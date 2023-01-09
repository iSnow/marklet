Class MethodSignature
=====================
Forms readable method signature

io.github.atlascommunity.marklet.util.MethodSignature Summary
-------
#### Constructors
| Visibility | Signature         |
| ---------- | ----------------- |
| public     | MethodSignature() |
#### Fields
| Type and modifiers                                           | Field name |
| ------------------------------------------------------------ | ---------- |
| **private final javax.lang.model.element.ExecutableElement** | methodInfo |
#### Methods
| Modifiers   | Method signature                                                                  | Return type |
| ----------- | --------------------------------------------------------------------------------- | ----------- |
| **public**  | toString() **(Override)**                                                         | String      |
| **private** | methodParams(List<? extends javax.lang.model.element.VariableElement> parameters) | String      |

Constructors
============
MethodSignature()
-----------------
*No method description provided*


Fields
======
javax.lang.model.element.ExecutableElement methodInfo
-----------------------------------------------------
Method information


Methods
=======
toString()
----------
### Overrides/Implements:
toString() from java.lang.Object

Form description from method information

### Returns

method signature string


methodParams(List<? extends javax.lang.model.element.VariableElement> parameters)
---------------------------------------------------------------------------------
Form doubled bracket params description

### Parameters

parameters: method params information

### Returns

formed string


