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
| **private jdk.javadoc.doclet.DocletEnvironment**           | root                |
| **private Locale**                                         | locale              |
| **private final io.github.atlascommunity.marklet.Options** | options             |
#### Methods
| Type and modifiers | Method signature                                                                                                             | Return type                                     |
| ------------------ | ---------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------- |
| **private**        | buildPackages()                                                                                                              | List<javax.lang.model.element.PackageElement>   |
| **public**         | getName() **(Override)**                                                                                                     | String                                          |
| **public static**  | main(String[] args)                                                                                                          | void                                            |
| **public**         | getSupportedSourceVersion() **(Override)**                                                                                   | javax.lang.model.SourceVersion                  |
| **public**         | test1(Map<String,Integer> arg1)                                                                                              | boolean                                         |
| **public**         | run(DocletEnvironment environment)                                                                                           | boolean                                         |
| **private**        | buildModules()                                                                                                               | List<javax.lang.model.element.ModuleElement>    |
| **private**        | getPackageDirectory(String packageName)                                                                                      | java.nio.file.Path                              |
| **public**         | test1(boolean test1Var1, int test1Var2)                                                                                      | boolean                                         |
| **private**        | doWork()                                                                                                                     | boolean                                         |
| **public**         | init(Locale locale, Reporter reporter)                                                                                       | void                                            |
| **private**        | generatePackage(PackageElement packageElement)                                                                               | void                                            |
| **private**        | generateReadme(List<javax.lang.model.element.ModuleElement> modules, List<javax.lang.model.element.PackageElement> packages) | void                                            |
| **private**        | buildClasses()                                                                                                               | void                                            |
| **public**         | getSupportedOptions() **(Override)**                                                                                         | Set<? extends jdk.javadoc.doclet.Doclet.Option> |

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


jdk.javadoc.doclet.DocletEnvironment root
-----------------------------------------
Documentation root provided by the doclet API. *


Locale locale
-----------------------
*No description provided*


io.github.atlascommunity.marklet.Options options
------------------------------------------------
Command line options that have been parsed. *



Methods
=======
buildPackages()
---------------
Generates documentation file for each package.

### Throws

IOException: If any error occurs during generation process.

### Returns

list of packages documents


getName()
---------
### Overrides/Implements:
getName() from jdk.javadoc.doclet.Doclet

*No method description provided*


main(String[] args)
-------------------
*No method description provided*


getSupportedSourceVersion()
---------------------------
### Overrides/Implements:
getSupportedSourceVersion() from jdk.javadoc.doclet.Doclet



### Returns

LanguageVersion supported.


test1(Map<String,Integer> arg1)
-------------------------------


### Parameters

arg1: the args

### Returns

false if false

**Deprecated** since 9


run(DocletEnvironment environment)
----------------------------------
**Doclet** worker point. Parses user provided options and starts a **Marklet** execution.

### Parameters

environment: DocletEnvironment.

### Returns

``true`` if the generation went well, ``false`` otherwise.


buildModules()
--------------
Generates documentation file for each module.

### Throws

IOException: If any error occurs during generation process.

### Returns

list of modules


getPackageDirectory(String packageName)
---------------------------------------
Builds and retrieves the path for the directory associated to the package with the given
 <tt>name</tt>.

### Parameters

packageName: Name of the package to get directory for.

### Returns

Built path.


test1(boolean test1Var1, int test1Var2)
---------------------------------------
Test methods


doWork()
--------


### Returns

`true` if generation was successful, `false` otherwise.


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


generateReadme(List<javax.lang.model.element.ModuleElement> modules, List<javax.lang.model.element.PackageElement> packages)
----------------------------------------------------------------------------------------------------------------------------
Generates Readme file

### Throws

IOException: If any error occurs during generation process.

### Parameters

- modules: project modules list
- packages: project packages list



buildClasses()
--------------
Generates documentation file for classes, enumerations, interfaces, or annotations.

### Throws

IOException: If any error occurs during generation process.


getSupportedOptions()
---------------------
### Overrides/Implements:
getSupportedOptions() from jdk.javadoc.doclet.Doclet

*No method description provided*



