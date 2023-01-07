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
| **private final io.github.atlascommunity.marklet.Options** | options          |
| **private final java.nio.file.Path**                       | packageDirectory |
| **private final javax.lang.model.element.PackageElement**  | packageElement   |
| **private final com.sun.source.util.DocTrees**             | comments         |
| **private final jdk.javadoc.doclet.DocletEnvironment**     | root             |
#### Methods
| Type and modifiers | Method signature                                                                                         | Return type                                    |
| ------------------ | -------------------------------------------------------------------------------------------------------- | ---------------------------------------------- |
| **private**        | generateTable(String tableLabel, javax.lang.model.element.TypeElement[] docs, StringBuilder packagePage) | void                                           |
| **private**        | writeFile(StringBuilder pageContent)                                                                     | void                                           |
| **private**        | createPackageIndexes(StringBuilder packagePage)                                                          | void                                           |
| **public**         | build(Reporter reporter)                                                                                 | void                                           |
| **private**        | createPackageClassIndex(StringBuilder packagePage)                                                       | void                                           |
| **private**        | createPackageEnumIndex(StringBuilder packagePage)                                                        | void                                           |
| **private**        | getFullBody(PackageElement packageElement, DocTrees comments)                                            | java.util.List<com.sun.source.doctree.DocTree> |

Constructors
============
PackagePage()
-------------


Fields
======
io.github.atlascommunity.marklet.Options options
------------------------------------------------

java.nio.file.Path packageDirectory
-----------------------------------

javax.lang.model.element.PackageElement packageElement
------------------------------------------------------

com.sun.source.util.DocTrees comments
-------------------------------------

jdk.javadoc.doclet.DocletEnvironment root
-----------------------------------------


Methods
=======
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



createPackageIndexes(StringBuilder packagePage)
-----------------------------------------------
Generate index tables for package annotations, enums, interfaces and classes

### Parameters

packagePage: string representation of package page content



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



createPackageEnumIndex(StringBuilder packagePage)
-------------------------------------------------
Generate index table for package classes

### Parameters

packagePage: string representation of package page content



getFullBody(PackageElement packageElement, DocTrees comments)
-------------------------------------------------------------
*No method description provided*




