Class ClassPage implements io.github.atlascommunity.marklet.pages.DocumentPage
==============================================================================
Markdown text file with class information

io.github.atlascommunity.marklet.pages.ClassPage Summary
-------
#### Constructors
| Visibility | Signature   |
| ---------- | ----------- |
| public     | ClassPage() |
#### Fields
| Type and modifiers                                         | Field name   |
| ---------------------------------------------------------- | ------------ |
| **private final javax.lang.model.element.TypeElement**     | classElement |
| **private final io.github.atlascommunity.marklet.Options** | options      |
| **private final com.sun.source.util.DocTrees**             | treeUtils    |
| **private final com.sun.source.doctree.DocCommentTree**    | comments     |
| **private final String**                                   | packageName  |
| **private final jdk.javadoc.doclet.DocletEnvironment**     | environment  |
#### Methods
| Type and modifiers | Method signature                        | Return type |
| ------------------ | --------------------------------------- | ----------- |
| **private**        | writeFile(StringBuilder classPage)      | void        |
| **public**         | build(Reporter reporter) **(Override)** | void        |

Constructors
============
ClassPage()
-----------
*No method description provided*



Fields
======
javax.lang.model.element.TypeElement classElement
-------------------------------------------------
Class information


io.github.atlascommunity.marklet.Options options
------------------------------------------------
Doclet options


com.sun.source.util.DocTrees treeUtils
--------------------------------------
*No description provided*


com.sun.source.doctree.DocCommentTree comments
----------------------------------------------
*No description provided*


String packageName
----------------------------
*No description provided*


jdk.javadoc.doclet.DocletEnvironment environment
------------------------------------------------
*No description provided*



Methods
=======
writeFile(StringBuilder classPage)
----------------------------------
Writes file to disk

### Throws

IOException: If any error occurs during write process.

### Parameters

classPage: markdown string with class information


build(Reporter reporter)
------------------------
### Overrides/Implements:
build(Reporter reporter) from io.github.atlascommunity.marklet.pages.DocumentPage

Creates markdown text file



