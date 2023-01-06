Class ReadmePage
================
Index of project packages

io.github.atlascommunity.marklet.pages.ReadmePage Summary
-------
#### Constructors
| Visibility | Signature    |
| ---------- | ------------ |
| **public** | ReadmePage() |
#### Fields
| Type and modifiers                                                        | Field name           |
| ------------------------------------------------------------------------- | -------------------- |
| **private final java.util.List<javax.lang.model.element.PackageElement>** | packages             |
| **private static final java.lang.String**                                 | TABLE_PACKAGE_HEADER |
| **private final io.github.atlascommunity.marklet.Options**                | options              |
#### Methods
| Type and modifiers | Method signature         | Return type |
| ------------------ | ------------------------ | ----------- |
| **public**         | build(Reporter reporter) | void        |

Constructors
============
ReadmePage()
------------


Fields
======
java.util.List<javax.lang.model.element.PackageElement> packages
----------------------------------------------------------------

java.lang.String TABLE_PACKAGE_HEADER
-------------------------------------

io.github.atlascommunity.marklet.Options options
------------------------------------------------


Methods
=======
build(Reporter reporter)
------------------------
Build document and write it to the selected folder

@throws IOException something went wrong during write operation




