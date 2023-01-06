package io.github.atlascommunity.marklet.pages;

import lombok.RequiredArgsConstructor;

import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import java.util.ArrayList;
import java.util.List;

/** Forms readable method signature */
@RequiredArgsConstructor
public class MethodSignature implements ClassPageElement{

  /** Method information */
  private final ExecutableElement methodInfo;

  /**
   * Form description from method information
   *
   * @return method signature string
   */
  public String generate() {

    String methodName = methodInfo.getSimpleName().toString();
    List<? extends VariableElement> parameters = methodInfo.getParameters();
    return methodName + methodParams(parameters);
  }

  /**
   * Form doubled bracket params description
   *
   * @param parameters method params information
   * @return formed string
   */
  private String methodParams(List<? extends VariableElement> parameters) {

    List<String> parametersFormed = new ArrayList<>();
    parameters.forEach(p -> {
      TypeMirror mirror = p.asType();
      String name = p.getSimpleName().toString();
      TypeKind kind = mirror.getKind();
      String typeName = "";
      if (kind.equals(TypeKind.DECLARED)) {
        Element element = ((DeclaredType) mirror).asElement();
        if (((DeclaredType)mirror).getTypeArguments().size() > 0) {
          typeName = mirror.toString();
        } else {
          typeName = element.getSimpleName().toString();
        }
      } else if (kind.equals(TypeKind.ARRAY)) {
        typeName = mirror.toString();
      } else {
        typeName = mirror.toString();
      }
      parametersFormed.add(typeName + " " + name);
    });
    return String.format("(%s)", String.join(", ", parametersFormed));
  }
}
