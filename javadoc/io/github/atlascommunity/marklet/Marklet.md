Class Marklet implements jdk.javadoc.doclet.Doclet
==================================================
Marklet entry point. This class declares the {@link #init(Locale, Reporter)} and {@link #run(DocletEnvironment)}
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
| **private final io.github.atlascommunity.marklet.Options** | options    |
| **jdk.javadoc.doclet.Reporter**                            | reporter   |
#### Methods
| Modifiers         | Method signature                                                                                                             | Return type                                     |
| ----------------- | ---------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------- |
| **private**       | getPackageDirectory(String packageName)                                                                                      | java.nio.file.Path                              |
| **public**        | getName() **(Override)**                                                                                                     | String                                          |
| **public**        | init(Locale locale, Reporter reporter)                                                                                       | void                                            |
| **private**       | generateReadme(List<javax.lang.model.element.ModuleElement> modules, List<javax.lang.model.element.PackageElement> packages) | void                                            |
| **public**        | getSupportedSourceVersion() **(Override)**                                                                                   | javax.lang.model.SourceVersion                  |
| **private**       | generatePackage(PackageElement packageElement)                                                                               | void                                            |
| **public**        | run(DocletEnvironment environment)                                                                                           | boolean                                         |
| **private**       | doWork()                                                                                                                     | boolean                                         |
| **private**       | buildModules()                                                                                                               | List<javax.lang.model.element.ModuleElement>    |
| **private**       | buildClasses()                                                                                                               | void                                            |
| **private**       | buildPackages()                                                                                                              | List<javax.lang.model.element.PackageElement>   |
| **public static** | main(String[] args)                                                                                                          | void                                            |
| **public**        | getSupportedOptions() **(Override)**                                                                                         | Set<? extends jdk.javadoc.doclet.Doclet.Option> |

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


io.github.atlascommunity.marklet.Options options
------------------------------------------------
Command line options that have been parsed. *


jdk.javadoc.doclet.Reporter reporter
------------------------------------
*No description provided*


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


getName()
---------
### Overrides/Implements:
getName() from jdk.javadoc.doclet.Doclet

*No method description provided*


init(Locale locale, Reporter reporter)
--------------------------------------
Overriden from {@link jdk.javadoc.doclet.StandardDoclet#init(Locale, Reporter)}, the
 doclet entry point

### Parameters

- locale: the locale to be used
- reporter: the reporter to be used



generateReadme(List<javax.lang.model.element.ModuleElement> modules, List<javax.lang.model.element.PackageElement> packages)
----------------------------------------------------------------------------------------------------------------------------
Generates Readme file

### Throws

IOException: If any error occurs during generation process.

### Parameters

- modules: project modules list
- packages: project packages list



getSupportedSourceVersion()
---------------------------
### Overrides/Implements:
getSupportedSourceVersion() from jdk.javadoc.doclet.Doclet



### Returns

LanguageVersion supported.


generatePackage(PackageElement packageElement)
----------------------------------------------
Generates package documentation for the given ``packageElement``.

### Throws

IOException: If any error occurs while creating file or directories.

### Parameters

packageElement: Package to generate documentation for.


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

`true` if generation was successful, `false` otherwise.


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


buildPackages()
---------------
Generates documentation file for each package.

### Throws

IOException: If any error occurs during generation process.

### Returns

list of packages documents


main(String[] args)
-------------------
*No method description provided*


getSupportedOptions()
---------------------
### Overrides/Implements:
getSupportedOptions() from jdk.javadoc.doclet.Doclet

*No method description provided*


