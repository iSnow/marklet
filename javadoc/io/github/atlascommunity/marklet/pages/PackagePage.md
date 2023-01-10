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
| **private final io.github.atlascommunity.marklet.Options** | options          |
| **private final com.sun.source.util.DocTrees**             | comments         |
| **private final jdk.javadoc.doclet.DocletEnvironment**     | root             |
| **private final jdk.javadoc.doclet.Reporter**              | reporter         |
#### Methods
| Modifiers   | Method signature                                                                                         | Return type                          |
| ----------- | -------------------------------------------------------------------------------------------------------- | ------------------------------------ |
| **public**  | build()                                                                                                  | String                               |
| **private** | getFullBody(PackageElement packageElement, DocTrees comments)                                            | List<com.sun.source.doctree.DocTree> |
| **private** | createPackageIndexes(StringBuilder packagePage)                                                          | void                                 |
| **private** | createPackageEnumIndex(StringBuilder packagePage)                                                        | void                                 |
| **private** | createPackageInterfaceIndex(StringBuilder packagePage)                                                   | void                                 |
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


io.github.atlascommunity.marklet.Options options
------------------------------------------------
Doclet options


com.sun.source.util.DocTrees comments
-------------------------------------
This class provides methods to access TreePaths, DocCommentTrees and so on.


jdk.javadoc.doclet.DocletEnvironment root
-----------------------------------------
*No description provided*


jdk.javadoc.doclet.Reporter reporter
------------------------------------
*No description provided*


Methods
=======
build()
-------
Build document and write it to the selected folder

### Throws

IOException: something went wrong during write operation


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


createPackageInterfaceIndex(StringBuilder packagePage)
------------------------------------------------------
Generate index table for package interfaces

### Parameters

packagePage: StringBuilder collecting package page content


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


