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
| **private final com.sun.source.util.DocTrees**         | treeUtils           |
| **private static final java.lang.String**              | OVERRIDE_MARK       |
| **private final javax.lang.model.element.TypeElement** | classElement        |
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
com.sun.source.util.DocTrees treeUtils
--------------------------------------

java.lang.String OVERRIDE_MARK
------------------------------

javax.lang.model.element.TypeElement classElement
-------------------------------------------------

java.lang.String DESCRIPTION_PATTERN
------------------------------------


Methods
=======
generate()
----------


@return markdown string representation of document part



methodDescription(ExecutableElement doc)
----------------------------------------


@param doc method representation

@return markdown string




