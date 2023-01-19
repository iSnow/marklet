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
| Modifiers         | Field name                                                            | Type                                     |
| ----------------- | --------------------------------------------------------------------- | ---------------------------------------- |
| **private final** | [packageElement](#javaxlangmodelelementpackageelement-packageelement) | javax.lang.model.element.PackageElement  |
| **private final** | [packageDirectory](#javaniofilepath-packagedirectory)                 | java.nio.file.Path                       |
| **private final** | [options](#iogithubatlascommunitymarkletoptions-options)              | io.github.atlascommunity.marklet.Options |
| **private final** | [comments](#comsunsourceutildoctrees-comments)                        | com.sun.source.util.DocTrees             |
| **private final** | [root](#jdkjavadocdocletdocletenvironment-root)                       | jdk.javadoc.doclet.DocletEnvironment     |
| **private final** | [reporter](#jdkjavadocdocletreporter-reporter)                        | jdk.javadoc.doclet.Reporter              |
#### Methods
| Modifiers   | Method signature                                                                                                                                                                                            | Return type                          |
| ----------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------ |
| **public**  | [build()](#build)                                                                                                                                                                                           | String                               |
| **private** | [getFullBody(PackageElement packageElement, DocTrees comments)](#getfullbodypackageelement-packageelement-doctrees-comments)                                                                                | List<com.sun.source.doctree.DocTree> |
| **private** | [createPackageIndexes(StringBuilder packagePage)](#createpackageindexesstringbuilder-packagepage)                                                                                                           | void                                 |
| **private** | [createPackageAnnotationIndex(StringBuilder packagePage)](#createpackageannotationindexstringbuilder-packagepage)                                                                                           | void                                 |
| **private** | [createPackageEnumIndex(StringBuilder packagePage)](#createpackageenumindexstringbuilder-packagepage)                                                                                                       | void                                 |
| **private** | [createPackageInterfaceIndex(StringBuilder packagePage)](#createpackageinterfaceindexstringbuilder-packagepage)                                                                                             | void                                 |
| **private** | [createPackageClassIndex(StringBuilder packagePage)](#createpackageclassindexstringbuilder-packagepage)                                                                                                     | void                                 |
| **private** | [generateTable(String tableLabel, javax.lang.model.element.TypeElement[] docs, StringBuilder packagePage)](#generatetablestring-tablelabel-javaxlangmodelelementtypeelement-docs-stringbuilder-packagepage) | void                                 |
| **public**  | [write()](#write)                                                                                                                                                                                           | void                                 |

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

### Parameters

| Name           | Description               |
| -------------- | ------------------------- |
| packageElement | *No description provided* |
| comments       | *No description provided* |

createPackageIndexes(StringBuilder packagePage)
-----------------------------------------------
Generate index tables for package annotations, enums, interfaces and classes

### Parameters

| Name        | Description                                   |
| ----------- | --------------------------------------------- |
| packagePage | string representation of package page content |


createPackageAnnotationIndex(StringBuilder packagePage)
-------------------------------------------------------
Generate index table for package annotations

### Parameters

| Name        | Description                                   |
| ----------- | --------------------------------------------- |
| packagePage | StringBuilder collecting package page content |


createPackageEnumIndex(StringBuilder packagePage)
-------------------------------------------------
Generate index table for package classes

### Parameters

| Name        | Description                                   |
| ----------- | --------------------------------------------- |
| packagePage | StringBuilder collecting package page content |


createPackageInterfaceIndex(StringBuilder packagePage)
------------------------------------------------------
Generate index table for package interfaces

### Parameters

| Name        | Description                                   |
| ----------- | --------------------------------------------- |
| packagePage | StringBuilder collecting package page content |


createPackageClassIndex(StringBuilder packagePage)
--------------------------------------------------
Generate index table for package classes

### Parameters

| Name        | Description                                   |
| ----------- | --------------------------------------------- |
| packagePage | StringBuilder collecting package page content |


generateTable(String tableLabel, javax.lang.model.element.TypeElement[] docs, StringBuilder packagePage)
--------------------------------------------------------------------------------------------------------
Generate index table

### Parameters

| Name        | Description                                   |
| ----------- | --------------------------------------------- |
| tableLabel  | table name                                    |
| docs        | elements to work with                         |
| packagePage | string representation of package page content |


write()
-------
*No method description provided*


