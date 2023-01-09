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
| Type and modifiers                                 | Field name          |
| -------------------------------------------------- | ------------------- |
| **final com.sun.source.util.DocTrees**             | treeUtils           |
| **final javax.lang.model.element.TypeElement**     | classElement        |
| **final javax.lang.model.util.Types**              | typeUtils           |
| **String**                                         | key                 |
| **final io.github.atlascommunity.marklet.Options** | options             |
| **private static final String**                    | DESCRIPTION_PATTERN |
#### Methods
| Modifiers   | Method signature                          | Return type                                     |
| ----------- | ----------------------------------------- | ----------------------------------------------- |
|             | signatureString(ExecutableElement method) | String                                          |
| **private** | methodDescription(ExecutableElement doc)  | String                                          |
| **public**  | generate() **(Override)**                 | String                                          |
|             | findElements()                            | Set<javax.lang.model.element.ExecutableElement> |

Constructors
============
ClassMethodsInfo(javax.lang.model.element.TypeElement,com.sun.source.util.DocTrees,javax.lang.model.util.Types,io.github.atlascommunity.marklet.Options)
--------------------------------------------------------------------------------------------------------------------------------------------------------
*No method description provided*


Fields
======
com.sun.source.util.DocTrees treeUtils
--------------------------------------
*No description provided*


javax.lang.model.element.TypeElement classElement
-------------------------------------------------
Class information


javax.lang.model.util.Types typeUtils
-------------------------------------
*No description provided*


String key
--------------------
*No description provided*


io.github.atlascommunity.marklet.Options options
------------------------------------------------
Doclet options


String DESCRIPTION_PATTERN
------------------------------------
Pattern for colon separated description


Methods
=======
signatureString(ExecutableElement method)
-----------------------------------------
*No method description provided*


methodDescription(ExecutableElement doc)
----------------------------------------


### Parameters

doc: method representation

### Returns

markdown string


generate()
----------
### Overrides/Implements:
generate() from io.github.atlascommunity.marklet.page_elements.ClassPageElement



### Returns

markdown string representation of document part


findElements()
--------------
*No method description provided*


