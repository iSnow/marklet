Class ClassPage
===============
Markdown text file with class information

io.github.atlascommunity.marklet.pages.ClassPage Summary
-------
#### Constructors
| Visibility | Signature   |
| ---------- | ----------- |
| **public** | ClassPage() |
#### Fields
| Type and modifiers                                         | Field name   |
| ---------------------------------------------------------- | ------------ |
| **private final com.sun.source.doctree.DocCommentTree**    | comments     |
| **private final io.github.atlascommunity.marklet.Options** | options      |
| **private final String**                                   | packageName  |
| **private final javax.lang.model.element.TypeElement**     | classElement |
| **private final com.sun.source.util.DocTrees**             | treeUtils    |
#### Methods
| Type and modifiers | Method signature                   | Return type |
| ------------------ | ---------------------------------- | ----------- |
| **public**         | build(Reporter reporter)           | void        |
| **private**        | writeFile(StringBuilder classPage) | void        |

Constructors
============
ClassPage()
-----------
*No method description provided*



Fields
======
com.sun.source.doctree.DocCommentTree comments
----------------------------------------------

io.github.atlascommunity.marklet.Options options
------------------------------------------------

java.lang.String packageName
----------------------------

javax.lang.model.element.TypeElement classElement
-------------------------------------------------

com.sun.source.util.DocTrees treeUtils
--------------------------------------


Methods
=======
build(Reporter reporter)
------------------------
Creates markdown text file


writeFile(StringBuilder classPage)
----------------------------------
Writes file to disk

### Throws

IOException: If any error occurs during write process.

### Parameters

classPage: markdown string with class information



