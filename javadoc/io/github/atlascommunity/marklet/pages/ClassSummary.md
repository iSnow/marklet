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
| Type and modifiers                                     | Field name                |
| ------------------------------------------------------ | ------------------------- |
| **private static final String**                        | TYPE_AND_MODIFIERS_COLUMN |
| **private final javax.lang.model.element.TypeElement** | classElement              |
| **private final javax.lang.model.util.Types**          | typeUtils                 |
#### Methods
| Type and modifiers | Method signature                                                 | Return type |
| ------------------ | ---------------------------------------------------------------- | ----------- |
| **private static** | generateMethodSummary(TypeElement classElement, Types typeUtils) | String      |
| **private static** | generateConstructorSummary(TypeElement classElement)             | String      |
| **public**         | generate() **(Override)**                                        | String      |
| **private static** | generateFieldSummary(TypeElement classElement)                   | String      |

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


generateFieldSummary(TypeElement classElement)
----------------------------------------------


### Returns

markdown string representation of class fields



