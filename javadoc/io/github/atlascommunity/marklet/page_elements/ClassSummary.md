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
| Modifiers         | Field name   | Type                                 |
| ----------------- | ------------ | ------------------------------------ |
| **private final** | classElement | javax.lang.model.element.TypeElement |
| **private final** | typeUtils    | javax.lang.model.util.Types          |
#### Methods
| Modifiers          | Method signature                                                 | Return type |
| ------------------ | ---------------------------------------------------------------- | ----------- |
| **public**         | generate() **(Override)**                                        | String      |
| **private static** | generateMethodSummary(TypeElement classElement, Types typeUtils) | String      |
| **private static** | generateFieldSummary(TypeElement classElement)                   | String      |
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


generateFieldSummary(TypeElement classElement)
----------------------------------------------


### Returns

markdown string representation of class fields


generateConstructorSummary(TypeElement classElement)
----------------------------------------------------


### Returns

markdown string representation of class constructors


