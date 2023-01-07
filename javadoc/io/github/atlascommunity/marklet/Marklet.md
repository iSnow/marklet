Class Marklet
=============
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
| **private Locale**                                         | locale              |
| **jdk.javadoc.doclet.Reporter**                            | reporter            |
| **private jdk.javadoc.doclet.DocletEnvironment**           | root                |
| **private final Map<String,String>**                       | classPackageMapping |
| **private final io.github.atlascommunity.marklet.Options** | options             |
#### Methods
| Type and modifiers | Method signature                                                       | Return type                                     |
| ------------------ | ---------------------------------------------------------------------- | ----------------------------------------------- |
| **public**         | test1(boolean test1Var1, int test1Var2)                                | boolean                                         |
| **private**        | getPackageDirectory(String packageName)                                | java.nio.file.Path                              |
| **public**         | getSupportedSourceVersion                                              | javax.lang.model.SourceVersion                  |
| **private**        | generateReadme(List<javax.lang.model.element.PackageElement> packages) | void                                            |
| **private**        | buildPackages                                                          | List<javax.lang.model.element.PackageElement>   |
| **private**        | buildClasses                                                           | void                                            |
| **public**         | init(Locale locale, Reporter reporter)                                 | void                                            |
| **public**         | test1(Map<String,Integer> arg1)                                        | boolean                                         |
| **private**        | start                                                                  | boolean                                         |
| **public**         | run(DocletEnvironment environment)                                     | boolean                                         |
| **public**         | getSupportedOptions                                                    | Set<? extends jdk.javadoc.doclet.Doclet.Option> |
| **public**         | getName                                                                | String                                          |
| **private**        | generatePackage(PackageElement packageElement)                         | void                                            |
| **public static**  | main(String[] args)                                                    | void                                            |

Constructors
============
Marklet()
---------
*No method description provided*



Fields
======
java.util.Locale locale
-----------------------

jdk.javadoc.doclet.Reporter reporter
------------------------------------

jdk.javadoc.doclet.DocletEnvironment root
-----------------------------------------

java.util.Map<java.lang.String,java.lang.String> classPackageMapping
--------------------------------------------------------------------

io.github.atlascommunity.marklet.Options options
------------------------------------------------


Methods
=======
test1(boolean test1Var1, int test1Var2)
---------------------------------------
Test methods


getPackageDirectory(String packageName)
---------------------------------------
Builds and retrieves the path for the directory associated to the package with the given
 <tt>name</tt>.

### Parameters

packageName: Name of the package to get directory for.

### Returns

Built path.


getSupportedSourceVersion
-------------------------


### Returns

LanguageVersion supported.


generateReadme(List<javax.lang.model.element.PackageElement> packages)
----------------------------------------------------------------------
Generates Readme file

### Throws

IOException: If any error occurs during generation process.

### Parameters

packages: project packages list


buildPackages
-------------
Generates documentation file for each package.

### Throws

IOException: If any error occurs during generation process.

### Returns

list of packages documents


buildClasses
------------
Generates documentation file for classes, enumerations, interfaces, or annotations.

### Throws

IOException: If any error occurs during generation process.


init(Locale locale, Reporter reporter)
--------------------------------------
Overriden from {@link jdk.javadoc.doclet.StandardDoclet#init(Locale, Reporter)}, the
 doclet entry point

### Parameters

- locale: the locale to be used
- reporter: the reporter to be used



test1(Map<String,Integer> arg1)
-------------------------------


### Parameters

arg1: the args

### Returns

false if false

**Deprecated** since 9


start
-----


### Returns

`true` if generation was successful, `false` otherwise.


run(DocletEnvironment environment)
----------------------------------
**Doclet** worker point. Parses user provided options and starts a **Marklet** execution.

### Parameters

environment: DocletEnvironment.

### Returns

``true`` if the generation went well, ``false`` otherwise.


getSupportedOptions
-------------------
*No method description provided*


getName
-------
*No method description provided*


generatePackage(PackageElement packageElement)
----------------------------------------------
Generates package documentation for the given ``packageElement``.

### Throws

IOException: If any error occurs while creating file or directories.

### Parameters

packageElement: Package to generate documentation for.


main(String[] args)
-------------------
*No method description provided*



