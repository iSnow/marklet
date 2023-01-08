package io.github.atlascommunity.marklet.pages;


import com.sun.source.util.DocTrees;
import io.github.atlascommunity.marklet.Options;
import io.github.atlascommunity.marklet.util.TypeUtils;

import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;

import java.util.Set;

import static io.github.atlascommunity.marklet.constants.Labels.CONSTRUCTORS;

/** Class constructors description */

public class ClassConstructorsInfo extends ClassMethodsInfo {

  public ClassConstructorsInfo(TypeElement classElement, DocTrees treeUtils, Options options) {
    super(classElement, treeUtils, options);
    key = CONSTRUCTORS;
  }

  @Override
  Set<ExecutableElement> findElements() {
    return TypeUtils.findClassConstructors(classElement);
  }

  @Override
  String signatureString(ExecutableElement doc) {
    return doc.toString();
  }
}
