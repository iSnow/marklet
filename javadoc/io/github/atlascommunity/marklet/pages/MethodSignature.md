Class MethodSignature
=====================
Forms readable method signature

io.github.atlascommunity.marklet.pages.MethodSignature Summary
-------
#### Constructors
| Visibility | Signature         |
| ---------- | ----------------- |
| **public** | MethodSignature() |
#### Fields
| Type and modifiers                                           | Field name |
| ------------------------------------------------------------ | ---------- |
| **private final javax.lang.model.element.ExecutableElement** | methodInfo |
#### Methods
| Type and modifiers | Method signature                                                                  | Return type |
| ------------------ | --------------------------------------------------------------------------------- | ----------- |
| **private**        | methodParams(List<? extends javax.lang.model.element.VariableElement> parameters) | String      |
| **public**         | generate                                                                          | String      |

Constructors
============
MethodSignature()
-----------------
*No method description provided*



Fields
======
javax.lang.model.element.ExecutableElement methodInfo
-----------------------------------------------------


Methods
=======
methodParams(List<? extends javax.lang.model.element.VariableElement> parameters)
---------------------------------------------------------------------------------
Form doubled bracket params description

### Parameters

parameters: method params information

### Returns

formed string


generate
--------
Form description from method information

### Returns

method signature string



