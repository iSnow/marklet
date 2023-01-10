package io.github.atlascommunity.marklet;

import jdk.javadoc.doclet.Doclet;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class MarkletOption implements Doclet.Option {

    private final List<String> names;

    private final Kind kind;

    private final String parameters;

    private final int argumentCount;

    private final String description;

    private String value;

    private final String defaultValue;

    @Override
    public int getArgumentCount() {
        return argumentCount;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Kind getKind() {
        return kind;
    }

    @Override
    public List<String> getNames() {
        return names;
    }

    @Override
    public String getParameters() {
        return parameters;
    }


    public String getValue() {return (value != null) ? value : defaultValue;}

    @Override
    public boolean process(String option, List<String> arguments) {
        value = arguments.get(0);
        return true;
    }

    @Override
    public String toString() {
        return "MarkletOption{" +
                "names=" + names +
                ", value='" + value + '\'' +
                '}';
    }
}
