Class ClassSummary implements io.github.atlascommunity.marklet.pages.ClassPageElement
=====================================================================================
Brief class description

io.github.atlascommunity.marklet.pages.ClassSummary Summary
-------
#### Constructors
| Visibility | Signature      |
| ---------- | -------------- |
| **public** | ClassSummary() |
#### Fields
| Type and modifiers                                     | Field name                |
| ------------------------------------------------------ | ------------------------- |
| **private static final String**                        | TYPE_AND_MODIFIERS_COLUMN |
| **private final javax.lang.model.util.Types**          | typeUtils                 |
| **private final javax.lang.model.element.TypeElement** | classElement              |
#### Methods
| Type and modifiers | Method signature                                                 | Return type |
| ------------------ | ---------------------------------------------------------------- | ----------- |
| **private static** | generateConstructorSummary(TypeElement classElement)             | String      |
| **private static** | generateFieldSummary(TypeElement classElement)                   | String      |
| **private static** | generateMethodSummary(TypeElement classElement, Types typeUtils) | String      |
| **public**         | generate() **(Override)**                                        | String      |

Constructors
============
ClassSummary()
--------------
*No method description provided*



Fields
======
String TYPE_AND_MODIFIERS_COLUMN
------------------------------------------
Table column name


javax.lang.model.util.Types typeUtils
-------------------------------------
*No description provided*


javax.lang.model.element.TypeElement classElement
-------------------------------------------------
Class information



Methods
=======
generateConstructorSummary(TypeElement classElement)
----------------------------------------------------


### Returns

markdown string representation of class constructors


generateFieldSummary(TypeElement classElement)
----------------------------------------------


### Returns

markdown string representation of class fields


generateMethodSummary(TypeElement classElement, Types typeUtils)
----------------------------------------------------------------


### Returns

markdown string representation of class methods


generate()
----------
### Overrides/Implements:
generate() from Interface ClassPageElement



### Returns

markdown string representation of document part



