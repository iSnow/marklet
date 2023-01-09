Class ClassSummary implements io.github.atlascommunity.marklet.page_elements.ClassPageElement
=============================================================================================
Brief class description

io.github.atlascommunity.marklet.page_elements.ClassSummary Summary
-------
#### Constructors
| Visibility | Signature      |
| ---------- | -------------- |
| public     | ClassSummary() |
#### Fields
| Type and modifiers                                     | Field name   |
| ------------------------------------------------------ | ------------ |
| **private final javax.lang.model.element.TypeElement** | classElement |
| **private final javax.lang.model.util.Types**          | typeUtils    |
#### Methods
| Modifiers          | Method signature                                                 | Return type |
| ------------------ | ---------------------------------------------------------------- | ----------- |
| **private static** | generateFieldSummary(TypeElement classElement)                   | String      |
| **public**         | generate() **(Override)**                                        | String      |
| **private static** | generateMethodSummary(TypeElement classElement, Types typeUtils) | String      |
| **private static** | generateConstructorSummary(TypeElement classElement)             | String      |

Constructors
============
ClassSummary()
--------------
*No method description provided*


Fields
======
javax.lang.model.element.TypeElement classElement
-------------------------------------------------
Class information


javax.lang.model.util.Types typeUtils
-------------------------------------
*No description provided*


Methods
=======
generateFieldSummary(TypeElement classElement)
----------------------------------------------


### Returns

markdown string representation of class fields


generate()
----------
### Overrides/Implements:
generate() from io.github.atlascommunity.marklet.page_elements.ClassPageElement



### Returns

markdown string representation of document part


generateMethodSummary(TypeElement classElement, Types typeUtils)
----------------------------------------------------------------


### Returns

markdown string representation of class methods


generateConstructorSummary(TypeElement classElement)
----------------------------------------------------


### Returns

markdown string representation of class constructors


