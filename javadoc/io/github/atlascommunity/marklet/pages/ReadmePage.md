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
| **private static final String**                                 | TABLE_PACKAGE_HEADER |
| **private final List<javax.lang.model.element.PackageElement>** | packages             |
| **private final io.github.atlascommunity.marklet.Options**      | options              |
#### Methods
| Type and modifiers | Method signature                        | Return type |
| ------------------ | --------------------------------------- | ----------- |
| **public**         | build(Reporter reporter) **(Override)** | void        |

Constructors
============
ReadmePage()
------------
*No method description provided*



Fields
======
String TABLE_PACKAGE_HEADER
-------------------------------------
Table header


List<javax.lang.model.element.PackageElement> packages
----------------------------------------------------------------
List of project packages


io.github.atlascommunity.marklet.Options options
------------------------------------------------
Doclet options



Methods
=======
build(Reporter reporter)
------------------------
### Overrides/Implements:
build(Reporter reporter) from Interface DocumentPage

Build document and write it to the selected folder

### Throws

IOException: something went wrong during write operation



