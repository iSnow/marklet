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
| **private java.util.Locale**                                       | locale              |
| **private jdk.javadoc.doclet.DocletEnvironment**                   | root                |
| **jdk.javadoc.doclet.Reporter**                                    | reporter            |
| **private final io.github.atlascommunity.marklet.Options**         | options             |
#### Methods
| Type and modifiers | Method signature                                                                 | Return type                                               |
| ------------------ | -------------------------------------------------------------------------------- | --------------------------------------------------------- |
| **private**        | generateReadme(java.util.List<javax.lang.model.element.PackageElement> packages) | void                                                      |
| **public**         | test1(java.util.Map<java.lang.String,java.lang.Integer> arg1)                    | boolean                                                   |
| **private**        | generatePackage(PackageElement packageElement)                                   | void                                                      |
| **private**        | start()                                                                          | boolean                                                   |
| **public**         | init(Locale locale, Reporter reporter)                                           | void                                                      |
| **public**         | getSupportedSourceVersion()                                                      | javax.lang.model.SourceVersion                            |
| **public**         | getName()                                                                        | java.lang.String                                          |
| **private**        | getPackageDirectory(String packageName)                                          | java.nio.file.Path                                        |
| **public static**  | main(java.lang.String[] args)                                                    | void                                                      |
| **public**         | run(DocletEnvironment environment)                                               | boolean                                                   |
| **private**        | buildPackages(PackageElement elem)                                               | java.util.List<javax.lang.model.element.PackageElement>   |
| **private**        | buildPackages()                                                                  | java.util.List<javax.lang.model.element.PackageElement>   |
| **public**         | getSupportedOptions()                                                            | java.util.Set<? extends jdk.javadoc.doclet.Doclet.Option> |
| **public**         | test1(boolean test1Var1, int test1Var2)                                          | boolean                                                   |
| **private**        | buildClasses()                                                                   | void                                                      |

Constructors
============
Marklet()
---------


Fields
======
java.util.Map<java.lang.String,java.lang.String> classPackageMapping
--------------------------------------------------------------------

java.util.Locale locale
-----------------------

jdk.javadoc.doclet.DocletEnvironment root
-----------------------------------------

jdk.javadoc.doclet.Reporter reporter
------------------------------------

io.github.atlascommunity.marklet.Options options
------------------------------------------------


Methods
=======
generateReadme(java.util.List<javax.lang.model.element.PackageElement> packages)
--------------------------------------------------------------------------------
Generates Readme file

@throws IOException If any error occurs during generation process.

@param packages project packages list



test1(java.util.Map<java.lang.String,java.lang.Integer> arg1)
-------------------------------------------------------------
*No method description provided*



generatePackage(PackageElement packageElement)
----------------------------------------------
Generates package documentation for the given ``packageElement``.

@throws IOException If any error occurs while creating file or directories.

@param packageElement Package to generate documentation for.



start()
-------


@return <tt>true</tt> if generation was successful, <tt>false</tt> otherwise.



init(Locale locale, Reporter reporter)
--------------------------------------
*No method description provided*



getSupportedSourceVersion()
---------------------------


@return LanguageVersion supported.



getName()
---------
*No method description provided*



getPackageDirectory(String packageName)
---------------------------------------
Builds and retrieves the path for the directory associated to the package with the given
 <tt>name</tt>.

@param packageName Name of the package to get directory for.

@return Built path.



main(java.lang.String[] args)
-----------------------------
*No method description provided*



run(DocletEnvironment environment)
----------------------------------
**Doclet** worker point. Parses user provided options and starts a **Marklet** execution.

@param environment DocletEnvironment.

@return ``true`` if the generation went well, ``false`` otherwise.



buildPackages(PackageElement elem)
----------------------------------
*No method description provided*



buildPackages()
---------------
Generates documentation file for each package.

@throws IOException If any error occurs during generation process.

@return list of packages documents



getSupportedOptions()
---------------------
*No method description provided*



test1(boolean test1Var1, int test1Var2)
---------------------------------------
Test methods



buildClasses()
--------------
Generates documentation file for classes, enumerations, interfaces, or annotations.

@throws IOException If any error occurs during generation process.




