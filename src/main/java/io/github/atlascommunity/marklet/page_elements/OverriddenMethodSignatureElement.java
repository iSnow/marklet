package io.github.atlascommunity.marklet.page_elements;

import io.github.atlascommunity.marklet.util.MethodSignature;
import net.steppschuh.markdowngenerator.text.emphasis.BoldText;

import javax.lang.model.element.ExecutableElement;

import static io.github.atlascommunity.marklet.constants.Labels.OVERRIDE_MARK;

/** Forms readable method signature */

public class OverriddenMethodSignatureElement extends MethodSignatureElement{

  private final ExecutableElement superClassMethodInfo;

  public OverriddenMethodSignatureElement(ExecutableElement methodInfo, ExecutableElement superClassMethodInfo) {
    super(methodInfo);
    this.superClassMethodInfo = superClassMethodInfo;
  }

  /**
   * Form description from method information
   *
   * @return method signature string
   */
  public String generate() {
    MethodSignature signature = new MethodSignature(methodInfo);

    if (null != superClassMethodInfo) {
      return String.format("%s %s", signature, new BoldText(OVERRIDE_MARK));
    }
    else {
      return String.format("%s", signature);
    }
  }
}
