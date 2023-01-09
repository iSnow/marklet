Class ReadmePage implements io.github.atlascommunity.marklet.pages.DocumentPage
===============================================================================
Index of project packages

io.github.atlascommunity.marklet.pages.ReadmePage Summary
-------
#### Constructors
| Visibility | Signature    |
| ---------- | ------------ |
| public     | ReadmePage() |
#### Fields
| Type and modifiers                                              | Field name |
| --------------------------------------------------------------- | ---------- |
| **private final List<javax.lang.model.element.PackageElement>** | packages   |
| **private final List<javax.lang.model.element.ModuleElement>**  | modules    |
| **private final io.github.atlascommunity.marklet.Options**      | options    |
#### Methods
| Modifiers  | Method signature                        | Return type |
| ---------- | --------------------------------------- | ----------- |
| **public** | build(Reporter reporter) **(Override)** | void        |

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


List<javax.lang.model.element.ModuleElement> modules
--------------------------------------------------------------
List of modules in the project


io.github.atlascommunity.marklet.Options options
------------------------------------------------
Doclet options


Methods
=======
build(Reporter reporter)
------------------------
### Overrides/Implements:
build(Reporter reporter) from io.github.atlascommunity.marklet.pages.DocumentPage

Build document and write it to the selected folder

### Throws

IOException: something went wrong during write operation


