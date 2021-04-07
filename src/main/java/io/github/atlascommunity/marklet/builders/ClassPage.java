package io.github.atlascommunity.marklet.builders;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.sun.javadoc.ClassDoc;

import io.github.atlascommunity.marklet.MarkletOptions;
import lombok.RequiredArgsConstructor;
import net.steppschuh.markdowngenerator.text.heading.Heading;

@RequiredArgsConstructor
public class ClassPage implements DocumentPage {

  private final ClassDoc classDoc;

  private final MarkletOptions options;

  @Override
  public void build() throws IOException {

    StringBuilder classPage =
        new StringBuilder()
            .append(new Heading(new ClassTitle(classDoc).generate(), 1))
            .append("\n");

    classPage.append(new ClassSummary(classDoc).generate());

    String constructorsInfo = new ClassConstructorsInfo(classDoc, options).generate();
    if (!constructorsInfo.isEmpty()) classPage.append(constructorsInfo);

    String fieldsInfo = new ClassFieldsInfo(classDoc).generate();
    if (!fieldsInfo.isEmpty()) classPage.append(fieldsInfo);

    String methodsInfo = new ClassMethodsInfo(classDoc).generate();
    if (!methodsInfo.isEmpty()) classPage.append(methodsInfo);

    writeFile(classPage);
  }

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
