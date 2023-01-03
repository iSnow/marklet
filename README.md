# Marklet

This is custom fork of
useful [Marklet doclet](https://github.com/atlascommunity/marklet/tree/master/src/main/java/io/github/atlascommunity/marklet)
which main purpose was to generate a Javadoc in a markdown format.

Currently working on the migration from `com.sun.javadoc` to the newer `jdk.javadoc.doclet` 
API because the  `com.sun.javadoc` classes are no longer supported on Java 9 and up. Still work in progress, so 
you can't just use it in your projects.

**Examples** :

* [Marklet itself!](https://github.com/iSnow/marklet/tree/master/javadoc)

In order to use it with Maven, adds the following configuration for the ``maven-javadoc-plugin``
in your project ``POM`` :

```xml

<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-javadoc-plugin</artifactId>
    <version>${javadoc.plugin.version}</version>
    <configuration>
        <doclet>io.github.atlascommunity.marklet.Marklet</doclet>
        <docletArtifact>
            <groupId>io.github.atlascommunity</groupId>
            <artifactId>marklet</artifactId>
            <version>2.0.0</version>
        </docletArtifact>
        <reportOutputDirectory>./</reportOutputDirectory>
        <destDir>./</destDir>
        <additionalOptions>
            <additionalOption>-d</additionalOption>
            <additionalOption>doc</additionalOption>
            <additionalOption>-e</additionalOption>
            <additionalOption>md</additionalOption>
        </additionalOptions>
        <useStandardDocletOptions>false</useStandardDocletOptions>
    </configuration>
</plugin>
```

This will generate the javadoc report into the project directory under project subfolder ``doc``.

## Java 8 doclint issues.

If you are using Java 8 you may have some issues with doclint validation especially when using
markdown blockquotes syntax. To deal with it, just add the following directive to your ``pom.xml``
file to deactivate doclint :

```xml

<additionalOptions>
    <additionalOption>-Xdoclint:none</additionalOption>
</additionalOptions>
```

## Available doclet options

| Option        | What it does                            | By default  |
| ------------- |-----------------------------------------| ------------|
| -d            | set output directory for documentation  | ./javadoc   |
| -e            | set files extension                     | .md         |

## Developing Marklet

Marklet requires Apache Maven. In order to build, run

```
$ mvn install

```

In order to generate Markdown documentation for Marklet itself, run

```
$ mvn -P marklet-generation javadoc:javadoc
```

## License

Marklet is licensed under the Apache License, Version 2.0

## Current issues

The current version is a still under development with the following feature missing :

* Interfaces, inner classes, enumerations, and annotations has not been tested already and subject
  to bug.

* Migration from com.sun.javadoc to jdk.javadoc.doclet API

* Version still needs testing
