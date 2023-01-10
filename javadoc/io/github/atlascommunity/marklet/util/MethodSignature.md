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
| Modifiers | Field name | Type                                       |
| --------- | ---------- | ------------------------------------------ |
| **final** | methodInfo | javax.lang.model.element.ExecutableElement |
#### Methods
| Modifiers   | Method signature                                                                                                                                                | Return type |
| ----------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------- |
| **public**  | [toString()](#tostring)                                                                                                                                         | String      |
| **public**  | [toLinkTarget()](#tolinktarget)                                                                                                                                 | String      |
| **private** | [methodParams(List<? extends javax.lang.model.element.VariableElement> parameters)](#methodparamslist?-extends-javaxlangmodelelementvariableelement-parameters) | String      |

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


toLinkTarget()
--------------
*No method description provided*


methodParams(List<? extends javax.lang.model.element.VariableElement> parameters)
---------------------------------------------------------------------------------
Form doubled bracket params description

### Parameters

parameters: method params information

### Returns

formed string


