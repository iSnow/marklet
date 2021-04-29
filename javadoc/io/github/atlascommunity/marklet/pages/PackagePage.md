Class PackagePage
=================
io.github.atlascommunity.marklet.pages.PackagePage
Summary
-------
#### Constructors
| Visibility | Signature     |
| ---------- | ------------- |
| **public** | PackagePage() |
#### Fields
| Type and modifiers                                         | Field name       |
| ---------------------------------------------------------- | ---------------- |
| **private final com.sun.javadoc.PackageDoc**               | packageDoc       |
| **private final java.nio.file.Path**                       | packageDirectory |
| **private final io.github.atlascommunity.marklet.Options** | options          |
#### Methods
| Type and modifiers | Method signature                                                                           | Return type |
| ------------------ | ------------------------------------------------------------------------------------------ | ----------- |
| **public**         | build()                                                                                    | void        |
| **private**        | createPackageIndexes(StringBuilder packagePage)                                            | void        |
| **private**        | generateTable(String tableLabel,com.sun.javadoc.ClassDoc[] docs,StringBuilder packagePage) | void        |
| **private**        | writeFile(StringBuilder pageContent)                                                       | void        |

Constructors
============
PackagePage ()
--------------


Fields
======
com.sun.javadoc.PackageDoc, packageDoc
--------------------------------------
Package information

java.nio.file.Path, packageDirectory
------------------------------------
Package path

io.github.atlascommunity.marklet.Options, options
-------------------------------------------------
Doclet options


Methods
=======
build ()
--------
Build document and write it to the selected folder
### Throws
java.io.IOException: something went wrong during write operation

createPackageIndexes (StringBuilder)
------------------------------------
Generate index tables for package annotations, enums, interfaces and classes
### Parameters
- packagePage: string representation of package page content

generateTable (String, ClassDoc[], StringBuilder)
-------------------------------------------------
Generate index table
### Parameters
- tableLabel: table name
- docs: elements to work with
- packagePage: string representation of package page content

writeFile (StringBuilder)
-------------------------
Write file to the selected folder
### Parameters
- pageContent: file content
### Throws
java.io.IOException: something went wrong during write operation


