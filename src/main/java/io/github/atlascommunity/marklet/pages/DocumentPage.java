package io.github.atlascommunity.marklet.pages;

import java.io.IOException;

/** Common interface for all classes, representing markdown documents */
public interface DocumentPage {

  /**
   * Build document and write it to the selected folder
   *
   * @throws IOException something went wrong during write operation
   */
  void build() throws IOException;
}
