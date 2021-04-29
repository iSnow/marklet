Class ReadmePage
================
io.github.atlascommunity.marklet.pages.ReadmePage
Summary
-------
#### Constructors
| Visibility | Signature    |
| ---------- | ------------ |
| **public** | ReadmePage() |
#### Fields
| Type and modifiers                                           | Field name           |
| ------------------------------------------------------------ | -------------------- |
| **private final java.util.List<com.sun.javadoc.PackageDoc>** | packages             |
| **private final io.github.atlascommunity.marklet.Options**   | options              |
| **private static final java.lang.String**                    | TABLE_PACKAGE_HEADER |
#### Methods
| Type and modifiers | Method signature | Return type |
| ------------------ | ---------------- | ----------- |
| **public**         | build()          | void        |

Constructors
============
ReadmePage ()
-------------


Fields
======
java.util.List<com.sun.javadoc.PackageDoc>, packages
----------------------------------------------------
List of project packages

io.github.atlascommunity.marklet.Options, options
-------------------------------------------------
Doclet options

java.lang.String, TABLE_PACKAGE_HEADER
--------------------------------------
Table header


Methods
=======
build ()
--------
Build document and write it to the selected folder
### Throws
java.io.IOException: something went wrong during write operation


