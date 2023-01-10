Class ClassMethodsInfo implements io.github.atlascommunity.marklet.page_elements.ClassPageElement
=================================================================================================
Class methods description

io.github.atlascommunity.marklet.page_elements.ClassMethodsInfo Summary
-------
#### Constructors
| Visibility | Signature                                                                                                                                                |
| ---------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| public     | ClassMethodsInfo(javax.lang.model.element.TypeElement,com.sun.source.util.DocTrees,javax.lang.model.util.Types,io.github.atlascommunity.marklet.Options) |
#### Fields
| Modifiers                | Field name                                                                                                | Type                                     |
| ------------------------ | --------------------------------------------------------------------------------------------------------- | ---------------------------------------- |
| **final**                | [final javax.lang.model.element.TypeElement classElement](#javaxlangmodelelementtypeelement-classelement) | javax.lang.model.element.TypeElement     |
| **final**                | [final com.sun.source.util.DocTrees treeUtils](#comsunsourceutildoctrees-treeutils)                       | com.sun.source.util.DocTrees             |
| **final**                | [final javax.lang.model.util.Types typeUtils](#javaxlangmodelutiltypes-typeutils)                         | javax.lang.model.util.Types              |
| **final**                | [final io.github.atlascommunity.marklet.Options options](#iogithubatlascommunitymarkletoptions-options)   | io.github.atlascommunity.marklet.Options |
|                          | [ java.lang.String key](#javalangstring-key)                                                              | String                                   |
| **private static final** | [private static final java.lang.String DESCRIPTION_PATTERN](#javalangstring-description_pattern)          | String                                   |
#### Methods
| Modifiers   | Method signature                                                                      | Return type                                     |
| ----------- | ------------------------------------------------------------------------------------- | ----------------------------------------------- |
| **public**  | [generate()](#generate)                                                               | String                                          |
| **private** | [methodDescription(ExecutableElement doc)](#methoddescriptionexecutableelement-doc)   | String                                          |
|             | [findElements()](#findelements)                                                       | Set<javax.lang.model.element.ExecutableElement> |
|             | [signatureString(ExecutableElement method)](#signaturestringexecutableelement-method) | String                                          |

Constructors
============
ClassMethodsInfo(javax.lang.model.element.TypeElement,com.sun.source.util.DocTrees,javax.lang.model.util.Types,io.github.atlascommunity.marklet.Options)
--------------------------------------------------------------------------------------------------------------------------------------------------------
*No method description provided*


Fields
======
javax.lang.model.element.TypeElement classElement
-------------------------------------------------
Class information


com.sun.source.util.DocTrees treeUtils
--------------------------------------
*No description provided*


javax.lang.model.util.Types typeUtils
-------------------------------------
*No description provided*


io.github.atlascommunity.marklet.Options options
------------------------------------------------
Doclet options


String key
--------------------
*No description provided*


String DESCRIPTION_PATTERN
------------------------------------
Pattern for colon separated description


Methods
=======
generate()
----------
### Overrides/Implements:
generate() from io.github.atlascommunity.marklet.page_elements.ClassPageElement



### Returns

markdown string representation of document part


methodDescription(ExecutableElement doc)
----------------------------------------


### Parameters

doc: method representation

### Returns

markdown string


findElements()
--------------
*No method description provided*


signatureString(ExecutableElement method)
-----------------------------------------
*No method description provided*


