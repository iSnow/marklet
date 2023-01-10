package io.github.atlascommunity.marklet.pages;

import io.github.atlascommunity.marklet.Options;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

/** Common interface for all classes, representing markdown documents */
public abstract class DocumentPage implements DocumentPageInterface{

  /**
   * Build document and write it to the selected folder
   *
   * @throws IOException something went wrong during write operation
   */
  void write(String document, String fileName, Path resolvedOutputDir, Options options) throws IOException {
    Path outputDir = (null != resolvedOutputDir) ? resolvedOutputDir : Paths.get(options.getOutputDirectory());

    try (FileOutputStream outStream
                 = new FileOutputStream(new File(outputDir.toFile(), fileName + "." +options.getFileEnding()));
         Writer readmeFile = new OutputStreamWriter(outStream, StandardCharsets.UTF_8)) {
      readmeFile.write(document);
    }
  };
}
