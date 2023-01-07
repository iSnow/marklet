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
| **private final java.util.Map<java.lang.String,java.lang.String>** | classPackageMapping |
| **private final io.github.atlascommunity.marklet.Options**         | options             |
| **jdk.javadoc.doclet.Reporter**                                    | reporter            |
| **private java.util.Locale**                                       | locale              |
| **private jdk.javadoc.doclet.DocletEnvironment**                   | root                |
#### Methods
| Type and modifiers | Method signature                                                                 | Return type                                               |
| ------------------ | -------------------------------------------------------------------------------- | --------------------------------------------------------- |
| **private**        | generatePackage(PackageElement packageElement)                                   | void                                                      |
| **private**        | buildPackages()                                                                  | java.util.List<javax.lang.model.element.PackageElement>   |
| **public**         | init(Locale locale, Reporter reporter)                                           | void                                                      |
| **public static**  | main(java.lang.String[] args)                                                    | void                                                      |
| **public**         | getSupportedSourceVersion()                                                      | javax.lang.model.SourceVersion                            |
| **private**        | buildClasses()                                                                   | void                                                      |
| **public**         | getSupportedOptions()                                                            | java.util.Set<? extends jdk.javadoc.doclet.Doclet.Option> |
| **public**         | run(DocletEnvironment environment)                                               | boolean                                                   |
| **public**         | test1(boolean test1Var1, int test1Var2)                                          | boolean                                                   |
| **private**        | buildPackages(PackageElement elem)                                               | java.util.List<javax.lang.model.element.PackageElement>   |
| **private**        | generateReadme(java.util.List<javax.lang.model.element.PackageElement> packages) | void                                                      |
| **private**        | start()                                                                          | boolean                                                   |
| **public**         | test1(java.util.Map<java.lang.String,java.lang.Integer> arg1)                    | boolean                                                   |
| **private**        | getPackageDirectory(String packageName)                                          | java.nio.file.Path                                        |
| **public**         | getName()                                                                        | java.lang.String                                          |

Constructors
============
Marklet()
---------


Fields
======
java.util.Map<java.lang.String,java.lang.String> classPackageMapping
--------------------------------------------------------------------

io.github.atlascommunity.marklet.Options options
------------------------------------------------

jdk.javadoc.doclet.Reporter reporter
------------------------------------

java.util.Locale locale
-----------------------

jdk.javadoc.doclet.DocletEnvironment root
-----------------------------------------


Methods
=======
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



init(Locale locale, Reporter reporter)
--------------------------------------
Overriden from {@link jdk.javadoc.doclet.StandardDoclet#init(Locale, Reporter)}, the
 doclet entry point

### Parameters

- locale: the locale to be used
- reporter: the reporter to be used




main(java.lang.String[] args)
-----------------------------
*No method description provided*



getSupportedSourceVersion()
---------------------------


### Returns

LanguageVersion supported.



buildClasses()
--------------
Generates documentation file for classes, enumerations, interfaces, or annotations.

### Throws

IOException: If any error occurs during generation process.



getSupportedOptions()
---------------------
*No method description provided*



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



buildPackages(PackageElement elem)
----------------------------------
*No method description provided*



generateReadme(java.util.List<javax.lang.model.element.PackageElement> packages)
--------------------------------------------------------------------------------
Generates Readme file

### Throws

IOException: If any error occurs during generation process.

### Parameters

packages: project packages list



start()
-------


### Returns

`true` if generation was successful, `false` otherwise.



test1(java.util.Map<java.lang.String,java.lang.Integer> arg1)
-------------------------------------------------------------
*No method description provided*



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
*No method description provided*




