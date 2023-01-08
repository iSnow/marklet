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
| **jdk.javadoc.doclet.Reporter**                            | reporter            |
| **private jdk.javadoc.doclet.DocletEnvironment**           | root                |
| **private final Map<String,String>**                       | classPackageMapping |
| **private final io.github.atlascommunity.marklet.Options** | options             |
| **private Locale**                                         | locale              |
#### Methods
| Type and modifiers | Method signature                                                       | Return type                                     |
| ------------------ | ---------------------------------------------------------------------- | ----------------------------------------------- |
| **public**         | getSupportedSourceVersion                                              | javax.lang.model.SourceVersion                  |
| **public**         | getSupportedOptions                                                    | Set<? extends jdk.javadoc.doclet.Doclet.Option> |
| **private**        | start                                                                  | boolean                                         |
| **public**         | init(Locale locale, Reporter reporter)                                 | void                                            |
| **public static**  | main(String[] args)                                                    | void                                            |
| **private**        | getPackageDirectory(String packageName)                                | java.nio.file.Path                              |
| **private**        | generatePackage(PackageElement packageElement)                         | void                                            |
| **private**        | buildPackages                                                          | List<javax.lang.model.element.PackageElement>   |
| **public**         | test1(boolean test1Var1, int test1Var2)                                | boolean                                         |
| **public**         | getName                                                                | String                                          |
| **private**        | buildClasses                                                           | void                                            |
| **public**         | run(DocletEnvironment environment)                                     | boolean                                         |
| **public**         | test1(Map<String,Integer> arg1)                                        | boolean                                         |
| **private**        | generateReadme(List<javax.lang.model.element.PackageElement> packages) | void                                            |

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


jdk.javadoc.doclet.DocletEnvironment root
-----------------------------------------
Documentation root provided by the doclet API. *


Map<String,String> classPackageMapping
--------------------------------------------------------------------
*No description provided*


io.github.atlascommunity.marklet.Options options
------------------------------------------------
Command line options that have been parsed. *


Locale locale
-----------------------
*No description provided*



Methods
=======
getSupportedSourceVersion
-------------------------


### Returns

LanguageVersion supported.


getSupportedOptions
-------------------
*No method description provided*


start
-----


### Returns

`true` if generation was successful, `false` otherwise.


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


buildPackages
-------------
Generates documentation file for each package.

### Throws

IOException: If any error occurs during generation process.

### Returns

list of packages documents


test1(boolean test1Var1, int test1Var2)
---------------------------------------
Test methods


getName
-------
*No method description provided*


buildClasses
------------
Generates documentation file for classes, enumerations, interfaces, or annotations.

### Throws

IOException: If any error occurs during generation process.


run(DocletEnvironment environment)
----------------------------------
**Doclet** worker point. Parses user provided options and starts a **Marklet** execution.

### Parameters

environment: DocletEnvironment.

### Returns

``true`` if the generation went well, ``false`` otherwise.


test1(Map<String,Integer> arg1)
-------------------------------


### Parameters

arg1: the args

### Returns

false if false

**Deprecated** since 9


generateReadme(List<javax.lang.model.element.PackageElement> packages)
----------------------------------------------------------------------
Generates Readme file

### Throws

IOException: If any error occurs during generation process.

### Parameters

packages: project packages list



