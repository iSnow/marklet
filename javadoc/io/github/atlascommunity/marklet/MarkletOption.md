Class MarkletOption
===================


io.github.atlascommunity.marklet.MarkletOption Summary
-------
#### Constructors
| Visibility | Signature       |
| ---------- | --------------- |
| **public** | MarkletOption() |
#### Fields
| Type and modifiers                                      | Field name    |
| ------------------------------------------------------- | ------------- |
| **private java.lang.String**                            | value         |
| **private final java.lang.String**                      | parameters    |
| **private final java.util.List<java.lang.String>**      | names         |
| **private final java.lang.String**                      | description   |
| **private final jdk.javadoc.doclet.Doclet.Option.Kind** | kind          |
| **private final int**                                   | argumentCount |
#### Methods
| Type and modifiers | Method signature                                                   | Return type                           |
| ------------------ | ------------------------------------------------------------------ | ------------------------------------- |
| **public**         | getValue()                                                         | java.lang.String                      |
| **public**         | getNames()                                                         | java.util.List<java.lang.String>      |
| **public**         | getDescription()                                                   | java.lang.String                      |
| **public**         | toString()                                                         | java.lang.String                      |
| **public**         | getArgumentCount()                                                 | int                                   |
| **public**         | process(String option, java.util.List<java.lang.String> arguments) | boolean                               |
| **public**         | getKind()                                                          | jdk.javadoc.doclet.Doclet.Option.Kind |
| **public**         | getParameters()                                                    | java.lang.String                      |

Constructors
============
MarkletOption()
---------------


Fields
======
java.lang.String value
----------------------

java.lang.String parameters
---------------------------

java.util.List<java.lang.String> names
--------------------------------------

java.lang.String description
----------------------------

jdk.javadoc.doclet.Doclet.Option.Kind kind
------------------------------------------

int argumentCount
-----------------


Methods
=======
getValue()
----------

getNames()
----------

getDescription()
----------------

toString()
----------

getArgumentCount()
------------------

process(String option, java.util.List<java.lang.String> arguments)
------------------------------------------------------------------

getKind()
---------

getParameters()
---------------


