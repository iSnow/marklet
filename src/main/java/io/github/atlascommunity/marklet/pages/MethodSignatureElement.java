package io.github.atlascommunity.marklet.pages;

import io.github.atlascommunity.marklet.util.MethodSignature;
import lombok.RequiredArgsConstructor;
import net.steppschuh.markdowngenerator.text.emphasis.BoldText;

import javax.lang.model.element.ExecutableElement;

import static io.github.atlascommunity.marklet.constants.Labels.OVERRIDE_MARK;

/** Forms readable method signature */
@RequiredArgsConstructor
public class MethodSignatureElement implements ClassPageElement{

  /** Method information */
  private final ExecutableElement methodInfo;

  private final ExecutableElement superClassMethodInfo;

  /**
   * Form description from method information
   *
   * @return method signature string
   */
  public String generate() {
    MethodSignature signature = new MethodSignature(methodInfo);

    if (null != superClassMethodInfo) {
      return String.format("%s %s", signature.toString(), new BoldText(OVERRIDE_MARK));
    }
    else {
      return String.format("%s", signature.toString());
    }
  }
}
