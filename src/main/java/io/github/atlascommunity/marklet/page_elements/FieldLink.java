package io.github.atlascommunity.marklet.page_elements;

import io.github.atlascommunity.marklet.util.FieldSignature;
import io.github.atlascommunity.marklet.util.MethodSignature;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FieldLink implements ClassPageElement{

    private final FieldSignature signature;

    @Override
    public String generate() {
        String linkTarget = signature.toLinkTarget();
        String linkName = signature.getName();
        return String.format("[%s](#%s)", linkName, linkTarget);
    }
}
