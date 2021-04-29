Class Marklet
=============
io.github.atlascommunity.marklet.Marklet
Summary
-------
#### Constructors
| Visibility | Signature |
| ---------- | --------- |
| **public** | Marklet() |
#### Fields
| Type and modifiers                                         | Field name |
| ---------------------------------------------------------- | ---------- |
| **private final io.github.atlascommunity.marklet.Options** | options    |
| **private final com.sun.javadoc.RootDoc**                  | root       |
#### Methods
| Type and modifiers | Method signature                                                     | Return type     |
| ------------------ | -------------------------------------------------------------------- | --------------- |
| **public static**  | optionLength(String option)                                          | int             |
| **public static**  | validOptions(java.lang.String[][] options,DocErrorReporter reporter) | boolean         |
| **public static**  | languageVersion()                                                    | LanguageVersion |
| **public static**  | start(RootDoc root)                                                  | boolean         |
| **private**        | getPackageDirectory(String packageName)                              | Path            |
| **private**        | generatePackage(PackageDoc packageDoc)                               | void            |
| **private**        | buildPackages()                                                      | List            |
| **private**        | generateReadme(java.util.List<com.sun.javadoc.PackageDoc> packages)  | void            |
| **private**        | buildClasses()                                                       | void            |
| **private**        | start()                                                              | boolean         |

Constructors
============
Marklet ()
----------


Fields
======
io.github.atlascommunity.marklet.Options, options
-------------------------------------------------
Command line options that have been parsed. *

com.sun.javadoc.RootDoc, root
-----------------------------
Documentation root provided by the doclet API. *


Methods
=======
optionLength (String)
---------------------
To document.
### Parameters
- option: To document.
### Returns
To document.

validOptions (String[][], DocErrorReporter)
-------------------------------------------
To document.
### Parameters
- options: Options from command line.
- reporter: Reporter instance to use in case of error.
### Returns
<tt>true</tt> if given set of options are valid, <tt>false</tt> otherwise.

languageVersion ()
------------------
No method description provided
### Returns
LanguageVersion supported.

start (RootDoc)
---------------
**Doclet** entry point. Parses user provided options and starts a **Marklet** execution.
### Parameters
- root: Doclet API root.
### Returns
``true`` if the generation went well, ``false`` otherwise.

getPackageDirectory (String)
----------------------------
Builds and retrieves the path for the directory associated to the package with the given
 <tt>name</tt>.
### Parameters
- packageName: Name of the package to get directory for.
### Returns
Built path.

generatePackage (PackageDoc)
----------------------------
Generates package documentation for the given ``packageDoc``.
### Parameters
- packageDoc: Package to generate documentation for.
### Throws
java.io.IOException: If any error occurs while creating file or directories.

buildPackages ()
----------------
Generates documentation file for each package.
### Returns
list of packages documents
### Throws
java.io.IOException: If any error occurs during generation process.

generateReadme (List<PackageDoc>)
---------------------------------
Generates Readme file
### Parameters
- packages: project packages list
### Throws
java.io.IOException: If any error occurs during generation process.

buildClasses ()
---------------
Generates documentation file for each classes, enumerations, interfaces, or annotations.
### Throws
java.io.IOException: If any error occurs during generation process.

start ()
--------
No method description provided
### Returns
<tt>true</tt> if generation was successful, <tt>false</tt> otherwise.


