package io.github.atlascommunity.marklet.page_elements;

import io.github.atlascommunity.marklet.util.MethodSignature;
import lombok.RequiredArgsConstructor;

import javax.lang.model.element.ExecutableElement;

/** Forms readable method signature */
@RequiredArgsConstructor
public class MethodSignatureElement implements ClassPageElement{

  /** Method information */
  final ExecutableElement methodInfo;


  /**
   * Form description from method information
   *
   * @return method signature string
   */
  public String generate() {
    MethodSignature signature = new MethodSignature(methodInfo);
    return signature.toString();
  }
}
