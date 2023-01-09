package io.github.atlascommunity.marklet.pages;

import com.sun.source.doctree.DocCommentTree;
import com.sun.source.doctree.DocTree;
import com.sun.source.util.DocTrees;
import com.sun.source.util.TreePath;
import io.github.atlascommunity.marklet.Options;
import io.github.atlascommunity.marklet.page_elements.MarkdownTag;
import io.github.atlascommunity.marklet.util.MarkletTypeUtils;
import jdk.javadoc.doclet.DocletEnvironment;
import jdk.javadoc.doclet.Reporter;
import lombok.RequiredArgsConstructor;
import net.steppschuh.markdowngenerator.link.Link;
import net.steppschuh.markdowngenerator.rule.HorizontalRule;
import net.steppschuh.markdowngenerator.table.Table;
import net.steppschuh.markdowngenerator.text.heading.Heading;

import javax.lang.model.element.*;
import javax.lang.model.util.ElementFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.*;

import static io.github.atlascommunity.marklet.constants.Filenames.PACKAGE_INDEX_FILE;
import static io.github.atlascommunity.marklet.constants.Labels.*;

/** Index of package elements */

@RequiredArgsConstructor
public class PackagePage implements DocumentPage {

  /** Package information */
  private final PackageElement packageElement;

  /** Package path */
  private final Path packageDirectory;

  /** Doclet options */
  private final Options options;

  /** This class provides methods to access TreePaths, DocCommentTrees and so on. */
  private final DocTrees comments;

  private final DocletEnvironment root;
  /**
   * Build document and write it to the selected folder
   *
   * @throws IOException something went wrong during write operation
   */
  @Override
  public void build(Reporter reporter) throws IOException {

    String packageHeader = String.format("%s %s", PACKAGE, packageElement.getSimpleName().toString());
    StringBuilder packagePage = new StringBuilder().append(new Heading(packageHeader)).append("\n");

    List<DocTree> bodyList =  getFullBody(packageElement, comments);
    if (null != bodyList) {
      bodyList.forEach((tag) -> {
        String formattedTag = new MarkdownTag(tag, options.getFileEnding()).create();
        packagePage.append(formattedTag);
        packagePage.append("\n").append(new HorizontalRule()).append("\n");
      });
    }
    /*Arrays.stream(packageElement.inlineTags())
        .forEach(
            tag -> {
              String formattedTag = new MarkdownTag(tag, options.getFileEnding()).create();
              packagePage.append(formattedTag);
              packagePage.append("\n").append(new HorizontalRule()).append("\n");
            });*/
    createPackageIndexes(packagePage);
    writeFile(packagePage);
  }

  private List<DocTree> getFullBody(PackageElement packageElement, DocTrees comments) {
    TreePath path = comments.getPath(packageElement);
    if (path == null) {
      return null;
    }
    DocCommentTree docCommentTree = comments.getDocCommentTree(path);

    List<DocTree> bodyList = new ArrayList<>();
    bodyList.addAll(docCommentTree.getFirstSentence());
    bodyList.addAll(docCommentTree.getBody());
    return bodyList;
  }

  /**
   * Generate index tables for package annotations, enums, interfaces and classes
   *
   * @param packagePage string representation of package page content
   */
  private void createPackageIndexes(StringBuilder packagePage) {
    createPackageEnumIndex(packagePage);
    createPackageInterfaceIndex(packagePage);
    createPackageClassIndex(packagePage);

/*
    AnnotationTypeDoc[] packageAnnotations = packageElement.annotationTypes();
    if (ArrayUtils.isNotEmpty(packageAnnotations)) {
      generateTable(ANNOTATIONS, packageAnnotations, packagePage);
    }

    ClassDoc[] packageEnums = packageElement.enums();
    if (ArrayUtils.isNotEmpty(packageEnums)) {
      generateTable(ENUMERATIONS, packageEnums, packagePage);
      packagePage.append("\n");
    }

    ClassDoc[] packageInterfaces = packageElement.interfaces();
    if (ArrayUtils.isNotEmpty(packageInterfaces)) {
      generateTable(INTERFACES, packageInterfaces, packagePage);
      packagePage.append("\n");
    }

    ClassDoc[] packageClasses = packageElement.allClasses();
    if (ArrayUtils.isNotEmpty(packageClasses)) {
      generateTable(CLASSES, packageClasses, packagePage);
      packagePage.append("\n");
    }*/
  }


  /**
   * Generate index table for package classes
   *
   * @param packagePage StringBuilder collecting package page content
   */
  private void createPackageEnumIndex(StringBuilder packagePage) {
    Set<TypeElement> packageEnums = new LinkedHashSet<>();
    for (PackageElement t : ElementFilter.packagesIn(root.getIncludedElements())) {
      for (Element e : t.getEnclosedElements()) {
        if (e.getKind() == ElementKind.ENUM) {
          packageEnums.add((TypeElement) e);
        }
      }
    }
    if (!packageEnums.isEmpty()) {
      generateTable(ENUMERATIONS, packageEnums.toArray(new TypeElement[]{}), packagePage);
      packagePage.append("\n");
    }
  }

  /**
   * Generate index table for package interfaces
   *
   * @param packagePage StringBuilder collecting package page content
   */
  private void createPackageInterfaceIndex(StringBuilder packagePage) {
    Set<TypeElement> interfaces = MarkletTypeUtils.findPackageInterfaces(packageElement);
    if (!interfaces.isEmpty()) {
      generateTable(INTERFACES, interfaces.toArray(new TypeElement[]{}), packagePage);
      packagePage.append("\n");
    }
  }

  /**
   * Generate index table for package classes
   *
   * @param packagePage StringBuilder collecting package page content
   */
  private void createPackageClassIndex(StringBuilder packagePage) {
    Set<TypeElement> packageClasses = MarkletTypeUtils.findPackageClasses(packageElement);
    if (!packageClasses.isEmpty()) {
      generateTable(CLASSES, packageClasses.toArray(new TypeElement[]{}), packagePage);
      packagePage.append("\n");
    }
  }
  /**
   * Generate index table
   *
   * @param tableLabel table name
   * @param docs elements to work with
   * @param packagePage string representation of package page content
   */
  private void generateTable(String tableLabel, TypeElement[] docs, StringBuilder packagePage) {
    packagePage.append(new Heading(tableLabel, 1)).append("\n");
    Table.Builder table =
            new Table.Builder()
                    .withAlignments(Table.ALIGN_LEFT)
                    .withRowLimit(docs.length + 1)
                    .addRow("Name");
    Arrays.stream(docs)
            .forEach(
                    d -> {
                      String linkName = d.getSimpleName().toString();
                      String linkUrl = d.getSimpleName().toString().replace(".", "/") + "." + options.getFileEnding();
                      table.addRow(new Link(linkName, linkUrl));
                    });

    packagePage.append(table.build()).append("\n");
  }

  /**
   * Write file to the selected folder
   *
   * @param pageContent file content
   * @throws IOException something went wrong during write operation
   */
  private void writeFile(StringBuilder pageContent) throws IOException {
    FileOutputStream savePath =
        new FileOutputStream(packageDirectory.resolve(PACKAGE_INDEX_FILE).toString());

    try (Writer readmeFile = new OutputStreamWriter(savePath, StandardCharsets.UTF_8)) {
      readmeFile.write(pageContent.toString());
    }
  }
}
