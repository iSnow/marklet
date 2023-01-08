Class TypeUtils
===============


io.github.atlascommunity.marklet.util.TypeUtils Summary
-------
#### Constructors
| Visibility | Signature   |
| ---------- | ----------- |
| **public** | TypeUtils() |
#### Methods
| Type and modifiers | Method signature                                        | Return type                                     |
| ------------------ | ------------------------------------------------------- | ----------------------------------------------- |
| **public static**  | findClassFields(TypeElement classElement)               | Set<javax.lang.model.element.VariableElement>   |
| **public static**  | findPackageClasses(DocletEnvironment root)              | Set<javax.lang.model.element.TypeElement>       |
| **public static**  | findPackageClasses(PackageElement t)                    | Set<javax.lang.model.element.TypeElement>       |
| **public static**  | findClassMethods(TypeElement classElement)              | Set<javax.lang.model.element.ExecutableElement> |
| **public static**  | findInClass(ElementKind kind, TypeElement classElement) | Set<javax.lang.model.element.Element>           |
| **public static**  | findClassConstructors(TypeElement classElement)         | Set<javax.lang.model.element.ExecutableElement> |

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


findClassMethods(TypeElement classElement)
------------------------------------------
Find all class methods

### Parameters

classElement: the class to scan


findInClass(ElementKind kind, TypeElement classElement)
-------------------------------------------------------
*No method description provided*


findClassConstructors(TypeElement classElement)
-----------------------------------------------
Find all class constructors

### Parameters

classElement: the class to scan



