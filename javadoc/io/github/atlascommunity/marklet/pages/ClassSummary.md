Class ClassSummary
==================
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
| **private final javax.lang.model.element.TypeElement** | classElement              |
#### Methods
| Type and modifiers | Method signature                                     | Return type |
| ------------------ | ---------------------------------------------------- | ----------- |
| **private static** | generateFieldSummary(TypeElement classElement)       | String      |
| **private static** | generateMethodSummary(TypeElement classElement)      | String      |
| **private static** | generateConstructorSummary(TypeElement classElement) | String      |
| **public**         | generate                                             | String      |

Constructors
============
ClassSummary()
--------------
*No method description provided*



Fields
======
java.lang.String TYPE_AND_MODIFIERS_COLUMN
------------------------------------------

javax.lang.model.element.TypeElement classElement
-------------------------------------------------


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


generateConstructorSummary(TypeElement classElement)
----------------------------------------------------


### Returns

markdown string representation of class constructors


generate
--------


### Returns

markdown string representation of document part



