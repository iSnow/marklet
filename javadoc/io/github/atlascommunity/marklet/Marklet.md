Class Marklet implements jdk.javadoc.doclet.Doclet
==================================================
Marklet entry point. This class declares the [#init(Locale, Reporter)](#initlocale--reporter) and [#run(DocletEnvironment)](#rundocletenvironment)
 methods required by the doclet API in order to be called by the javadoc tool.

io.github.atlascommunity.marklet.Marklet Summary
-------
#### Constructors
| Visibility | Signature |
| ---------- | --------- |
| public     | Marklet() |
#### Fields
| Modifiers         | Field name                                               | Type                                     |
| ----------------- | -------------------------------------------------------- | ---------------------------------------- |
|                   | [reporter](#jdkjavadocdocletreporter-reporter)           | jdk.javadoc.doclet.Reporter              |
| **private final** | [options](#iogithubatlascommunitymarkletoptions-options) | io.github.atlascommunity.marklet.Options |
| **private**       | [root](#jdkjavadocdocletdocletenvironment-root)          | jdk.javadoc.doclet.DocletEnvironment     |
#### Methods
| Modifiers         | Method signature                                                                                                                                                                                                                                       | Return type                                     |
| ----------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ----------------------------------------------- |
| **private**       | [generateReadmePage(List<javax.lang.model.element.ModuleElement> modules, List<javax.lang.model.element.PackageElement> packages)](#generatereadmepagelistjavaxlangmodelelementmoduleelement-modules-listjavaxlangmodelelementpackageelement-packages) | void                                            |
| **private**       | [generatePackagePage(PackageElement packageElement)](#generatepackagepagepackageelement-packageelement)                                                                                                                                                | void                                            |
| **private**       | [buildPackages()](#buildpackages)                                                                                                                                                                                                                      | List<javax.lang.model.element.PackageElement>   |
| **private**       | [buildModules()](#buildmodules)                                                                                                                                                                                                                        | List<javax.lang.model.element.ModuleElement>    |
| **private**       | [collectPackageElements(PackageElement packageElement)](#collectpackageelementspackageelement-packageelement)                                                                                                                                          | void                                            |
| **public**        | [getName()](#getname)                                                                                                                                                                                                                                  | String                                          |
| **public**        | [getSupportedOptions()](#getsupportedoptions)                                                                                                                                                                                                          | Set<? extends jdk.javadoc.doclet.Doclet.Option> |
| **public**        | [getSupportedSourceVersion()](#getsupportedsourceversion)                                                                                                                                                                                              | javax.lang.model.SourceVersion                  |
| **public**        | [init(Locale locale, Reporter reporter)](#initlocale-locale-reporter-reporter)                                                                                                                                                                         | void                                            |
| **public**        | [run(DocletEnvironment environment)](#rundocletenvironment-environment)                                                                                                                                                                                | boolean                                         |
| **private**       | [doWork()](#dowork)                                                                                                                                                                                                                                    | boolean                                         |
| **private**       | [getPackageDirectory(String packageName)](#getpackagedirectorystring-packagename)                                                                                                                                                                      | java.nio.file.Path                              |
| **public static** | [main(String[] args)](#mainstring-args)                                                                                                                                                                                                                | void                                            |

Fields
======
jdk.javadoc.doclet.Reporter reporter
------------------------------------
Doclet enviroment logger


io.github.atlascommunity.marklet.Options options
------------------------------------------------
Command line options that have been parsed. *


jdk.javadoc.doclet.DocletEnvironment root
-----------------------------------------
Documentation root provided by the doclet API. *


Methods
=======
generateReadmePage(List<javax.lang.model.element.ModuleElement> modules, List<javax.lang.model.element.PackageElement> packages)
--------------------------------------------------------------------------------------------------------------------------------
Generates Readme file

### Throws

IOException: If any error occurs during generation process.

### Parameters

| Name     | Description           |
| -------- | --------------------- |
| modules  | project modules list  |
| packages | project packages list |


generatePackagePage(PackageElement packageElement)
--------------------------------------------------
Generates package documentation for the given ``packageElement``.

### Throws

IOException: If any error occurs while creating file or directories.

### Parameters

| Name           | Description                            |
| -------------- | -------------------------------------- |
| packageElement | Package to generate documentation for. |


buildPackages()
---------------
Generates documentation file for each package.

### Throws

IOException: If any error occurs during generation process.

### Returns

list of packages documents


buildModules()
--------------
Generates documentation file for each module.

### Throws

IOException: If any error occurs during generation process.

### Returns

list of modules


collectPackageElements(PackageElement packageElement)
-----------------------------------------------------
Generates documentation file for classes, records, enumerations, interfaces, or annotations.

### Throws

IOException: If any error occurs during generation process.

### Parameters

| Name           | Description                     |
| -------------- | ------------------------------- |
| packageElement | the package to scan for classes |


getName()
---------
### Overrides/Implements:
getName() from jdk.javadoc.doclet.Doclet

Returns the name of this Doclet

### Returns

returns `Marklet`


getSupportedOptions()
---------------------
### Overrides/Implements:
getSupportedOptions() from jdk.javadoc.doclet.Doclet

Returns the options this Doclet supports

### Returns

Set of supported options


getSupportedSourceVersion()
---------------------------
### Overrides/Implements:
getSupportedSourceVersion() from jdk.javadoc.doclet.Doclet

Report the highest Java version supported.

### Returns

LanguageVersion supported.


init(Locale locale, Reporter reporter)
--------------------------------------
Overriden from {@link jdk.javadoc.doclet.StandardDoclet#init(Locale, Reporter)}, the
 doclet entry point. We don't do a lot here

### Parameters

| Name     | Description             |
| -------- | ----------------------- |
| locale   | the locale to be used   |
| reporter | the reporter to be used |


run(DocletEnvironment environment)
----------------------------------
Main **Doclet** worker entry point.

### Parameters

| Name        | Description        |
| ----------- | ------------------ |
| environment | DocletEnvironment. |

### Returns

``true`` if the generation went well, ``false`` otherwise.


doWork()
--------
Does the actual work of setting up paths and generating markdown files.
 Hands back to {@link #run(DocletEnvironment)}

### Returns

`true` if markdown generation was successful, `false` otherwise.


getPackageDirectory(String packageName)
---------------------------------------
Builds and retrieves the path for the directory associated to the package with the given
 <tt>name</tt>.

### Parameters

| Name        | Description                               |
| ----------- | ----------------------------------------- |
| packageName | Name of the package to get directory for. |

### Returns

Built path.


main(String[] args)
-------------------
Useful to run the Doclet in an IDE like IntelliJ. This can be used to create a run configuration
 as if this was a regular Java application instead of a Doclet intended to be used via ´javadoc´. This
 way, you can step through it in the debugger.

 This starts up ´javadoc´ programmatically (called `DocumentationTool`) and tells it to run our
 Doclet with the given options.

 Currently, this is in the unnamed module b/c using modules here proved to be difficult. If you want
  to have a try, first uncomment the "--module-path", create a file `modulepath.txt` and add classpath
  entries for all dependencies. Then get rid of the need to explicitly list the jars...

### Parameters

| Name | Description                         |
| ---- | ----------------------------------- |
| args | command-line arguments, disregarded |


