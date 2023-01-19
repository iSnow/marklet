Class Sanitizers
================


io.github.atlascommunity.marklet.util.Sanitizers Summary
-------
#### Constructors
| Visibility | Signature    |
| ---------- | ------------ |
| public     | Sanitizers() |
#### Fields
| Modifiers                | Field name                                   | Type   |
| ------------------------ | -------------------------------------------- | ------ |
| **private static final** | [UP_DIRECTORY](#javalangstring-up_directory) | String |
#### Methods
| Modifiers         | Method signature                                                                                         | Return type |
| ----------------- | -------------------------------------------------------------------------------------------------------- | ----------- |
| **public static** | [sanitizeHtmlTags(String input)](#sanitizehtmltagsstring-input)                                          | String      |
| **public static** | [sanitizePackageNames(String input)](#sanitizepackagenamesstring-input)                                  | String      |
| **public static** | [sanitizeSuperClass(TypeMirror superclass)](#sanitizesuperclasstypemirror-superclass)                    | String      |
| **public static** | [methodSignatureToLinkTarget(String methodInfo)](#methodsignaturetolinktargetstring-methodinfo)          | String      |
| **public static** | [constructShortestPath(String source, String target)](#constructshortestpathstring-source-string-target) | String      |

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

### Parameters

| Name  | Description               |
| ----- | ------------------------- |
| input | *No description provided* |

sanitizePackageNames(String input)
----------------------------------
*No method description provided*

### Parameters

| Name  | Description               |
| ----- | ------------------------- |
| input | *No description provided* |

sanitizeSuperClass(TypeMirror superclass)
-----------------------------------------
*No method description provided*

### Parameters

| Name       | Description               |
| ---------- | ------------------------- |
| superclass | *No description provided* |

methodSignatureToLinkTarget(String methodInfo)
----------------------------------------------
*No method description provided*

### Parameters

| Name       | Description               |
| ---------- | ------------------------- |
| methodInfo | *No description provided* |

constructShortestPath(String source, String target)
---------------------------------------------------
Static method that builds a shortest URL path, from
 the given ``source`` package to the ``target`` package.
 Such path is built by taking the longest common prefix
 from both package name, trying to move from source to this
 prefix using ``../`` path, then moving to the target path
 vertically.

### Parameters

| Name   | Description                        |
| ------ | ---------------------------------- |
| source | Source package to build path from. |
| target | Target package to build path to.   |

### Returns

Built path.


