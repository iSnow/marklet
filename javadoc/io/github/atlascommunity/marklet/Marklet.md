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
| Type and modifiers                                         | Field name |
| ---------------------------------------------------------- | ---------- |
| **private jdk.javadoc.doclet.DocletEnvironment**           | root       |
| **jdk.javadoc.doclet.Reporter**                            | reporter   |
| **private final io.github.atlascommunity.marklet.Options** | options    |
#### Methods
| Modifiers         | Method signature                                                                                                             | Return type                                     |
| ----------------- | ---------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------- |
| **private**       | buildClasses()                                                                                                               | void                                            |
| **public static** | main(String[] args)                                                                                                          | void                                            |
| **public**        | getSupportedOptions() **(Override)**                                                                                         | Set<? extends jdk.javadoc.doclet.Doclet.Option> |
| **private**       | buildModules()                                                                                                               | List<javax.lang.model.element.ModuleElement>    |
| **public**        | getName() **(Override)**                                                                                                     | String                                          |
| **public**        | getSupportedSourceVersion() **(Override)**                                                                                   | javax.lang.model.SourceVersion                  |
| **public**        | init(Locale locale, Reporter reporter)                                                                                       | void                                            |
| **private**       | generatePackage(PackageElement packageElement)                                                                               | void                                            |
| **private**       | buildPackages()                                                                                                              | List<javax.lang.model.element.PackageElement>   |
| **private**       | doWork()                                                                                                                     | boolean                                         |
| **private**       | getPackageDirectory(String packageName)                                                                                      | java.nio.file.Path                              |
| **public**        | run(DocletEnvironment environment)                                                                                           | boolean                                         |
| **private**       | generateReadme(List<javax.lang.model.element.ModuleElement> modules, List<javax.lang.model.element.PackageElement> packages) | void                                            |

Constructors
============
Marklet()
---------
*No method description provided*


Fields
======
jdk.javadoc.doclet.DocletEnvironment root
-----------------------------------------
Documentation root provided by the doclet API. *


jdk.javadoc.doclet.Reporter reporter
------------------------------------
*No description provided*


io.github.atlascommunity.marklet.Options options
------------------------------------------------
Command line options that have been parsed. *


Methods
=======
buildClasses()
--------------
Generates documentation file for classes, enumerations, interfaces, or annotations.

### Throws

IOException: If any error occurs during generation process.


main(String[] args)
-------------------
*No method description provided*


getSupportedOptions()
---------------------
### Overrides/Implements:
getSupportedOptions() from jdk.javadoc.doclet.Doclet

*No method description provided*


buildModules()
--------------
Generates documentation file for each module.

### Throws

IOException: If any error occurs during generation process.

### Returns

list of modules


getName()
---------
### Overrides/Implements:
getName() from jdk.javadoc.doclet.Doclet

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


doWork()
--------


### Returns

`true` if generation was successful, `false` otherwise.


getPackageDirectory(String packageName)
---------------------------------------
Builds and retrieves the path for the directory associated to the package with the given
 <tt>name</tt>.

### Parameters

packageName: Name of the package to get directory for.

### Returns

Built path.


run(DocletEnvironment environment)
----------------------------------
**Doclet** worker point. Parses user provided options and starts a **Marklet** execution.

### Parameters

environment: DocletEnvironment.

### Returns

``true`` if the generation went well, ``false`` otherwise.


generateReadme(List<javax.lang.model.element.ModuleElement> modules, List<javax.lang.model.element.PackageElement> packages)
----------------------------------------------------------------------------------------------------------------------------
Generates Readme file

### Throws

IOException: If any error occurs during generation process.

### Parameters

- modules: project modules list
- packages: project packages list



