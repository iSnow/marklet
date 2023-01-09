Class PackagePage implements io.github.atlascommunity.marklet.pages.DocumentPage
================================================================================
Index of package elements

io.github.atlascommunity.marklet.pages.PackagePage Summary
-------
#### Constructors
| Visibility | Signature     |
| ---------- | ------------- |
| public     | PackagePage() |
#### Fields
| Type and modifiers                                         | Field name       |
| ---------------------------------------------------------- | ---------------- |
| **private final com.sun.source.util.DocTrees**             | comments         |
| **private final jdk.javadoc.doclet.DocletEnvironment**     | root             |
| **private final io.github.atlascommunity.marklet.Options** | options          |
| **private final java.nio.file.Path**                       | packageDirectory |
| **private final javax.lang.model.element.PackageElement**  | packageElement   |
#### Methods
| Modifiers   | Method signature                                                                                         | Return type                          |
| ----------- | -------------------------------------------------------------------------------------------------------- | ------------------------------------ |
| **private** | createPackageClassIndex(StringBuilder packagePage)                                                       | void                                 |
| **private** | createPackageIndexes(StringBuilder packagePage)                                                          | void                                 |
| **public**  | build(Reporter reporter) **(Override)**                                                                  | void                                 |
| **private** | getFullBody(PackageElement packageElement, DocTrees comments)                                            | List<com.sun.source.doctree.DocTree> |
| **private** | createPackageEnumIndex(StringBuilder packagePage)                                                        | void                                 |
| **private** | generateTable(String tableLabel, javax.lang.model.element.TypeElement[] docs, StringBuilder packagePage) | void                                 |
| **private** | writeFile(StringBuilder pageContent)                                                                     | void                                 |
| **private** | createPackageInterfaceIndex(StringBuilder packagePage)                                                   | void                                 |

Constructors
============
PackagePage()
-------------
*No method description provided*


Fields
======
com.sun.source.util.DocTrees comments
-------------------------------------
This class provides methods to access TreePaths, DocCommentTrees and so on.


jdk.javadoc.doclet.DocletEnvironment root
-----------------------------------------
*No description provided*


io.github.atlascommunity.marklet.Options options
------------------------------------------------
Doclet options


java.nio.file.Path packageDirectory
-----------------------------------
Package path


javax.lang.model.element.PackageElement packageElement
------------------------------------------------------
Package information


Methods
=======
createPackageClassIndex(StringBuilder packagePage)
--------------------------------------------------
Generate index table for package classes

### Parameters

packagePage: StringBuilder collecting package page content


createPackageIndexes(StringBuilder packagePage)
-----------------------------------------------
Generate index tables for package annotations, enums, interfaces and classes

### Parameters

packagePage: string representation of package page content


build(Reporter reporter)
------------------------
### Overrides/Implements:
build(Reporter reporter) from io.github.atlascommunity.marklet.pages.DocumentPage

Build document and write it to the selected folder

### Throws

IOException: something went wrong during write operation


getFullBody(PackageElement packageElement, DocTrees comments)
-------------------------------------------------------------
*No method description provided*


createPackageEnumIndex(StringBuilder packagePage)
-------------------------------------------------
Generate index table for package classes

### Parameters

packagePage: StringBuilder collecting package page content


generateTable(String tableLabel, javax.lang.model.element.TypeElement[] docs, StringBuilder packagePage)
--------------------------------------------------------------------------------------------------------
Generate index table

### Parameters

- tableLabel: table name
- docs: elements to work with
- packagePage: string representation of package page content



writeFile(StringBuilder pageContent)
------------------------------------
Write file to the selected folder

### Throws

IOException: something went wrong during write operation

### Parameters

pageContent: file content


createPackageInterfaceIndex(StringBuilder packagePage)
------------------------------------------------------
Generate index table for package interfaces

### Parameters

packagePage: StringBuilder collecting package page content


