Class PackagePage
=================
Index of package elements

io.github.atlascommunity.marklet.pages.PackagePage Summary
-------
#### Constructors
| Visibility | Signature     |
| ---------- | ------------- |
| **public** | PackagePage() |
#### Fields
| Type and modifiers                                         | Field name       |
| ---------------------------------------------------------- | ---------------- |
| **private final java.nio.file.Path**                       | packageDirectory |
| **private final io.github.atlascommunity.marklet.Options** | options          |
| **private final com.sun.source.util.DocTrees**             | comments         |
| **private final jdk.javadoc.doclet.DocletEnvironment**     | root             |
| **private final javax.lang.model.element.PackageElement**  | packageElement   |
#### Methods
| Type and modifiers | Method signature                                                                                         | Return type                                    |
| ------------------ | -------------------------------------------------------------------------------------------------------- | ---------------------------------------------- |
| **private**        | createPackageEnumIndex(StringBuilder packagePage)                                                        | void                                           |
| **private**        | createPackageIndexes(StringBuilder packagePage)                                                          | void                                           |
| **public**         | build(Reporter reporter)                                                                                 | void                                           |
| **private**        | generateTable(String tableLabel, javax.lang.model.element.TypeElement[] docs, StringBuilder packagePage) | void                                           |
| **public**         | handle(Object element)                                                                                   | void                                           |
| **private**        | createPackageClassIndex(StringBuilder packagePage)                                                       | void                                           |
| **private**        | writeFile(StringBuilder pageContent)                                                                     | void                                           |
| **private**        | getFullBody(PackageElement packageElement, DocTrees comments)                                            | java.util.List<com.sun.source.doctree.DocTree> |

Constructors
============
PackagePage()
-------------


