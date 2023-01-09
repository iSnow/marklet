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
| **final io.github.atlascommunity.marklet.Options** | options             |
| **private static final String**                    | DESCRIPTION_PATTERN |
| **final javax.lang.model.element.TypeElement**     | classElement        |
| **final com.sun.source.util.DocTrees**             | treeUtils           |
| **final javax.lang.model.util.Types**              | typeUtils           |
| **String**                                         | key                 |
#### Methods
| Modifiers   | Method signature                          | Return type                                     |
| ----------- | ----------------------------------------- | ----------------------------------------------- |
| **private** | methodDescription(ExecutableElement doc)  | String                                          |
| **public**  | generate() **(Override)**                 | String                                          |
|             | signatureString(ExecutableElement method) | String                                          |
|             | findElements()                            | Set<javax.lang.model.element.ExecutableElement> |

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


String DESCRIPTION_PATTERN
------------------------------------
Pattern for colon separated description


javax.lang.model.element.TypeElement classElement
-------------------------------------------------
Class information


com.sun.source.util.DocTrees treeUtils
--------------------------------------
*No description provided*


javax.lang.model.util.Types typeUtils
-------------------------------------
*No description provided*


String key
--------------------
*No description provided*


Methods
=======
methodDescription(ExecutableElement doc)
----------------------------------------


### Parameters

doc: method representation

### Returns

markdown string


generate()
----------
### Overrides/Implements:
generate() from io.github.atlascommunity.marklet.pages.ClassPageElement



### Returns

markdown string representation of document part


signatureString(ExecutableElement method)
-----------------------------------------
*No method description provided*


findElements()
--------------
*No method description provided*


