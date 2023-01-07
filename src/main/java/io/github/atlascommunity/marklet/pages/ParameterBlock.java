package io.github.atlascommunity.marklet.pages;

import com.sun.source.doctree.*;
import io.github.atlascommunity.marklet.constants.Labels;
import lombok.AllArgsConstructor;
import net.steppschuh.markdowngenerator.text.heading.Heading;

import java.util.*;
import java.util.stream.Collectors;

import static com.sun.source.doctree.DocTree.Kind.*;
import static io.github.atlascommunity.marklet.constants.Labels.PARAMETERS;
import static io.github.atlascommunity.marklet.constants.Labels.RETURNS;

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
            Map<DocTree.Kind, List<DocTree>> dictionary = new HashMap<>();

            List<? extends DocTree> blockTags = comments.getBlockTags();
            for (DocTree dt : blockTags){
                DocTree.Kind kind = dt.getKind();
                List<DocTree> entries = dictionary.computeIfAbsent(kind, k -> new ArrayList<>());
                entries.add(dt);
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
                List<DocTree> dts = dictionary.get(dt);
                description.append(format(dts, dt)).append("\n\n");
            }

        }
        return description.toString();
    }

    private String format(ParamTree param) {
        return param.getDescription().stream().map(Object::toString).collect(Collectors.joining("\n"));
    }

    private String format(List<DocTree> dts, DocTree.Kind kind) {
        switch (kind) {
            case PARAM -> {
                return formatParams(dts);
            }
            case RETURN -> {
                return formatReturnValue(dts);
            }
            case THROWS -> {
                return formatThrows(dts);
            }
            default -> {return dts.stream().map(Object::toString).collect(Collectors.joining("\n\n"));}
        }
    }

    private String formatThrows(List<DocTree> dts) {
        Heading parametersHeading = new Heading(Labels.THROWS, 3);
        StringBuilder sb = new StringBuilder(parametersHeading.toString()).append("\n\n");
        ThrowsTree tt = (ThrowsTree)dts.get(0);
        sb.append(tt.getExceptionName().toString()).append(": ");
        sb.append(tt.getDescription().stream().map(Object::toString).collect(Collectors.joining("")));
        return sanitize(sb.toString());
    }

    private String formatReturnValue(List<DocTree> dts) {
        Heading parametersHeading = new Heading(RETURNS, 3);
        StringBuilder sb = new StringBuilder(parametersHeading.toString()).append("\n\n");
        sb.append(((ReturnTree)dts.get(0)).getDescription().stream().map(Object::toString).collect(Collectors.joining("")));
        return sanitize(sb.toString());
    }

    private String formatParams(List<DocTree> dts) {
        Heading parametersHeading = new Heading(PARAMETERS, 3);
        StringBuilder sb = new StringBuilder(parametersHeading.toString()).append("\n\n");
        if (dts.size() == 1) {
            sb.append(((ParamTree)dts.get(0)).getName().toString());
            sb.append(": ");
            sb.append(((ParamTree)dts.get(0)).getDescription().stream().map(Object::toString).collect(Collectors.joining("\n")));
        } else if (dts.size() > 1) {
            for (DocTree dt : dts) {
                sb.append("- ");
                sb.append(((ParamTree)dt).getName().toString());
                sb.append(": ");
                sb.append(((ParamTree)dt).getDescription().stream().map(Object::toString).collect(Collectors.joining("\n")));
                sb.append("\n");
            }
        }

        return sanitize(sb.toString());
    }

    private static String sanitize(String input) {
        String output = input.replaceAll("<tt>", "`");
        output = output.replaceAll("</tt>", "`");
        output = output.replaceAll("<b>", "*");
        output = output.replaceAll("</b>", "*");
        return output;
    }
}
