package io.github.atlascommunity.marklet.util;

import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;

public class Sanitizers {

    public static String sanitizeHtmlTags(String input) {
        String output = input.replaceAll("<tt>", "`");
        output = output.replaceAll("</tt>", "`");
        output = output.replaceAll("<b>", "*");
        output = output.replaceAll("</b>", "*");
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
        return superclass.toString();
    }
}
