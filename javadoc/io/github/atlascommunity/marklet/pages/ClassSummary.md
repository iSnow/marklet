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
| **private final javax.lang.model.element.TypeElement** | classElement |
| **private final javax.lang.model.util.Types**          | typeUtils    |
#### Methods
| Modifiers          | Method signature                                                 | Return type |
| ------------------ | ---------------------------------------------------------------- | ----------- |
| **private static** | generateMethodSummary(TypeElement classElement, Types typeUtils) | String      |
| **private static** | generateFieldSummary(TypeElement classElement)                   | String      |
| **public**         | generate() **(Override)**                                        | String      |
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
generateMethodSummary(TypeElement classElement, Types typeUtils)
----------------------------------------------------------------


### Returns

markdown string representation of class methods


generateFieldSummary(TypeElement classElement)
----------------------------------------------


### Returns

markdown string representation of class fields


generate()
----------
### Overrides/Implements:
generate() from io.github.atlascommunity.marklet.pages.ClassPageElement



### Returns

markdown string representation of document part


generateConstructorSummary(TypeElement classElement)
----------------------------------------------------


### Returns

markdown string representation of class constructors


