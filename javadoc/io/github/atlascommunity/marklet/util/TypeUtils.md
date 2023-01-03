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
| **public static**  | findInClass(ElementKind kind, TypeElement classElement) | java.util.Set<javax.lang.model.element.Element>           |
| **public static**  | findClassMethods(TypeElement classElement)              | java.util.Set<javax.lang.model.element.ExecutableElement> |
| **public static**  | findPackageClasses(PackageElement t)                    | java.util.Set<javax.lang.model.element.TypeElement>       |
| **public static**  | findClassFields(TypeElement classElement)               | java.util.Set<javax.lang.model.element.VariableElement>   |
| **public static**  | findClassConstructors(TypeElement classElement)         | java.util.Set<javax.lang.model.element.Element>           |
| **public static**  | findPackageClasses(DocletEnvironment root)              | java.util.Set<javax.lang.model.element.TypeElement>       |

Constructors
============
TypeUtils()
-----------


