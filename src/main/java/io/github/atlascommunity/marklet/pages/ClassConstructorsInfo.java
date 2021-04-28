package io.github.atlascommunity.marklet.pages;

import static io.github.atlascommunity.marklet.constants.Labels.CONSTRUCTORS;
import static io.github.atlascommunity.marklet.constants.Labels.PARAMETERS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.ExecutableMemberDoc;
import com.sun.javadoc.ParamTag;
import com.sun.javadoc.Tag;

import io.github.atlascommunity.marklet.Options;
import lombok.RequiredArgsConstructor;
import net.steppschuh.markdowngenerator.list.UnorderedList;
import net.steppschuh.markdowngenerator.text.heading.Heading;

/** Class constructors description */
@RequiredArgsConstructor
public class ClassConstructorsInfo implements ClassPageElement {

  /** Class information */
  private final ClassDoc classDoc;

  /** Doclet options */
  private final Options options;

  /** @return markdown string representation of document part */
  @Override
  public String generate() {

    if (classDoc.constructors().length > 0) {
      Heading sectionHeading = new Heading(CONSTRUCTORS, 1);
      StringBuilder constructorsInfo = new StringBuilder().append(sectionHeading).append("\n");
      Arrays.stream(classDoc.constructors())
          .forEach(c -> constructorsInfo.append(constructorDescription(c)).append("\n"));

      return constructorsInfo.toString();
    }

    return "";
  }

  /**
   * @param doc constructor representation
   * @return markdown string
   */
  private String constructorDescription(ExecutableMemberDoc doc) {

    String signatureHeader = String.format("%s %s", doc.name(), doc.flatSignature());
    Heading heading = new Heading(signatureHeader, 2);
    StringBuilder description = new StringBuilder().append(heading).append("\n");

    Tag[] tags = doc.inlineTags();
    if (tags.length > 0) {
      Arrays.stream(tags)
          .forEach(
              t -> {
                String processedTag = new MarkdownTag(t, options.getFileEnding()).create();
                description.append(processedTag).append("\n");
              });
    }

    ParamTag[] parameters = doc.paramTags();
    if (parameters.length > 0) {
      Heading parametersHeading = new Heading(PARAMETERS, 3);
      StringBuilder parametersInfo = new StringBuilder().append(parametersHeading).append("\n");
      List<String> entities = new ArrayList<>();
      Arrays.stream(parameters)
          .forEach(
              p -> {
                String parameterComment = p.parameterComment();
                String parameterEntity =
                    String.format(
                        "%s: %s",
                        p.parameterName(),
                        parameterComment.isEmpty() ? "No description provided" : parameterComment);
                entities.add(parameterEntity);
              });

      parametersInfo.append(new UnorderedList<>(entities));
      description.append(parametersInfo);
    }

    return description.toString();
  }
}
