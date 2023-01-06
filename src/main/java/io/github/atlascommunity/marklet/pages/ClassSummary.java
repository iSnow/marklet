package io.github.atlascommunity.marklet.pages;

import io.github.atlascommunity.marklet.util.TypeUtils;
import lombok.RequiredArgsConstructor;
import net.steppschuh.markdowngenerator.table.Table;
import net.steppschuh.markdowngenerator.text.emphasis.BoldText;
import net.steppschuh.markdowngenerator.text.heading.Heading;

import javax.lang.model.element.*;
import javax.lang.model.type.*;
import java.util.Set;
import java.util.stream.Collectors;

import static io.github.atlascommunity.marklet.constants.Labels.*;

/** Brief class description */
@RequiredArgsConstructor
public class ClassSummary implements ClassPageElement {

  /** Class information */
  private final TypeElement classElement;

  /** Table column name */
  private static final String TYPE_AND_MODIFIERS_COLUMN = "Type and modifiers";

  /** @return markdown string representation of document part */
  @Override
  public String generate() {

    StringBuilder summary = new StringBuilder().append(new Heading(SUMMARY, 2)).append("\n");

    summary.append(generateConstructorSummary(classElement));
    summary.append(generateFieldSummary(classElement));
    summary.append(generateMethodSummary(classElement));

    return summary.toString();
  }

  /** @return markdown string representation of class methods */
  private static String generateMethodSummary(TypeElement classElement) {

    StringBuilder summary = new StringBuilder();
    Set<ExecutableElement> methods = TypeUtils.findClassMethods(classElement);

    int numberOfMethods = methods.size();
    if (numberOfMethods > 0) {

      Heading tableHeading = new Heading(METHODS, 4);
      StringBuilder methodsTable = new StringBuilder().append(tableHeading).append("\n");
      Table.Builder tableEntries =
              new Table.Builder()
                      .withAlignments(Table.ALIGN_LEFT)
                      .withRowLimit(numberOfMethods + 1)
                      .addRow(TYPE_AND_MODIFIERS_COLUMN, "Method signature", "Return type");

      methods.stream()
              //.filter(m -> m.overriddenMethod() == null)
              .forEach(
                      m -> {
                        String modifiers = m.getModifiers().stream().map(Modifier::toString).collect(Collectors.joining(" "));
                        TypeMirror mirror = m.getReturnType();
                        tableEntries.addRow(
                                new BoldText(modifiers),
                                new MethodSignature(m).generate(),
                                mirror.toString());
                      });

      methodsTable.append(tableEntries.build());
      summary.append(methodsTable).append("\n");
    }

    return summary.toString();
  }

  /** @return markdown string representation of class fields */
  private static String generateFieldSummary(TypeElement classElement) {

    StringBuilder summary = new StringBuilder();

    Set<VariableElement> fields = TypeUtils.findClassFields(classElement);
    int numberOfFields = fields.size();
    if (numberOfFields > 0) {

      Heading tableHeading = new Heading(FIELDS, 4);
      StringBuilder fieldsTable = new StringBuilder().append(tableHeading).append("\n");
      Table.Builder tableEntries =
              new Table.Builder()
                      .withAlignments(Table.ALIGN_LEFT)
                      .withRowLimit(numberOfFields + 1)
                      .addRow(TYPE_AND_MODIFIERS_COLUMN, "Field name");

      for (VariableElement f : fields) {
        String modifiers = f.getModifiers().stream().map(Modifier::toString).collect(Collectors.joining(" "));
        TypeMirror typeMirror = f.asType();
        String modifiersAndType = String.format("%s %s", modifiers, typeMirror).trim();
        tableEntries.addRow(new BoldText(modifiersAndType), f.getSimpleName());
      }
      fieldsTable.append(tableEntries.build());
      summary.append(fieldsTable).append("\n");
    }
    return summary.toString();
  }

  /** @return markdown string representation of class constructors */
  private static String generateConstructorSummary(TypeElement classElement) {

    Set<Element> ctors = TypeUtils.findClassConstructors(classElement);
    StringBuilder summary = new StringBuilder();

    int numberOfConstructors = ctors.size();
    if (numberOfConstructors > 0) {

      Heading tableHeading = new Heading(CONSTRUCTORS, 4);
      StringBuilder constructorsTable = new StringBuilder().append(tableHeading).append("\n");
      Table.Builder tableEntries =
              new Table.Builder()
                      .withAlignments(Table.ALIGN_LEFT)
                      .withRowLimit(numberOfConstructors + 1)
                      .addRow("Visibility", "Signature");

      for (Element c : ctors) {

        String modifiers = c.getModifiers().stream().map(Modifier::toString).collect(Collectors.joining(" "));
        tableEntries.addRow(new BoldText(modifiers), c.toString());
      }

      constructorsTable.append(tableEntries.build());
      summary.append(constructorsTable).append("\n");
    }
    return summary.toString();
  }

}
