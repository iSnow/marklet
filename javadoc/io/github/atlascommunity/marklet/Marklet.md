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
| Modifiers         | Method signature                                                                                                                                                                                                                               | Return type                                     |
| ----------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------- |
| **private**       | [getPackageDirectory(String packageName)](#getpackagedirectorystring-packagename)                                                                                                                                                              | java.nio.file.Path                              |
| **private**       | [generatePackage(PackageElement packageElement)](#generatepackagepackageelement-packageelement)                                                                                                                                                | void                                            |
| **private**       | [buildPackages()](#buildpackages)                                                                                                                                                                                                              | List<javax.lang.model.element.PackageElement>   |
| **private**       | [buildModules()](#buildmodules)                                                                                                                                                                                                                | List<javax.lang.model.element.ModuleElement>    |
| **private**       | [buildClasses()](#buildclasses)                                                                                                                                                                                                                | void                                            |
| **private**       | [generateReadme(List<javax.lang.model.element.ModuleElement> modules, List<javax.lang.model.element.PackageElement> packages)](#generatereadmelistjavaxlangmodelelementmoduleelement-modules-listjavaxlangmodelelementpackageelement-packages) | void                                            |
| **public**        | [getName()](#getname)                                                                                                                                                                                                                          | String                                          |
| **public**        | [getSupportedOptions()](#getsupportedoptions)                                                                                                                                                                                                  | Set<? extends jdk.javadoc.doclet.Doclet.Option> |
| **public**        | [getSupportedSourceVersion()](#getsupportedsourceversion)                                                                                                                                                                                      | javax.lang.model.SourceVersion                  |
| **public**        | [init(Locale locale, Reporter reporter)](#initlocale-locale-reporter-reporter)                                                                                                                                                                 | void                                            |
| **public**        | [run(DocletEnvironment environment)](#rundocletenvironment-environment)                                                                                                                                                                        | boolean                                         |
| **private**       | [doWork()](#dowork)                                                                                                                                                                                                                            | boolean                                         |
| **public static** | [main(String[] args)](#mainstring-args)                                                                                                                                                                                                        | void                                            |

Constructors
============
Marklet()
---------
*No method description provided*


Fields
======
jdk.javadoc.doclet.Reporter reporter
------------------------------------
*No description provided*


io.github.atlascommunity.marklet.Options options
------------------------------------------------
Command line options that have been parsed. *


jdk.javadoc.doclet.DocletEnvironment root
-----------------------------------------
Documentation root provided by the doclet API. *


Methods
=======
getPackageDirectory(String packageName)
---------------------------------------
Builds and retrieves the path for the directory associated to the package with the given
 <tt>name</tt>.

### Parameters

packageName: Name of the package to get directory for.

### Returns

Built path.


generatePackage(PackageElement packageElement)
----------------------------------------------
Generates package documentation for the given ``packageElement``.

### Throws

IOException: If any error occurs while creating file or directories.

### Parameters

packageElement: Package to generate documentation for.


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


buildClasses()
--------------
Generates documentation file for classes, enumerations, interfaces, or annotations.

### Throws

IOException: If any error occurs during generation process.


generateReadme(List<javax.lang.model.element.ModuleElement> modules, List<javax.lang.model.element.PackageElement> packages)
----------------------------------------------------------------------------------------------------------------------------
Generates Readme file

### Throws

IOException: If any error occurs during generation process.

### Parameters

- modules: project modules list
- packages: project packages list



getName()
---------
### Overrides/Implements:
getName() from jdk.javadoc.doclet.Doclet

*No method description provided*


getSupportedOptions()
---------------------
### Overrides/Implements:
getSupportedOptions() from jdk.javadoc.doclet.Doclet

*No method description provided*


getSupportedSourceVersion()
---------------------------
### Overrides/Implements:
getSupportedSourceVersion() from jdk.javadoc.doclet.Doclet



### Returns

LanguageVersion supported.


init(Locale locale, Reporter reporter)
--------------------------------------
Overriden from {@link jdk.javadoc.doclet.StandardDoclet#init(Locale, Reporter)}, the
 doclet entry point

### Parameters

- locale: the locale to be used
- reporter: the reporter to be used



run(DocletEnvironment environment)
----------------------------------
**Doclet** worker point. Parses user provided options and starts a **Marklet** execution.

### Parameters

environment: DocletEnvironment.

### Returns

``true`` if the generation went well, ``false`` otherwise.


doWork()
--------


### Returns

`true` if markdown generation was successful, `false` otherwise.


main(String[] args)
-------------------
*No method description provided*


