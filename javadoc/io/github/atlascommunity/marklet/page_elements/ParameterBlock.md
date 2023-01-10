Class ParameterBlock implements io.github.atlascommunity.marklet.page_elements.ClassPageElement
===============================================================================================


io.github.atlascommunity.marklet.page_elements.ParameterBlock Summary
-------
#### Constructors
| Visibility | Signature        |
| ---------- | ---------------- |
| public     | ParameterBlock() |
#### Fields
| Modifiers                | Field name | Type                                             |
| ------------------------ | ---------- | ------------------------------------------------ |
| **private final**        | comments   | com.sun.source.doctree.DocCommentTree            |
| **private static final** | tags       | com.sun.source.doctree.DocTree.Kind[]            |
| **private static final** | ordering   | Map<com.sun.source.doctree.DocTree.Kind,Integer> |
#### Methods
| Modifiers   | Method signature                                            | Return type |
| ----------- | ----------------------------------------------------------- | ----------- |
| **public**  | generate() **(Override)**                                   | String      |
| **private** | format(List<com.sun.source.doctree.DocTree> dts, Kind kind) | String      |
| **private** | formatDeprecated(List<com.sun.source.doctree.DocTree> dts)  | String      |
| **private** | formatThrows(List<com.sun.source.doctree.DocTree> dts)      | String      |
| **private** | formatReturnValue(List<com.sun.source.doctree.DocTree> dts) | String      |
| **private** | formatParams(List<com.sun.source.doctree.DocTree> dts)      | String      |

Constructors
============
ParameterBlock()
----------------
*No method description provided*


Fields
======
com.sun.source.doctree.DocCommentTree comments
----------------------------------------------
*No description provided*


com.sun.source.doctree.DocTree.Kind[] tags
------------------------------------------
*No description provided*


Map<com.sun.source.doctree.DocTree.Kind,Integer> ordering
-----------------------------------------------------------------------------
*No description provided*


Methods
=======
generate()
----------
### Overrides/Implements:
generate() from io.github.atlascommunity.marklet.page_elements.ClassPageElement

*No method description provided*


format(List<com.sun.source.doctree.DocTree> dts, Kind kind)
-----------------------------------------------------------
*No method description provided*


formatDeprecated(List<com.sun.source.doctree.DocTree> dts)
----------------------------------------------------------
*No method description provided*


formatThrows(List<com.sun.source.doctree.DocTree> dts)
------------------------------------------------------
*No method description provided*


formatReturnValue(List<com.sun.source.doctree.DocTree> dts)
-----------------------------------------------------------
*No method description provided*


formatParams(List<com.sun.source.doctree.DocTree> dts)
------------------------------------------------------
*No method description provided*


