package io.github.atlascommunity.marklet.pages;

import com.sun.javadoc.ClassDoc;

import lombok.RequiredArgsConstructor;

/** Class document title */
@RequiredArgsConstructor
public class ClassQualifiedPathInfo implements ClassPageElement {

  /** Class information */
  private final ClassDoc classDoc;

  /** @return markdown string representation of document part */
  @Override
  public String generate() {

    return classDoc.qualifiedName();
  }
}
