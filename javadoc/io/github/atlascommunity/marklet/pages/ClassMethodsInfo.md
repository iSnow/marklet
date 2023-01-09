Class ClassMethodsInfo implements io.github.atlascommunity.marklet.pages.ClassPageElement
=========================================================================================
Class methods description

io.github.atlascommunity.marklet.pages.ClassMethodsInfo Summary
-------
#### Constructors
| Visibility | Signature                                                                                                                                                |
| ---------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **public** | ClassMethodsInfo(javax.lang.model.element.TypeElement,com.sun.source.util.DocTrees,javax.lang.model.util.Types,io.github.atlascommunity.marklet.Options) |
#### Fields
| Type and modifiers                                 | Field name          |
| -------------------------------------------------- | ------------------- |
| **String**                                         | key                 |
| **private static final String**                    | DESCRIPTION_PATTERN |
| **final com.sun.source.util.DocTrees**             | treeUtils           |
| **final javax.lang.model.util.Types**              | typeUtils           |
| **final javax.lang.model.element.TypeElement**     | classElement        |
| **final io.github.atlascommunity.marklet.Options** | options             |
#### Methods
| Type and modifiers | Method signature                          | Return type                                     |
| ------------------ | ----------------------------------------- | ----------------------------------------------- |
| **private**        | methodDescription(ExecutableElement doc)  | String                                          |
| ****               | findElements()                            | Set<javax.lang.model.element.ExecutableElement> |
| **public**         | generate() **(Override)**                 | String                                          |
| ****               | signatureString(ExecutableElement method) | String                                          |

Constructors
============
ClassMethodsInfo(javax.lang.model.element.TypeElement,com.sun.source.util.DocTrees,javax.lang.model.util.Types,io.github.atlascommunity.marklet.Options)
--------------------------------------------------------------------------------------------------------------------------------------------------------
*No method description provided*



Fields
======
String key
--------------------
*No description provided*


String DESCRIPTION_PATTERN
------------------------------------
Pattern for colon separated description


com.sun.source.util.DocTrees treeUtils
--------------------------------------
*No description provided*


javax.lang.model.util.Types typeUtils
-------------------------------------
*No description provided*


javax.lang.model.element.TypeElement classElement
-------------------------------------------------
Class information


io.github.atlascommunity.marklet.Options options
------------------------------------------------
Doclet options



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


generate()
----------
### Overrides/Implements:
generate() from Interface ClassPageElement



### Returns

markdown string representation of document part


signatureString(ExecutableElement method)
-----------------------------------------
*No method description provided*



