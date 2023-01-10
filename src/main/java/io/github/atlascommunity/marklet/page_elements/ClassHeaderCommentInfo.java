package io.github.atlascommunity.marklet.page_elements;

import com.sun.source.doctree.DocCommentTree;
import com.sun.source.doctree.DocTree;
import io.github.atlascommunity.marklet.Options;
import lombok.RequiredArgsConstructor;

import javax.lang.model.element.TypeElement;

@RequiredArgsConstructor
public class ClassHeaderCommentInfo  implements ClassPageElement{

    private final DocCommentTree comments;

    private final TypeElement classElement;

    private final Options options;

    @Override
    public String generate() {
        if (null == comments)
            return "";
        StringBuffer commentInfo = new StringBuffer();
        for (DocTree tag : comments.getFullBody()) {
            commentInfo
                    .append(new MarkdownTag(tag, classElement.getSimpleName().toString(), options.getFileEnding()).create());
        }
        return commentInfo.toString();
        //String rawVal = comments.getFullBody().stream().map(Object::toString).collect(Collectors.joining());
        //return Sanitizers.sanitizeHtmlTags(rawVal);
    }
}
