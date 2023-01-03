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

test1(java.util.Map<java.lang.String,java.lang.Integer> arg1)
-------------------------------------------------------------

generatePackage(PackageElement packageElement)
----------------------------------------------

start()
-------

init(Locale locale, Reporter reporter)
--------------------------------------

getSupportedSourceVersion()
---------------------------

getName()
---------

getPackageDirectory(String packageName)
---------------------------------------

main(java.lang.String[] args)
-----------------------------

run(DocletEnvironment environment)
----------------------------------

buildPackages(PackageElement elem)
----------------------------------

buildPackages()
---------------

getSupportedOptions()
---------------------

test1(boolean test1Var1, int test1Var2)
---------------------------------------

buildClasses()
--------------


