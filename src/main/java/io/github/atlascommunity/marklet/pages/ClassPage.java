package io.github.atlascommunity.marklet.pages;

import com.sun.source.doctree.DocCommentTree;
import com.sun.source.util.DocTrees;
import io.github.atlascommunity.marklet.Options;
import io.github.atlascommunity.marklet.util.TypeUtils;
import jdk.javadoc.doclet.Reporter;
import lombok.RequiredArgsConstructor;
import net.steppschuh.markdowngenerator.text.heading.Heading;

import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;

/** Markdown text file with class information */
@RequiredArgsConstructor
public class ClassPage implements DocumentPage {

  /** Class information */
  private final TypeElement classElement;

  private final DocTrees treeUtils;

  private final DocCommentTree comments;

  /** Doclet options */
  private final Options options;

  private final String packageName;

  /** Creates markdown text file */
  @Override
  public void build(Reporter reporter) throws IOException {

    StringBuilder classPage =
        new StringBuilder()
            .append(new Heading(new ClassTitle(classElement).generate(), 1))
            .append("\n");

    classPage.append(new ClassHeaderCommentInfo(comments).generate()).append("\n\n");
    classPage.append(new ClassQualifiedPathInfo(classElement).generate()).append(" ");
    classPage.append(new ClassSummary(classElement).generate()).append("\n");

    String constructorsInfo = new ClassConstructorsInfo(classElement, treeUtils, options).generate();
    if (!constructorsInfo.isEmpty()) classPage.append(constructorsInfo).append("\n");

    String fieldsInfo = new ClassFieldsInfo(classElement, treeUtils).generate();
    if (!fieldsInfo.isEmpty()) classPage.append(fieldsInfo).append("\n");

    String methodsInfo = new ClassMethodsInfo(classElement, treeUtils, options).generate();
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

    String packageLayout = packageName.replace('.', '/');
    Path resolvedOutputDir = Paths.get(options.getOutputDirectory(), packageLayout);
    if (!Files.exists(resolvedOutputDir)) Files.createDirectories(resolvedOutputDir);

    Path filename = Paths.get(classElement.getSimpleName() + "." + options.getFileEnding());
    Path resolvedFilePath = resolvedOutputDir.resolve(filename);

    FileOutputStream outputStream = new FileOutputStream(resolvedFilePath.toString());

    try (Writer readmeFile = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8)) {
      readmeFile.write(classPage.toString());
    }
  }
}
