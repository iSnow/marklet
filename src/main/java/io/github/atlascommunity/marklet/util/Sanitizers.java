package io.github.atlascommunity.marklet.util;

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
}
