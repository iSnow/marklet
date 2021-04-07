package io.github.atlascommunity.marklet.pages;

/** Common interface for all classes, representing parts of class description file */
public interface ClassPageElement {

  /** @return markdown string representation of document part */
  String generate();
}
