package io.github.atlascommunity.marklet.pages;

import com.sun.source.doctree.DocCommentTree;
import com.sun.source.doctree.DocTree;
import lombok.AllArgsConstructor;

import java.util.*;
import static com.sun.source.doctree.DocTree.Kind.*;

@AllArgsConstructor
public class ParameterBlock implements ClassPageElement{

    private final DocCommentTree comments;

    private static final DocTree.Kind[] tags = {THROWS, PARAM, RETURN, AUTHOR, SEE, SINCE, VERSION};

    private static final Map<DocTree.Kind, Integer> ordering = new HashMap<>();

    static {
        for (int i = 0; i < tags.length; i++) {
            ordering.put(tags[i], i);
        }
    }


    @Override
    public String generate() {
        StringBuilder description = new StringBuilder();
        if ((null != comments) && (null != comments.getBlockTags())) {
            Map<DocTree.Kind, String> dictionary = new HashMap<>();

            List<? extends DocTree> blockTags = comments.getBlockTags();
            for (DocTree dt : blockTags){
                DocTree.Kind kind = dt.getKind();
                dictionary.put(kind, dt.toString());
            }

            Set<DocTree.Kind> sortedKeys = new TreeSet<>((o1, o2) -> {
                Integer i1 = ordering.get(o1);
                Integer i2 = ordering.get(o2);
                if ((null == i1) ||(null == i2)) {
                    return -1;
                }
                return i1.compareTo(i2);
            });
            sortedKeys.addAll(dictionary.keySet());
            for (DocTree.Kind dt : sortedKeys){
                description.append(dictionary.get(dt)).append("\n").append("\n");
            }

        }
        return description.toString();
    }
}
