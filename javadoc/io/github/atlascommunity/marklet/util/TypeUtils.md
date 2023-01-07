Class TypeUtils
===============


io.github.atlascommunity.marklet.util.TypeUtils Summary
-------
#### Constructors
| Visibility | Signature   |
| ---------- | ----------- |
| **public** | TypeUtils() |
#### Methods
| Type and modifiers | Method signature                                        | Return type                                               |
| ------------------ | ------------------------------------------------------- | --------------------------------------------------------- |
| **public static**  | findClassMethods(TypeElement classElement)              | java.util.Set<javax.lang.model.element.ExecutableElement> |
| **public static**  | findInClass(ElementKind kind, TypeElement classElement) | java.util.Set<javax.lang.model.element.Element>           |
| **public static**  | findClassConstructors(TypeElement classElement)         | java.util.Set<javax.lang.model.element.ExecutableElement> |
| **public static**  | findClassFields(TypeElement classElement)               | java.util.Set<javax.lang.model.element.VariableElement>   |
| **public static**  | findPackageClasses(PackageElement t)                    | java.util.Set<javax.lang.model.element.TypeElement>       |
| **public static**  | findPackageClasses(DocletEnvironment root)              | java.util.Set<javax.lang.model.element.TypeElement>       |

Constructors
============
TypeUtils()
-----------
*No method description provided*



Methods
=======
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


findClassFields(TypeElement classElement)
-----------------------------------------
Find all class fields

### Parameters

classElement: the class to scan


findPackageClasses(PackageElement t)
------------------------------------
Find all package classes

### Parameters

t: the PackageElement to scan


findPackageClasses(DocletEnvironment root)
------------------------------------------
Find all package classes

### Parameters

root: the DocletEnvironment to scan



