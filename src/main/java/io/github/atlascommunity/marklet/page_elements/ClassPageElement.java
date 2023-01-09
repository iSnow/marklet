package io.github.atlascommunity.marklet.page_elements;

/** Common interface for all page elements, representing a part of a class description file */
public interface ClassPageElement {

  /** @return markdown string representation of document part */
  String generate();
}
