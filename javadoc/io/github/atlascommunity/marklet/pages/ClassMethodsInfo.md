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
| **final com.sun.source.util.DocTrees**             | treeUtils           |
| **private static final java.lang.String**          | OVERRIDE_MARK       |
| **private static final java.lang.String**          | DESCRIPTION_PATTERN |
| **final io.github.atlascommunity.marklet.Options** | options             |
| **final javax.lang.model.element.TypeElement**     | classElement        |
| **java.lang.String**                               | key                 |
#### Methods
| Type and modifiers | Method signature                         | Return type                                               |
| ------------------ | ---------------------------------------- | --------------------------------------------------------- |
| **private**        | methodDescription(ExecutableElement doc) | java.lang.String                                          |
| **public**         | generate()                               | java.lang.String                                          |
| ****               | findElements()                           | java.util.Set<javax.lang.model.element.ExecutableElement> |
| ****               | signatureString(ExecutableElement doc)   | java.lang.String                                          |

Constructors
============
ClassMethodsInfo(javax.lang.model.element.TypeElement,com.sun.source.util.DocTrees,io.github.atlascommunity.marklet.Options)
----------------------------------------------------------------------------------------------------------------------------
*No method description provided*



Fields
======
com.sun.source.util.DocTrees treeUtils
--------------------------------------

java.lang.String OVERRIDE_MARK
------------------------------

java.lang.String DESCRIPTION_PATTERN
------------------------------------

io.github.atlascommunity.marklet.Options options
------------------------------------------------

javax.lang.model.element.TypeElement classElement
-------------------------------------------------

java.lang.String key
--------------------


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


### Returns

markdown string representation of document part


findElements()
--------------
*No method description provided*


signatureString(ExecutableElement doc)
--------------------------------------
*No method description provided*



