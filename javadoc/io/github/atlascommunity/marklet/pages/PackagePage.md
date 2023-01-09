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
| **private final io.github.atlascommunity.marklet.Options** | options          |
| **private final javax.lang.model.element.PackageElement**  | packageElement   |
| **private final java.nio.file.Path**                       | packageDirectory |
| **private final com.sun.source.util.DocTrees**             | comments         |
| **private final jdk.javadoc.doclet.DocletEnvironment**     | root             |
#### Methods
| Modifiers   | Method signature                                                                                         | Return type                          |
| ----------- | -------------------------------------------------------------------------------------------------------- | ------------------------------------ |
| **public**  | build(Reporter reporter) **(Override)**                                                                  | void                                 |
| **private** | createPackageClassIndex(StringBuilder packagePage)                                                       | void                                 |
| **private** | generateTable(String tableLabel, javax.lang.model.element.TypeElement[] docs, StringBuilder packagePage) | void                                 |
| **private** | getFullBody(PackageElement packageElement, DocTrees comments)                                            | List<com.sun.source.doctree.DocTree> |
| **private** | createPackageIndexes(StringBuilder packagePage)                                                          | void                                 |
| **private** | createPackageEnumIndex(StringBuilder packagePage)                                                        | void                                 |
| **private** | writeFile(StringBuilder pageContent)                                                                     | void                                 |
| **private** | createPackageInterfaceIndex(StringBuilder packagePage)                                                   | void                                 |

Constructors
============
PackagePage()
-------------
*No method description provided*


Fields
======
io.github.atlascommunity.marklet.Options options
------------------------------------------------
Doclet options


javax.lang.model.element.PackageElement packageElement
------------------------------------------------------
Package information


java.nio.file.Path packageDirectory
-----------------------------------
Package path


com.sun.source.util.DocTrees comments
-------------------------------------
This class provides methods to access TreePaths, DocCommentTrees and so on.


jdk.javadoc.doclet.DocletEnvironment root
-----------------------------------------
*No description provided*


Methods
=======
build(Reporter reporter)
------------------------
### Overrides/Implements:
build(Reporter reporter) from io.github.atlascommunity.marklet.pages.DocumentPage

Build document and write it to the selected folder

### Throws

IOException: something went wrong during write operation


createPackageClassIndex(StringBuilder packagePage)
--------------------------------------------------
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



getFullBody(PackageElement packageElement, DocTrees comments)
-------------------------------------------------------------
*No method description provided*


createPackageIndexes(StringBuilder packagePage)
-----------------------------------------------
Generate index tables for package annotations, enums, interfaces and classes

### Parameters

packagePage: string representation of package page content


createPackageEnumIndex(StringBuilder packagePage)
-------------------------------------------------
Generate index table for package classes

### Parameters

packagePage: StringBuilder collecting package page content


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


