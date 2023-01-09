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
| **private final javax.lang.model.element.PackageElement**  | packageElement   |
| **private final jdk.javadoc.doclet.DocletEnvironment**     | root             |
| **private final com.sun.source.util.DocTrees**             | comments         |
| **private final java.nio.file.Path**                       | packageDirectory |
| **private final io.github.atlascommunity.marklet.Options** | options          |
#### Methods
| Type and modifiers | Method signature                                                                                         | Return type                          |
| ------------------ | -------------------------------------------------------------------------------------------------------- | ------------------------------------ |
| **private**        | createPackageEnumIndex(StringBuilder packagePage)                                                        | void                                 |
| **private**        | createPackageIndexes(StringBuilder packagePage)                                                          | void                                 |
| **private**        | createPackageClassIndex(StringBuilder packagePage)                                                       | void                                 |
| **private**        | generateTable(String tableLabel, javax.lang.model.element.TypeElement[] docs, StringBuilder packagePage) | void                                 |
| **private**        | getFullBody(PackageElement packageElement, DocTrees comments)                                            | List<com.sun.source.doctree.DocTree> |
| **private**        | writeFile(StringBuilder pageContent)                                                                     | void                                 |
| **public**         | build(Reporter reporter) **(Override)**                                                                  | void                                 |

Constructors
============
PackagePage()
-------------
*No method description provided*



Fields
======
javax.lang.model.element.PackageElement packageElement
------------------------------------------------------
Package information


jdk.javadoc.doclet.DocletEnvironment root
-----------------------------------------
*No description provided*


com.sun.source.util.DocTrees comments
-------------------------------------
This class provides methods to access TreePaths, DocCommentTrees and so on.


java.nio.file.Path packageDirectory
-----------------------------------
Package path


io.github.atlascommunity.marklet.Options options
------------------------------------------------
Doclet options



Methods
=======
createPackageEnumIndex(StringBuilder packagePage)
-------------------------------------------------
Generate index table for package classes

### Parameters

packagePage: string representation of package page content


createPackageIndexes(StringBuilder packagePage)
-----------------------------------------------
Generate index tables for package annotations, enums, interfaces and classes

### Parameters

packagePage: string representation of package page content


createPackageClassIndex(StringBuilder packagePage)
--------------------------------------------------
Generate index table for package classes

### Parameters

packagePage: string representation of package page content


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


writeFile(StringBuilder pageContent)
------------------------------------
Write file to the selected folder

### Throws

IOException: something went wrong during write operation

### Parameters

pageContent: file content


build(Reporter reporter)
------------------------
### Overrides/Implements:
build(Reporter reporter) from io.github.atlascommunity.marklet.pages.DocumentPage

Build document and write it to the selected folder

### Throws

IOException: something went wrong during write operation



