package io.github.atlascommunity.marklet.builders;

import static io.github.atlascommunity.marklet.constants.Labels.METHODS;
import static io.github.atlascommunity.marklet.constants.Labels.PARAMETERS;
import static io.github.atlascommunity.marklet.constants.Labels.RETURNS;

import java.util.Arrays;

import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.MethodDoc;
import com.sun.javadoc.ParamTag;
import com.sun.javadoc.Tag;

import lombok.RequiredArgsConstructor;
import net.steppschuh.markdowngenerator.text.heading.Heading;

@RequiredArgsConstructor
public class ClassMethodsInfo implements ClassPageElement {

  private final ClassDoc classDoc;

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

    return null;
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
                String about = String.format("%s : %s", p.parameterName(), p.parameterComment());
                parametersInfo.append(about);
              });
      description.append(parametersInfo);
    }

    StringBuilder returnInfo = new StringBuilder().append(new Heading(RETURNS, 3)).append("\n");
    Tag methodReturns = methodDoc.tags("return")[0];
    if (methodReturns != null) {
      returnInfo.append(String.format("%s : %s", methodReturns.name(), methodReturns.text()));
    } else {
      returnInfo.append("No description provided").append("\n");
    }
    description.append(returnInfo);

    // TODO throws description and test

    return description.toString();
  }
}
