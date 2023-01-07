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
| **private final com.sun.source.util.DocTrees**             | treeUtils    |
| **private final io.github.atlascommunity.marklet.Options** | options      |
| **private final java.lang.String**                         | packageName  |
| **private final javax.lang.model.element.TypeElement**     | classElement |
| **private final com.sun.source.doctree.DocCommentTree**    | comments     |
#### Methods
| Type and modifiers | Method signature                   | Return type |
| ------------------ | ---------------------------------- | ----------- |
| **private**        | writeFile(StringBuilder classPage) | void        |
| **public**         | build(Reporter reporter)           | void        |

Constructors
============
ClassPage()
-----------


Fields
======
com.sun.source.util.DocTrees treeUtils
--------------------------------------

io.github.atlascommunity.marklet.Options options
------------------------------------------------

java.lang.String packageName
----------------------------

javax.lang.model.element.TypeElement classElement
-------------------------------------------------

com.sun.source.doctree.DocCommentTree comments
----------------------------------------------


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
Creates markdown text file




