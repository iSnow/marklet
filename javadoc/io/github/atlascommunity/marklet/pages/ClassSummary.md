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
| **private final javax.lang.model.element.TypeElement** | classElement              |
| **private static final String**                        | TYPE_AND_MODIFIERS_COLUMN |
#### Methods
| Type and modifiers | Method signature                                     | Return type |
| ------------------ | ---------------------------------------------------- | ----------- |
| **private static** | generateFieldSummary(TypeElement classElement)       | String      |
| **private static** | generateMethodSummary(TypeElement classElement)      | String      |
| **public**         | generate                                             | String      |
| **private static** | generateConstructorSummary(TypeElement classElement) | String      |

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


String TYPE_AND_MODIFIERS_COLUMN
------------------------------------------
Table column name



Methods
=======
generateFieldSummary(TypeElement classElement)
----------------------------------------------


### Returns

markdown string representation of class fields


generateMethodSummary(TypeElement classElement)
-----------------------------------------------


### Returns

markdown string representation of class methods


generate
--------


### Returns

markdown string representation of document part


generateConstructorSummary(TypeElement classElement)
----------------------------------------------------


### Returns

markdown string representation of class constructors



