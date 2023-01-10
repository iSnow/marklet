package io.github.atlascommunity.marklet.page_elements;


import com.sun.source.util.DocTrees;
import io.github.atlascommunity.marklet.Options;
import io.github.atlascommunity.marklet.util.MarkletTypeUtils;

import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import java.util.Set;

import static io.github.atlascommunity.marklet.constants.Labels.CONSTRUCTORS;

/** Class constructors description */

public class ClassConstructorsInfo extends ClassMethodsInfo {

  public ClassConstructorsInfo(TypeElement classElement, DocTrees treeUtils, Options options) {
    super(classElement, treeUtils, null, options);
    key = CONSTRUCTORS;
  }

  @Override
  Set<ExecutableElement> findElements() {
    return MarkletTypeUtils.findClassConstructors(classElement);
  }

  @Override
  String signatureString(ExecutableElement method) {
    return method.toString();
  }
}
