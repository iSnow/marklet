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
| **private final com.sun.source.util.DocTrees**             | comments         |
| **private final jdk.javadoc.doclet.DocletEnvironment**     | root             |
| **private final javax.lang.model.element.PackageElement**  | packageElement   |
| **private final java.nio.file.Path**                       | packageDirectory |
#### Methods
| Type and modifiers | Method signature                                                                                         | Return type                                    |
| ------------------ | -------------------------------------------------------------------------------------------------------- | ---------------------------------------------- |
| **private**        | createPackageClassIndex(StringBuilder packagePage)                                                       | void                                           |
| **private**        | createPackageEnumIndex(StringBuilder packagePage)                                                        | void                                           |
| **private**        | getFullBody(PackageElement packageElement, DocTrees comments)                                            | java.util.List<com.sun.source.doctree.DocTree> |
| **private**        | writeFile(StringBuilder pageContent)                                                                     | void                                           |
| **private**        | generateTable(String tableLabel, javax.lang.model.element.TypeElement[] docs, StringBuilder packagePage) | void                                           |
| **public**         | build(Reporter reporter)                                                                                 | void                                           |
| **private**        | createPackageIndexes(StringBuilder packagePage)                                                          | void                                           |

Constructors
============
PackagePage()
-------------


Fields
======
io.github.atlascommunity.marklet.Options options
------------------------------------------------

com.sun.source.util.DocTrees comments
-------------------------------------

jdk.javadoc.doclet.DocletEnvironment root
-----------------------------------------

javax.lang.model.element.PackageElement packageElement
------------------------------------------------------

java.nio.file.Path packageDirectory
-----------------------------------


Methods
=======
createPackageClassIndex(StringBuilder packagePage)
--------------------------------------------------
Generate index table for package classes

@param packagePage string representation of package page content



createPackageEnumIndex(StringBuilder packagePage)
-------------------------------------------------
Generate index table for package classes

@param packagePage string representation of package page content



getFullBody(PackageElement packageElement, DocTrees comments)
-------------------------------------------------------------
*No method description provided*



writeFile(StringBuilder pageContent)
------------------------------------
Write file to the selected folder

@throws IOException something went wrong during write operation

@param pageContent file content



generateTable(String tableLabel, javax.lang.model.element.TypeElement[] docs, StringBuilder packagePage)
--------------------------------------------------------------------------------------------------------
Generate index table

@param packagePage string representation of package page content



build(Reporter reporter)
------------------------
Build document and write it to the selected folder

@throws IOException something went wrong during write operation



createPackageIndexes(StringBuilder packagePage)
-----------------------------------------------
Generate index tables for package annotations, enums, interfaces and classes

@param packagePage string representation of package page content




