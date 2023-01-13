package io.github.atlascommunity.marklet.page_elements;

import com.sun.source.doctree.*;
import io.github.atlascommunity.marklet.constants.Labels;
import io.github.atlascommunity.marklet.util.MethodSignature;
import lombok.AllArgsConstructor;
import net.steppschuh.markdowngenerator.table.Table;
import net.steppschuh.markdowngenerator.text.emphasis.BoldText;
import net.steppschuh.markdowngenerator.text.emphasis.ItalicText;
import net.steppschuh.markdowngenerator.text.heading.Heading;

import javax.lang.model.element.VariableElement;
import java.util.*;
import java.util.stream.Collectors;

import static com.sun.source.doctree.DocTree.Kind.*;
import static io.github.atlascommunity.marklet.constants.Labels.PARAMETERS;
import static io.github.atlascommunity.marklet.constants.Labels.RETURNS;
import static io.github.atlascommunity.marklet.util.Sanitizers.sanitizeHtmlTags;

@AllArgsConstructor
public class CommentBlock implements ClassPageElement{

    private final DocCommentTree comments;

    private final List<? extends VariableElement> parameters;

    private static final DocTree.Kind[] tags = {
            THROWS, PARAM, RETURN, DEPRECATED, AUTHOR, SEE, SINCE, VERSION
    };

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
            boolean foundParamBlock = false;
            for (DocTree.Kind dt : sortedKeys){
                List<DocTree> dts = dictionary.get(dt);
                if (dt.equals(PARAM)) {
                    foundParamBlock = true;
                }
                description.append(format(dts, dt)).append("\n\n");
            }
            if ((null != parameters) && (parameters.size() > 0)) {
                if (!foundParamBlock) {
                    description.append(generateFallbackParameterBlock()).append("\n");
                }
            }

        } else if ((null != parameters) && (parameters.size() > 0)) {
            description.append(generateFallbackParameterBlock()).append("\n");
        }
        return description.toString();
    }

    private String generateFallbackParameterBlock() {
        Table.Builder table =
                new Table.Builder()
                        .withAlignments(Table.ALIGN_LEFT)
                        .withRowLimit(parameters.size() + 1)
                        .addRow("Name", "Description");
        Heading parametersHeading = new Heading(PARAMETERS, 3);
        StringBuilder sb = new StringBuilder(parametersHeading.toString()).append("\n\n");

        for (VariableElement v : parameters) {
            table.addRow( v.getSimpleName().toString(), "*No description provided*");
        }
        sb.append(table.build());
        return sb.toString();
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
            case DEPRECATED -> {
                return formatDeprecated(dts);
            }
            case SINCE -> {
                return formatSince(dts);
            }
            default -> {return dts.stream().map(Object::toString).collect(Collectors.joining("\n\n"));}
        }
    }

    private String formatSince(List<DocTree> dts) {
        StringBuilder sb = new StringBuilder(Labels.SINCE).append(" ");
        SinceTree dt = (SinceTree)dts.get(0);
        sb.append(dt.getBody().stream().map(Object::toString).collect(Collectors.joining("")));
        return sanitizeHtmlTags(new ItalicText(sb.toString()).toString());
    }
    private String formatDeprecated(List<DocTree> dts) {
        StringBuilder sb = new StringBuilder(new BoldText(Labels.DEPRECATED).toString()).append(" ");
        DeprecatedTree dt = (DeprecatedTree)dts.get(0);
        sb.append(dt.getBody().stream().map(Object::toString).collect(Collectors.joining("")));
        return sanitizeHtmlTags(sb.toString());
    }

    private String formatThrows(List<DocTree> dts) {
        Heading parametersHeading = new Heading(Labels.THROWS, 3);
        StringBuilder sb = new StringBuilder(parametersHeading.toString()).append("\n\n");
        ThrowsTree tt = (ThrowsTree)dts.get(0);
        sb.append(tt.getExceptionName().toString()).append(": ");
        sb.append(tt.getDescription().stream().map(Object::toString).collect(Collectors.joining("")));
        return sanitizeHtmlTags(sb.toString());
    }

    private String formatReturnValue(List<DocTree> dts) {
        Heading parametersHeading = new Heading(RETURNS, 3);
        StringBuilder sb = new StringBuilder(parametersHeading.toString()).append("\n\n");
        sb.append(((ReturnTree)dts.get(0)).getDescription().stream().map(Object::toString).collect(Collectors.joining("")));
        return sanitizeHtmlTags(sb.toString());
    }

    private String formatParams(List<DocTree> dts) {
        Heading parametersHeading = new Heading(PARAMETERS, 3);
        StringBuilder sb = new StringBuilder(parametersHeading.toString()).append("\n\n");

        Table.Builder table =
                new Table.Builder()
                        .withAlignments(Table.ALIGN_LEFT)
                        .withRowLimit(dts.size() + 1)
                        .addRow("Name", "Description");

        for (DocTree dt : dts) {
            table.addRow(
                ((ParamTree)dt).getName().toString(),
                ((ParamTree)dt).getDescription().stream().map(Object::toString).collect(Collectors.joining(" "))
            );
        }
        sb.append(table.build());

        /*if (dts.size() == 1) {
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
        }*/

        return sanitizeHtmlTags(sb.toString());
    }

}
