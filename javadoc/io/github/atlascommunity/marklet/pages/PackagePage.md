Class PackagePage extends io.github.atlascommunity.marklet.pages.DocumentPage
=============================================================================
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
| **private final java.nio.file.Path**                       | packageDirectory |
| **private final jdk.javadoc.doclet.DocletEnvironment**     | root             |
| **private final jdk.javadoc.doclet.Reporter**              | reporter         |
| **private final io.github.atlascommunity.marklet.Options** | options          |
| **private final com.sun.source.util.DocTrees**             | comments         |
#### Methods
| Modifiers   | Method signature                                                                                         | Return type                          |
| ----------- | -------------------------------------------------------------------------------------------------------- | ------------------------------------ |
| **private** | createPackageInterfaceIndex(StringBuilder packagePage)                                                   | void                                 |
| **private** | getFullBody(PackageElement packageElement, DocTrees comments)                                            | List<com.sun.source.doctree.DocTree> |
| **private** | createPackageEnumIndex(StringBuilder packagePage)                                                        | void                                 |
| **private** | createPackageIndexes(StringBuilder packagePage)                                                          | void                                 |
| **public**  | build()                                                                                                  | String                               |
| **private** | createPackageClassIndex(StringBuilder packagePage)                                                       | void                                 |
| **private** | generateTable(String tableLabel, javax.lang.model.element.TypeElement[] docs, StringBuilder packagePage) | void                                 |
| **public**  | write()                                                                                                  | void                                 |

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


java.nio.file.Path packageDirectory
-----------------------------------
Package path


jdk.javadoc.doclet.DocletEnvironment root
-----------------------------------------
*No description provided*


jdk.javadoc.doclet.Reporter reporter
------------------------------------
*No description provided*


io.github.atlascommunity.marklet.Options options
------------------------------------------------
Doclet options


com.sun.source.util.DocTrees comments
-------------------------------------
This class provides methods to access TreePaths, DocCommentTrees and so on.


Methods
=======
createPackageInterfaceIndex(StringBuilder packagePage)
------------------------------------------------------
Generate index table for package interfaces

### Parameters

packagePage: StringBuilder collecting package page content


getFullBody(PackageElement packageElement, DocTrees comments)
-------------------------------------------------------------
*No method description provided*


createPackageEnumIndex(StringBuilder packagePage)
-------------------------------------------------
Generate index table for package classes

### Parameters

packagePage: StringBuilder collecting package page content


createPackageIndexes(StringBuilder packagePage)
-----------------------------------------------
Generate index tables for package annotations, enums, interfaces and classes

### Parameters

packagePage: string representation of package page content


build()
-------
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



write()
-------
*No method description provided*


