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
| Modifiers         | Field name                                                     | Type                                     |
| ----------------- | -------------------------------------------------------------- | ---------------------------------------- |
| **private final** | [classElement](#javaxlangmodelelementtypeelement-classelement) | javax.lang.model.element.TypeElement     |
| **private final** | [treeUtils](#comsunsourceutildoctrees-treeutils)               | com.sun.source.util.DocTrees             |
| **private final** | [comments](#comsunsourcedoctreedoccommenttree-comments)        | com.sun.source.doctree.DocCommentTree    |
| **private final** | [environment](#jdkjavadocdocletdocletenvironment-environment)  | jdk.javadoc.doclet.DocletEnvironment     |
| **private final** | [options](#iogithubatlascommunitymarkletoptions-options)       | io.github.atlascommunity.marklet.Options |
| **private final** | [packageName](#javalangstring-packagename)                     | String                                   |
| **private final** | [reporter](#jdkjavadocdocletreporter-reporter)                 | jdk.javadoc.doclet.Reporter              |
#### Methods
| Modifiers  | Method signature  | Return type |
| ---------- | ----------------- | ----------- |
| **public** | [build()](#build) | String      |
| **public** | [write()](#write) | void        |

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


