package io.github.atlascommunity.marklet.pages;

import lombok.RequiredArgsConstructor;
import net.steppschuh.markdowngenerator.text.heading.Heading;

import javax.lang.model.element.TypeElement;
import java.util.Arrays;

import static io.github.atlascommunity.marklet.constants.Labels.FIELDS;

/** Class fields description */
@RequiredArgsConstructor
public class ClassFieldsInfo implements ClassPageElement {

  /** Class information */
  private final TypeElement classElement;

  /** @return markdown string representation of document part */
  @Override
  public String generate() {
/*
    if (classElement.fields().length > 0) {
      Heading sectionHeading = new Heading(FIELDS, 1);
      StringBuilder fieldsInfo = new StringBuilder().append(sectionHeading).append("\n");
      Arrays.stream(classElement.fields())
          .forEach(
              f -> {
                String headingText = String.format("%s, %s", f.type(), f.name());
                StringBuilder fieldDescription =
                    new StringBuilder().append(new Heading(headingText, 2)).append("\n");
                String fieldComment =
                    f.commentText().isEmpty() ? "No description provided" : f.commentText();
                fieldDescription.append(fieldComment).append("\n");
                fieldsInfo.append(fieldDescription).append("\n");
              });

      return fieldsInfo.toString();
    }
*/
    return "";
  }
}
