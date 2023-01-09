Class Marklet implements jdk.javadoc.doclet.Doclet
==================================================
Marklet entry point. This class declares the {@link #init(Locale, Reporter)} and {@link #run(DocletEnvironment)}
 methods required by the doclet API in order to be called by the javadoc tool.

io.github.atlascommunity.marklet.Marklet Summary
-------
#### Constructors
| Visibility | Signature |
| ---------- | --------- |
| **public** | Marklet() |
#### Fields
| Type and modifiers                                         | Field name          |
| ---------------------------------------------------------- | ------------------- |
| **private final Map<String,String>**                       | classPackageMapping |
| **private final io.github.atlascommunity.marklet.Options** | options             |
| **private Locale**                                         | locale              |
| **private jdk.javadoc.doclet.DocletEnvironment**           | root                |
| **jdk.javadoc.doclet.Reporter**                            | reporter            |
#### Methods
| Type and modifiers | Method signature                                                       | Return type                                     |
| ------------------ | ---------------------------------------------------------------------- | ----------------------------------------------- |
| **private**        | start()                                                                | boolean                                         |
| **public**         | init(Locale locale, Reporter reporter)                                 | void                                            |
| **public**         | getSupportedSourceVersion() **(Override)**                             | javax.lang.model.SourceVersion                  |
| **public**         | getName() **(Override)**                                               | String                                          |
| **public**         | run(DocletEnvironment environment)                                     | boolean                                         |
| **private**        | generatePackage(PackageElement packageElement)                         | void                                            |
| **private**        | buildPackages()                                                        | List<javax.lang.model.element.PackageElement>   |
| **public**         | getSupportedOptions() **(Override)**                                   | Set<? extends jdk.javadoc.doclet.Doclet.Option> |
| **public static**  | main(String[] args)                                                    | void                                            |
| **private**        | getPackageDirectory(String packageName)                                | java.nio.file.Path                              |
| **private**        | buildClasses()                                                         | void                                            |
| **public**         | test1(Map<String,Integer> arg1)                                        | boolean                                         |
| **public**         | test1(boolean test1Var1, int test1Var2)                                | boolean                                         |
| **private**        | generateReadme(List<javax.lang.model.element.PackageElement> packages) | void                                            |

Constructors
============
Marklet()
---------
*No method description provided*



Fields
======
Map<String,String> classPackageMapping
--------------------------------------------------------------------
*No description provided*


io.github.atlascommunity.marklet.Options options
------------------------------------------------
Command line options that have been parsed. *


Locale locale
-----------------------
*No description provided*


jdk.javadoc.doclet.DocletEnvironment root
-----------------------------------------
Documentation root provided by the doclet API. *


jdk.javadoc.doclet.Reporter reporter
------------------------------------
*No description provided*



Methods
=======
start()
-------


### Returns

`true` if generation was successful, `false` otherwise.


init(Locale locale, Reporter reporter)
--------------------------------------
Overriden from {@link jdk.javadoc.doclet.StandardDoclet#init(Locale, Reporter)}, the
 doclet entry point

### Parameters

- locale: the locale to be used
- reporter: the reporter to be used



getSupportedSourceVersion()
---------------------------
### Overrides/Implements:
getSupportedSourceVersion() from Interface Doclet



### Returns

LanguageVersion supported.


getName()
---------
### Overrides/Implements:
getName() from Interface Doclet

*No method description provided*


run(DocletEnvironment environment)
----------------------------------
**Doclet** worker point. Parses user provided options and starts a **Marklet** execution.

### Parameters

environment: DocletEnvironment.

### Returns

``true`` if the generation went well, ``false`` otherwise.


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


getSupportedOptions()
---------------------
### Overrides/Implements:
getSupportedOptions() from Interface Doclet

*No method description provided*


main(String[] args)
-------------------
*No method description provided*


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


test1(Map<String,Integer> arg1)
-------------------------------


### Parameters

arg1: the args

### Returns

false if false

**Deprecated** since 9


test1(boolean test1Var1, int test1Var2)
---------------------------------------
Test methods


generateReadme(List<javax.lang.model.element.PackageElement> packages)
----------------------------------------------------------------------
Generates Readme file

### Throws

IOException: If any error occurs during generation process.

### Parameters

packages: project packages list



