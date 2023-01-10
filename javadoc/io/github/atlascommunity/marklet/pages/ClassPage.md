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
| Modifiers         | Field name   | Type                                     |
| ----------------- | ------------ | ---------------------------------------- |
| **private final** | classElement | javax.lang.model.element.TypeElement     |
| **private final** | treeUtils    | com.sun.source.util.DocTrees             |
| **private final** | comments     | com.sun.source.doctree.DocCommentTree    |
| **private final** | environment  | jdk.javadoc.doclet.DocletEnvironment     |
| **private final** | options      | io.github.atlascommunity.marklet.Options |
| **private final** | packageName  | String                                   |
| **private final** | reporter     | jdk.javadoc.doclet.Reporter              |
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


com.sun.source.util.DocTrees treeUtils
--------------------------------------
*No description provided*


com.sun.source.doctree.DocCommentTree comments
----------------------------------------------
*No description provided*


jdk.javadoc.doclet.DocletEnvironment environment
------------------------------------------------
*No description provided*


io.github.atlascommunity.marklet.Options options
------------------------------------------------
Doclet options


String packageName
----------------------------
*No description provided*


jdk.javadoc.doclet.Reporter reporter
------------------------------------
*No description provided*


Methods
=======
build()
-------
Creates markdown text file


write()
-------
*No method description provided*


