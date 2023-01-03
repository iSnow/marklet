package io.github.atlascommunity.marklet;

import com.sun.source.doctree.DocCommentTree;
import com.sun.source.util.DocTrees;
import io.github.atlascommunity.marklet.pages.ClassPage;
import io.github.atlascommunity.marklet.pages.PackagePage;
import io.github.atlascommunity.marklet.pages.ReadmePage;
import io.github.atlascommunity.marklet.util.TypeUtils;
import jdk.javadoc.doclet.Doclet;
import jdk.javadoc.doclet.DocletEnvironment;
import jdk.javadoc.doclet.Reporter;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.ElementFilter;
import javax.lang.model.util.Elements;
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
//@Slf4j
@NoArgsConstructor()
public final class Marklet implements Doclet {
  Reporter reporter;

  /** Command line options that have been parsed. * */
  private final Options options = new Options(new HashMap<>());

  /** Documentation root provided by the doclet API. * */
  private DocletEnvironment root;

  private Locale locale;

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
      for (Element e : t.getEnclosedElements()) {
        if (e.getKind() == ElementKind.CLASS) {
          classPackageMapping.put(((TypeElement)e).getQualifiedName().toString(), t.getQualifiedName().toString());
        }
      }
      buildPackages(t);
    }

    return packages;
  }

  private List<PackageElement> buildPackages(PackageElement elem) throws IOException {
    final List<PackageElement> packages = new ArrayList<>();
    for (Element e : elem.getEnclosedElements()) {
      if (e.getKind() == ElementKind.PACKAGE) {
        System.out.println(e);
      }
    }
    return packages;
  }

      /**
       * Generates Readme file
       *
       * @param packages project packages list
       * @throws IOException If any error occurs during generation process.
       */
  private void generateReadme(List<PackageElement> packages) throws IOException {

    new ReadmePage(packages, options).build(reporter);
  }

  /**
   * Generates documentation file for classes, enumerations, interfaces, or annotations.
   *
   * @throws IOException If any error occurs during generation process.
   */
  private void buildClasses() throws IOException {
    Set<TypeElement> packageClasses = TypeUtils.findPackageClasses(root);
    DocTrees treeUtils = root.getDocTrees();
    for (final TypeElement classElem : packageClasses) {
      reporter.print(Diagnostic.Kind.NOTE, "Generate documentation for " + classElem.getQualifiedName());
      String packageName = classPackageMapping.get(classElem.getQualifiedName().toString());
      DocCommentTree comments = treeUtils.getDocCommentTree(classElem);
      new ClassPage(classElem, comments, options, packageName).build(reporter);
    }
  }

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
   * **Doclet** worker point. Parses user provided options and starts a **Marklet** execution.
   *
   * @param environment DocletEnvironment.
   * @return ``true`` if the generation went well, ``false`` otherwise.
   */
  @Override
  public boolean run(DocletEnvironment environment) {
    this.root = environment;
    reporter.print(Diagnostic.Kind.NOTE, "outputDirectory: " + Options.getOption(OUTPUT_DIRECTORY_OPTION));
    //log.info("start up");
    boolean result;
    try {
      result = start();
    } catch (final Exception e) {
      reporter.print(Diagnostic.Kind.ERROR, e.getMessage());
      //log.error("An exception has been caught during generation (see stack trace below).");
      e.printStackTrace();
      result = false;
    }
    return result;
  }

  /**
   * Test methods
   */

  public boolean test1(boolean test1Var1, int test1Var2) {
    return false;
  }

  public boolean test1(Map<String, Integer> arg1) {
    return false;
  }

  /** @return <tt>true</tt> if generation was successful, <tt>false</tt> otherwise. */
  private boolean start() {

    try {
      final Path outputDirectory = Paths.get(options.getOutputDirectory());
      //log.info("Target output directory : " + outputDirectory.toAbsolutePath());
      reporter.print(Diagnostic.Kind.NOTE, "Target output directory : " + outputDirectory.toAbsolutePath());
      if (!Files.exists(outputDirectory)) Files.createDirectories(outputDirectory);

      List<PackageElement> packages = buildPackages();
      reporter.print(Diagnostic.Kind.NOTE, "packages: " + packages);

      generateReadme(packages);
      for (PackageElement p : packages) {
        generatePackage(p);
      }
      buildClasses();
    } catch (final IOException e) {
      //log.error(e.getMessage());
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
