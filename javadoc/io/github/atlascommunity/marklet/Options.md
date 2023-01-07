Class Options
=============
Class that reads and stores provided options for javadoc execution. Options that we care about
 are :

 <p>* `-d` specifies the output directory (default: `javadocs`) * `-e` specifies the file ending
 for files to be created (default `md`) * `-l` specifies the file ending used in internal links
 (default `md`)

 <p> The default options are ideal if you want to serve the documentation using GitHub's
 built-in README rendering. If you are using a tool like Slate, change the options as follows: ```
 $ javadoc -doclet fr.faylixe.marklet.Marklet -e html.md -l html \u2026 ```

io.github.atlascommunity.marklet.Options Summary
-------
#### Constructors
| Visibility | Signature                                                 |
| ---------- | --------------------------------------------------------- |
| **public** | Options(java.util.Map<java.lang.String,java.lang.String>) |
#### Fields
| Type and modifiers                                                                                      | Field name               |
| ------------------------------------------------------------------------------------------------------- | ------------------------ |
| **private final java.lang.String**                                                                      | fileEnding               |
| **private static final java.lang.String**                                                               | DEFAULT_FILE_ENDING      |
| **public static final java.lang.String**                                                                | SOURCE_DIRECTORY_OPTION  |
| **private static final java.util.Map<java.lang.String,io.github.atlascommunity.marklet.MarkletOption>** | OPTIONS                  |
| **private final boolean**                                                                               | hasBadge                 |
| **public static final java.lang.String**                                                                | CREATE_BADGE_OPTION      |
| **private static final java.lang.String**                                                               | DEFAULT_OUTPUT_DIRECTORY |
| **public static final java.lang.String**                                                                | OUTPUT_DIRECTORY_OPTION  |
| **private final java.lang.String**                                                                      | outputDirectory          |
| **public static final java.lang.String**                                                                | FILE_ENDING_OPTION       |
#### Methods
| Type and modifiers | Method signature      | Return type                                     |
| ------------------ | --------------------- | ----------------------------------------------- |
| **public static**  | getOption(String key) | io.github.atlascommunity.marklet.MarkletOption  |
| **public static**  | getSupportedOptions() | java.util.Set<jdk.javadoc.doclet.Doclet.Option> |

Constructors
============
Options(java.util.Map<java.lang.String,java.lang.String>)
---------------------------------------------------------
Default constructor. Sets options with their default parameters if available.



Fields
======
java.lang.String fileEnding
---------------------------

java.lang.String DEFAULT_FILE_ENDING
------------------------------------

java.lang.String SOURCE_DIRECTORY_OPTION
----------------------------------------

java.util.Map<java.lang.String,io.github.atlascommunity.marklet.MarkletOption> OPTIONS
--------------------------------------------------------------------------------------

boolean hasBadge
----------------

java.lang.String CREATE_BADGE_OPTION
------------------------------------

java.lang.String DEFAULT_OUTPUT_DIRECTORY
-----------------------------------------

java.lang.String OUTPUT_DIRECTORY_OPTION
----------------------------------------

java.lang.String outputDirectory
--------------------------------

java.lang.String FILE_ENDING_OPTION
-----------------------------------


Methods
=======
getOption(String key)
---------------------
*No method description provided*


getSupportedOptions()
---------------------
*No method description provided*



