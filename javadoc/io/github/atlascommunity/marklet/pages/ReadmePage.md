Class ReadmePage implements io.github.atlascommunity.marklet.pages.DocumentPage
===============================================================================
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
| **private final List<javax.lang.model.element.PackageElement>** | packages             |
| **private final io.github.atlascommunity.marklet.Options**      | options              |
| **private static final String**                                 | TABLE_PACKAGE_HEADER |
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
List<javax.lang.model.element.PackageElement> packages
----------------------------------------------------------------
List of project packages


io.github.atlascommunity.marklet.Options options
------------------------------------------------
Doclet options


String TABLE_PACKAGE_HEADER
-------------------------------------
Table header



Methods
=======
build(Reporter reporter)
------------------------
Build document and write it to the selected folder

### Throws

IOException: something went wrong during write operation



