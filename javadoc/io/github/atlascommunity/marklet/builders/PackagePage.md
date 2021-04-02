# Class PackagePage

* Package [io.github.atlascommunity.marklet.builders](Index.md)
*  > [MarkdownDocument](MarkdownDocument.md) > [MarkletDocument](MarkletDocument.md) > [PackagePage](PackagePage.md)

Builder that aims to create documentation page for a given ``package``. Such documentation
 consists in a package description followed by type listing over following categories :

 * Classes * Interfaces * Enumerations * Annotations


## Summary
#### Methods
| Type and modifiers | Method signature |
| --- | --- |
| `public static` `void` | [build](#buildpackagedoc-path-markletoptions)( packageDoc,  directoryPath, [MarkletOptions](../MarkletOptions.md) options) |



# Methods
## build(PackageDoc, Path, MarkletOptions)
Builds and writes the documentation file associated to the given ``packageDoc`` into the
 directory denoted by the given ``directoryPath``.

### **Parameters**
* `packageDoc`: Package to generated documentation for.
* `directoryPath`: Path of the directory to write documentation in.
* `options`: Doclet options.

### **Throws**
*  If any error occurs while writing package page.




