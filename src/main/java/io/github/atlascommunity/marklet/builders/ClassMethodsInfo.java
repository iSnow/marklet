package io.github.atlascommunity.marklet.builders;

import static io.github.atlascommunity.marklet.constants.Labels.METHODS;
import static io.github.atlascommunity.marklet.constants.Labels.PARAMETERS;
import static io.github.atlascommunity.marklet.constants.Labels.RETURNS;
import static io.github.atlascommunity.marklet.constants.Labels.THROWS;

import java.util.Arrays;

import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.MethodDoc;
import com.sun.javadoc.ParamTag;
import com.sun.javadoc.Tag;
import com.sun.javadoc.ThrowsTag;

import lombok.RequiredArgsConstructor;
import net.steppschuh.markdowngenerator.text.heading.Heading;

@RequiredArgsConstructor
public class ClassMethodsInfo implements ClassPageElement {

  private final ClassDoc classDoc;

  private static final String DESCRIPTION_PATTERN = "%s : %s";

  @Override
  public String generate() {

    if (classDoc.methods().length > 0) {
      Heading sectionHeading = new Heading(METHODS, 1);
      StringBuilder methodsInfo = new StringBuilder().append(sectionHeading).append("\n");
      Arrays.stream(classDoc.methods())
          .filter(m -> m.overriddenMethod() == null)
          .forEach(m -> methodsInfo.append(methodDescription(m)).append("\n"));

      return methodsInfo.toString();
    }

    return "";
  }

  private String methodDescription(MethodDoc methodDoc) {
    String methodHeader = String.format("%s %s", methodDoc.name(), methodDoc.flatSignature());
    Heading heading = new Heading(methodHeader, 2);
    StringBuilder description =
        new StringBuilder()
            .append(heading)
            .append("\n")
            .append(methodDoc.commentText())
            .append("\n");

    ParamTag[] paramTags = methodDoc.paramTags();
    if (paramTags.length > 0) {
      Heading parametersHeading = new Heading(PARAMETERS, 3);
      StringBuilder parametersInfo = new StringBuilder().append(parametersHeading).append("\n");
      Arrays.stream(paramTags)
          .forEach(
              p -> {
                String paramDesc =
                    String.format(DESCRIPTION_PATTERN, p.parameterName(), p.parameterComment());
                parametersInfo.append(paramDesc);
              });
      description.append(parametersInfo);
    }

    Tag[] returnTags = methodDoc.tags("return");
    if (returnTags.length > 0) {
      String returnInfo =
          new Heading(RETURNS, 3)
              + "\n"
              + String.format(DESCRIPTION_PATTERN, returnTags[0].name(), returnTags[0].text());
      description.append(returnInfo);
    }

    ThrowsTag[] throwsTags = methodDoc.throwsTags();
    if (throwsTags.length > 0) {
      Heading exceptionsHeading = new Heading(THROWS, 3);
      StringBuilder exceptionsInfo = new StringBuilder().append(exceptionsHeading).append("\n");
      Arrays.stream(throwsTags)
          .forEach(
              t ->
                  exceptionsInfo.append(
                      String.format(DESCRIPTION_PATTERN, t.exception(), t.exceptionComment())));
      description.append(exceptionsInfo);
    }

    return description.toString();
  }
}
