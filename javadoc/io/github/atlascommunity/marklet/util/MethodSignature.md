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
| Modifiers | Field name                                                       | Type                                       |
| --------- | ---------------------------------------------------------------- | ------------------------------------------ |
| **final** | [methodInfo](#javaxlangmodelelementexecutableelement-methodinfo) | javax.lang.model.element.ExecutableElement |
#### Methods
| Modifiers          | Method signature                                                                                                                                                | Return type |
| ------------------ | --------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------- |
| **public**         | [toString()](#tostring)                                                                                                                                         | String      |
| **public**         | [toLinkTarget()](#tolinktarget)                                                                                                                                 | String      |
| **private static** | [methodParams(List<? extends javax.lang.model.element.VariableElement> parameters)](#methodparamslist?-extends-javaxlangmodelelementvariableelement-parameters) | String      |

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

| Name       | Description               |
| ---------- | ------------------------- |
| parameters | method params information |

### Returns

formed string


