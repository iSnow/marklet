Class Sanitizers
================


io.github.atlascommunity.marklet.util.Sanitizers Summary
-------
#### Constructors
| Visibility | Signature    |
| ---------- | ------------ |
| public     | Sanitizers() |
#### Fields
| Type and modifiers              | Field name   |
| ------------------------------- | ------------ |
| **private static final String** | UP_DIRECTORY |
#### Methods
| Modifiers         | Method signature                                    | Return type |
| ----------------- | --------------------------------------------------- | ----------- |
| **public static** | sanitizeHtmlTags(String input)                      | String      |
| **public static** | sanitizePackageNames(String input)                  | String      |
| **public static** | sanitizeSuperClass(TypeMirror superclass)           | String      |
| **public static** | constructShortestPath(String source, String target) | String      |

Constructors
============
Sanitizers()
------------
*No method description provided*


Fields
======
String UP_DIRECTORY
-----------------------------
*No description provided*


Methods
=======
sanitizeHtmlTags(String input)
------------------------------
*No method description provided*


sanitizePackageNames(String input)
----------------------------------
*No method description provided*


sanitizeSuperClass(TypeMirror superclass)
-----------------------------------------
*No method description provided*


constructShortestPath(String source, String target)
---------------------------------------------------
Static method that builds a shortest URL path, from
 the given ``source`` package to the ``target`` package.
 Such path is built by taking the longest common prefix
 from both package name, trying to move from source to this
 prefix using ``../`` path, then moving to the target path
 vertically.

### Parameters

- source: Source package to build path from.
- target: Target package to build path to.


### Returns

Built path.


