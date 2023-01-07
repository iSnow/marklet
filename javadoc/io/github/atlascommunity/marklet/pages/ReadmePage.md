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
| Type and modifiers                                              | Field name           |
| --------------------------------------------------------------- | -------------------- |
| **private static final String**                                 | TABLE_PACKAGE_HEADER |
| **private final io.github.atlascommunity.marklet.Options**      | options              |
| **private final List<javax.lang.model.element.PackageElement>** | packages             |
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

io.github.atlascommunity.marklet.Options options
------------------------------------------------

java.util.List<javax.lang.model.element.PackageElement> packages
----------------------------------------------------------------


Methods
=======
build(Reporter reporter)
------------------------
Build document and write it to the selected folder

### Throws

IOException: something went wrong during write operation



