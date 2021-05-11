package io.github.atlascommunity.marklet.pages;

import static io.github.atlascommunity.marklet.constants.Filenames.PACKAGE_INDEX_FILE;
import static io.github.atlascommunity.marklet.constants.Labels.ANNOTATIONS;
import static io.github.atlascommunity.marklet.constants.Labels.CLASSES;
import static io.github.atlascommunity.marklet.constants.Labels.ENUMERATIONS;
import static io.github.atlascommunity.marklet.constants.Labels.INTERFACES;
import static io.github.atlascommunity.marklet.constants.Labels.PACKAGE;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

import com.sun.javadoc.AnnotationTypeDoc;
import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.PackageDoc;

import io.github.atlascommunity.marklet.Options;
import lombok.RequiredArgsConstructor;
import net.steppschuh.markdowngenerator.link.Link;
import net.steppschuh.markdowngenerator.rule.HorizontalRule;
import net.steppschuh.markdowngenerator.table.Table;
import net.steppschuh.markdowngenerator.text.heading.Heading;

/** Index of package elements */
@RequiredArgsConstructor
public class PackagePage implements DocumentPage {

  /** Package information */
  private final PackageDoc packageDoc;

  /** Package path */
  private final Path packageDirectory;

  /** Doclet options */
  private final Options options;

  /**
   * Build document and write it to the selected folder
   *
   * @throws IOException something went wrong during write operation
   */
  @Override
  public void build() throws IOException {

    String packageHeader = String.format("%s %s", PACKAGE, packageDoc.name());
    StringBuilder packagePage = new StringBuilder().append(new Heading(packageHeader)).append("\n");
    Arrays.stream(packageDoc.inlineTags())
        .forEach(
            tag -> {
              String formattedTag = new MarkdownTag(tag, options.getFileEnding()).create();
              packagePage.append(formattedTag);
              packagePage.append("\n").append(new HorizontalRule()).append("\n");
            });
    createPackageIndexes(packagePage);
    writeFile(packagePage);
  }

  /**
   * Generate index tables for package annotations, enums, interfaces and classes
   *
   * @param packagePage string representation of package page content
   */
  private void createPackageIndexes(StringBuilder packagePage) {

    AnnotationTypeDoc[] packageAnnotations = packageDoc.annotationTypes();
    if (ArrayUtils.isNotEmpty(packageAnnotations)) {
      generateTable(ANNOTATIONS, packageAnnotations, packagePage);
    }

    ClassDoc[] packageEnums = packageDoc.enums();
    if (ArrayUtils.isNotEmpty(packageEnums)) {
      generateTable(ENUMERATIONS, packageEnums, packagePage);
      packagePage.append("\n");
    }

    ClassDoc[] packageInterfaces = packageDoc.interfaces();
    if (ArrayUtils.isNotEmpty(packageInterfaces)) {
      generateTable(INTERFACES, packageInterfaces, packagePage);
      packagePage.append("\n");
    }

    ClassDoc[] packageClasses = packageDoc.allClasses();
    if (ArrayUtils.isNotEmpty(packageClasses)) {
      generateTable(CLASSES, packageClasses, packagePage);
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
  private void generateTable(String tableLabel, ClassDoc[] docs, StringBuilder packagePage) {

    packagePage.append(new Heading(tableLabel, 1)).append("\n");
    Table.Builder table =
        new Table.Builder()
            .withAlignments(Table.ALIGN_LEFT)
            .withRowLimit(docs.length + 1)
            .addRow("Name");

    Arrays.stream(docs)
        .forEach(
            d -> {
              String linkName = d.simpleTypeName();
              String linkUrl = d.name().replace(".", "/") + "." + options.getFileEnding();
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
