Class ClassMethodsInfo implements io.github.atlascommunity.marklet.pages.ClassPageElement
=========================================================================================
Class methods description

io.github.atlascommunity.marklet.pages.ClassMethodsInfo Summary
-------
#### Constructors
| Visibility | Signature                                                                                                                    |
| ---------- | ---------------------------------------------------------------------------------------------------------------------------- |
| **public** | ClassMethodsInfo(javax.lang.model.element.TypeElement,com.sun.source.util.DocTrees,io.github.atlascommunity.marklet.Options) |
#### Fields
| Type and modifiers                                 | Field name          |
| -------------------------------------------------- | ------------------- |
| **private static final String**                    | DESCRIPTION_PATTERN |
| **String**                                         | key                 |
| **final javax.lang.model.element.TypeElement**     | classElement        |
| **final com.sun.source.util.DocTrees**             | treeUtils           |
| **private static final String**                    | OVERRIDE_MARK       |
| **final io.github.atlascommunity.marklet.Options** | options             |
#### Methods
| Type and modifiers | Method signature                         | Return type                                     |
| ------------------ | ---------------------------------------- | ----------------------------------------------- |
| **public**         | generate                                 | String                                          |
| ****               | signatureString(ExecutableElement doc)   | String                                          |
| ****               | findElements                             | Set<javax.lang.model.element.ExecutableElement> |
| **private**        | methodDescription(ExecutableElement doc) | String                                          |

Constructors
============
ClassMethodsInfo(javax.lang.model.element.TypeElement,com.sun.source.util.DocTrees,io.github.atlascommunity.marklet.Options)
----------------------------------------------------------------------------------------------------------------------------
*No method description provided*



Fields
======
String DESCRIPTION_PATTERN
------------------------------------
Pattern for colon separated description


String key
--------------------
*No description provided*


javax.lang.model.element.TypeElement classElement
-------------------------------------------------
Class information


com.sun.source.util.DocTrees treeUtils
--------------------------------------
*No description provided*


String OVERRIDE_MARK
------------------------------
*No description provided*


io.github.atlascommunity.marklet.Options options
------------------------------------------------
Doclet options



Methods
=======
generate
--------


### Returns

markdown string representation of document part


signatureString(ExecutableElement doc)
--------------------------------------
*No method description provided*


findElements
------------
*No method description provided*


methodDescription(ExecutableElement doc)
----------------------------------------


### Parameters

doc: method representation

### Returns

markdown string



