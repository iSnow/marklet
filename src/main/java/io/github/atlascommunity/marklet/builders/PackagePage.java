package io.github.atlascommunity.marklet.builders;

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
import com.sun.javadoc.SeeTag;
import com.sun.javadoc.Tag;

import io.github.atlascommunity.marklet.MarkletOptions;
import lombok.RequiredArgsConstructor;
import net.steppschuh.markdowngenerator.link.Link;
import net.steppschuh.markdowngenerator.rule.HorizontalRule;
import net.steppschuh.markdowngenerator.table.Table;
import net.steppschuh.markdowngenerator.text.heading.Heading;

@RequiredArgsConstructor
public class PackagePage implements DocumentPage {
  private final PackageDoc packageDoc;

  private final Path packageDirectory;

  private final MarkletOptions options;

  @Override
  public void build() throws IOException {

    String packageHeader = String.format("%s %s", PACKAGE, packageDoc.name());
    StringBuilder packagePage = new StringBuilder().append(new Heading(packageHeader)).append("\n");
    Arrays.stream(packageDoc.inlineTags())
        .forEach(
            tag -> {
              String formattedTag = processTag(tag);
              packagePage.append(formattedTag);
              packagePage.append("\n").append(new HorizontalRule()).append("\n");
            });
    createPackageIndexes(packagePage);
    writeFile(packagePage);
  }

  private String processTag(Tag tag) {

    if (("@link").equals(tag.name())) {
      SeeTag seeTag = (SeeTag) tag;
      ClassDoc referencedClassDoc = seeTag.referencedClass();
      if (referencedClassDoc != null) {
        String linkName = referencedClassDoc.name();
        String linkUrl =
            linkName.replace(".", "/") + "/" + linkName + "." + options.getFileEnding();

        return new Link(linkName, linkUrl).toString();
      }
    }

    return tag.text().replace("<p>", "").replace("</p>", "");
  }

  private void createPackageIndexes(StringBuilder packagePage) {

    AnnotationTypeDoc[] packageAnnotations = packageDoc.annotationTypes();
    if (ArrayUtils.isNotEmpty(packageAnnotations)) {
      generateTable(ANNOTATIONS, packageAnnotations, packagePage);
    }

    ClassDoc[] packageEnums = packageDoc.enums();
    if (ArrayUtils.isNotEmpty(packageEnums)) {
      generateTable(ENUMERATIONS, packageEnums, packagePage);
    }

    ClassDoc[] packageInterfaces = packageDoc.interfaces();
    if (ArrayUtils.isNotEmpty(packageInterfaces)) {
      generateTable(INTERFACES, packageInterfaces, packagePage);
    }

    ClassDoc[] packageClasses = packageDoc.allClasses();
    if (ArrayUtils.isNotEmpty(packageClasses)) {
      generateTable(CLASSES, packageClasses, packagePage);
    }
  }

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

  private void writeFile(StringBuilder pageContent) throws IOException {
    FileOutputStream savePath =
        new FileOutputStream(packageDirectory.resolve(PACKAGE_INDEX_FILE).toString());

    try (Writer readmeFile = new OutputStreamWriter(savePath, StandardCharsets.UTF_8)) {
      readmeFile.write(pageContent.toString());
    }
  }
}
