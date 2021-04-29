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

  private final MethodDoc methodInfo;

  public String form() {

    String methodName = methodInfo.name();
    Parameter[] methodParameters = methodInfo.parameters();

    return methodName + methodParams(methodParameters);
  }

  private String methodParams(Parameter[] parameters) {

    List<String> parametersFormed = new ArrayList<>();
    Arrays.stream(parameters).forEach(p -> parametersFormed.add(p.typeName() + " " + p.name()));

    return "(" + String.join(",", parametersFormed) + ")";
  }
}
