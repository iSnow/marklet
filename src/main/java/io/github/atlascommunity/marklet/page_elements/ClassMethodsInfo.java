package io.github.atlascommunity.marklet.page_elements;

import com.sun.source.doctree.DocCommentTree;
import com.sun.source.util.DocTrees;
import io.github.atlascommunity.marklet.Options;
import io.github.atlascommunity.marklet.util.MarkletTypeUtils;
import net.steppschuh.markdowngenerator.text.heading.Heading;

import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.util.Types;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static io.github.atlascommunity.marklet.constants.Labels.METHODS;
import static io.github.atlascommunity.marklet.constants.Labels.OVERRIDES;
import static io.github.atlascommunity.marklet.util.MarkletTypeUtils.findOverriddenMethod;

/** Class methods description */

public class ClassMethodsInfo implements ClassPageElement {

  /** Class information */
  final TypeElement classElement;

  final DocTrees treeUtils;

  final Types typeUtils;

  /** Doclet options */
  final Options options;

  String key = METHODS;

  /** Pattern for colon separated description */
  private static final String DESCRIPTION_PATTERN = "%s: %s";



  public ClassMethodsInfo(TypeElement classElement, DocTrees treeUtils, Types typeUtils, Options options) {
    this.classElement = classElement;
    this.treeUtils = treeUtils;
    this.typeUtils = typeUtils;
    this.options = options;
  }

  /** @return markdown string representation of document part */
  @Override
  public String generate() {
    Set<ExecutableElement> methods = findElements();

    if (methods.size() > 0) {
      Heading sectionHeading = new Heading(key, 1);
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
   * @param methodInfo method representation
   * @return markdown string
   */
  private String methodDescription(ExecutableElement methodInfo) {

    String signatureString = signatureString(methodInfo);
    Heading heading = new Heading(signatureString, 2);
    StringBuilder description =
            new StringBuilder().append(heading).append("\n");
    DocCommentTree comments = treeUtils.getDocCommentTree(methodInfo);
    ExecutableElement overriddenMethod = null;
    if (null != typeUtils) {
      overriddenMethod = findOverriddenMethod(methodInfo, typeUtils);
      if (null != overriddenMethod) {
        Heading overrideHeading = new Heading(OVERRIDES, 3);
        description
                .append(overrideHeading).append("\n")
                .append(new MethodSignatureElement(overriddenMethod).generate())
                .append(" from ");
        TypeElement overriddenClass = (TypeElement) overriddenMethod.getEnclosingElement();
        description.append(overriddenClass.getQualifiedName()).append("\n").append("\n");
      }
    }
    if (null == comments) {
      description.append("*No method description provided*").append("\n").append("\n");
    } else {
    String commentsStr = comments
            .getFullBody()
            .stream().map(Object::toString).collect(Collectors.joining());
      description.append(commentsStr).append("\n").append("\n");
    }
    List<? extends VariableElement> parameters = methodInfo.getParameters();
    CommentBlock block = new CommentBlock(comments, parameters);

    description.append(block.generate());
    /*
    String methodHeader;
    String name = methodInfo.name();
    String signature = methodInfo.flatSignature();
    if (methodInfo.overriddenMethod() != null) {
      methodHeader = String.format("%s %s %s", name, signature, new BoldText(OVERRIDE_MARK));
    } else {
      methodHeader = String.format("%s %s", name, signature);
    }

    Heading heading = new Heading(methodHeader, 2);
    String methodComment =
        methodInfo.commentText().isEmpty() ? "No method description provided" : methodInfo.commentText();
    StringBuilder description =
        new StringBuilder().append(heading).append("\n").append(methodComment).append("\n");

    ParamTag[] paramTags = methodInfo.paramTags();
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

    Tag[] returnTags = methodInfo.tags("return");
    if (returnTags.length > 0) {
      String returnInfo = new Heading(RETURNS, 3) + "\n" + returnTags[0].text();
      description.append(returnInfo).append("\n");
    }

    ThrowsTag[] throwsTags = methodInfo.throwsTags();
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

  Set<ExecutableElement> findElements() {
    return MarkletTypeUtils.findClassMethods(classElement);
  }

  String signatureString(ExecutableElement method) {
    return new MethodSignatureElement(method).generate();
  }
}
