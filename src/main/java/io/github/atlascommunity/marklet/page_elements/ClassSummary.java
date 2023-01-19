package io.github.atlascommunity.marklet.page_elements;

import com.sun.source.doctree.DocCommentTree;
import com.sun.source.util.DocTrees;
import io.github.atlascommunity.marklet.util.FieldSignature;
import io.github.atlascommunity.marklet.util.MarkletTypeUtils;
import io.github.atlascommunity.marklet.util.OverriddenMethodSignature;
import io.github.atlascommunity.marklet.util.Sanitizers;
import lombok.RequiredArgsConstructor;
import net.steppschuh.markdowngenerator.table.Table;
import net.steppschuh.markdowngenerator.text.emphasis.BoldText;
import net.steppschuh.markdowngenerator.text.heading.Heading;

import javax.lang.model.element.*;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.Types;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static io.github.atlascommunity.marklet.constants.Labels.*;
import static io.github.atlascommunity.marklet.util.MarkletTypeUtils.findOverriddenMethod;

/** Brief class description */
@RequiredArgsConstructor
public class ClassSummary implements ClassPageElement {

  /** Class information */
  private final TypeElement classElement;

  private final Types typeUtils;

  private  final DocTrees treeUtils;


  /** @return markdown string representation of document part */
  @Override
  public String generate() {

    StringBuilder summary = new StringBuilder().append(new Heading(SUMMARY, 2)).append("\n");

    boolean generateConstructors = (!classElement.getKind().equals(ElementKind.ENUM))
            && (!classElement.getKind().equals(ElementKind.RECORD));
    if (generateConstructors) {
      summary.append(generateConstructorSummary(classElement));
    }
    if (classElement.getKind().equals(ElementKind.ENUM)) {
      summary.append(generateEnumConstantSummary(classElement));
    } else {
      summary.append(generateFieldSummary(classElement));
    }
    summary.append(generateMethodSummary(classElement, typeUtils));

    return summary.toString();
  }

  /**
   * @param classElement the Enum
   * @return markdown string representation of the constants of an Enum */
  private String generateEnumConstantSummary(TypeElement classElement) {
    StringBuilder summary = new StringBuilder();
    List<VariableElement> enumConstants = MarkletTypeUtils.findEnumConstants(classElement);

    if (!enumConstants.isEmpty()) {
      Heading tableHeading = new Heading(ENUM_CONSTANTS, 4);
      StringBuilder enumConstantsTable = new StringBuilder().append(tableHeading).append("\n");
      Table.Builder tableEntries =
              new Table.Builder()
                      .withAlignments(Table.ALIGN_LEFT)
                      .withRowLimit(enumConstants.size() + 1)
                      .addRow(ENUM_CONSTANT, DESCRIPTION);
      enumConstants.forEach(
              c -> {
                StringBuilder fieldDescription = new StringBuilder();
                DocCommentTree comments = treeUtils.getDocCommentTree(c);
                if (null == comments) {
                  fieldDescription.append("*No description provided*");
                } else {
                  fieldDescription.append(comments.getFullBody().stream().map(Object::toString).collect(Collectors.joining()));
                }
                tableEntries.addRow(
                        c.getSimpleName(),
                        fieldDescription.toString());
              });
      enumConstantsTable.append(tableEntries.build());
      summary.append(enumConstantsTable).append("\n");
    }
    return summary.toString();
  }

  /** @return markdown string representation of class methods */
  private static String generateMethodSummary(TypeElement classElement, Types typeUtils) {

    StringBuilder summary = new StringBuilder();
    Set<ExecutableElement> methods = MarkletTypeUtils.findClassMethods(classElement);

    int numberOfMethods = methods.size();
    if (numberOfMethods > 0) {

      Heading tableHeading = new Heading(METHODS, 4);
      StringBuilder methodsTable = new StringBuilder().append(tableHeading).append("\n");
      Table.Builder tableEntries =
              new Table.Builder()
                      .withAlignments(Table.ALIGN_LEFT)
                      .withRowLimit(numberOfMethods + 1)
                      .addRow(MODIFIERS_COLUMN, "Method signature", "Return type");

      methods.forEach(
        m -> {
          String modifiers = m.getModifiers().stream().map(Modifier::toString).collect(Collectors.joining(" "));
          TypeMirror mirror = m.getReturnType();
          ExecutableElement overriddenMethod = findOverriddenMethod(m, typeUtils);
          MethodLink link = new MethodLink(new OverriddenMethodSignature(m, overriddenMethod));
          tableEntries.addRow(
                  modifiers.isEmpty()? "" : new BoldText(modifiers),
                  link.generate(),
                  Sanitizers.sanitizePackageNames(mirror.toString()));
        });

      methodsTable.append(tableEntries.build());
      summary.append(methodsTable).append("\n");
    }

    return summary.toString();
  }

  /** @return markdown string representation of class fields */
  private static String generateFieldSummary(TypeElement classElement) {

    StringBuilder summary = new StringBuilder();

    Set<VariableElement> fields = MarkletTypeUtils.findClassFields(classElement);
    int numberOfFields = fields.size();
    if (numberOfFields > 0) {

      Heading tableHeading = new Heading(FIELDS, 4);
      StringBuilder fieldsTable = new StringBuilder().append(tableHeading).append("\n");
      Table.Builder tableEntries =
              new Table.Builder()
                      .withAlignments(Table.ALIGN_LEFT)
                      .withRowLimit(numberOfFields + 1)
                      .addRow(MODIFIERS_COLUMN, "Field name", TYPE_COLUMN);

      for (VariableElement f : fields) {
        FieldSignature signature = new FieldSignature(f);
        String modifiers = signature.modifiersToString();
        TypeMirror typeMirror = f.asType();
        String sanitizedType = Sanitizers.sanitizePackageNames(typeMirror.toString());
        tableEntries.addRow(modifiers.isEmpty()? "" : new BoldText(modifiers), new FieldLink(signature).generate(), sanitizedType);
      }
      fieldsTable.append(tableEntries.build());
      summary.append(fieldsTable).append("\n");
    }
    return summary.toString();
  }

  /** @return markdown string representation of class constructors */
  private static String generateConstructorSummary(TypeElement classElement) {

    Set<ExecutableElement> ctors = MarkletTypeUtils.findClassConstructors(classElement);
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
        tableEntries.addRow(modifiers.isEmpty()? "" : modifiers, c.toString());
      }

      constructorsTable.append(tableEntries.build());
      summary.append(constructorsTable).append("\n");
    }
    return summary.toString();
  }

}
