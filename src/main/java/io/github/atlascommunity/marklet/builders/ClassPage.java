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

import com.sun.javadoc.ClassDoc;

import lombok.RequiredArgsConstructor;
import net.steppschuh.markdowngenerator.text.heading.Heading;

@RequiredArgsConstructor
public class ClassPage implements DocumentPage {

  private final ClassDoc classDoc;

  @Override
  public void build() throws IOException {

    StringBuilder pageTitle =
        new StringBuilder().append(new Heading(generateTitle(), 1)).append("\n");

    String pageSummary = generateSummary();
    if (!pageSummary.isEmpty()) pageTitle.append(pageSummary);
  }

  private String generateSummary() {
    StringBuilder summary = new StringBuilder().append(new Heading(SUMMARY, 2)).append("\n");
    if (classDoc.fields().length > 0) {
      summary.append(new Heading(FIELDS, 4)).append("\n");
      // TODO table
    }

    if (classDoc.methods().length > 0) {
      summary.append(new Heading(METHODS, 4)).append("\n");
      // TODO table
    }

    if (classDoc.constructors().length > 0) {
      summary.append(new Heading(CONSTRUCTORS, 4)).append("\n");
      // TODO table
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
