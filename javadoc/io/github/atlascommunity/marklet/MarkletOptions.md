# Class MarkletOptions

* Package [io.github.atlascommunity.marklet](README.html)
* *java.lang.Object* > [MarkletOptions](MarkletOptions.html)

Class that reads and stores provided options for javadoc execution. Options that we care about
 are :

 * `-d` specifies the output directory (default: `javadocs`) * `-e` specifies the file ending
 for files to be created (default `md`) * `-l` specifies the file ending used in internal links
 (default `md`)

 > The default options are ideal if you want to serve the documentation using GitHub's >
 built-in README rendering. If you are using a tool like Slate, change the options as follows: ```
 $ javadoc -doclet fr.faylixe.marklet.Marklet -e html.md -l html … ```


## Summary
#### Methods
| Type and modifiers | Method signature |
| --- | --- |
| `public static` `int` | [optionLength](#optionlengthstring)(*java.lang.String* option) |
| `public static` [MarkletOptions](MarkletOptions.html) | [parse](#parserootdoc)(*com.sun.javadoc.RootDoc* root) |
| `public static` `boolean` | [validOptions](#validoptionsstring-docerrorreporter)(*java.lang.String* options, *com.sun.javadoc.DocErrorReporter* reporter) |



# Methods
## optionLength(String)
Computes number of arguments (as token) for the given option.

### **Parameters**
* `option`: Target option to get token number for.

### **Returns**
Number of token expected for the given option.



## parse(RootDoc)
Static factory.

### **Parameters**
* `root`: program structure information root

### **Returns**
Built options instance.



## validOptions(String[][], DocErrorReporter)
Options validation method.

### **Parameters**
* `options`: Options from command line.
* `reporter`: Reporter instance to use in case of error.

### **Returns**
<tt>true</tt> if given set of options are valid, <tt>false</tt> otherwise.




