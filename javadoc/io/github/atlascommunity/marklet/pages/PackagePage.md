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
| Modifiers         | Field name                                                                                                                  | Type                                     |
| ----------------- | --------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------- |
| **private final** | [private final javax.lang.model.element.PackageElement packageElement](#javaxlangmodelelementpackageelement-packageelement) | javax.lang.model.element.PackageElement  |
| **private final** | [private final java.nio.file.Path packageDirectory](#javaniofilepath-packagedirectory)                                      | java.nio.file.Path                       |
| **private final** | [private final io.github.atlascommunity.marklet.Options options](#iogithubatlascommunitymarkletoptions-options)             | io.github.atlascommunity.marklet.Options |
| **private final** | [private final com.sun.source.util.DocTrees comments](#comsunsourceutildoctrees-comments)                                   | com.sun.source.util.DocTrees             |
| **private final** | [private final jdk.javadoc.doclet.DocletEnvironment root](#jdkjavadocdocletdocletenvironment-root)                          | jdk.javadoc.doclet.DocletEnvironment     |
| **private final** | [private final jdk.javadoc.doclet.Reporter reporter](#jdkjavadocdocletreporter-reporter)                                    | jdk.javadoc.doclet.Reporter              |
#### Methods
| Modifiers   | Method signature                                                                                                                                                                                            | Return type                          |
| ----------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------ |
| **public**  | [build()](#build)                                                                                                                                                                                           | String                               |
| **private** | [getFullBody(PackageElement packageElement, DocTrees comments)](#getfullbodypackageelement-packageelement-doctrees-comments)                                                                                | List<com.sun.source.doctree.DocTree> |
| **private** | [createPackageIndexes(StringBuilder packagePage)](#createpackageindexesstringbuilder-packagepage)                                                                                                           | void                                 |
| **private** | [createPackageEnumIndex(StringBuilder packagePage)](#createpackageenumindexstringbuilder-packagepage)                                                                                                       | void                                 |
| **private** | [createPackageInterfaceIndex(StringBuilder packagePage)](#createpackageinterfaceindexstringbuilder-packagepage)                                                                                             | void                                 |
| **private** | [createPackageClassIndex(StringBuilder packagePage)](#createpackageclassindexstringbuilder-packagepage)                                                                                                     | void                                 |
| **private** | [generateTable(String tableLabel, javax.lang.model.element.TypeElement[] docs, StringBuilder packagePage)](#generatetablestring-tablelabel-javaxlangmodelelementtypeelement-docs-stringbuilder-packagepage) | void                                 |
| **public**  | [write()](#write)                                                                                                                                                                                           | void                                 |

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


