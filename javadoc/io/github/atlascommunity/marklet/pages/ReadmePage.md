Class ReadmePage extends io.github.atlascommunity.marklet.pages.DocumentPage
============================================================================
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
| **private final jdk.javadoc.doclet.Reporter**                   | reporter   |
| **private final io.github.atlascommunity.marklet.Options**      | options    |
| **private final List<javax.lang.model.element.PackageElement>** | packages   |
| **private final List<javax.lang.model.element.ModuleElement>**  | modules    |
#### Methods
| Modifiers  | Method signature | Return type |
| ---------- | ---------------- | ----------- |
| **public** | write()          | void        |
| **public** | build()          | String      |

Constructors
============
ReadmePage()
------------
*No method description provided*


Fields
======
jdk.javadoc.doclet.Reporter reporter
------------------------------------
*No description provided*


io.github.atlascommunity.marklet.Options options
------------------------------------------------
Doclet options


List<javax.lang.model.element.PackageElement> packages
----------------------------------------------------------------
List of project packages


List<javax.lang.model.element.ModuleElement> modules
--------------------------------------------------------------
List of modules in the project


Methods
=======
write()
-------
*No method description provided*


build()
-------
Build document and write it to the selected folder

### Throws

IOException: something went wrong during write operation


