Class FieldSignature
====================
Creates readable field signature

io.github.atlascommunity.marklet.util.FieldSignature Summary
-------
#### Constructors
| Visibility | Signature        |
| ---------- | ---------------- |
| public     | FieldSignature() |
#### Fields
| Modifiers | Field name                                                   | Type                                     |
| --------- | ------------------------------------------------------------ | ---------------------------------------- |
| **final** | [fieldInfo](#javaxlangmodelelementvariableelement-fieldinfo) | javax.lang.model.element.VariableElement |
#### Methods
| Modifiers          | Method signature                                                                                                                | Return type |
| ------------------ | ------------------------------------------------------------------------------------------------------------------------------- | ----------- |
| **public**         | [toString()](#tostring)                                                                                                         | String      |
| **public**         | [toLinkTarget()](#tolinktarget)                                                                                                 | String      |
| **public**         | [modifiersToString()](#modifierstostring)                                                                                       | String      |
| **public**         | [getName()](#getname)                                                                                                           | String      |
| **public**         | [typeToString()](#typetostring)                                                                                                 | String      |
| **private static** | [fieldModifiers(Set<javax.lang.model.element.Modifier> parameters)](#fieldmodifierssetjavaxlangmodelelementmodifier-parameters) | String      |

Fields
======
javax.lang.model.element.VariableElement fieldInfo
--------------------------------------------------
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


modifiersToString()
-------------------
*No method description provided*


getName()
---------
*No method description provided*


typeToString()
--------------
*No method description provided*


fieldModifiers(Set<javax.lang.model.element.Modifier> parameters)
-----------------------------------------------------------------
Form doubled bracket params description

### Parameters

| Name       | Description               |
| ---------- | ------------------------- |
| parameters | method params information |

### Returns

formed string


