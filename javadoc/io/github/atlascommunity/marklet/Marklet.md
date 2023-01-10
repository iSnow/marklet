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
| **private final io.github.atlascommunity.marklet.Options** | options    |
| **private jdk.javadoc.doclet.DocletEnvironment**           | root       |
| **jdk.javadoc.doclet.Reporter**                            | reporter   |
#### Methods
| Modifiers         | Method signature                                                                                                             | Return type                                     |
| ----------------- | ---------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------- |
| **private**       | buildModules()                                                                                                               | List<javax.lang.model.element.ModuleElement>    |
| **public**        | init(Locale locale, Reporter reporter)                                                                                       | void                                            |
| **private**       | buildPackages()                                                                                                              | List<javax.lang.model.element.PackageElement>   |
| **private**       | getPackageDirectory(String packageName)                                                                                      | java.nio.file.Path                              |
| **private**       | generateReadme(List<javax.lang.model.element.ModuleElement> modules, List<javax.lang.model.element.PackageElement> packages) | void                                            |
| **public**        | getName() **(Override)**                                                                                                     | String                                          |
| **public**        | run(DocletEnvironment environment)                                                                                           | boolean                                         |
| **public**        | getSupportedSourceVersion() **(Override)**                                                                                   | javax.lang.model.SourceVersion                  |
| **private**       | doWork()                                                                                                                     | boolean                                         |
| **public**        | getSupportedOptions() **(Override)**                                                                                         | Set<? extends jdk.javadoc.doclet.Doclet.Option> |
| **public static** | main(String[] args)                                                                                                          | void                                            |
| **private**       | generatePackage(PackageElement packageElement)                                                                               | void                                            |
| **private**       | buildClasses()                                                                                                               | void                                            |

Constructors
============
Marklet()
---------
*No method description provided*


Fields
======
io.github.atlascommunity.marklet.Options options
------------------------------------------------
Command line options that have been parsed. *


jdk.javadoc.doclet.DocletEnvironment root
-----------------------------------------
Documentation root provided by the doclet API. *


jdk.javadoc.doclet.Reporter reporter
------------------------------------
*No description provided*


Methods
=======
buildModules()
--------------
Generates documentation file for each module.

### Throws

IOException: If any error occurs during generation process.

### Returns

list of modules


init(Locale locale, Reporter reporter)
--------------------------------------
Overriden from {@link jdk.javadoc.doclet.StandardDoclet#init(Locale, Reporter)}, the
 doclet entry point

### Parameters

- locale: the locale to be used
- reporter: the reporter to be used



buildPackages()
---------------
Generates documentation file for each package.

### Throws

IOException: If any error occurs during generation process.

### Returns

list of packages documents


getPackageDirectory(String packageName)
---------------------------------------
Builds and retrieves the path for the directory associated to the package with the given
 <tt>name</tt>.

### Parameters

packageName: Name of the package to get directory for.

### Returns

Built path.


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


run(DocletEnvironment environment)
----------------------------------
**Doclet** worker point. Parses user provided options and starts a **Marklet** execution.

### Parameters

environment: DocletEnvironment.

### Returns

``true`` if the generation went well, ``false`` otherwise.


getSupportedSourceVersion()
---------------------------
### Overrides/Implements:
getSupportedSourceVersion() from jdk.javadoc.doclet.Doclet



### Returns

LanguageVersion supported.


doWork()
--------


### Returns

`true` if markdown generation was successful, `false` otherwise.


getSupportedOptions()
---------------------
### Overrides/Implements:
getSupportedOptions() from jdk.javadoc.doclet.Doclet

*No method description provided*


main(String[] args)
-------------------
*No method description provided*


generatePackage(PackageElement packageElement)
----------------------------------------------
Generates package documentation for the given ``packageElement``.

### Throws

IOException: If any error occurs while creating file or directories.

### Parameters

packageElement: Package to generate documentation for.


buildClasses()
--------------
Generates documentation file for classes, enumerations, interfaces, or annotations.

### Throws

IOException: If any error occurs during generation process.


