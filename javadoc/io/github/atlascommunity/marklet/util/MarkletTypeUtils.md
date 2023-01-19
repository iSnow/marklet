Class MarkletTypeUtils
======================


io.github.atlascommunity.marklet.util.MarkletTypeUtils Summary
-------
#### Constructors
| Visibility | Signature          |
| ---------- | ------------------ |
| public     | MarkletTypeUtils() |
#### Methods
| Modifiers          | Method signature                                                                                                                               | Return type                                      |
| ------------------ | ---------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------ |
| **public static**  | [findPackageClasses(PackageElement t)](#findpackageclassespackageelement-t)                                                                    | Set<javax.lang.model.element.TypeElement>        |
| **public static**  | [findPackageInterfaces(PackageElement t)](#findpackageinterfacespackageelement-t)                                                              | Set<javax.lang.model.element.TypeElement>        |
| **public static**  | [findPackageAnnotations(PackageElement t)](#findpackageannotationspackageelement-t)                                                            | Set<javax.lang.model.element.TypeElement>        |
| **public static**  | [findPackageEnums(PackageElement t)](#findpackageenumspackageelement-t)                                                                        | Set<javax.lang.model.element.TypeElement>        |
| **public static**  | [findPackageRecords(PackageElement t)](#findpackagerecordspackageelement-t)                                                                    | Set<javax.lang.model.element.TypeElement>        |
| **private static** | [findInPackage(ElementKind kind, PackageElement pkg)](#findinpackageelementkind-kind-packageelement-pkg)                                       | Set<javax.lang.model.element.Element>            |
| **public static**  | [findClassConstructors(TypeElement classElement)](#findclassconstructorstypeelement-classelement)                                              | Set<javax.lang.model.element.ExecutableElement>  |
| **public static**  | [findClassFields(TypeElement classElement)](#findclassfieldstypeelement-classelement)                                                          | Set<javax.lang.model.element.VariableElement>    |
| **public static**  | [findClassMethods(TypeElement classElement)](#findclassmethodstypeelement-classelement)                                                        | Set<javax.lang.model.element.ExecutableElement>  |
| **public static**  | [findClassAnnotations(TypeElement classElement)](#findclassannotationstypeelement-classelement)                                                | Set<javax.lang.model.element.Element>            |
| **private static** | [findInClass(ElementKind kind, TypeElement classElement)](#findinclasselementkind-kind-typeelement-classelement)                               | Set<javax.lang.model.element.Element>            |
| **public static**  | [findImplementedInterfaces(TypeElement classElement)](#findimplementedinterfacestypeelement-classelement)                                      | List<? extends javax.lang.model.type.TypeMirror> |
| **public static**  | [findOverriddenMethod(ExecutableElement methodElement, Types typeUtils)](#findoverriddenmethodexecutableelement-methodelement-types-typeutils) | javax.lang.model.element.ExecutableElement       |
| **public static**  | [findEnumConstants(TypeElement enumElement)](#findenumconstantstypeelement-enumelement)                                                        | List<javax.lang.model.element.VariableElement>   |

Methods
=======
findPackageClasses(PackageElement t)
------------------------------------
Find all package classes

### Parameters

| Name | Description                |
| ---- | -------------------------- |
| t    | the PackageElement to scan |


findPackageInterfaces(PackageElement t)
---------------------------------------
Find all package interfaces

### Parameters

| Name | Description                |
| ---- | -------------------------- |
| t    | the PackageElement to scan |


findPackageAnnotations(PackageElement t)
----------------------------------------
Find all package annotations

### Parameters

| Name | Description                |
| ---- | -------------------------- |
| t    | the PackageElement to scan |


findPackageEnums(PackageElement t)
----------------------------------
Find all package enums

### Parameters

| Name | Description                |
| ---- | -------------------------- |
| t    | the PackageElement to scan |


findPackageRecords(PackageElement t)
------------------------------------
Find all package records

### Parameters

| Name | Description                |
| ---- | -------------------------- |
| t    | the PackageElement to scan |


findInPackage(ElementKind kind, PackageElement pkg)
---------------------------------------------------
*No method description provided*

### Parameters

| Name | Description               |
| ---- | ------------------------- |
| kind | *No description provided* |
| pkg  | *No description provided* |

findClassConstructors(TypeElement classElement)
-----------------------------------------------
Find all class constructors

### Parameters

| Name         | Description       |
| ------------ | ----------------- |
| classElement | the class to scan |


findClassFields(TypeElement classElement)
-----------------------------------------
Find all class fields

### Parameters

| Name         | Description       |
| ------------ | ----------------- |
| classElement | the class to scan |


findClassMethods(TypeElement classElement)
------------------------------------------
Find all class methods

### Parameters

| Name         | Description       |
| ------------ | ----------------- |
| classElement | the class to scan |


findClassAnnotations(TypeElement classElement)
----------------------------------------------
Find all class annotations

### Parameters

| Name         | Description       |
| ------------ | ----------------- |
| classElement | the class to scan |


findInClass(ElementKind kind, TypeElement classElement)
-------------------------------------------------------
*No method description provided*

### Parameters

| Name         | Description               |
| ------------ | ------------------------- |
| kind         | *No description provided* |
| classElement | *No description provided* |

findImplementedInterfaces(TypeElement classElement)
---------------------------------------------------
*No method description provided*

### Parameters

| Name         | Description               |
| ------------ | ------------------------- |
| classElement | *No description provided* |

findOverriddenMethod(ExecutableElement methodElement, Types typeUtils)
----------------------------------------------------------------------
*No method description provided*

### Parameters

| Name          | Description               |
| ------------- | ------------------------- |
| methodElement | *No description provided* |
| typeUtils     | *No description provided* |

findEnumConstants(TypeElement enumElement)
------------------------------------------
*No method description provided*

### Parameters

| Name        | Description               |
| ----------- | ------------------------- |
| enumElement | *No description provided* |

