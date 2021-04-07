Class Marklet
=============
Summary
-------
#### Constructors
| Visibility | Signature |
| ---------- | --------- |
| **public** | Marklet() |
#### Methods
| Type and modifiers | Method signature                           |
| ------------------ | ------------------------------------------ |
| **public static**  | optionLength(String)                       |
| **public static**  | validOptions(String[][], DocErrorReporter) |
| **public static**  | languageVersion()                          |
| **public static**  | start(RootDoc)                             |

Constructors
============
Marklet ()
----------


Methods
=======
optionLength (String)
---------------------
To document.
### Parameters
option: To document.

### Returns
To document.

validOptions (String[][], DocErrorReporter)
-------------------------------------------
To document.
### Parameters
options: Options from command line.
reporter: Reporter instance to use in case of error.

### Returns
<tt>true</tt> if given set of options are valid, <tt>false</tt> otherwise.

languageVersion ()
------------------

### Returns
LanguageVersion supported.

start (RootDoc)
---------------
**Doclet** entry point. Parses user provided options and starts a **Marklet** execution.
### Parameters
root: Doclet API root.

### Returns
``true`` if the generation went well, ``false`` otherwise.


