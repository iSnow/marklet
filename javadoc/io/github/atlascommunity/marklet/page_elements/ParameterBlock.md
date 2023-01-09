Class ParameterBlock implements io.github.atlascommunity.marklet.page_elements.ClassPageElement
===============================================================================================


io.github.atlascommunity.marklet.page_elements.ParameterBlock Summary
-------
#### Constructors
| Visibility | Signature        |
| ---------- | ---------------- |
| public     | ParameterBlock() |
#### Fields
| Type and modifiers                                                        | Field name |
| ------------------------------------------------------------------------- | ---------- |
| **private static final Map<com.sun.source.doctree.DocTree.Kind,Integer>** | ordering   |
| **private static final com.sun.source.doctree.DocTree.Kind[]**            | tags       |
| **private final com.sun.source.doctree.DocCommentTree**                   | comments   |
#### Methods
| Modifiers   | Method signature                                            | Return type |
| ----------- | ----------------------------------------------------------- | ----------- |
| **private** | formatThrows(List<com.sun.source.doctree.DocTree> dts)      | String      |
| **private** | formatDeprecated(List<com.sun.source.doctree.DocTree> dts)  | String      |
| **private** | formatReturnValue(List<com.sun.source.doctree.DocTree> dts) | String      |
| **private** | format(List<com.sun.source.doctree.DocTree> dts, Kind kind) | String      |
| **public**  | generate() **(Override)**                                   | String      |
| **private** | formatParams(List<com.sun.source.doctree.DocTree> dts)      | String      |

Constructors
============
ParameterBlock()
----------------
*No method description provided*


Fields
======
Map<com.sun.source.doctree.DocTree.Kind,Integer> ordering
-----------------------------------------------------------------------------
*No description provided*


com.sun.source.doctree.DocTree.Kind[] tags
------------------------------------------
*No description provided*


com.sun.source.doctree.DocCommentTree comments
----------------------------------------------
*No description provided*


Methods
=======
formatThrows(List<com.sun.source.doctree.DocTree> dts)
------------------------------------------------------
*No method description provided*


formatDeprecated(List<com.sun.source.doctree.DocTree> dts)
----------------------------------------------------------
*No method description provided*


formatReturnValue(List<com.sun.source.doctree.DocTree> dts)
-----------------------------------------------------------
*No method description provided*


format(List<com.sun.source.doctree.DocTree> dts, Kind kind)
-----------------------------------------------------------
*No method description provided*


generate()
----------
### Overrides/Implements:
generate() from io.github.atlascommunity.marklet.page_elements.ClassPageElement

*No method description provided*


formatParams(List<com.sun.source.doctree.DocTree> dts)
------------------------------------------------------
*No method description provided*


