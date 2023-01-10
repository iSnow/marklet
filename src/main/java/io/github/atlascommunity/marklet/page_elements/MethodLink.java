package io.github.atlascommunity.marklet.page_elements;

import io.github.atlascommunity.marklet.util.MethodSignature;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MethodLink implements ClassPageElement{

    private final MethodSignature signature;

    @Override
    public String generate() {
        String linkTarget = signature.toLinkTarget();
        String linkName = signature.toString();
        return String.format("[%s](#%s)", linkName, linkTarget);
    }
}
