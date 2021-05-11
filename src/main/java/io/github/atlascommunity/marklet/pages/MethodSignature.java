package io.github.atlascommunity.marklet.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sun.javadoc.MethodDoc;
import com.sun.javadoc.Parameter;

import lombok.RequiredArgsConstructor;

/** Forms readable method signature */
@RequiredArgsConstructor
public class MethodSignature {

  /** Method information */
  private final MethodDoc methodInfo;

  /**
   * Form description from method information
   *
   * @return method signature string
   */
  public String form() {

    String methodName = methodInfo.name();
    Parameter[] methodParameters = methodInfo.parameters();

    return methodName + methodParams(methodParameters);
  }

  /**
   * Form doubled bracket params description
   *
   * @param parameters method params information
   * @return formed string
   */
  private String methodParams(Parameter[] parameters) {

    List<String> parametersFormed = new ArrayList<>();
    Arrays.stream(parameters).forEach(p -> parametersFormed.add(p.typeName() + " " + p.name()));

    return String.format("(%s)", String.join(",", parametersFormed));
  }
}
