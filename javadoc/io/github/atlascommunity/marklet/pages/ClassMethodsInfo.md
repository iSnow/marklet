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
| **final javax.lang.model.element.TypeElement**     | classElement        |
| **final com.sun.source.util.DocTrees**             | treeUtils           |
| **String**                                         | key                 |
| **private static final String**                    | DESCRIPTION_PATTERN |
| **final javax.lang.model.util.Types**              | typeUtils           |
#### Methods
| Type and modifiers | Method signature                          | Return type                                     |
| ------------------ | ----------------------------------------- | ----------------------------------------------- |
| **private**        | methodDescription(ExecutableElement doc)  | String                                          |
|                    | findElements()                            | Set<javax.lang.model.element.ExecutableElement> |
|                    | signatureString(ExecutableElement method) | String                                          |
| **public**         | generate() **(Override)**                 | String                                          |

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


javax.lang.model.element.TypeElement classElement
-------------------------------------------------
Class information


com.sun.source.util.DocTrees treeUtils
--------------------------------------
*No description provided*


String key
--------------------
*No description provided*


String DESCRIPTION_PATTERN
------------------------------------
Pattern for colon separated description


javax.lang.model.util.Types typeUtils
-------------------------------------
*No description provided*



Methods
=======
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


generate()
----------
### Overrides/Implements:
generate() from io.github.atlascommunity.marklet.pages.ClassPageElement



### Returns

markdown string representation of document part



