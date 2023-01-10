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
| Type and modifiers                               | Field name |
| ------------------------------------------------ | ---------- |
| **private final com.sun.source.doctree.DocTree** | tag        |
| **private final String**                         | className  |
| **private final String**                         | fileEnding |
#### Methods
| Modifiers  | Method signature | Return type |
| ---------- | ---------------- | ----------- |
| **public** | create()         | String      |

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


