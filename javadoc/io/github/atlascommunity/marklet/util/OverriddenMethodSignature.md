Class OverriddenMethodSignature extends io.github.atlascommunity.marklet.util.MethodSignature
=============================================================================================
Forms readable method signature

io.github.atlascommunity.marklet.util.OverriddenMethodSignature Summary
-------
#### Constructors
| Visibility | Signature                                                                                                        |
| ---------- | ---------------------------------------------------------------------------------------------------------------- |
| public     | OverriddenMethodSignature(javax.lang.model.element.ExecutableElement,javax.lang.model.element.ExecutableElement) |
#### Fields
| Modifiers         | Field name                                                                           | Type                                       |
| ----------------- | ------------------------------------------------------------------------------------ | ------------------------------------------ |
| **private final** | [superClassMethodInfo](#javaxlangmodelelementexecutableelement-superclassmethodinfo) | javax.lang.model.element.ExecutableElement |
#### Methods
| Modifiers   | Method signature                                                                                                                                                | Return type |
| ----------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------- |
| **public**  | [toString()](#tostring)                                                                                                                                         | String      |
| **public**  | [toLinkTarget()](#tolinktarget)                                                                                                                                 | String      |
| **private** | [methodParams(List<? extends javax.lang.model.element.VariableElement> parameters)](#methodparamslist?-extends-javaxlangmodelelementvariableelement-parameters) | String      |

Fields
======
javax.lang.model.element.ExecutableElement superClassMethodInfo
---------------------------------------------------------------
*No description provided*


Methods
=======
toString()
----------
### Overrides/Implements:
toString() from io.github.atlascommunity.marklet.util.MethodSignature

Form description from method information

### Returns

method signature string


toLinkTarget()
--------------
### Overrides/Implements:
toLinkTarget() from io.github.atlascommunity.marklet.util.MethodSignature

*No method description provided*


methodParams(List<? extends javax.lang.model.element.VariableElement> parameters)
---------------------------------------------------------------------------------
### Overrides/Implements:
methodParams(List<? extends javax.lang.model.element.VariableElement> parameters) from io.github.atlascommunity.marklet.util.MethodSignature

Form doubled bracket params description

### Parameters

| Name       | Description               |
| ---------- | ------------------------- |
| parameters | method params information |

### Returns

formed string


