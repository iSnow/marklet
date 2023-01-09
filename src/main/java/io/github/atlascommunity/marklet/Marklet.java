package io.github.atlascommunity.marklet;

import com.sun.source.doctree.DocCommentTree;
import com.sun.source.util.DocTrees;
import io.github.atlascommunity.marklet.pages.ClassPage;
import io.github.atlascommunity.marklet.pages.PackagePage;
import io.github.atlascommunity.marklet.pages.ReadmePage;
import io.github.atlascommunity.marklet.util.MarkletTypeUtils;
import jdk.javadoc.doclet.Doclet;
import jdk.javadoc.doclet.DocletEnvironment;
import jdk.javadoc.doclet.Reporter;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import javax.lang.model.SourceVersion;
import javax.lang.model.element.*;
import javax.lang.model.util.ElementFilter;
import javax.tools.Diagnostic;
import javax.tools.DocumentationTool;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static io.github.atlascommunity.marklet.Options.OUTPUT_DIRECTORY_OPTION;

/**
 * Marklet entry point. This class declares the {@link #init(Locale, Reporter)} and {@link #run(DocletEnvironment)}
 * methods required by the doclet API in order to be called by the javadoc tool.
 *
 * @author fv
 */
@NoArgsConstructor()
public final class Marklet implements Doclet {
  Reporter reporter;

  /** Command line options that have been parsed. * */
  private final Options options = new Options(new HashMap<>());

  /** Documentation root provided by the doclet API. * */
  private DocletEnvironment root;

  private final Map<String, String> classPackageMapping = new HashMap<>();


  /**
   * Builds and retrieves the path for the directory associated to the package with the given
   * <tt>name</tt>.
   *
   * @param packageName Name of the package to get directory for.
   * @return Built path.
   */
  private Path getPackageDirectory(final String packageName) {

    final String directory = packageName.replace('.', '/');

    return Paths.get(options.getOutputDirectory(), directory);
  }

  /**
   * Generates package documentation for the given ``packageElement``.
   *
   * @param packageElement Package to generate documentation for.
   * @throws IOException If any error occurs while creating file or directories.
   */
  private void generatePackage(final PackageElement packageElement) throws IOException {

    final String name = packageElement.getQualifiedName().toString();
    //log.info("Generates package documentation for " + name);
    reporter.print(Diagnostic.Kind.NOTE, "Generates package documentation for " + name);
    if (!name.isEmpty()) {
      final Path directoryPath = getPackageDirectory(name);
      if (!Files.exists(directoryPath)) {
        Files.createDirectories(directoryPath);
      }
      new PackagePage(packageElement, directoryPath, options, root.getDocTrees(), root).build(reporter);
    }
  }

  /**
   * Generates documentation file for each package.
   *
   * @throws IOException If any error occurs during generation process.
   * @return list of packages documents
   */
  private List<PackageElement> buildPackages() throws IOException {
    final List<PackageElement> packages = new ArrayList<>();
    for (PackageElement t : ElementFilter.packagesIn(root.getIncludedElements())) {
      packages.add(t);
      //log.trace(t.getKind() + ":" + t);
      for (TypeElement e : MarkletTypeUtils.findPackageClasses(t)) {
          classPackageMapping.put(e.getQualifiedName().toString(), t.getQualifiedName().toString());
      }
    }

    return packages;
  }


  /**
   * Generates documentation file for each module.
   *
   * @throws IOException If any error occurs during generation process.
   * @return list of modules
   */
  private List<ModuleElement> buildModules() throws IOException {
    final List<ModuleElement> modules = new ArrayList<>();
    for (ModuleElement t : ElementFilter.modulesIn(root.getIncludedElements())) {
      modules.add(t);
    }

    return modules;
  }

  /**
   * Generates documentation file for classes, enumerations, interfaces, or annotations.
   *
   * @throws IOException If any error occurs during generation process.
   */
  private void buildClasses() throws IOException {
    Set<TypeElement> packageClasses = MarkletTypeUtils.findPackageClasses(root);

    DocTrees treeUtils = root.getDocTrees();
    for (final TypeElement classElem : packageClasses) {
      reporter.print(Diagnostic.Kind.NOTE, "Generate documentation for " + classElem.getQualifiedName());
      String packageName = classPackageMapping.get(classElem.getQualifiedName().toString());
      DocCommentTree comments = treeUtils.getDocCommentTree(classElem);
      new ClassPage(classElem, treeUtils, comments, root, options, packageName).build(reporter);
    }
  }

  /**
       * Generates Readme file
       *
       * @param modules project modules list
       * @param packages project packages list
       * @throws IOException If any error occurs during generation process.
       */
  private void generateReadme(List<ModuleElement> modules, List<PackageElement> packages) throws IOException {

    new ReadmePage(modules, packages, options).build(reporter);
  }



  @Override
  public String getName() {
    return getClass().getSimpleName();
  }

  @Override
  public Set<? extends Option> getSupportedOptions() {
    return Options.getSupportedOptions();
  }

  /** @return LanguageVersion supported. */
  @Override
  public SourceVersion getSupportedSourceVersion() {
    return SourceVersion.latest();
  }

  /**
   * Overriden from {@link jdk.javadoc.doclet.StandardDoclet#init(Locale, Reporter)}, the
   * doclet entry point
   *
   * @param locale the locale to be used
   * @param reporter the reporter to be used
   */
  @Override
  public void init(Locale locale, Reporter reporter) {
    this.reporter = reporter;
    try {
      final Path outputDirectory = Paths.get(options.getOutputDirectory());
      //log.info("Target output directory : " + outputDirectory.toAbsolutePath());
      if (!Files.exists(outputDirectory)) Files.createDirectories(outputDirectory);
    } catch (final IOException e) {
      //log.error(e.getMessage());
    }
  }

  /**
   * **Doclet** worker point. Parses user provided options and starts a **Marklet** execution.
   *
   * @param environment DocletEnvironment.
   * @return ``true`` if the generation went well, ``false`` otherwise.
   */
  @Override
  public boolean run(DocletEnvironment environment) {
    reporter.print(Diagnostic.Kind.NOTE, "Doclet 'Marklet' starting up");
    reporter.print(Diagnostic.Kind.NOTE, "outputDirectory: " + Options.getOption(OUTPUT_DIRECTORY_OPTION));
    root = environment;
    boolean result;
    try {
      result = doWork();
    } catch (final Exception e) {
      reporter.print(Diagnostic.Kind.ERROR, e.getMessage());
      e.printStackTrace();
      result = false;
    }
    return result;
  }


  /** @return <tt>true</tt> if generation was successful, <tt>false</tt> otherwise. */
  private boolean doWork() {

    try {
      final Path outputDirectory = Paths.get(options.getOutputDirectory());
      reporter.print(Diagnostic.Kind.NOTE, "Target output directory : " + outputDirectory.toAbsolutePath());
      if (!Files.exists(outputDirectory)) Files.createDirectories(outputDirectory);

      List<ModuleElement> modules = buildModules();
      reporter.print(Diagnostic.Kind.NOTE, "modules: " + modules);

      List<PackageElement> packages = buildPackages();
      reporter.print(Diagnostic.Kind.NOTE, "packages: " + packages);

      generateReadme(modules, packages);
      for (PackageElement p : packages) {
        generatePackage(p);
      }
      buildClasses();
    } catch (final IOException e) {
      reporter.print(Diagnostic.Kind.ERROR, e.getMessage());
      return false;
    }
    return true;
  }

  @SneakyThrows
  public static void main(String[] args) {
    String docletName = Marklet.class.getName();
    String packageName = Marklet.class.getPackageName();
    File f = new File ("modulepath.txt");
    String modulePath = Files.readString(f.toPath());
    String[] docletArgs = new String[]{
            "-doclet", docletName,
            "-docletpath", "target/classes/",
            "-sourcepath", "src/main/java/",
            //"-d", "javadoc",
            "--module-path", modulePath,
            "-subpackages", "io.github.atlascommunity",
            packageName
    };
    DocumentationTool docTool = ToolProvider.getSystemDocumentationTool();
    docTool.run(System.in, System.out, System.err, docletArgs);
  }
}
