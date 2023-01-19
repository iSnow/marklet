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
| Modifiers         | Field name                               | Type                           |
| ----------------- | ---------------------------------------- | ------------------------------ |
| **private final** | [tag](#comsunsourcedoctreedoctree-tag)   | com.sun.source.doctree.DocTree |
| **private final** | [className](#javalangstring-classname)   | String                         |
| **private final** | [fileEnding](#javalangstring-fileending) | String                         |
#### Methods
| Modifiers  | Method signature    | Return type |
| ---------- | ------------------- | ----------- |
| **public** | [create()](#create) | String      |

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


