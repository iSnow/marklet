package io.github.atlascommunity.marklet.pages;

import io.github.atlascommunity.marklet.util.TypeUtils;
import lombok.RequiredArgsConstructor;
import net.steppschuh.markdowngenerator.text.heading.Heading;

import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.TypeMirror;
import java.util.Arrays;
import java.util.Set;

import static io.github.atlascommunity.marklet.constants.Labels.FIELDS;

/** Class fields description */
@RequiredArgsConstructor
public class ClassFieldsInfo implements ClassPageElement {

  /** Class information */
  private final TypeElement classElement;

  /** @return markdown string representation of document part */
  @Override
  public String generate() {

    Set<VariableElement> fields = TypeUtils.findClassFields(classElement);
    int numberOfFields = fields.size();
    if (numberOfFields > 0) {
      Heading sectionHeading = new Heading(FIELDS, 1);
      StringBuilder fieldsInfo = new StringBuilder().append(sectionHeading).append("\n");
      fields.forEach(
                f -> {
                  TypeMirror typeMirror = f.asType();
                  String headingText = String.format("%s %s", typeMirror, f.getSimpleName());
                  StringBuilder fieldDescription =
                          new StringBuilder().append(new Heading(headingText, 2)).append("\n");
                  //String fieldComment =
                  //        f.commentText().isEmpty() ? "No description provided" : f.commentText();
                  //fieldDescription.append(fieldComment).append("\n");
                  fieldsInfo.append(fieldDescription).append("\n");
                });

      return fieldsInfo.toString();
    }
    return "";
  }
}
