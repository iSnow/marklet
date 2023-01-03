package io.github.atlascommunity.marklet.pages;

import lombok.RequiredArgsConstructor;

import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;

import static io.github.atlascommunity.marklet.constants.Labels.*;

/** Class document title */
@RequiredArgsConstructor
public class ClassTitle implements ClassPageElement {

  /** Class information */
  private final TypeElement classElement;

  /** @return markdown string representation of document part */
  @Override
  public String generate() {

    StringBuilder builder = new StringBuilder();
    ElementKind kind = classElement.getKind();
    if (kind.equals(ElementKind.ANNOTATION_TYPE)) {
      builder.append(ANNOTATION);
    } else if (kind.equals(ElementKind.INTERFACE)) {
      builder.append(INTERFACE);
    } else if (kind.equals(ElementKind.ENUM)) {
      builder.append(ENUMERATION);
    } else if (kind.isClass()) {
      builder.append(CLASS);
    }

    StringBuilder title = builder.append(' ').append(classElement.getSimpleName());

    return title.toString();
  }
}
