Class ClassSummary implements io.github.atlascommunity.marklet.pages.ClassPageElement
=====================================================================================
Brief class description

io.github.atlascommunity.marklet.pages.ClassSummary Summary
-------
#### Constructors
| Visibility | Signature      |
| ---------- | -------------- |
| public     | ClassSummary() |
#### Fields
| Type and modifiers                                     | Field name   |
| ------------------------------------------------------ | ------------ |
| **private final javax.lang.model.util.Types**          | typeUtils    |
| **private final javax.lang.model.element.TypeElement** | classElement |
#### Methods
| Modifiers          | Method signature                                                 | Return type |
| ------------------ | ---------------------------------------------------------------- | ----------- |
| **private static** | generateFieldSummary(TypeElement classElement)                   | String      |
| **private static** | generateMethodSummary(TypeElement classElement, Types typeUtils) | String      |
| **private static** | generateConstructorSummary(TypeElement classElement)             | String      |
| **public**         | generate() **(Override)**                                        | String      |

Constructors
============
ClassSummary()
--------------
*No method description provided*


Fields
======
javax.lang.model.util.Types typeUtils
-------------------------------------
*No description provided*


javax.lang.model.element.TypeElement classElement
-------------------------------------------------
Class information


Methods
=======
generateFieldSummary(TypeElement classElement)
----------------------------------------------


### Returns

markdown string representation of class fields


generateMethodSummary(TypeElement classElement, Types typeUtils)
----------------------------------------------------------------


### Returns

markdown string representation of class methods


generateConstructorSummary(TypeElement classElement)
----------------------------------------------------


### Returns

markdown string representation of class constructors


generate()
----------
### Overrides/Implements:
generate() from io.github.atlascommunity.marklet.pages.ClassPageElement



### Returns

markdown string representation of document part


