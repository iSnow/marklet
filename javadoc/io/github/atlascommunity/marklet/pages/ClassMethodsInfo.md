Class ClassMethodsInfo
======================
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
| **final io.github.atlascommunity.marklet.Options** | options             |
| **final com.sun.source.util.DocTrees**             | treeUtils           |
| **String**                                         | key                 |
| **final javax.lang.model.element.TypeElement**     | classElement        |
| **private static final String**                    | OVERRIDE_MARK       |
| **private static final String**                    | DESCRIPTION_PATTERN |
#### Methods
| Type and modifiers | Method signature                         | Return type                                     |
| ------------------ | ---------------------------------------- | ----------------------------------------------- |
| ****               | findElements                             | Set<javax.lang.model.element.ExecutableElement> |
| **private**        | methodDescription(ExecutableElement doc) | String                                          |
| ****               | signatureString(ExecutableElement doc)   | String                                          |
| **public**         | generate                                 | String                                          |

Constructors
============
ClassMethodsInfo(javax.lang.model.element.TypeElement,com.sun.source.util.DocTrees,io.github.atlascommunity.marklet.Options)
----------------------------------------------------------------------------------------------------------------------------
*No method description provided*



Fields
======
io.github.atlascommunity.marklet.Options options
------------------------------------------------

com.sun.source.util.DocTrees treeUtils
--------------------------------------

java.lang.String key
--------------------

javax.lang.model.element.TypeElement classElement
-------------------------------------------------

java.lang.String OVERRIDE_MARK
------------------------------

java.lang.String DESCRIPTION_PATTERN
------------------------------------


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


signatureString(ExecutableElement doc)
--------------------------------------
*No method description provided*


generate
--------


### Returns

markdown string representation of document part



