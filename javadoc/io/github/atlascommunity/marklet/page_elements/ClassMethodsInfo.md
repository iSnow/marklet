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
| **final io.github.atlascommunity.marklet.Options** | options             |
| **final javax.lang.model.util.Types**              | typeUtils           |
| **final javax.lang.model.element.TypeElement**     | classElement        |
| **String**                                         | key                 |
| **final com.sun.source.util.DocTrees**             | treeUtils           |
| **private static final String**                    | DESCRIPTION_PATTERN |
#### Methods
| Modifiers   | Method signature                          | Return type                                     |
| ----------- | ----------------------------------------- | ----------------------------------------------- |
|             | signatureString(ExecutableElement method) | String                                          |
|             | findElements()                            | Set<javax.lang.model.element.ExecutableElement> |
| **public**  | generate() **(Override)**                 | String                                          |
| **private** | methodDescription(ExecutableElement doc)  | String                                          |

Constructors
============
ClassMethodsInfo(javax.lang.model.element.TypeElement,com.sun.source.util.DocTrees,javax.lang.model.util.Types,io.github.atlascommunity.marklet.Options)
--------------------------------------------------------------------------------------------------------------------------------------------------------
*No method description provided*


Fields
======
io.github.atlascommunity.marklet.Options options
------------------------------------------------
Doclet options


javax.lang.model.util.Types typeUtils
-------------------------------------
*No description provided*


javax.lang.model.element.TypeElement classElement
-------------------------------------------------
Class information


String key
--------------------
*No description provided*


com.sun.source.util.DocTrees treeUtils
--------------------------------------
*No description provided*


String DESCRIPTION_PATTERN
------------------------------------
Pattern for colon separated description


Methods
=======
signatureString(ExecutableElement method)
-----------------------------------------
*No method description provided*


findElements()
--------------
*No method description provided*


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


