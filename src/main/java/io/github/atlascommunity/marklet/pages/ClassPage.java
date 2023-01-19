package io.github.atlascommunity.marklet.pages;

import com.sun.source.doctree.DocCommentTree;
import com.sun.source.util.DocTrees;
import io.github.atlascommunity.marklet.Options;
import io.github.atlascommunity.marklet.page_elements.*;
import jdk.javadoc.doclet.DocletEnvironment;
import jdk.javadoc.doclet.Reporter;
import lombok.RequiredArgsConstructor;
import net.steppschuh.markdowngenerator.text.heading.Heading;

import javax.lang.model.element.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/** Markdown text file with class information */
@RequiredArgsConstructor
public class ClassPage extends DocumentPage {

  /** Class information */
  private final TypeElement classElement;

  private final DocTrees treeUtils;

  private final DocCommentTree comments;

  private final DocletEnvironment environment;

  /** Doclet options */
  private final Options options;

  private final String packageName;

  private final Reporter reporter;

  /** Creates markdown text file */
  @Override
  public String build() throws IOException {
    StringBuilder classPage =
        new StringBuilder()
            .append(new Heading(new ClassTitle(classElement).generate(), 1))
            .append("\n");

    boolean generateConstructors = (!classElement.getKind().equals(ElementKind.ENUM))
            && classElement.getKind().equals(ElementKind.RECORD);

    classPage.append(new ClassHeaderCommentInfo(comments, classElement, options).generate()).append("\n\n");
    classPage.append(new ClassQualifiedPathInfo(classElement).generate()).append(" ");
    classPage.append(new ClassSummary(classElement, environment.getTypeUtils(), treeUtils).generate()).append("\n");

    if (generateConstructors) {
      String constructorsInfo = new ClassConstructorsInfo(classElement, treeUtils, options).generate();
      if (!constructorsInfo.isEmpty()) classPage.append(constructorsInfo);
    }

    String fieldsInfo = new ClassFieldsInfo(classElement, treeUtils).generate();
    if (!fieldsInfo.isEmpty()) classPage.append(fieldsInfo);

    String methodsInfo = new ClassMethodsInfo(classElement, treeUtils, environment.getTypeUtils(), options).generate();
    if (!methodsInfo.isEmpty()) classPage.append(methodsInfo);

    return classPage.toString();
  }


  @Override
  public void write() throws IOException {
    String filename = classElement.getSimpleName().toString();
    String packageLayout = packageName.replace('.', '/');
    Path resolvedOutputDir = Paths.get(options.getOutputDirectory(), packageLayout);
    if (!Files.exists(resolvedOutputDir)) Files.createDirectories(resolvedOutputDir);
    write(build(), filename, resolvedOutputDir, options);
  }
}
