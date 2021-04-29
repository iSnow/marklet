package io.github.atlascommunity.marklet.pages;

import static io.github.atlascommunity.marklet.constants.Labels.CONSTRUCTORS;
import static io.github.atlascommunity.marklet.constants.Labels.FIELDS;
import static io.github.atlascommunity.marklet.constants.Labels.METHODS;
import static io.github.atlascommunity.marklet.constants.Labels.SUMMARY;

import java.util.Arrays;

import com.sun.javadoc.ClassDoc;

import lombok.RequiredArgsConstructor;
import net.steppschuh.markdowngenerator.table.Table;
import net.steppschuh.markdowngenerator.text.emphasis.BoldText;
import net.steppschuh.markdowngenerator.text.heading.Heading;

/** Brief class description */
@RequiredArgsConstructor
public class ClassSummary implements ClassPageElement {

  /** Class information */
  private final ClassDoc classDoc;

  /** Table column name */
  private static final String TYPE_AND_MODIFIERS_COLUMN = "Type and modifiers";

  /** @return markdown string representation of document part */
  @Override
  public String generate() {

    StringBuilder summary = new StringBuilder().append(new Heading(SUMMARY, 2)).append("\n");

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
          .forEach(
              c -> tableEntries.addRow(new BoldText(c.modifiers()), c.name() + c.flatSignature()));
      constructorsTable.append(tableEntries.build());
      summary.append(constructorsTable).append("\n");
    }

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
          .forEach(
              f -> {
                String modifiersAndType = String.format("%s %s", f.modifiers(), f.type());
                tableEntries.addRow(new BoldText(modifiersAndType), f.name());
              });
      fieldsTable.append(tableEntries.build());
      summary.append(fieldsTable).append("\n");
    }

    int numberOfMethods = classDoc.methods().length;
    if (numberOfMethods > 0) {

      Heading tableHeading = new Heading(METHODS, 4);
      StringBuilder methodsTable = new StringBuilder().append(tableHeading).append("\n");
      Table.Builder tableEntries =
          new Table.Builder()
              .withAlignments(Table.ALIGN_LEFT)
              .withRowLimit(numberOfMethods + 1)
              .addRow(TYPE_AND_MODIFIERS_COLUMN, "Method signature", "Return type");

      Arrays.stream(classDoc.methods())
          .filter(m -> m.overriddenMethod() == null)
          .forEach(
              m ->
                  tableEntries.addRow(
                      new BoldText(m.modifiers()),
                      new MethodSignature(m).form(),
                      m.returnType().typeName()));
      methodsTable.append(tableEntries.build());
      summary.append(methodsTable).append("\n");
    }

    return summary.toString();
  }
}
