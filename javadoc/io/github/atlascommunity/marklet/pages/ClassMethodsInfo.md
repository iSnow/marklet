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
| **private static final String**                    | OVERRIDE_MARK       |
| **String**                                         | key                 |
| **final io.github.atlascommunity.marklet.Options** | options             |
| **final javax.lang.model.element.TypeElement**     | classElement        |
| **private static final String**                    | DESCRIPTION_PATTERN |
| **final com.sun.source.util.DocTrees**             | treeUtils           |
#### Methods
| Type and modifiers | Method signature                         | Return type                                     |
| ------------------ | ---------------------------------------- | ----------------------------------------------- |
| ****               | findElements                             | Set<javax.lang.model.element.ExecutableElement> |
| **private**        | methodDescription(ExecutableElement doc) | String                                          |
| **public**         | generate                                 | String                                          |
| ****               | signatureString(ExecutableElement doc)   | String                                          |

Constructors
============
ClassMethodsInfo(javax.lang.model.element.TypeElement,com.sun.source.util.DocTrees,io.github.atlascommunity.marklet.Options)
----------------------------------------------------------------------------------------------------------------------------
*No method description provided*



Fields
======
String OVERRIDE_MARK
------------------------------
*No description provided*


String key
--------------------
*No description provided*


io.github.atlascommunity.marklet.Options options
------------------------------------------------
Doclet options


javax.lang.model.element.TypeElement classElement
-------------------------------------------------
Class information


String DESCRIPTION_PATTERN
------------------------------------
Pattern for colon separated description


com.sun.source.util.DocTrees treeUtils
--------------------------------------
*No description provided*



Methods
=======
findElements
------------
*No method description provided*


methodDescription(ExecutableElement doc)
----------------------------------------


### Parameters

doc: method representation

### Returns

markdown string


generate
--------


### Returns

markdown string representation of document part


signatureString(ExecutableElement doc)
--------------------------------------
*No method description provided*



