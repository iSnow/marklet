Class MarkdownTag
=================
Javadoc tag processor

io.github.atlascommunity.marklet.page_elements.MarkdownTag Summary
-------
#### Constructors
| Visibility | Signature     |
| ---------- | ------------- |
| public     | MarkdownTag() |
#### Fields
| Modifiers         | Field name                                                                          | Type                           |
| ----------------- | ----------------------------------------------------------------------------------- | ------------------------------ |
| **private final** | [private final com.sun.source.doctree.DocTree tag](#comsunsourcedoctreedoctree-tag) | com.sun.source.doctree.DocTree |
| **private final** | [private final java.lang.String className](#javalangstring-classname)               | String                         |
| **private final** | [private final java.lang.String fileEnding](#javalangstring-fileending)             | String                         |
#### Methods
| Modifiers  | Method signature    | Return type |
| ---------- | ------------------- | ----------- |
| **public** | [create()](#create) | String      |

Constructors
============
MarkdownTag()
-------------
*No method description provided*


Fields
======
com.sun.source.doctree.DocTree tag
----------------------------------
Tag information


String className
--------------------------
*No description provided*


String fileEnding
---------------------------
File ending from doclet options


Methods
=======
create()
--------
Create markdown string from tag


