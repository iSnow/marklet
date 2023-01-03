package io.github.atlascommunity.marklet.pages;

import com.sun.source.doctree.DocCommentTree;
import lombok.RequiredArgsConstructor;

import java.util.stream.Collectors;

@RequiredArgsConstructor
public class ClassHeaderCommentInfo  implements ClassPageElement{

    private final DocCommentTree comments;

    @Override
    public String generate() {
        if (null == comments)
            return "";
        return comments.getFullBody().stream().map(Object::toString).collect(Collectors.joining());
    }
}
