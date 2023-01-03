package io.github.atlascommunity.marklet.pages;


import io.github.atlascommunity.marklet.Options;
import io.github.atlascommunity.marklet.util.TypeUtils;
import lombok.RequiredArgsConstructor;
import net.steppschuh.markdowngenerator.text.heading.Heading;

import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.TypeMirror;
import java.util.Set;
import java.util.stream.Collectors;

import static io.github.atlascommunity.marklet.constants.Labels.CONSTRUCTORS;

/** Class constructors description */
@RequiredArgsConstructor
public class ClassConstructorsInfo implements ClassPageElement {

  /** Class information */
  private final TypeElement classElement;

  /** Doclet options */
  private final Options options;

  /** @return markdown string representation of document part */
  @Override
  public String generate() {
    Set<Element> constructors = TypeUtils.findClassConstructors(classElement);

    if (constructors.size() > 0) {
      Heading sectionHeading = new Heading(CONSTRUCTORS, 1);
      StringBuilder constructorsInfo = new StringBuilder().append(sectionHeading).append("\n");
      constructors.forEach(c -> constructorsInfo.append(constructorDescription((ExecutableElement)c)).append("\n"));

      return constructorsInfo.toString();
    }

    return "";
  }

  /**
   * @param doc constructor representation
   * @return markdown string
   */
  private String constructorDescription(ExecutableElement doc) {

    TypeMirror typeMirror = doc.asType();
    String s = typeMirror.toString();
    TypeMirror returnType = doc.getReturnType();
    String s1 = returnType.toString();
    String s2 = doc.toString();


    String signatureHeader = doc.toString();
    //String signatureHeader = String.format("%s %s", doc.getSimpleName(), doc.flatSignature());
    Heading heading = new Heading(signatureHeader, 2);
    StringBuilder description = new StringBuilder().append(heading).append("\n");


    /*
    Tag[] tags = doc.inlineTags();
    if (tags.length > 0) {
      Arrays.stream(tags)
          .forEach(
              t -> {
                String processedTag = new MarkdownTag(t, options.getFileEnding()).create();
                description.append(processedTag).append("\n");
              });
    }

     */
/*
    ParamTree[] parameters = doc.paramTags();
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
   */
    return description.toString();
  }
}
