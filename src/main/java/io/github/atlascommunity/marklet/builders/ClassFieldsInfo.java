package io.github.atlascommunity.marklet.builders;

import static io.github.atlascommunity.marklet.constants.Labels.FIELDS;

import java.util.Arrays;

import com.sun.javadoc.ClassDoc;

import lombok.RequiredArgsConstructor;
import net.steppschuh.markdowngenerator.text.heading.Heading;

@RequiredArgsConstructor
public class ClassFieldsInfo implements ClassPageElement {

  private final ClassDoc classDoc;

  @Override
  public String generate() {

    if (classDoc.fields().length > 0) {
      Heading sectionHeading = new Heading(FIELDS, 1);
      StringBuilder fieldsInfo = new StringBuilder().append(sectionHeading).append("\n");
      Arrays.stream(classDoc.fields())
          .forEach(
              f -> {
                String headingText = String.format("%s, %s", f.name(), f.type());
                Heading fieldHeading = new Heading(headingText, 2);
                String fieldComment = f.commentText();
                fieldsInfo.append(fieldHeading).append("\n").append(fieldComment).append("\n");
              });

      return fieldsInfo.toString();
    }

    return "";
  }
}
