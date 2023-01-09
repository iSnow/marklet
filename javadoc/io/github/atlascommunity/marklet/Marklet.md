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
| Type and modifiers                                         | Field name          |
| ---------------------------------------------------------- | ------------------- |
| **jdk.javadoc.doclet.Reporter**                            | reporter            |
| **private final Map<String,String>**                       | classPackageMapping |
| **private Locale**                                         | locale              |
| **private final io.github.atlascommunity.marklet.Options** | options             |
| **private jdk.javadoc.doclet.DocletEnvironment**           | root                |
#### Methods
| Modifiers         | Method signature                                                                                                             | Return type                                     |
| ----------------- | ---------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------- |
| **private**       | generatePackage(PackageElement packageElement)                                                                               | void                                            |
| **private**       | generateReadme(List<javax.lang.model.element.ModuleElement> modules, List<javax.lang.model.element.PackageElement> packages) | void                                            |
| **private**       | doWork()                                                                                                                     | boolean                                         |
| **public**        | getSupportedOptions() **(Override)**                                                                                         | Set<? extends jdk.javadoc.doclet.Doclet.Option> |
| **public static** | main(String[] args)                                                                                                          | void                                            |
| **public**        | init(Locale locale, Reporter reporter)                                                                                       | void                                            |
| **private**       | buildPackages()                                                                                                              | List<javax.lang.model.element.PackageElement>   |
| **public**        | run(DocletEnvironment environment)                                                                                           | boolean                                         |
| **public**        | test1(boolean test1Var1, int test1Var2)                                                                                      | boolean                                         |
| **public**        | test1(Map<String,Integer> arg1)                                                                                              | boolean                                         |
| **public**        | getSupportedSourceVersion() **(Override)**                                                                                   | javax.lang.model.SourceVersion                  |
| **private**       | getPackageDirectory(String packageName)                                                                                      | java.nio.file.Path                              |
| **private**       | buildClasses()                                                                                                               | void                                            |
| **private**       | buildModules()                                                                                                               | List<javax.lang.model.element.ModuleElement>    |
| **public**        | getName() **(Override)**                                                                                                     | String                                          |

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


Map<String,String> classPackageMapping
--------------------------------------------------------------------
*No description provided*


Locale locale
-----------------------
*No description provided*


io.github.atlascommunity.marklet.Options options
------------------------------------------------
Command line options that have been parsed. *


jdk.javadoc.doclet.DocletEnvironment root
-----------------------------------------
Documentation root provided by the doclet API. *


Methods
=======
generatePackage(PackageElement packageElement)
----------------------------------------------
Generates package documentation for the given ``packageElement``.

### Throws

IOException: If any error occurs while creating file or directories.

### Parameters

packageElement: Package to generate documentation for.


generateReadme(List<javax.lang.model.element.ModuleElement> modules, List<javax.lang.model.element.PackageElement> packages)
----------------------------------------------------------------------------------------------------------------------------
Generates Readme file

### Throws

IOException: If any error occurs during generation process.

### Parameters

- modules: project modules list
- packages: project packages list



doWork()
--------


### Returns

`true` if generation was successful, `false` otherwise.


getSupportedOptions()
---------------------
### Overrides/Implements:
getSupportedOptions() from jdk.javadoc.doclet.Doclet

*No method description provided*


main(String[] args)
-------------------
*No method description provided*


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


run(DocletEnvironment environment)
----------------------------------
**Doclet** worker point. Parses user provided options and starts a **Marklet** execution.

### Parameters

environment: DocletEnvironment.

### Returns

``true`` if the generation went well, ``false`` otherwise.


test1(boolean test1Var1, int test1Var2)
---------------------------------------
Test methods


test1(Map<String,Integer> arg1)
-------------------------------


### Parameters

arg1: the args

### Returns

false if false

**Deprecated** since 9


getSupportedSourceVersion()
---------------------------
### Overrides/Implements:
getSupportedSourceVersion() from jdk.javadoc.doclet.Doclet



### Returns

LanguageVersion supported.


getPackageDirectory(String packageName)
---------------------------------------
Builds and retrieves the path for the directory associated to the package with the given
 <tt>name</tt>.

### Parameters

packageName: Name of the package to get directory for.

### Returns

Built path.


buildClasses()
--------------
Generates documentation file for classes, enumerations, interfaces, or annotations.

### Throws

IOException: If any error occurs during generation process.


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


