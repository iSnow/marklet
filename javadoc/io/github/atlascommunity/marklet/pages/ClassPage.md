Class ClassPage
===============
io.github.atlascommunity.marklet.pages.ClassPage
Summary
-------
#### Constructors
| Visibility | Signature   |
| ---------- | ----------- |
| **public** | ClassPage() |
#### Fields
| Type and modifiers                                         | Field name |
| ---------------------------------------------------------- | ---------- |
| **private final com.sun.javadoc.ClassDoc**                 | classDoc   |
| **private final io.github.atlascommunity.marklet.Options** | options    |
#### Methods
| Type and modifiers | Method signature                   | Return type |
| ------------------ | ---------------------------------- | ----------- |
| **public**         | build()                            | void        |
| **private**        | writeFile(StringBuilder classPage) | void        |

Constructors
============
ClassPage ()
------------


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
build ()
--------
Creates markdown text file

writeFile (StringBuilder)
-------------------------
Writes file to disk
### Parameters
- classPage: markdown string with class information
### Throws
java.io.IOException: If any error occurs during write process.


