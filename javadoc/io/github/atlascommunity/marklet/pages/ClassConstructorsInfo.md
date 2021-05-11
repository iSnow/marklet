Class ClassConstructorsInfo
===========================
io.github.atlascommunity.marklet.pages.ClassConstructorsInfo
Summary
-------
#### Constructors
| Visibility | Signature               |
| ---------- | ----------------------- |
| **public** | ClassConstructorsInfo() |
#### Fields
| Type and modifiers                                         | Field name |
| ---------------------------------------------------------- | ---------- |
| **private final com.sun.javadoc.ClassDoc**                 | classDoc   |
| **private final io.github.atlascommunity.marklet.Options** | options    |
#### Methods
| Type and modifiers | Method signature                                | Return type |
| ------------------ | ----------------------------------------------- | ----------- |
| **public**         | generate()                                      | String      |
| **private**        | constructorDescription(ExecutableMemberDoc doc) | String      |

Constructors
============
ClassConstructorsInfo ()
------------------------


Fields
======
com.sun.javadoc.ClassDoc, classDoc
----------------------------------
Class information

io.github.atlascommunity.marklet.Options, options
-------------------------------------------------
Doclet options


Methods
=======
generate ()
-----------
No method description provided
### Returns
markdown string representation of document part

constructorDescription (ExecutableMemberDoc)
--------------------------------------------
No method description provided
### Parameters
- doc: constructor representation
### Returns
markdown string


