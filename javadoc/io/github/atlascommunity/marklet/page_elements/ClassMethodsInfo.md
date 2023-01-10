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
| **private static final String**                    | DESCRIPTION_PATTERN |
| **String**                                         | key                 |
| **final javax.lang.model.util.Types**              | typeUtils           |
| **final javax.lang.model.element.TypeElement**     | classElement        |
| **final com.sun.source.util.DocTrees**             | treeUtils           |
| **final io.github.atlascommunity.marklet.Options** | options             |
#### Methods
| Modifiers   | Method signature                          | Return type                                     |
| ----------- | ----------------------------------------- | ----------------------------------------------- |
| **public**  | generate() **(Override)**                 | String                                          |
|             | signatureString(ExecutableElement method) | String                                          |
|             | findElements()                            | Set<javax.lang.model.element.ExecutableElement> |
| **private** | methodDescription(ExecutableElement doc)  | String                                          |

Constructors
============
ClassMethodsInfo(javax.lang.model.element.TypeElement,com.sun.source.util.DocTrees,javax.lang.model.util.Types,io.github.atlascommunity.marklet.Options)
--------------------------------------------------------------------------------------------------------------------------------------------------------
*No method description provided*


Fields
======
String DESCRIPTION_PATTERN
------------------------------------
Pattern for colon separated description


String key
--------------------
*No description provided*


javax.lang.model.util.Types typeUtils
-------------------------------------
*No description provided*


javax.lang.model.element.TypeElement classElement
-------------------------------------------------
Class information


com.sun.source.util.DocTrees treeUtils
--------------------------------------
*No description provided*


io.github.atlascommunity.marklet.Options options
------------------------------------------------
Doclet options


Methods
=======
generate()
----------
### Overrides/Implements:
generate() from io.github.atlascommunity.marklet.page_elements.ClassPageElement



### Returns

markdown string representation of document part


signatureString(ExecutableElement method)
-----------------------------------------
*No method description provided*


findElements()
--------------
*No method description provided*


methodDescription(ExecutableElement doc)
----------------------------------------


### Parameters

doc: method representation

### Returns

markdown string


