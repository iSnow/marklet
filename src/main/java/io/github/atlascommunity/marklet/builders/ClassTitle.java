package io.github.atlascommunity.marklet.builders;

import static io.github.atlascommunity.marklet.constants.Labels.ANNOTATION;
import static io.github.atlascommunity.marklet.constants.Labels.CLASS;
import static io.github.atlascommunity.marklet.constants.Labels.ENUMERATION;
import static io.github.atlascommunity.marklet.constants.Labels.INTERFACE;

import com.sun.javadoc.ClassDoc;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ClassTitle implements ClassPageElement {

  private final ClassDoc classDoc;

  @Override
  public String generate() {

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
