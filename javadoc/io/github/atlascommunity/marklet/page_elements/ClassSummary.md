Class ClassSummary implements io.github.atlascommunity.marklet.page_elements.ClassPageElement
=============================================================================================
Brief class description

io.github.atlascommunity.marklet.page_elements.ClassSummary Summary
-------
#### Constructors
| Visibility | Signature      |
| ---------- | -------------- |
| public     | ClassSummary() |
#### Fields
| Modifiers         | Field name                                                     | Type                                 |
| ----------------- | -------------------------------------------------------------- | ------------------------------------ |
| **private final** | [classElement](#javaxlangmodelelementtypeelement-classelement) | javax.lang.model.element.TypeElement |
| **private final** | [typeUtils](#javaxlangmodelutiltypes-typeutils)                | javax.lang.model.util.Types          |
| **private final** | [treeUtils](#comsunsourceutildoctrees-treeutils)               | com.sun.source.util.DocTrees         |
#### Methods
| Modifiers          | Method signature                                                                                                                   | Return type |
| ------------------ | ---------------------------------------------------------------------------------------------------------------------------------- | ----------- |
| **public**         | [generate()](#generate)                                                                                                            | String      |
| **private**        | [generateEnumConstantSummary(TypeElement classElement)](#generateenumconstantsummarytypeelement-classelement)                      | String      |
| **private static** | [generateMethodSummary(TypeElement classElement, Types typeUtils)](#generatemethodsummarytypeelement-classelement-types-typeutils) | String      |
| **private static** | [generateFieldSummary(TypeElement classElement)](#generatefieldsummarytypeelement-classelement)                                    | String      |
| **private static** | [generateConstructorSummary(TypeElement classElement)](#generateconstructorsummarytypeelement-classelement)                        | String      |

Fields
======
javax.lang.model.element.TypeElement classElement
-------------------------------------------------
Class information


javax.lang.model.util.Types typeUtils
-------------------------------------
*No description provided*


com.sun.source.util.DocTrees treeUtils
--------------------------------------
*No description provided*


Methods
=======
generate()
----------
### Overrides/Implements:
generate() from io.github.atlascommunity.marklet.page_elements.ClassPageElement



### Returns

markdown string representation of document part


generateEnumConstantSummary(TypeElement classElement)
-----------------------------------------------------


### Parameters

| Name         | Description |
| ------------ | ----------- |
| classElement | the Enum    |

### Returns

markdown string representation of the constants of an Enum


generateMethodSummary(TypeElement classElement, Types typeUtils)
----------------------------------------------------------------


### Returns

markdown string representation of class methods

### Parameters

| Name         | Description               |
| ------------ | ------------------------- |
| classElement | *No description provided* |
| typeUtils    | *No description provided* |

generateFieldSummary(TypeElement classElement)
----------------------------------------------


### Returns

markdown string representation of class fields

### Parameters

| Name         | Description               |
| ------------ | ------------------------- |
| classElement | *No description provided* |

generateConstructorSummary(TypeElement classElement)
----------------------------------------------------


### Returns

markdown string representation of class constructors

### Parameters

| Name         | Description               |
| ------------ | ------------------------- |
| classElement | *No description provided* |

