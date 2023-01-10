Class ClassFieldsInfo implements io.github.atlascommunity.marklet.page_elements.ClassPageElement
================================================================================================
Class fields description

io.github.atlascommunity.marklet.page_elements.ClassFieldsInfo Summary
-------
#### Constructors
| Visibility | Signature         |
| ---------- | ----------------- |
| public     | ClassFieldsInfo() |
#### Fields
| Modifiers         | Field name   | Type                                 |
| ----------------- | ------------ | ------------------------------------ |
| **private final** | classElement | javax.lang.model.element.TypeElement |
| **private final** | treeUtils    | com.sun.source.util.DocTrees         |
#### Methods
| Modifiers  | Method signature          | Return type |
| ---------- | ------------------------- | ----------- |
| **public** | generate() **(Override)** | String      |

Constructors
============
ClassFieldsInfo()
-----------------
*No method description provided*


Fields
======
javax.lang.model.element.TypeElement classElement
-------------------------------------------------
Class information


com.sun.source.util.DocTrees treeUtils
--------------------------------------
*No description provided*


Methods
=======
generate()
----------
### Overrides/Implements:
generate() from io.github.atlascommunity.marklet.page_elements.ClassPageElement



### Returns

markdown string representation of document part


