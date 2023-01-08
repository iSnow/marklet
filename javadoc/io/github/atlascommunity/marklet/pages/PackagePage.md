Class PackagePage
=================
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
| **private final jdk.javadoc.doclet.DocletEnvironment**     | root             |
| **private final com.sun.source.util.DocTrees**             | comments         |
| **private final javax.lang.model.element.PackageElement**  | packageElement   |
| **private final io.github.atlascommunity.marklet.Options** | options          |
| **private final java.nio.file.Path**                       | packageDirectory |
#### Methods
| Type and modifiers | Method signature                                                                                         | Return type                          |
| ------------------ | -------------------------------------------------------------------------------------------------------- | ------------------------------------ |
| **private**        | generateTable(String tableLabel, javax.lang.model.element.TypeElement[] docs, StringBuilder packagePage) | void                                 |
| **public**         | build(Reporter reporter)                                                                                 | void                                 |
| **private**        | createPackageIndexes(StringBuilder packagePage)                                                          | void                                 |
| **private**        | createPackageClassIndex(StringBuilder packagePage)                                                       | void                                 |
| **private**        | writeFile(StringBuilder pageContent)                                                                     | void                                 |
| **private**        | createPackageEnumIndex(StringBuilder packagePage)                                                        | void                                 |
| **private**        | getFullBody(PackageElement packageElement, DocTrees comments)                                            | List<com.sun.source.doctree.DocTree> |

Constructors
============
PackagePage()
-------------
*No method description provided*



Fields
======
jdk.javadoc.doclet.DocletEnvironment root
-----------------------------------------
*No description provided*


com.sun.source.util.DocTrees comments
-------------------------------------
This class provides methods to access TreePaths, DocCommentTrees and so on.


javax.lang.model.element.PackageElement packageElement
------------------------------------------------------
Package information


io.github.atlascommunity.marklet.Options options
------------------------------------------------
Doclet options


java.nio.file.Path packageDirectory
-----------------------------------
Package path



Methods
=======
generateTable(String tableLabel, javax.lang.model.element.TypeElement[] docs, StringBuilder packagePage)
--------------------------------------------------------------------------------------------------------
Generate index table

### Parameters

- tableLabel: table name
- docs: elements to work with
- packagePage: string representation of package page content



build(Reporter reporter)
------------------------
Build document and write it to the selected folder

### Throws

IOException: something went wrong during write operation


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


writeFile(StringBuilder pageContent)
------------------------------------
Write file to the selected folder

### Throws

IOException: something went wrong during write operation

### Parameters

pageContent: file content


createPackageEnumIndex(StringBuilder packagePage)
-------------------------------------------------
Generate index table for package classes

### Parameters

packagePage: string representation of package page content


getFullBody(PackageElement packageElement, DocTrees comments)
-------------------------------------------------------------
*No method description provided*



