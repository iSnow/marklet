package io.github.atlascommunity.marklet.pages;

import com.sun.source.doctree.DocCommentTree;
import com.sun.source.util.DocTrees;
import io.github.atlascommunity.marklet.util.TypeUtils;
import lombok.RequiredArgsConstructor;
import net.steppschuh.markdowngenerator.text.heading.Heading;

import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import java.util.Set;
import java.util.stream.Collectors;

import static io.github.atlascommunity.marklet.constants.Labels.*;

/** Class methods description */
@RequiredArgsConstructor
public class ClassMethodsInfo implements ClassPageElement {

  /** Class information */
  private final TypeElement classElement;

  private final DocTrees treeUtils;

  /** Pattern for colon separated description */
  private static final String DESCRIPTION_PATTERN = "%s: %s";

  private static final String OVERRIDE_MARK = "(Override)";

  /** @return markdown string representation of document part */
  @Override
  public String generate() {
    StringBuilder summary = new StringBuilder();
    Set<ExecutableElement> methods = TypeUtils.findClassMethods(classElement);

    int numberOfMethods = methods.size();
    if (numberOfMethods > 0) {
      Heading sectionHeading = new Heading(METHODS, 1);
      StringBuilder methodsInfo = new StringBuilder().append(sectionHeading).append("\n");
      methods.forEach(m -> methodsInfo.append(methodDescription(m)).append("\n"));
      return methodsInfo.toString();
    }
    return "";
  }

/*
    if (classElement.methods().length > 0) {
      Heading sectionHeading = new Heading(METHODS, 1);
      StringBuilder methodsInfo = new StringBuilder().append(sectionHeading).append("\n");
      Arrays.stream(classElement.methods())
          .forEach(m -> methodsInfo.append(methodDescription(m)).append("\n"));

      return methodsInfo.toString();
    }
*/

  /**
   * @param doc method representation
   * @return markdown string
   */
  private String methodDescription(ExecutableElement doc) {
    String methodHeader = new MethodSignature(doc).generate();
    Heading heading = new Heading(methodHeader, 2);
    StringBuilder description =
            new StringBuilder().append(heading).append("\n");
    DocCommentTree comments = treeUtils.getDocCommentTree(doc);
    if (null == comments) {
      description.append("*No method description provided*").append("\n").append("\n");
    } else {
      description.append(comments.getFullBody().stream().map(Object::toString).collect(Collectors.joining())).append("\n").append("\n");
    }
    ParameterBlock block = new ParameterBlock(comments);

    description.append(block.generate()).append("\n");
    /*
    String methodHeader;
    String name = doc.name();
    String signature = doc.flatSignature();
    if (doc.overriddenMethod() != null) {
      methodHeader = String.format("%s %s %s", name, signature, new BoldText(OVERRIDE_MARK));
    } else {
      methodHeader = String.format("%s %s", name, signature);
    }

    Heading heading = new Heading(methodHeader, 2);
    String methodComment =
        doc.commentText().isEmpty() ? "No method description provided" : doc.commentText();
    StringBuilder description =
        new StringBuilder().append(heading).append("\n").append(methodComment).append("\n");

    ParamTag[] paramTags = doc.paramTags();
    if (paramTags.length > 0) {
      Heading parametersHeading = new Heading(PARAMETERS, 3);
      StringBuilder parametersInfo = new StringBuilder().append(parametersHeading).append("\n");
      List<String> entities = new ArrayList<>();
      Arrays.stream(paramTags)
          .forEach(
              p -> {
                String parameterComment =
                    p.parameterComment().isEmpty()
                        ? "No parameter description provided"
                        : p.parameterComment();
                String paramDesc =
                    String.format(DESCRIPTION_PATTERN, p.parameterName(), parameterComment);
                entities.add(paramDesc);
              });
      parametersInfo.append(new UnorderedList<>(entities)).append("\n");
      description.append(parametersInfo);
    }

    Tag[] returnTags = doc.tags("return");
    if (returnTags.length > 0) {
      String returnInfo = new Heading(RETURNS, 3) + "\n" + returnTags[0].text();
      description.append(returnInfo).append("\n");
    }

    ThrowsTag[] throwsTags = doc.throwsTags();
    if (throwsTags.length > 0) {
      Heading exceptionsHeading = new Heading(THROWS, 3);
      StringBuilder exceptionsInfo = new StringBuilder().append(exceptionsHeading).append("\n");
      Arrays.stream(throwsTags)
          .forEach(
              t ->
                  exceptionsInfo.append(
                      String.format(
                          DESCRIPTION_PATTERN,
                          t.exception(),
                          t.exceptionComment().isEmpty()
                              ? "No description provided"
                              : t.exceptionComment())));
      description.append(exceptionsInfo).append("\n");
    }
    return description.toString();
*/
    return description.toString();
  }
}
