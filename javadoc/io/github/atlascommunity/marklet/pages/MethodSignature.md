Class MethodSignature
=====================
io.github.atlascommunity.marklet.pages.MethodSignature
Summary
-------
#### Constructors
| Visibility | Signature         |
| ---------- | ----------------- |
| **public** | MethodSignature() |
#### Fields
| Type and modifiers                          | Field name |
| ------------------------------------------- | ---------- |
| **private final com.sun.javadoc.MethodDoc** | methodInfo |
#### Methods
| Type and modifiers | Method signature                                     | Return type |
| ------------------ | ---------------------------------------------------- | ----------- |
| **public**         | form()                                               | String      |
| **private**        | methodParams(com.sun.javadoc.Parameter[] parameters) | String      |

Constructors
============
MethodSignature ()
------------------


Fields
======
com.sun.javadoc.MethodDoc, methodInfo
-------------------------------------
Method information


Methods
=======
form ()
-------
Form description from method information
### Returns
method signature string

methodParams (Parameter[])
--------------------------
Form doubled bracket params description
### Parameters
- parameters: method params information
### Returns
formed string


