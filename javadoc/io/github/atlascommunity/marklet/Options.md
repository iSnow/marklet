Class Options
=============
Summary
-------
#### Methods
| Type and modifiers | Method signature                           |
| ------------------ | ------------------------------------------ |
| **public static**  | validOptions(String[][], DocErrorReporter) |
| **public static**  | optionLength(String)                       |
| **public static**  | parse(RootDoc)                             |

Methods
=======
validOptions (String[][], DocErrorReporter)
-------------------------------------------
Options validation method.
### Parameters
options: Options from command line.
reporter: Reporter instance to use in case of error.

### Returns
<tt>true</tt> if given set of options are valid, <tt>false</tt> otherwise.

optionLength (String)
---------------------
Computes number of arguments (as token) for the given option.
### Parameters
option: Target option to get token number for.

### Returns
Number of token expected for the given option.

parse (RootDoc)
---------------
Static factory.
### Parameters
root: program structure information root

### Returns
Built options instance.


