package io.github.atlascommunity.marklet.util;

import lombok.RequiredArgsConstructor;

import javax.lang.model.element.Modifier;
import javax.lang.model.element.VariableElement;
import java.util.Set;
import java.util.stream.Collectors;

import static io.github.atlascommunity.marklet.util.Sanitizers.methodSignatureToLinkTarget;

/** Creates readable field signature */
@RequiredArgsConstructor
public class FieldSignature {

  /** Method information */
  final VariableElement fieldInfo;


  /**
   * Form description from method information
   *
   * @return method signature string
   */
  @Override
  public String toString() {

    String methodName = fieldInfo.getSimpleName().toString();
    return String.format("%s %s %s", modifiersToString(), typeToString(), methodName);
  }

  public String toLinkTarget() {
    String methodName = fieldInfo.getSimpleName().toString();
    String link = String.format("%s %s", typeToString(), methodName);
    return methodSignatureToLinkTarget(link);
  }

  public String modifiersToString() {
    return fieldModifiers(fieldInfo.getModifiers());
  }

  public String getName(){
    return fieldInfo.getSimpleName().toString();
  }

  public String typeToString() {
    return fieldInfo.asType().toString();
  }

  /**
   * Form doubled bracket params description
   *
   * @param parameters method params information
   * @return formed string
   */
  private static String fieldModifiers(Set<Modifier> parameters) {

    return parameters.stream()
            .map(Modifier::toString)
            .collect(Collectors.joining(" "));
  }
}
