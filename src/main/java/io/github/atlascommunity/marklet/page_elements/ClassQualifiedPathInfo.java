package io.github.atlascommunity.marklet.page_elements;

import lombok.RequiredArgsConstructor;

import javax.lang.model.element.TypeElement;

/** Class document title */
@RequiredArgsConstructor
public class ClassQualifiedPathInfo implements ClassPageElement {

  /** Class information */
  private final TypeElement classElement;

  /** @return markdown string representation of document part */
  @Override
  public String generate() {

    return classElement.getQualifiedName().toString();
  }
}
