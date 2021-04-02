# Class Marklet

* Package [io.github.atlascommunity.marklet](Index.md)
*  > [Marklet](Marklet.md)

Marklet entry point. This class declares the [Marklet](Marklet.md) method required by the
 doclet API in order to be called by the javadoc tool.


## Summary
#### Constructors
| Visibility | Signature |
| --- | --- |
| `public` | [Marklet](#marklet)() |

#### Methods
| Type and modifiers | Method signature |
| --- | --- |
| `public static`  | [languageVersion](#languageversion)() |
| `public static` `int` | [optionLength](#optionlengthstring)( option) |
| `public static` `boolean` | [start](#startrootdoc)( root) |
| `public static` `boolean` | [validOptions](#validoptionsstring-docerrorreporter)( options,  reporter) |



# Constructors
## Marklet()





# Methods
## languageVersion()


### **Returns**
LanguageVersion supported.



## optionLength(String)
To document.

### **Parameters**
* `option`: To document.

### **Returns**
To document.



## start(RootDoc)
**Doclet** entry point. Parses user provided options and starts a **Marklet** execution.

### **Parameters**
* `root`: Doclet API root.

### **Returns**
``true`` if the generation went well, ``false`` otherwise.



## validOptions(String[][], DocErrorReporter)
To document.

### **Parameters**
* `options`: Options from command line.
* `reporter`: Reporter instance to use in case of error.

### **Returns**
<tt>true</tt> if given set of options are valid, <tt>false</tt> otherwise.




