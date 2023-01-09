package io.github.atlascommunity.marklet.pages;

import com.sun.source.doctree.DocCommentTree;
import io.github.atlascommunity.marklet.util.Sanitizers;
import lombok.RequiredArgsConstructor;

import java.util.stream.Collectors;

@RequiredArgsConstructor
public class ClassHeaderCommentInfo  implements ClassPageElement{

    private final DocCommentTree comments;

    @Override
    public String generate() {
        if (null == comments)
            return "";
        String rawVal = comments.getFullBody().stream().map(Object::toString).collect(Collectors.joining());
        return Sanitizers.sanitizeHtmlTags(rawVal);
    }
}
