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
| **private final java.nio.file.Path**                       | packageDirectory |
| **private final javax.lang.model.element.PackageElement**  | packageElement   |
| **private final com.sun.source.util.DocTrees**             | comments         |
| **private final io.github.atlascommunity.marklet.Options** | options          |
#### Methods
| Type and modifiers | Method signature                                                                                         | Return type                                    |
| ------------------ | -------------------------------------------------------------------------------------------------------- | ---------------------------------------------- |
| **private**        | createPackageEnumIndex(StringBuilder packagePage)                                                        | void                                           |
| **private**        | createPackageIndexes(StringBuilder packagePage)                                                          | void                                           |
| **private**        | createPackageClassIndex(StringBuilder packagePage)                                                       | void                                           |
| **private**        | writeFile(StringBuilder pageContent)                                                                     | void                                           |
| **private**        | getFullBody(PackageElement packageElement, DocTrees comments)                                            | java.util.List<com.sun.source.doctree.DocTree> |
| **public**         | build(Reporter reporter)                                                                                 | void                                           |
| **private**        | generateTable(String tableLabel, javax.lang.model.element.TypeElement[] docs, StringBuilder packagePage) | void                                           |

Constructors
============
PackagePage()
-------------
*No method description provided*



Fields
======
jdk.javadoc.doclet.DocletEnvironment root
-----------------------------------------

java.nio.file.Path packageDirectory
-----------------------------------

javax.lang.model.element.PackageElement packageElement
------------------------------------------------------

com.sun.source.util.DocTrees comments
-------------------------------------

io.github.atlascommunity.marklet.Options options
------------------------------------------------


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


build(Reporter reporter)
------------------------
Build document and write it to the selected folder

### Throws

IOException: something went wrong during write operation


generateTable(String tableLabel, javax.lang.model.element.TypeElement[] docs, StringBuilder packagePage)
--------------------------------------------------------------------------------------------------------
Generate index table

### Parameters

- tableLabel: table name
- docs: elements to work with
- packagePage: string representation of package page content




