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
| **private static final java.lang.String**              | TYPE_AND_MODIFIERS_COLUMN |
| **private final javax.lang.model.element.TypeElement** | classElement              |
#### Methods
| Type and modifiers | Method signature                                     | Return type      |
| ------------------ | ---------------------------------------------------- | ---------------- |
| **public**         | generate()                                           | java.lang.String |
| **private static** | generateConstructorSummary(TypeElement classElement) | java.lang.String |
| **private static** | generateMethodSummary(TypeElement classElement)      | java.lang.String |
| **private static** | generateFieldSummary(TypeElement classElement)       | java.lang.String |

Constructors
============
ClassSummary()
--------------


