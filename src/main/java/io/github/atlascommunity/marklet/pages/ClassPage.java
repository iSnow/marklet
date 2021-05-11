package io.github.atlascommunity.marklet.pages;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.sun.javadoc.ClassDoc;

import io.github.atlascommunity.marklet.Options;
import lombok.RequiredArgsConstructor;
import net.steppschuh.markdowngenerator.text.heading.Heading;

/** Markdown text file with class information */
@RequiredArgsConstructor
public class ClassPage implements DocumentPage {

  /** Class information */
  private final ClassDoc classDoc;

  /** Doclet options */
  private final Options options;

  /** Creates markdown text file */
  @Override
  public void build() throws IOException {

    StringBuilder classPage =
        new StringBuilder()
            .append(new Heading(new ClassTitle(classDoc).generate(), 1))
            .append("\n");

    classPage.append(new ClassQualifiedPathInfo(classDoc).generate()).append("\n");
    classPage.append(new ClassSummary(classDoc).generate()).append("\n");

    String constructorsInfo = new ClassConstructorsInfo(classDoc, options).generate();
    if (!constructorsInfo.isEmpty()) classPage.append(constructorsInfo).append("\n");

    String fieldsInfo = new ClassFieldsInfo(classDoc).generate();
    if (!fieldsInfo.isEmpty()) classPage.append(fieldsInfo).append("\n");

    String methodsInfo = new ClassMethodsInfo(classDoc).generate();
    if (!methodsInfo.isEmpty()) classPage.append(methodsInfo).append("\n");

    writeFile(classPage);
  }

  /**
   * Writes file to disk
   *
   * @param classPage markdown string with class information
   * @throws IOException If any error occurs during write process.
   */
  private void writeFile(StringBuilder classPage) throws IOException {

    String outputDirectory = options.getOutputDirectory();
    String packageLayout = classDoc.containingPackage().name().replace('.', '/');
    Path filename = Paths.get(classDoc.simpleTypeName() + "." + options.getFileEnding());

    FileOutputStream outputStream =
        new FileOutputStream(
            Paths.get(outputDirectory, packageLayout).resolve(filename).toString());

    try (Writer readmeFile = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8)) {
      readmeFile.write(classPage.toString());
    }
  }
}
