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
| **private final javax.lang.model.element.TypeElement**     | classElement |
| **private final io.github.atlascommunity.marklet.Options** | options      |
| **private final java.lang.String**                         | packageName  |
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
com.sun.source.doctree.DocCommentTree comments
----------------------------------------------

javax.lang.model.element.TypeElement classElement
-------------------------------------------------

io.github.atlascommunity.marklet.Options options
------------------------------------------------

java.lang.String packageName
----------------------------


Methods
=======
writeFile(StringBuilder classPage)
----------------------------------

build(Reporter reporter)
------------------------


