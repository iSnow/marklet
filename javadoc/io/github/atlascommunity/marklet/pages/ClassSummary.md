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
| **public**         | generate()                                           | java.lang.String |
| **private static** | generateMethodSummary(TypeElement classElement)      | java.lang.String |
| **private static** | generateConstructorSummary(TypeElement classElement) | java.lang.String |
| **private static** | generateFieldSummary(TypeElement classElement)       | java.lang.String |

Constructors
============
ClassSummary()
--------------


Fields
======
javax.lang.model.element.TypeElement classElement
-------------------------------------------------

java.lang.String TYPE_AND_MODIFIERS_COLUMN
------------------------------------------


Methods
=======
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



generateFieldSummary(TypeElement classElement)
----------------------------------------------


### Returns

markdown string representation of class fields




