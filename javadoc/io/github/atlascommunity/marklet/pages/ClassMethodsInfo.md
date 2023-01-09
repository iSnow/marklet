Class ClassMethodsInfo implements io.github.atlascommunity.marklet.pages.ClassPageElement
=========================================================================================
Class methods description

io.github.atlascommunity.marklet.pages.ClassMethodsInfo Summary
-------
#### Constructors
| Visibility | Signature                                                                                                                                                |
| ---------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| public     | ClassMethodsInfo(javax.lang.model.element.TypeElement,com.sun.source.util.DocTrees,javax.lang.model.util.Types,io.github.atlascommunity.marklet.Options) |
#### Fields
| Type and modifiers                                 | Field name          |
| -------------------------------------------------- | ------------------- |
| **final javax.lang.model.element.TypeElement**     | classElement        |
| **private static final String**                    | DESCRIPTION_PATTERN |
| **final com.sun.source.util.DocTrees**             | treeUtils           |
| **final javax.lang.model.util.Types**              | typeUtils           |
| **final io.github.atlascommunity.marklet.Options** | options             |
| **String**                                         | key                 |
#### Methods
| Modifiers   | Method signature                          | Return type                                     |
| ----------- | ----------------------------------------- | ----------------------------------------------- |
|             | findElements()                            | Set<javax.lang.model.element.ExecutableElement> |
| **public**  | generate() **(Override)**                 | String                                          |
| **private** | methodDescription(ExecutableElement doc)  | String                                          |
|             | signatureString(ExecutableElement method) | String                                          |

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


String DESCRIPTION_PATTERN
------------------------------------
Pattern for colon separated description


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


Methods
=======
findElements()
--------------
*No method description provided*


generate()
----------
### Overrides/Implements:
generate() from io.github.atlascommunity.marklet.pages.ClassPageElement



### Returns

markdown string representation of document part


methodDescription(ExecutableElement doc)
----------------------------------------


### Parameters

doc: method representation

### Returns

markdown string


signatureString(ExecutableElement method)
-----------------------------------------
*No method description provided*


