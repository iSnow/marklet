Class ClassMethodsInfo
======================
Class methods description

io.github.atlascommunity.marklet.pages.ClassMethodsInfo Summary
-------
#### Constructors
| Visibility | Signature          |
| ---------- | ------------------ |
| **public** | ClassMethodsInfo() |
#### Fields
| Type and modifiers                                     | Field name          |
| ------------------------------------------------------ | ------------------- |
| **private final javax.lang.model.element.TypeElement** | classElement        |
| **private final com.sun.source.util.DocTrees**         | treeUtils           |
| **private static final java.lang.String**              | OVERRIDE_MARK       |
| **private static final java.lang.String**              | DESCRIPTION_PATTERN |
#### Methods
| Type and modifiers | Method signature                         | Return type      |
| ------------------ | ---------------------------------------- | ---------------- |
| **public**         | generate()                               | java.lang.String |
| **private**        | methodDescription(ExecutableElement doc) | java.lang.String |

Constructors
============
ClassMethodsInfo()
------------------


Fields
======
javax.lang.model.element.TypeElement classElement
-------------------------------------------------

com.sun.source.util.DocTrees treeUtils
--------------------------------------

java.lang.String OVERRIDE_MARK
------------------------------

java.lang.String DESCRIPTION_PATTERN
------------------------------------


Methods
=======
generate()
----------


### Returns

markdown string representation of document part



methodDescription(ExecutableElement doc)
----------------------------------------


### Parameters

doc: method representation

### Returns

markdown string




