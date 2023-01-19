package io.github.atlascommunity.marklet.page_elements;

import io.github.atlascommunity.marklet.util.MarkletTypeUtils;
import lombok.RequiredArgsConstructor;

import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.TypeMirror;
import java.util.List;
import java.util.stream.Collectors;

import static io.github.atlascommunity.marklet.constants.Labels.*;
import static io.github.atlascommunity.marklet.util.Sanitizers.sanitizeSuperClass;

/** Class document title */
@RequiredArgsConstructor
public class ClassTitle implements ClassPageElement {

  /** Class information */
  private final TypeElement classElement;

  /** @return markdown string representation of document part */
  @Override
  public String generate() {

    StringBuilder builder = new StringBuilder();
    switch (classElement.getKind()) {
      case ENUM -> {
        builder.append(ENUMERATION);
      }
      case CLASS -> {
        builder.append(CLASS);
      }
      case ANNOTATION_TYPE -> {
        builder.append(ANNOTATION);
      }
      case INTERFACE -> {
        builder.append(INTERFACE);
      }
      case RECORD -> {
        builder.append(RECORD);
      }
      default -> {
        builder.append(UNKNOWN);
      }
    }

    StringBuilder title = builder.append(' ').append(classElement.getSimpleName());

    List<? extends TypeMirror> implementedInterfaces = MarkletTypeUtils.findImplementedInterfaces(classElement);
    if (!classElement.getKind().equals(ElementKind.ENUM)) {
      if (!implementedInterfaces.isEmpty()) {
        title.append(" implements ");
        String interfaceStr = implementedInterfaces
                .stream()
                .map(TypeMirror::toString)
                .collect(Collectors.joining(", "));
        title.append(interfaceStr);
      }

      String superclass = sanitizeSuperClass(classElement.getSuperclass());
      if (!superclass.isEmpty()) {
        title.append(" extends ");
        title.append(superclass);
      }
    }
    return title.toString();
  }
}
