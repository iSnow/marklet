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
| **private final com.sun.source.doctree.DocCommentTree**    | comments     |
| **private final javax.lang.model.element.TypeElement**     | classElement |
| **private final com.sun.source.util.DocTrees**             | treeUtils    |
| **private final io.github.atlascommunity.marklet.Options** | options      |
| **private final String**                                   | packageName  |
| **private final jdk.javadoc.doclet.DocletEnvironment**     | environment  |
#### Methods
| Modifiers   | Method signature                        | Return type |
| ----------- | --------------------------------------- | ----------- |
| **public**  | build(Reporter reporter) **(Override)** | void        |
| **private** | writeFile(StringBuilder classPage)      | void        |

Constructors
============
ClassPage()
-----------
*No method description provided*


Fields
======
com.sun.source.doctree.DocCommentTree comments
----------------------------------------------
*No description provided*


javax.lang.model.element.TypeElement classElement
-------------------------------------------------
Class information


com.sun.source.util.DocTrees treeUtils
--------------------------------------
*No description provided*


io.github.atlascommunity.marklet.Options options
------------------------------------------------
Doclet options


String packageName
----------------------------
*No description provided*


jdk.javadoc.doclet.DocletEnvironment environment
------------------------------------------------
*No description provided*


Methods
=======
build(Reporter reporter)
------------------------
### Overrides/Implements:
build(Reporter reporter) from io.github.atlascommunity.marklet.pages.DocumentPage

Creates markdown text file


writeFile(StringBuilder classPage)
----------------------------------
Writes file to disk

### Throws

IOException: If any error occurs during write process.

### Parameters

classPage: markdown string with class information


