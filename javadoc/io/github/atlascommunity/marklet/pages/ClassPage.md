Class ClassPage
===============
Summary
-------
#### Constructors
| Visibility | Signature   |
| ---------- | ----------- |
| **public** | ClassPage() |
#### Fields
| Type and modifiers | Field name |
| ------------------ | ---------- |
| **private final**  | classDoc   |
| **private final**  | options    |
#### Methods
| Type and modifiers | Method signature         |
| ------------------ | ------------------------ |
| **public**         | build()                  |
| **private**        | writeFile(StringBuilder) |

Constructors
============
ClassPage ()
------------


Fields
======
classDoc, com.sun.javadoc.ClassDoc
----------------------------------
Class information

options, io.github.atlascommunity.marklet.Options
-------------------------------------------------
Doclet options


Methods
=======
build ()
--------
Creates markdown text file

writeFile (StringBuilder)
-------------------------
Writes file to disk
### Parameters
classPage: markdown string with class information

### Throws
java.io.IOException: If any error occurs during write process.


