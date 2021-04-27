package io.github.atlascommunity.marklet.pages;

import static io.github.atlascommunity.marklet.constants.Labels.ANNOTATION;
import static io.github.atlascommunity.marklet.constants.Labels.CLASS;
import static io.github.atlascommunity.marklet.constants.Labels.ENUMERATION;
import static io.github.atlascommunity.marklet.constants.Labels.INTERFACE;

import com.sun.javadoc.ClassDoc;

import lombok.RequiredArgsConstructor;

/** Class document title */
@RequiredArgsConstructor
public class ClassTitle implements ClassPageElement {

  /** Class information */
  private final ClassDoc classDoc;

  /** @return markdown string representation of document part */
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

    StringBuilder title = builder.append(' ').append(classDoc.name());

    return title.toString();
  }
}
