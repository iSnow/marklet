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
| **private final javax.lang.model.element.TypeElement** | classElement              |
| **private static final java.lang.String**              | TYPE_AND_MODIFIERS_COLUMN |
#### Methods
| Type and modifiers | Method signature                                     | Return type      |
| ------------------ | ---------------------------------------------------- | ---------------- |
| **private static** | generateFieldSummary(TypeElement classElement)       | java.lang.String |
| **public**         | generate()                                           | java.lang.String |
| **private static** | generateMethodSummary(TypeElement classElement)      | java.lang.String |
| **private static** | generateConstructorSummary(TypeElement classElement) | java.lang.String |

Constructors
============
ClassSummary()
--------------
*No method description provided*



Fields
======
javax.lang.model.element.TypeElement classElement
-------------------------------------------------

java.lang.String TYPE_AND_MODIFIERS_COLUMN
------------------------------------------


Methods
=======
generateFieldSummary(TypeElement classElement)
----------------------------------------------


### Returns

markdown string representation of class fields


generate()
----------


### Returns

markdown string representation of document part


generateMethodSummary(TypeElement classElement)
-----------------------------------------------


### Returns

markdown string representation of class methods


generateConstructorSummary(TypeElement classElement)
----------------------------------------------------


### Returns

markdown string representation of class constructors



