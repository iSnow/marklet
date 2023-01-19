package io.github.atlascommunity.marklet.util;

import org.apache.commons.lang3.StringUtils;

import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;

public class Sanitizers {

    private static final String UP_DIRECTORY = "../";

    public static String sanitizeHtmlTags(String input) {
        String output = input.replaceAll("<tt>", "`");
        output = output.replaceAll("</tt>", "`");
        output = output.replaceAll("<b>", "*");
        output = output.replaceAll("</b>", "*");
        output = output.replaceAll("<p>", "\n\n");
        output = output.replaceAll("<ul>", "\n\n");
        output = output.replaceAll("</ul>", "\n");
        output = output.replaceAll("<li>", "\n* ");
        output = output.replaceAll("</li>", "");
        return output;
    }

    public static String sanitizePackageNames(String input) {
        String output = input.replaceAll("java.util.", "");
        output = output.replaceAll("java.lang.", "");
        return output;
    }

    public static String sanitizeSuperClass(TypeMirror superclass) {
        if (superclass.getKind().equals(TypeKind.NONE)){
            return "";
        }
        if (superclass.toString().equals("java.lang.Object")) {
            return "";
        }
        if (superclass.toString().equals("java.lang.Record")) {
            return "";
        }
        return superclass.toString();
    }

    public static String methodSignatureToLinkTarget(String methodInfo) {
        String output = methodInfo
                .replaceAll("[, ]+", "-")
                .replaceAll("[().<>]+", "")
                .replaceAll("\\[]", "")
                .toLowerCase();
        return output;
    }

    /**
     * Static method that builds a shortest URL path, from
     * the given ``source`` package to the ``target`` package.
     * Such path is built by taking the longest common prefix
     * from both package name, trying to move from source to this
     * prefix using ``../`` path, then moving to the target path
     * vertically.
     *
     * @param source Source package to build path from.
     * @param target Target package to build path to.
     * @return Built path.
     */
    public static String constructShortestPath(final String source, final String target) {
        if (source.equals(target)) {
            return "";
        }
        final StringBuffer pathBuilder = new StringBuffer();
        final String common = StringUtils.getCommonPrefix(source, target);
        final int start = common.length();
        final boolean endsWithDot = common.endsWith(".");
        if (!common.equals(source)) {
            if (endsWithDot) {
                pathBuilder.append(UP_DIRECTORY);
            }
            final String back = source.substring(start);
            for (int i = 0; i < StringUtils.countMatches(back, '.'); i++) {
                pathBuilder.append(UP_DIRECTORY);
            }
        }
        if (!common.equals(target)) {
            final String forward = target.substring(endsWithDot ? start : start + 1);
            pathBuilder.append(forward.replace('.', '/'));
            pathBuilder.append('/');
        }
        return pathBuilder.toString();
    }
}
