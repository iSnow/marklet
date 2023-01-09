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
| **private** | methodParams(List<? extends javax.lang.model.element.VariableElement> parameters) | String      |
| **public**  | toString() **(Override)**                                                         | String      |

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
methodParams(List<? extends javax.lang.model.element.VariableElement> parameters)
---------------------------------------------------------------------------------
Form doubled bracket params description

### Parameters

parameters: method params information

### Returns

formed string


toString()
----------
### Overrides/Implements:
toString() from java.lang.Object

Form description from method information

### Returns

method signature string


