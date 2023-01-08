Class TypeUtils
===============


io.github.atlascommunity.marklet.util.TypeUtils Summary
-------
#### Constructors
| Visibility | Signature   |
| ---------- | ----------- |
| **public** | TypeUtils() |
#### Methods
| Type and modifiers | Method signature                                        | Return type                                      |
| ------------------ | ------------------------------------------------------- | ------------------------------------------------ |
| **public static**  | findClassFields(TypeElement classElement)               | Set<javax.lang.model.element.VariableElement>    |
| **public static**  | findClassMethods(TypeElement classElement)              | Set<javax.lang.model.element.ExecutableElement>  |
| **public static**  | findPackageClasses(DocletEnvironment root)              | Set<javax.lang.model.element.TypeElement>        |
| **public static**  | findPackageClasses(PackageElement t)                    | Set<javax.lang.model.element.TypeElement>        |
| **public static**  | findImplementedInterfaces(TypeElement classElement)     | List<? extends javax.lang.model.type.TypeMirror> |
| **public static**  | findClassAnnotations(TypeElement classElement)          | Set<javax.lang.model.element.Element>            |
| **public static**  | findClassConstructors(TypeElement classElement)         | Set<javax.lang.model.element.ExecutableElement>  |
| **public static**  | findInClass(ElementKind kind, TypeElement classElement) | Set<javax.lang.model.element.Element>            |

Constructors
============
TypeUtils()
-----------
*No method description provided*



Methods
=======
findClassFields(TypeElement classElement)
-----------------------------------------
Find all class fields

### Parameters

classElement: the class to scan


findClassMethods(TypeElement classElement)
------------------------------------------
Find all class methods

### Parameters

classElement: the class to scan


findPackageClasses(DocletEnvironment root)
------------------------------------------
Find all package classes

### Parameters

root: the DocletEnvironment to scan


findPackageClasses(PackageElement t)
------------------------------------
Find all package classes

### Parameters

t: the PackageElement to scan


findImplementedInterfaces(TypeElement classElement)
---------------------------------------------------
*No method description provided*


findClassAnnotations(TypeElement classElement)
----------------------------------------------
Find all class annotations

### Parameters

classElement: the class to scan


findClassConstructors(TypeElement classElement)
-----------------------------------------------
Find all class constructors

### Parameters

classElement: the class to scan


findInClass(ElementKind kind, TypeElement classElement)
-------------------------------------------------------
*No method description provided*



