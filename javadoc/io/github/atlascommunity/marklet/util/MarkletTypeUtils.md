Class MarkletTypeUtils
======================


io.github.atlascommunity.marklet.util.MarkletTypeUtils Summary
-------
#### Constructors
| Visibility | Signature          |
| ---------- | ------------------ |
| public     | MarkletTypeUtils() |
#### Methods
| Modifiers         | Method signature                                                       | Return type                                      |
| ----------------- | ---------------------------------------------------------------------- | ------------------------------------------------ |
| **public static** | findClassMethods(TypeElement classElement)                             | Set<javax.lang.model.element.ExecutableElement>  |
| **public static** | findPackageClasses(PackageElement t)                                   | Set<javax.lang.model.element.TypeElement>        |
| **public static** | findClassConstructors(TypeElement classElement)                        | Set<javax.lang.model.element.ExecutableElement>  |
| **public static** | findClassAnnotations(TypeElement classElement)                         | Set<javax.lang.model.element.Element>            |
| **public static** | findInClass(ElementKind kind, TypeElement classElement)                | Set<javax.lang.model.element.Element>            |
| **public static** | findImplementedInterfaces(TypeElement classElement)                    | List<? extends javax.lang.model.type.TypeMirror> |
| **public static** | findClassFields(TypeElement classElement)                              | Set<javax.lang.model.element.VariableElement>    |
| **public static** | findPackageClasses(DocletEnvironment root)                             | Set<javax.lang.model.element.TypeElement>        |
| **public static** | findOverriddenMethod(ExecutableElement methodElement, Types typeUtils) | javax.lang.model.element.ExecutableElement       |

Constructors
============
MarkletTypeUtils()
------------------
*No method description provided*


Methods
=======
findClassMethods(TypeElement classElement)
------------------------------------------
Find all class methods

### Parameters

classElement: the class to scan


findPackageClasses(PackageElement t)
------------------------------------
Find all package classes

### Parameters

t: the PackageElement to scan


findClassConstructors(TypeElement classElement)
-----------------------------------------------
Find all class constructors

### Parameters

classElement: the class to scan


findClassAnnotations(TypeElement classElement)
----------------------------------------------
Find all class annotations

### Parameters

classElement: the class to scan


findInClass(ElementKind kind, TypeElement classElement)
-------------------------------------------------------
*No method description provided*


findImplementedInterfaces(TypeElement classElement)
---------------------------------------------------
*No method description provided*


findClassFields(TypeElement classElement)
-----------------------------------------
Find all class fields

### Parameters

classElement: the class to scan


findPackageClasses(DocletEnvironment root)
------------------------------------------
Find all package classes

### Parameters

root: the DocletEnvironment to scan


findOverriddenMethod(ExecutableElement methodElement, Types typeUtils)
----------------------------------------------------------------------
*No method description provided*


