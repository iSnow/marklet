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
| **private final javax.lang.model.element.TypeElement**     | classElement |
| **private final com.sun.source.doctree.DocCommentTree**    | comments     |
| **private final java.lang.String**                         | packageName  |
| **private final io.github.atlascommunity.marklet.Options** | options      |
#### Methods
| Type and modifiers | Method signature                   | Return type |
| ------------------ | ---------------------------------- | ----------- |
| **public**         | build(Reporter reporter)           | void        |
| **private**        | writeFile(StringBuilder classPage) | void        |

Constructors
============
ClassPage()
-----------


Fields
======
com.sun.source.util.DocTrees treeUtils
--------------------------------------

javax.lang.model.element.TypeElement classElement
-------------------------------------------------

com.sun.source.doctree.DocCommentTree comments
----------------------------------------------

java.lang.String packageName
----------------------------

io.github.atlascommunity.marklet.Options options
------------------------------------------------


Methods
=======
build(Reporter reporter)
------------------------
Creates markdown text file



writeFile(StringBuilder classPage)
----------------------------------
Writes file to disk

@throws IOException If any error occurs during write process.

@param classPage markdown string with class information




