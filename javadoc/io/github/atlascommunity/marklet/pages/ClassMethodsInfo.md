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
| Type and modifiers       | Field name          |
| ------------------------ | ------------------- |
| **private final**        | classDoc            |
| **private static final** | DESCRIPTION_PATTERN |
| **private static final** | OVERRIDE_MARK       |
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
classDoc, com.sun.javadoc.ClassDoc
----------------------------------
Class information

DESCRIPTION_PATTERN, java.lang.String
-------------------------------------
Pattern for colon separated description

OVERRIDE_MARK, java.lang.String
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


