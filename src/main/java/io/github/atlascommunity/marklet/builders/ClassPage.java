package io.github.atlascommunity.marklet.builders;

import static io.github.atlascommunity.marklet.constants.Labels.ANNOTATION;
import static io.github.atlascommunity.marklet.constants.Labels.CLASS;
import static io.github.atlascommunity.marklet.constants.Labels.CONSTRUCTORS;
import static io.github.atlascommunity.marklet.constants.Labels.ENUMERATION;
import static io.github.atlascommunity.marklet.constants.Labels.FIELDS;
import static io.github.atlascommunity.marklet.constants.Labels.INTERFACE;
import static io.github.atlascommunity.marklet.constants.Labels.METHODS;
import static io.github.atlascommunity.marklet.constants.Labels.SUMMARY;

import java.io.IOException;
import java.util.Arrays;

import com.sun.javadoc.ClassDoc;

import lombok.RequiredArgsConstructor;
import net.steppschuh.markdowngenerator.table.Table;
import net.steppschuh.markdowngenerator.text.emphasis.BoldText;
import net.steppschuh.markdowngenerator.text.heading.Heading;

@RequiredArgsConstructor
public class ClassPage implements DocumentPage {

  private final ClassDoc classDoc;

  private static final String TYPE_AND_MODIFIERS_COLUMN = "Type and modifiers";

  @Override
  public void build() throws IOException {

    StringBuilder pageTitle =
        new StringBuilder().append(new Heading(generateTitle(), 1)).append("\n");

    String pageSummary = generateSummary();
    if (!pageSummary.isEmpty()) pageTitle.append(pageSummary);
  }

  private String generateSummary() {

    StringBuilder summary = new StringBuilder().append(new Heading(SUMMARY, 2)).append("\n");

    int numberOfFields = classDoc.fields().length;
    if (numberOfFields > 0) {

      Heading tableHeading = new Heading(FIELDS, 4);
      StringBuilder fieldsTable = new StringBuilder().append(tableHeading).append("\n");
      Table.Builder tableEntries =
          new Table.Builder()
              .withAlignments(Table.ALIGN_LEFT)
              .withRowLimit(numberOfFields + 1)
              .addRow(TYPE_AND_MODIFIERS_COLUMN, "Field name");

      Arrays.stream(classDoc.fields())
          .forEach(f -> tableEntries.addRow(new BoldText(f.modifiers()), f.name()));
      fieldsTable.append(tableEntries.build());
      summary.append(fieldsTable);
    }

    int numberOfConstructors = classDoc.constructors().length;
    if (numberOfConstructors > 0) {

      Heading tableHeading = new Heading(CONSTRUCTORS, 4);
      StringBuilder constructorsTable = new StringBuilder().append(tableHeading).append("\n");
      Table.Builder tableEntries =
          new Table.Builder()
              .withAlignments(Table.ALIGN_LEFT)
              .withRowLimit(numberOfConstructors + 1)
              .addRow("Visibility", "Signature");

      Arrays.stream(classDoc.constructors())
          .forEach(f -> tableEntries.addRow(new BoldText(f.modifiers()), f.name()));
      constructorsTable.append(tableEntries.build());
      summary.append(constructorsTable);
    }

    int numberOfMethods = classDoc.methods().length;
    if (numberOfMethods > 0) {

      Heading tableHeading = new Heading(METHODS, 4);
      StringBuilder methodsTable = new StringBuilder().append(tableHeading).append("\n");
      Table.Builder tableEntries =
          new Table.Builder()
              .withAlignments(Table.ALIGN_LEFT)
              .withRowLimit(numberOfMethods + 1)
              .addRow(TYPE_AND_MODIFIERS_COLUMN, "Method signature");

      Arrays.stream(classDoc.methods())
          .forEach(f -> tableEntries.addRow(new BoldText(f.modifiers()), f.name()));
      methodsTable.append(tableEntries.build());
      summary.append(methodsTable);
    }

    return summary.toString();
  }

  private String generateTitle() {

    StringBuilder builder = new StringBuilder();
    if (classDoc.isInterface()) {
      builder.append(INTERFACE);
    } else if (classDoc.isEnum()) {
      builder.append(ENUMERATION);
    } else if (classDoc.isAnnotationType()) {
      builder.append(ANNOTATION);
    } else {
      builder.append(CLASS);
    }
    return builder.append(' ').append(classDoc.name()).toString();
  }
}
