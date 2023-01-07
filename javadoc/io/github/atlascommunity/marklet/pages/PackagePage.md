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
| **private final com.sun.source.util.DocTrees**             | comments         |
| **private final io.github.atlascommunity.marklet.Options** | options          |
| **private final javax.lang.model.element.PackageElement**  | packageElement   |
#### Methods
| Type and modifiers | Method signature                                                                                         | Return type                          |
| ------------------ | -------------------------------------------------------------------------------------------------------- | ------------------------------------ |
| **private**        | writeFile(StringBuilder pageContent)                                                                     | void                                 |
| **public**         | build(Reporter reporter)                                                                                 | void                                 |
| **private**        | getFullBody(PackageElement packageElement, DocTrees comments)                                            | List<com.sun.source.doctree.DocTree> |
| **private**        | createPackageEnumIndex(StringBuilder packagePage)                                                        | void                                 |
| **private**        | generateTable(String tableLabel, javax.lang.model.element.TypeElement[] docs, StringBuilder packagePage) | void                                 |
| **private**        | createPackageClassIndex(StringBuilder packagePage)                                                       | void                                 |
| **private**        | createPackageIndexes(StringBuilder packagePage)                                                          | void                                 |

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

com.sun.source.util.DocTrees comments
-------------------------------------

io.github.atlascommunity.marklet.Options options
------------------------------------------------

javax.lang.model.element.PackageElement packageElement
------------------------------------------------------


Methods
=======
writeFile(StringBuilder pageContent)
------------------------------------
Write file to the selected folder

### Throws

IOException: something went wrong during write operation

### Parameters

pageContent: file content


build(Reporter reporter)
------------------------
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

packagePage: string representation of package page content


generateTable(String tableLabel, javax.lang.model.element.TypeElement[] docs, StringBuilder packagePage)
--------------------------------------------------------------------------------------------------------
Generate index table

### Parameters

- tableLabel: table name
- docs: elements to work with
- packagePage: string representation of package page content



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



