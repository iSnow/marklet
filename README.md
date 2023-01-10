# Marklet

Marklet is a Doclet that plugs into `javadoc`. The purpose of Marklet is to generate Javadoc in markdown format. 
This version requires Java 14, but can document all lower source code versions.

Currently working on the migration from `com.sun.javadoc` to the newer `jdk.javadoc.doclet` 
API because the  `com.sun.javadoc` classes are no longer supported on Java 12 and up. Still work in progress, so 
you can't just use it in your projects.

**Examples** :

* [Marklet documenting itself!](tree/master/javadoc/README.md)

## How to use

You can run Marklet on the command line to generate one-shot documentation or add it to your `pom.xml` 
so markdown docs are created on Maven build.

The most important caveat is that you have to specify the Java packages (option `-subpackage`) you want to document
and their location in the file system (option `-sourcepath`) correctly, otherwise no output will be generated
(specifying `-sourcepath` alone is not sufficient).


### Command-line use
First run `mvn package` to build the doclet.

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

On both platforms, be sure to set `subpackages` to
your project packages qualified name and `sourcepath` pointing to your sources.

### Maven use
In order to use it with Maven, add the following configuration for the ``maven-javadoc-plugin``
in your project ``POM`` :

```xml

<profiles>
    <profile>
        <id>generate-markdown</id>
        <activation>
            <activeByDefault>false</activeByDefault>
        </activation>
        <build>
            <plugins>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-javadoc-plugin</artifactId>
                    <version>${maven-javadoc-plugin.version}</version>
                    <configuration>
                        <doclet>io.github.atlascommunity.marklet.Marklet</doclet>
                        <docletArtifact>
                            <groupId>io.github.atlascommunity</groupId>
                            <artifactId>marklet</artifactId>
                            <version>2.0.0</version>
                        </docletArtifact>
                        <reportOutputDirectory>./</reportOutputDirectory>
                        <destDir>./</destDir>
                        <useStandardDocletOptions>false</useStandardDocletOptions>
                        <additionalOptions>
                            <additionalOption>-e markdown</additionalOption>
                        </additionalOptions>
                        <show>private</show>
                        <subpackages>io.github.atlascommunity.marklet</subpackages>
                        <sourcepath>src/main/java/</sourcepath>
                    </configuration>
                </plugin>
            </plugins>
        </build>
    </profile>
</profiles>
```

This profile is not active by default, so the markdown documentation would not get re-created with each Maven run,
but if you type `mvn clean package -P generate-markdown`, it gets run. If you want to have it permanently active,
set `activeByDefault` to `true`: 

```xml
<activation>
     <activeByDefault>true</activeByDefault>
 </activation>
 ```

Running from Maven, you may omit the `sourcepath` option, but be sure to set `subpackages` to
your project packages qualified name. You may usually omit `reportOutputDirectory`, but not `destDir`.

If you set `show` to `public`, no internals will be documented, and your api-docs will be the public API.

`useStandardDocletOptions` interferes with the working of Marklet, it must be set to `false`.

This will generate the javadoc report into the project directory under project subfolder `javadoc` and use the 
file extension `.markdown` ( the `-e` in the `additionalOptions` overrides the default extension `.md`).

The Apache Maven site 
[has more information](https://maven.apache.org/plugins/maven-javadoc-plugin/examples/alternate-doclet.html) 
on how to use alternate doclets like Marklet in addition to the default HTML-generating `javadoc-plugin`.

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

| Option | What it does                           | By default |
|--------|----------------------------------------|------------|
| -e     | set files extension                    | .md        |

## Developing Marklet

Marklet requires Apache Maven. In order to build, run

```
$ mvn install

```

In order to generate Markdown documentation for Marklet itself, run

```
$ mvn -P generate-markdown javadoc:javadoc
```

### Developer docs

- [new jdk.javadoc.doclet API Docs](https://openjdk.org/groups/compiler/using-new-doclet.html)
- [Javadoc for jdk.javadoc.doclet](https://docs.oracle.com/en/java/javase/17/docs/api/jdk.javadoc/jdk/javadoc/doclet/package-summary.html)

## License

Marklet is licensed under the Apache License, Version 2.0

## Current issues

The current version is still under development with the following issues:

* Interfaces, inner classes, enumerations, and annotations might have bugs.

* Many modern (post Java-8) features will not be documented yet.

* Migration from com.sun.javadoc to jdk.javadoc.doclet API (WIP)

* Basically no unit tests
