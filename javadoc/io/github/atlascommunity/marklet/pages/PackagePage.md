Class PackagePage implements io.github.atlascommunity.marklet.pages.DocumentPage
================================================================================
Index of package elements

io.github.atlascommunity.marklet.pages.PackagePage Summary
-------
#### Constructors
| Visibility | Signature     |
| ---------- | ------------- |
| **public** | PackagePage() |
#### Fields
| Type and modifiers                                         | Field name       |
| ---------------------------------------------------------- | ---------------- |
| **private final javax.lang.model.element.PackageElement**  | packageElement   |
| **private final io.github.atlascommunity.marklet.Options** | options          |
| **private final jdk.javadoc.doclet.DocletEnvironment**     | root             |
| **private final com.sun.source.util.DocTrees**             | comments         |
| **private final java.nio.file.Path**                       | packageDirectory |
#### Methods
| Type and modifiers | Method signature                                                                                         | Return type                          |
| ------------------ | -------------------------------------------------------------------------------------------------------- | ------------------------------------ |
| **public**         | build(Reporter reporter)                                                                                 | void                                 |
| **private**        | createPackageClassIndex(StringBuilder packagePage)                                                       | void                                 |
| **private**        | createPackageIndexes(StringBuilder packagePage)                                                          | void                                 |
| **private**        | createPackageEnumIndex(StringBuilder packagePage)                                                        | void                                 |
| **private**        | writeFile(StringBuilder pageContent)                                                                     | void                                 |
| **private**        | getFullBody(PackageElement packageElement, DocTrees comments)                                            | List<com.sun.source.doctree.DocTree> |
| **private**        | generateTable(String tableLabel, javax.lang.model.element.TypeElement[] docs, StringBuilder packagePage) | void                                 |

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


io.github.atlascommunity.marklet.Options options
------------------------------------------------
Doclet options


jdk.javadoc.doclet.DocletEnvironment root
-----------------------------------------
*No description provided*


com.sun.source.util.DocTrees comments
-------------------------------------
This class provides methods to access TreePaths, DocCommentTrees and so on.


java.nio.file.Path packageDirectory
-----------------------------------
Package path



Methods
=======
build(Reporter reporter)
------------------------
Build document and write it to the selected folder

### Throws

IOException: something went wrong during write operation


createPackageClassIndex(StringBuilder packagePage)
--------------------------------------------------
Generate index table for package classes

### Parameters

packagePage: string representation of package page content


createPackageIndexes(StringBuilder packagePage)
-----------------------------------------------
Generate index tables for package annotations, enums, interfaces and classes

### Parameters

packagePage: string representation of package page content


createPackageEnumIndex(StringBuilder packagePage)
-------------------------------------------------
Generate index table for package classes

### Parameters

packagePage: string representation of package page content


writeFile(StringBuilder pageContent)
------------------------------------
Write file to the selected folder

### Throws

IOException: something went wrong during write operation

### Parameters

pageContent: file content


getFullBody(PackageElement packageElement, DocTrees comments)
-------------------------------------------------------------
*No method description provided*


generateTable(String tableLabel, javax.lang.model.element.TypeElement[] docs, StringBuilder packagePage)
--------------------------------------------------------------------------------------------------------
Generate index table

### Parameters

- tableLabel: table name
- docs: elements to work with
- packagePage: string representation of package page content




