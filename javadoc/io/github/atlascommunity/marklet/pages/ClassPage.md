Class ClassPage extends io.github.atlascommunity.marklet.pages.DocumentPage
===========================================================================
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
| **private final jdk.javadoc.doclet.DocletEnvironment**     | environment  |
| **private final com.sun.source.util.DocTrees**             | treeUtils    |
| **private final com.sun.source.doctree.DocCommentTree**    | comments     |
| **private final jdk.javadoc.doclet.Reporter**              | reporter     |
| **private final String**                                   | packageName  |
#### Methods
| Modifiers  | Method signature | Return type |
| ---------- | ---------------- | ----------- |
| **public** | build()          | String      |
| **public** | write()          | void        |

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


jdk.javadoc.doclet.DocletEnvironment environment
------------------------------------------------
*No description provided*


com.sun.source.util.DocTrees treeUtils
--------------------------------------
*No description provided*


com.sun.source.doctree.DocCommentTree comments
----------------------------------------------
*No description provided*


jdk.javadoc.doclet.Reporter reporter
------------------------------------
*No description provided*


String packageName
----------------------------
*No description provided*


Methods
=======
build()
-------
Creates markdown text file


write()
-------
*No method description provided*


