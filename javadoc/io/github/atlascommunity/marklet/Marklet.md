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
| **private final io.github.atlascommunity.marklet.Options** | options    |
| **jdk.javadoc.doclet.Reporter**                            | reporter   |
| **private jdk.javadoc.doclet.DocletEnvironment**           | root       |
#### Methods
| Modifiers         | Method signature                                                                                                             | Return type                                     |
| ----------------- | ---------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------- |
| **private**       | buildPackages()                                                                                                              | List<javax.lang.model.element.PackageElement>   |
| **private**       | buildModules()                                                                                                               | List<javax.lang.model.element.ModuleElement>    |
| **public**        | init(Locale locale, Reporter reporter)                                                                                       | void                                            |
| **public static** | main(String[] args)                                                                                                          | void                                            |
| **public**        | getSupportedSourceVersion() **(Override)**                                                                                   | javax.lang.model.SourceVersion                  |
| **private**       | doWork()                                                                                                                     | boolean                                         |
| **private**       | buildClasses()                                                                                                               | void                                            |
| **private**       | getPackageDirectory(String packageName)                                                                                      | java.nio.file.Path                              |
| **public**        | getName() **(Override)**                                                                                                     | String                                          |
| **public**        | getSupportedOptions() **(Override)**                                                                                         | Set<? extends jdk.javadoc.doclet.Doclet.Option> |
| **private**       | generateReadme(List<javax.lang.model.element.ModuleElement> modules, List<javax.lang.model.element.PackageElement> packages) | void                                            |
| **private**       | generatePackage(PackageElement packageElement)                                                                               | void                                            |
| **public**        | run(DocletEnvironment environment)                                                                                           | boolean                                         |

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


jdk.javadoc.doclet.Reporter reporter
------------------------------------
*No description provided*


jdk.javadoc.doclet.DocletEnvironment root
-----------------------------------------
Documentation root provided by the doclet API. *


Methods
=======
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


init(Locale locale, Reporter reporter)
--------------------------------------
Overriden from {@link jdk.javadoc.doclet.StandardDoclet#init(Locale, Reporter)}, the
 doclet entry point

### Parameters

- locale: the locale to be used
- reporter: the reporter to be used



main(String[] args)
-------------------
*No method description provided*


getSupportedSourceVersion()
---------------------------
### Overrides/Implements:
getSupportedSourceVersion() from jdk.javadoc.doclet.Doclet



### Returns

LanguageVersion supported.


doWork()
--------


### Returns

`true` if generation was successful, `false` otherwise.


buildClasses()
--------------
Generates documentation file for classes, enumerations, interfaces, or annotations.

### Throws

IOException: If any error occurs during generation process.


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


getSupportedOptions()
---------------------
### Overrides/Implements:
getSupportedOptions() from jdk.javadoc.doclet.Doclet

*No method description provided*


generateReadme(List<javax.lang.model.element.ModuleElement> modules, List<javax.lang.model.element.PackageElement> packages)
----------------------------------------------------------------------------------------------------------------------------
Generates Readme file

### Throws

IOException: If any error occurs during generation process.

### Parameters

- modules: project modules list
- packages: project packages list



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


