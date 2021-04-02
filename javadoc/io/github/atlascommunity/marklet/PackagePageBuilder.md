# Class PackagePageBuilder

* Package [io.github.atlascommunity.marklet](README.html)
* *java.lang.Object* > [MarkdownDocumentBuilder](MarkdownDocumentBuilder.html) > [MarkletDocumentBuilder](MarkletDocumentBuilder.html) > [PackagePageBuilder](PackagePageBuilder.html)

Builder that aims to create documentation page for a given ``package``. Such documentation
 consists in a package description followed by type listing over following categories :

 * Classes * Interfaces * Enumerations * Annotations


## Summary
#### Methods
| Type and modifiers | Method signature |
| --- | --- |
| `public static` `void` | [build](#buildpackagedoc-path-markletoptions)(*com.sun.javadoc.PackageDoc* packageDoc, *java.nio.file.Path* directoryPath, [MarkletOptions](MarkletOptions.html) options) |



# Methods
## build(PackageDoc, Path, MarkletOptions)
Builds and writes the documentation file associated to the given ``packageDoc`` into the
 directory denoted by the given ``directoryPath``.

### **Parameters**
* `packageDoc`: Package to generated documentation for.
* `directoryPath`: Path of the directory to write documentation in.

### **Throws**
* *java.io.IOException* If any error occurs while writing package page.




