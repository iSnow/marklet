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
| Type and modifiers                                                 | Field name          |
| ------------------------------------------------------------------ | ------------------- |
| **private jdk.javadoc.doclet.DocletEnvironment**                   | root                |
| **private final java.util.Map<java.lang.String,java.lang.String>** | classPackageMapping |
| **jdk.javadoc.doclet.Reporter**                                    | reporter            |
| **private final io.github.atlascommunity.marklet.Options**         | options             |
| **private java.util.Locale**                                       | locale              |
#### Methods
| Type and modifiers | Method signature                                                                 | Return type                                               |
| ------------------ | -------------------------------------------------------------------------------- | --------------------------------------------------------- |
| **private**        | start()                                                                          | boolean                                                   |
| **public**         | test1(java.util.Map<java.lang.String,java.lang.Integer> arg1)                    | boolean                                                   |
| **private**        | generateReadme(java.util.List<javax.lang.model.element.PackageElement> packages) | void                                                      |
| **public**         | getName()                                                                        | java.lang.String                                          |
| **private**        | buildPackages()                                                                  | java.util.List<javax.lang.model.element.PackageElement>   |
| **public**         | init(Locale locale, Reporter reporter)                                           | void                                                      |
| **public**         | getSupportedOptions()                                                            | java.util.Set<? extends jdk.javadoc.doclet.Doclet.Option> |
| **public**         | getSupportedSourceVersion()                                                      | javax.lang.model.SourceVersion                            |
| **private**        | getPackageDirectory(String packageName)                                          | java.nio.file.Path                                        |
| **private**        | generatePackage(PackageElement packageElement)                                   | void                                                      |
| **public**         | test1(boolean test1Var1, int test1Var2)                                          | boolean                                                   |
| **public static**  | main(java.lang.String[] args)                                                    | void                                                      |
| **public**         | run(DocletEnvironment environment)                                               | boolean                                                   |
| **private**        | buildClasses()                                                                   | void                                                      |

Constructors
============
Marklet()
---------
*No method description provided*



Fields
======
jdk.javadoc.doclet.DocletEnvironment root
-----------------------------------------

java.util.Map<java.lang.String,java.lang.String> classPackageMapping
--------------------------------------------------------------------

jdk.javadoc.doclet.Reporter reporter
------------------------------------

io.github.atlascommunity.marklet.Options options
------------------------------------------------

java.util.Locale locale
-----------------------


Methods
=======
start()
-------


### Returns

`true` if generation was successful, `false` otherwise.


test1(java.util.Map<java.lang.String,java.lang.Integer> arg1)
-------------------------------------------------------------


### Parameters

arg1: the args

### Returns

false if false

**Deprecated** since 9


generateReadme(java.util.List<javax.lang.model.element.PackageElement> packages)
--------------------------------------------------------------------------------
Generates Readme file

### Throws

IOException: If any error occurs during generation process.

### Parameters

packages: project packages list


getName()
---------
*No method description provided*


buildPackages()
---------------
Generates documentation file for each package.

### Throws

IOException: If any error occurs during generation process.

### Returns

list of packages documents


init(Locale locale, Reporter reporter)
--------------------------------------
Overriden from {@link jdk.javadoc.doclet.StandardDoclet#init(Locale, Reporter)}, the
 doclet entry point

### Parameters

- locale: the locale to be used
- reporter: the reporter to be used



getSupportedOptions()
---------------------
*No method description provided*


getSupportedSourceVersion()
---------------------------


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


generatePackage(PackageElement packageElement)
----------------------------------------------
Generates package documentation for the given ``packageElement``.

### Throws

IOException: If any error occurs while creating file or directories.

### Parameters

packageElement: Package to generate documentation for.


test1(boolean test1Var1, int test1Var2)
---------------------------------------
Test methods


main(java.lang.String[] args)
-----------------------------
*No method description provided*


run(DocletEnvironment environment)
----------------------------------
**Doclet** worker point. Parses user provided options and starts a **Marklet** execution.

### Parameters

environment: DocletEnvironment.

### Returns

``true`` if the generation went well, ``false`` otherwise.


buildClasses()
--------------
Generates documentation file for classes, enumerations, interfaces, or annotations.

### Throws

IOException: If any error occurs during generation process.



