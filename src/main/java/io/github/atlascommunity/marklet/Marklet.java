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
import javax.lang.model.element.ModuleElement;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.ElementFilter;
import javax.tools.Diagnostic;
import javax.tools.DocumentationTool;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import static io.github.atlascommunity.marklet.Options.OUTPUT_DIRECTORY_OPTION;

/**
 * Marklet entry point. This class declares the {@link #init(Locale, Reporter)} and {@link #run(DocletEnvironment)}
 * methods required by the doclet API in order to be called by the javadoc tool.
 *
 * @author fv
 */
@NoArgsConstructor()
public final class Marklet implements Doclet {
  /**
   * Doclet enviroment logger
   */
  Reporter reporter;

  /** Command line options that have been parsed. * */
  private final Options options = new Options();

  /** Documentation root provided by the doclet API. * */
  private DocletEnvironment root;




  /**
   * Generates Readme file
   *
   * @param modules project modules list
   * @param packages project packages list
   * @throws IOException If any error occurs during generation process.
   */
  private void generateReadmePage(List<ModuleElement> modules, List<PackageElement> packages) throws IOException {
    new ReadmePage(modules, packages, options, reporter).write();
  }

  /**
   * Generates package documentation for the given ``packageElement``.
   *
   * @param packageElement Package to generate documentation for.
   * @throws IOException If any error occurs while creating file or directories.
   */
  private void generatePackagePage(final PackageElement packageElement) throws IOException {

    final String name = packageElement.getQualifiedName().toString();
    //log.info("Generates package documentation for " + name);
    reporter.print(Diagnostic.Kind.NOTE, "Generates package documentation for " + name);
    if (!name.isEmpty()) {
      final Path directoryPath = getPackageDirectory(name);
      if (!Files.exists(directoryPath)) {
        Files.createDirectories(directoryPath);
      }
      new PackagePage(packageElement, directoryPath, options, root.getDocTrees(), root, reporter).write();
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
      if (!t.isUnnamed()) {
        modules.add(t);
      }
    }

    return modules;
  }


  /**
   * Generates documentation file for classes, records, enumerations, interfaces, or annotations.
   *
   * @param packageElement the package to scan for classes
   *
   * @throws IOException If any error occurs during generation process.
   */
  private void collectPackageElements(PackageElement packageElement) throws IOException {
    Set<TypeElement> childElements = MarkletTypeUtils.findPackageClasses(packageElement);
    childElements.addAll(MarkletTypeUtils.findPackageEnums(packageElement));
    childElements.addAll(MarkletTypeUtils.findPackageInterfaces(packageElement));
    childElements.addAll(MarkletTypeUtils.findPackageAnnotations(packageElement));
    childElements.addAll(MarkletTypeUtils.findPackageRecords(packageElement));

    DocTrees treeUtils = root.getDocTrees();
    for (final TypeElement classElem : childElements) {
      reporter.print(Diagnostic.Kind.NOTE, "Generate documentation for " + classElem.getQualifiedName());
      String packageName = packageElement.getQualifiedName().toString();
      DocCommentTree comments = treeUtils.getDocCommentTree(classElem);
      new ClassPage(classElem, treeUtils, comments, root, options, packageName, reporter).write();
    }
  }


  /**
   * Returns the name of this Doclet
   *
   * @return returns `Marklet`
   */
  @Override
  public String getName() {
    return getClass().getSimpleName();
  }

  /**
   * Returns the options this Doclet supports
   *
   * @return Set of supported options
   */
  @Override
  public Set<? extends Option> getSupportedOptions() {
    return Options.getSupportedOptions();
  }

  /** Report the highest Java version supported.
   *
   * @return LanguageVersion supported. */
  @Override
  public SourceVersion getSupportedSourceVersion() {
    return SourceVersion.latest();
  }

  /**
   * Overriden from {@link jdk.javadoc.doclet.StandardDoclet#init(Locale, Reporter)}, the
   * doclet entry point. We don't do a lot here
   *
   * @param locale the locale to be used
   * @param reporter the reporter to be used
   */
  @Override
  public void init(Locale locale, Reporter reporter) {
    this.reporter = reporter;
  }

  /**
   * Main **Doclet** worker entry point.
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


  /**
   * Does the actual work of setting up paths and generating markdown files.
   * Hands back to {@link #run(DocletEnvironment)}
   *
   * @return <tt>true</tt> if markdown generation was successful, <tt>false</tt> otherwise. */
  private boolean doWork() {

    try {
      final Path outputDirectory = Paths.get(options.getOutputDirectory());
      if (!Files.exists(outputDirectory)) Files.createDirectories(outputDirectory);

      reporter.print(Diagnostic.Kind.NOTE, "Target output directory : " + outputDirectory.toAbsolutePath());
      if (!Files.exists(outputDirectory)) Files.createDirectories(outputDirectory);

      List<ModuleElement> modules = buildModules();
      reporter.print(Diagnostic.Kind.NOTE, "modules: " + modules);

      List<PackageElement> packages = buildPackages();
      reporter.print(Diagnostic.Kind.NOTE, "packages: " + packages);

      generateReadmePage(modules, packages);
      for (PackageElement p : packages) {
        generatePackagePage(p);
        collectPackageElements(p);
      }
    } catch (final IOException e) {
      reporter.print(Diagnostic.Kind.ERROR, e.getMessage());
      return false;
    }
    return true;
  }


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
   * Useful to run the Doclet in an IDE like IntelliJ. This can be used to create a run configuration
   * as if this was a regular Java application instead of a Doclet intended to be used via ´javadoc´. This
   * way, you can step through it in the debugger.
   *
   * This starts up ´javadoc´ programmatically (called `DocumentationTool`) and tells it to run our
   * Doclet with the given options.
   *
   * Currently, this is in the unnamed module b/c using modules here proved to be difficult. If you want
   *  to have a try, first uncomment the "--module-path", create a file `modulepath.txt` and add classpath
   *  entries for all dependencies. Then get rid of the need to explicitly list the jars...
   *
   * @param args command-line arguments, disregarded
   */
  @SneakyThrows
  public static void main(String[] args) {
    String docletName = Marklet.class.getName();
    String packageName = Marklet.class.getPackageName();
    File f = new File ("modulepath.txt");
    if (f.exists()) {
      String modulePath = Files.readString(f.toPath());
    }
    String[] docletArgs = new String[]{
            "-doclet", docletName,
            "-docletpath", "target/classes/",
            "-sourcepath", "src/main/java/",
            //"--module-path", modulePath,
            "-subpackages", "io.github.atlascommunity",
            packageName
    };
    DocumentationTool docTool = ToolProvider.getSystemDocumentationTool();
    docTool.run(System.in, System.out, System.err, docletArgs);
  }
}
