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
| **final javax.lang.model.util.Types**              | typeUtils           |
| **private static final String**                    | DESCRIPTION_PATTERN |
| **final io.github.atlascommunity.marklet.Options** | options             |
| **final com.sun.source.util.DocTrees**             | treeUtils           |
| **String**                                         | key                 |
| **final javax.lang.model.element.TypeElement**     | classElement        |
#### Methods
| Modifiers   | Method signature                          | Return type                                     |
| ----------- | ----------------------------------------- | ----------------------------------------------- |
| **public**  | generate() **(Override)**                 | String                                          |
|             | findElements()                            | Set<javax.lang.model.element.ExecutableElement> |
| **private** | methodDescription(ExecutableElement doc)  | String                                          |
|             | signatureString(ExecutableElement method) | String                                          |

Constructors
============
ClassMethodsInfo(javax.lang.model.element.TypeElement,com.sun.source.util.DocTrees,javax.lang.model.util.Types,io.github.atlascommunity.marklet.Options)
--------------------------------------------------------------------------------------------------------------------------------------------------------
*No method description provided*


Fields
======
javax.lang.model.util.Types typeUtils
-------------------------------------
*No description provided*


String DESCRIPTION_PATTERN
------------------------------------
Pattern for colon separated description


io.github.atlascommunity.marklet.Options options
------------------------------------------------
Doclet options


com.sun.source.util.DocTrees treeUtils
--------------------------------------
*No description provided*


String key
--------------------
*No description provided*


javax.lang.model.element.TypeElement classElement
-------------------------------------------------
Class information


Methods
=======
generate()
----------
### Overrides/Implements:
generate() from io.github.atlascommunity.marklet.page_elements.ClassPageElement



### Returns

markdown string representation of document part


findElements()
--------------
*No method description provided*


methodDescription(ExecutableElement doc)
----------------------------------------


### Parameters

doc: method representation

### Returns

markdown string


signatureString(ExecutableElement method)
-----------------------------------------
*No method description provided*


