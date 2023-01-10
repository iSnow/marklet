# Marklet

This is fork of the [Marklet doclet](https://github.com/atlascommunity/marklet/tree/master/src/main/java/io/github/atlascommunity/marklet)
. The purpose of Marklet is to generate Javadoc in markdown format. This version requires Java 14, but can
document all lower source code versions.

Currently working on the migration from `com.sun.javadoc` to the newer `jdk.javadoc.doclet` 
API because the  `com.sun.javadoc` classes are no longer supported on Java 12 and up. Still work in progress, so 
you can't just use it in your projects.

**Examples** :

* [Marklet documenting itself!](https://github.com/iSnow/marklet/tree/master/javadoc)

## How to use

You can run Marklet on the command line to generate one-shot documentation or add it to your pom.xml 
so markdown docs are always created on build.

The most important caveat is that you have to specify the Java packages (option `-subpackage`) you want to document
and their location in the file system (option `-sourcepath`) correctly, otherwise no output will be generated
(specifying `-sourcepath` alone is not sufficient).


### Command-line use

Linux/macOS:
```shell
javadoc -docletpath ./target/marklet-2.0.0.jar \
  -doclet io.github.atlascommunity.marklet.Marklet \
  -cp ./target/marklet-2.0.0.jar \
  -sourcepath ./src/main/java \
  -subpackages io.github.atlascommunity.marklet
```

Windows:
```shell
javadoc -docletpath .\target\marklet-2.0.0.jar  -doclet io.github.atlascommunity.marklet.Marklet -cp .\target\marklet-2.0.0.jar -sourcepath .\src\main\java -subpackages io.github.atlascommunity.marklet
```

### Maven use
In order to use it with Maven, add the following configuration for the ``maven-javadoc-plugin``
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
        <subpackages>io.github.atlascommunity.marklet</subpackages>
        <sourcepath>src/main/java/</sourcepath>
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

This will generate the javadoc report into the project directory under project subfolder `doc` and use the 
file extension `md`.

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

The current version is still under development with the following issues:

* Interfaces, inner classes, enumerations, and annotations might have bugs.

* Many modern (post Java-8) features will not be documented yet.

* Migration from com.sun.javadoc to jdk.javadoc.doclet API (WIP)

* Basically no unit tests
