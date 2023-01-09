Class MarkletTypeUtils
======================


io.github.atlascommunity.marklet.util.MarkletTypeUtils Summary
-------
#### Constructors
| Visibility | Signature          |
| ---------- | ------------------ |
| public     | MarkletTypeUtils() |
#### Methods
| Modifiers          | Method signature                                                       | Return type                                      |
| ------------------ | ---------------------------------------------------------------------- | ------------------------------------------------ |
| **public static**  | findPackageClasses(PackageElement t)                                   | Set<javax.lang.model.element.TypeElement>        |
| **public static**  | findClassConstructors(TypeElement classElement)                        | Set<javax.lang.model.element.ExecutableElement>  |
| **public static**  | findPackageClasses(DocletEnvironment root)                             | Set<javax.lang.model.element.TypeElement>        |
| **public static**  | findImplementedInterfaces(TypeElement classElement)                    | List<? extends javax.lang.model.type.TypeMirror> |
| **public static**  | findOverriddenMethod(ExecutableElement methodElement, Types typeUtils) | javax.lang.model.element.ExecutableElement       |
| **public static**  | findClassMethods(TypeElement classElement)                             | Set<javax.lang.model.element.ExecutableElement>  |
| **public static**  | findClassAnnotations(TypeElement classElement)                         | Set<javax.lang.model.element.Element>            |
| **private static** | findInPackage(ElementKind kind, PackageElement pkg)                    | Set<javax.lang.model.element.Element>            |
| **public static**  | findPackageInterfaces(PackageElement t)                                | Set<javax.lang.model.element.TypeElement>        |
| **public static**  | findClassFields(TypeElement classElement)                              | Set<javax.lang.model.element.VariableElement>    |
| **private static** | findInClass(ElementKind kind, TypeElement classElement)                | Set<javax.lang.model.element.Element>            |

Constructors
============
MarkletTypeUtils()
------------------
*No method description provided*


Methods
=======
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


findPackageClasses(DocletEnvironment root)
------------------------------------------
Find all package classes

### Parameters

root: the DocletEnvironment to scan


findImplementedInterfaces(TypeElement classElement)
---------------------------------------------------
*No method description provided*


findOverriddenMethod(ExecutableElement methodElement, Types typeUtils)
----------------------------------------------------------------------
*No method description provided*


findClassMethods(TypeElement classElement)
------------------------------------------
Find all class methods

### Parameters

classElement: the class to scan


findClassAnnotations(TypeElement classElement)
----------------------------------------------
Find all class annotations

### Parameters

classElement: the class to scan


findInPackage(ElementKind kind, PackageElement pkg)
---------------------------------------------------
*No method description provided*


findPackageInterfaces(PackageElement t)
---------------------------------------
Find all package interfaces

### Parameters

t: the PackageElement to scan


findClassFields(TypeElement classElement)
-----------------------------------------
Find all class fields

### Parameters

classElement: the class to scan


findInClass(ElementKind kind, TypeElement classElement)
-------------------------------------------------------
*No method description provided*


