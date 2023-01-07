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
| **private static final java.lang.String**                                 | TABLE_PACKAGE_HEADER |
| **private final java.util.List<javax.lang.model.element.PackageElement>** | packages             |
| **private final io.github.atlascommunity.marklet.Options**                | options              |
#### Methods
| Type and modifiers | Method signature         | Return type |
| ------------------ | ------------------------ | ----------- |
| **public**         | build(Reporter reporter) | void        |

Constructors
============
ReadmePage()
------------
*No method description provided*



Fields
======
java.lang.String TABLE_PACKAGE_HEADER
-------------------------------------

java.util.List<javax.lang.model.element.PackageElement> packages
----------------------------------------------------------------

io.github.atlascommunity.marklet.Options options
------------------------------------------------


Methods
=======
build(Reporter reporter)
------------------------
Build document and write it to the selected folder

### Throws

IOException: something went wrong during write operation



