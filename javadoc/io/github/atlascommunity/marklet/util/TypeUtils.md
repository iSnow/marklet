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
| **public static**  | findPackageClasses(DocletEnvironment root)              | java.util.Set<javax.lang.model.element.TypeElement>       |
| **public static**  | findClassConstructors(TypeElement classElement)         | java.util.Set<javax.lang.model.element.Element>           |
| **public static**  | findPackageClasses(PackageElement t)                    | java.util.Set<javax.lang.model.element.TypeElement>       |
| **public static**  | findClassMethods(TypeElement classElement)              | java.util.Set<javax.lang.model.element.ExecutableElement> |
| **public static**  | findClassFields(TypeElement classElement)               | java.util.Set<javax.lang.model.element.VariableElement>   |
| **public static**  | findInClass(ElementKind kind, TypeElement classElement) | java.util.Set<javax.lang.model.element.Element>           |

Constructors
============
TypeUtils()
-----------


Methods
=======
findPackageClasses(DocletEnvironment root)
------------------------------------------
Find all package classes

@param root the DocletEnvironment to scan



findClassConstructors(TypeElement classElement)
-----------------------------------------------
Find all class constructors

@param classElement the class to scan



findPackageClasses(PackageElement t)
------------------------------------
Find all package classes

@param t the PackageElement to scan



findClassMethods(TypeElement classElement)
------------------------------------------
Find all class methods

@param classElement the class to scan



findClassFields(TypeElement classElement)
-----------------------------------------
Find all class fields

@param classElement the class to scan



findInClass(ElementKind kind, TypeElement classElement)
-------------------------------------------------------
*No method description provided*




