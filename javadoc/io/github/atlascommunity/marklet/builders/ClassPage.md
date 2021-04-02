# Class ClassPage

* Package [io.github.atlascommunity.marklet.builders](Index.md)
*  > [MarkdownDocument](MarkdownDocument.md) > [MarkletDocument](MarkletDocument.md) > [ClassPage](ClassPage.md)

Builder that aims to create documentation page for a given ``class``. As for a standard class
 javadoc generation, it will contains a class summary, followed by details about class field,
 constructor, and methods.


## Summary
#### Methods
| Type and modifiers | Method signature |
| --- | --- |
| `public static` `void` | [build](#buildclassdoc-path-markletoptions)( classDoc,  directoryPath, [MarkletOptions](../MarkletOptions.md) options) |
| `public` `void` | [inheritedMethodSummary](#inheritedmethodsummary)() |



# Methods
## build(ClassDoc, Path, MarkletOptions)
Builds and writes the documentation file associated to the given ``classDoc`` into the
 directory denoted by the given ``directoryPath``.

### **Parameters**
* `classDoc`: Class to generated documentation for
* `directoryPath`: Path of the directory to write documentation in
* `options`: doclet options to use

### **Throws**
*  If any error occurs while writing documentation



## inheritedMethodSummary()
Appends inherited method summary




