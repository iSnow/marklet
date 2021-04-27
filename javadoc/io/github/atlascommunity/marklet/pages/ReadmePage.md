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
| Type and modifiers       | Field name           |
| ------------------------ | -------------------- |
| **private final**        | packages             |
| **private final**        | options              |
| **private static final** | TABLE_PACKAGE_HEADER |
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
packages, java.util.List<com.sun.javadoc.PackageDoc>
----------------------------------------------------
List of project packages

options, io.github.atlascommunity.marklet.Options
-------------------------------------------------
Doclet options

TABLE_PACKAGE_HEADER, java.lang.String
--------------------------------------
Table header


Methods
=======
build ()
--------
Build document and write it to the selected folder
### Throws
java.io.IOException: something went wrong during write operation


