package io.github.atlascommunity.marklet.builders;

import java.io.IOException;

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

    StringBuilder pageTitle =
        new StringBuilder()
            .append(new Heading(new ClassTitle(classDoc).generate(), 1))
            .append("\n");

    pageTitle.append(new ClassSummary(classDoc).generate());

    String constructorsInfo = new ClassConstructorInfo(classDoc, options).generate();
    if (!constructorsInfo.isEmpty()) pageTitle.append(constructorsInfo);
  }
}
