Class ClassMethodsInfo
======================
io.github.atlascommunity.marklet.pages.ClassMethodsInfo
Summary
-------
#### Constructors
| Visibility | Signature          |
| ---------- | ------------------ |
| **public** | ClassMethodsInfo() |
#### Fields
| Type and modifiers                         | Field name          |
| ------------------------------------------ | ------------------- |
| **private final com.sun.javadoc.ClassDoc** | classDoc            |
| **private static final java.lang.String**  | DESCRIPTION_PATTERN |
| **private static final java.lang.String**  | OVERRIDE_MARK       |
#### Methods
| Type and modifiers | Method signature                 | Return type |
| ------------------ | -------------------------------- | ----------- |
| **public**         | generate()                       | String      |
| **private**        | methodDescription(MethodDoc doc) | String      |

Constructors
============
ClassMethodsInfo ()
-------------------


Fields
======
com.sun.javadoc.ClassDoc, classDoc
----------------------------------
Class information

java.lang.String, DESCRIPTION_PATTERN
-------------------------------------
Pattern for colon separated description

java.lang.String, OVERRIDE_MARK
-------------------------------
No description provided


Methods
=======
generate ()
-----------
No method description provided
### Returns
markdown string representation of document part

methodDescription (MethodDoc)
-----------------------------
No method description provided
### Parameters
- doc: method representation
### Returns
markdown string


