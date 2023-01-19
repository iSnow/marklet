Class CommentBlock implements io.github.atlascommunity.marklet.page_elements.ClassPageElement
=============================================================================================


io.github.atlascommunity.marklet.page_elements.CommentBlock Summary
-------
#### Constructors
| Visibility | Signature      |
| ---------- | -------------- |
| public     | CommentBlock() |
#### Fields
| Modifiers                | Field name                                                                           | Type                                                     |
| ------------------------ | ------------------------------------------------------------------------------------ | -------------------------------------------------------- |
| **private final**        | [comments](#comsunsourcedoctreedoccommenttree-comments)                              | com.sun.source.doctree.DocCommentTree                    |
| **private final**        | [parameters](#javautillist?-extends-javaxlangmodelelementvariableelement-parameters) | List<? extends javax.lang.model.element.VariableElement> |
| **private static final** | [tags](#comsunsourcedoctreedoctreekind-tags)                                         | com.sun.source.doctree.DocTree.Kind[]                    |
| **private static final** | [ordering](#javautilmapcomsunsourcedoctreedoctreekind-javalanginteger-ordering)      | Map<com.sun.source.doctree.DocTree.Kind,Integer>         |
#### Methods
| Modifiers   | Method signature                                                                                                    | Return type |
| ----------- | ------------------------------------------------------------------------------------------------------------------- | ----------- |
| **public**  | [generate()](#generate)                                                                                             | String      |
| **private** | [generateFallbackParameterBlock()](#generatefallbackparameterblock)                                                 | String      |
| **private** | [format(List<com.sun.source.doctree.DocTree> dts, Kind kind)](#formatlistcomsunsourcedoctreedoctree-dts-kind-kind)  | String      |
| **private** | [formatSince(List<com.sun.source.doctree.DocTree> dts)](#formatsincelistcomsunsourcedoctreedoctree-dts)             | String      |
| **private** | [formatDeprecated(List<com.sun.source.doctree.DocTree> dts)](#formatdeprecatedlistcomsunsourcedoctreedoctree-dts)   | String      |
| **private** | [formatThrows(List<com.sun.source.doctree.DocTree> dts)](#formatthrowslistcomsunsourcedoctreedoctree-dts)           | String      |
| **private** | [formatReturnValue(List<com.sun.source.doctree.DocTree> dts)](#formatreturnvaluelistcomsunsourcedoctreedoctree-dts) | String      |
| **private** | [formatParams(List<com.sun.source.doctree.DocTree> dts)](#formatparamslistcomsunsourcedoctreedoctree-dts)           | String      |

Fields
======
com.sun.source.doctree.DocCommentTree comments
----------------------------------------------
*No description provided*


List<? extends javax.lang.model.element.VariableElement> parameters
-----------------------------------------------------------------------------
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


generateFallbackParameterBlock()
--------------------------------
*No method description provided*


format(List<com.sun.source.doctree.DocTree> dts, Kind kind)
-----------------------------------------------------------
*No method description provided*

### Parameters

| Name | Description               |
| ---- | ------------------------- |
| dts  | *No description provided* |
| kind | *No description provided* |

formatSince(List<com.sun.source.doctree.DocTree> dts)
-----------------------------------------------------
*No method description provided*

### Parameters

| Name | Description               |
| ---- | ------------------------- |
| dts  | *No description provided* |

formatDeprecated(List<com.sun.source.doctree.DocTree> dts)
----------------------------------------------------------
*No method description provided*

### Parameters

| Name | Description               |
| ---- | ------------------------- |
| dts  | *No description provided* |

formatThrows(List<com.sun.source.doctree.DocTree> dts)
------------------------------------------------------
*No method description provided*

### Parameters

| Name | Description               |
| ---- | ------------------------- |
| dts  | *No description provided* |

formatReturnValue(List<com.sun.source.doctree.DocTree> dts)
-----------------------------------------------------------
*No method description provided*

### Parameters

| Name | Description               |
| ---- | ------------------------- |
| dts  | *No description provided* |

formatParams(List<com.sun.source.doctree.DocTree> dts)
------------------------------------------------------
*No method description provided*

### Parameters

| Name | Description               |
| ---- | ------------------------- |
| dts  | *No description provided* |

