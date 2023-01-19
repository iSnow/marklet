package io.github.atlascommunity.marklet.util;

import jdk.javadoc.doclet.DocletEnvironment;

import javax.lang.model.element.*;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.ElementFilter;
import javax.lang.model.util.Types;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MarkletTypeUtils {


    /**
     * Find all package classes
     *
     * @param t the PackageElement to scan
     */
    public static Set<TypeElement> findPackageClasses(PackageElement t) {
        return findInPackage(ElementKind.CLASS, t)
                .stream()
                .map((e) -> (TypeElement) e)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }
    /**
     * Find all package interfaces
     *
     * @param t the PackageElement to scan
     */
    public static Set<TypeElement> findPackageInterfaces(PackageElement t) {
        return findInPackage(ElementKind.INTERFACE, t)
                .stream()
                .map((e) -> (TypeElement) e)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    /**
     * Find all package annotations
     *
     * @param t the PackageElement to scan
     */
    public static Set<TypeElement> findPackageAnnotations(PackageElement t) {
        return findInPackage(ElementKind.ANNOTATION_TYPE, t)
                .stream()
                .map((e) -> (TypeElement) e)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }


    /**
     * Find all package enums
     *
     * @param t the PackageElement to scan
     */
    public static Set<TypeElement> findPackageEnums(PackageElement t) {
        return findInPackage(ElementKind.ENUM, t)
                .stream()
                .map((e) -> (TypeElement) e)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    /**
     * Find all package records
     *
     * @param t the PackageElement to scan
     */
    public static Set<TypeElement> findPackageRecords(PackageElement t) {
        return findInPackage(ElementKind.RECORD, t)
                .stream()
                .map((e) -> (TypeElement) e)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    private static Set<Element> findInPackage(ElementKind kind, PackageElement pkg) {
        Set<Element> elements = new LinkedHashSet<>();
        for (Element e : pkg.getEnclosedElements()) {
            if (e.getKind().equals(kind)) {
                elements.add(e);
            }
        }
        return elements;
    }
    /**
     * Find all class constructors
     *
     * @param classElement the class to scan
     */
    public static Set<ExecutableElement> findClassConstructors(TypeElement classElement) {
        return findInClass(ElementKind.CONSTRUCTOR, classElement)
                .stream()
                .map((e) -> (ExecutableElement)e)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    /**
     * Find all class fields
     *
     * @param classElement the class to scan
     */
    public static Set<VariableElement> findClassFields(TypeElement classElement) {
        return findInClass(ElementKind.FIELD, classElement)
                .stream()
                .map((e) -> (VariableElement)e)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    /**
     * Find all class methods
     *
     * @param classElement the class to scan
     */
    public static Set<ExecutableElement> findClassMethods(TypeElement classElement) {
        return findInClass(ElementKind.METHOD, classElement)
                .stream()
                .map((e) -> (ExecutableElement)e)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    /**
     * Find all class annotations
     *
     * @param classElement the class to scan
     */
    public static Set<Element> findClassAnnotations(TypeElement classElement) {
        return findInClass(ElementKind.ANNOTATION_TYPE, classElement)
                .stream()
                .map((e) -> (Element)e)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    private static Set<Element> findInClass(ElementKind kind, TypeElement classElement) {
        Set<Element> elements = new LinkedHashSet<>();
        for (Element e : classElement.getEnclosedElements()) {
            if (e.getKind().equals(kind)) {
                elements.add(e);
            }
        }
        return elements;
    }

    public static List<? extends TypeMirror> findImplementedInterfaces(TypeElement classElement) {
        if (!classElement.getKind().equals(ElementKind.ANNOTATION_TYPE)) {
                    return classElement.getInterfaces();
        }
        return new ArrayList<>();
    }

    public static ExecutableElement findOverriddenMethod(ExecutableElement methodElement, Types typeUtils) {

        String methodSig = new MethodSignature(methodElement).toString();
        TypeElement typeElement = (TypeElement) methodElement.getEnclosingElement();
        for (TypeMirror t : typeUtils.directSupertypes(typeElement.asType())) {
            TypeElement te = (TypeElement) typeUtils.asElement(t);
            if (null != te) {
                Set<ExecutableElement> superclassMethods = findClassMethods(te);
                for (ExecutableElement method : superclassMethods) {
                    String testSig = new MethodSignature(method).toString();
                    if (testSig.equals(methodSig)) {
                        return method;
                    }
                }
            }
        }

        return null;
    }

    public static List<VariableElement> findEnumConstants(TypeElement enumElement) {
        return enumElement
                .getEnclosedElements()
                .stream()
                .filter((e)-> e.getKind().equals(ElementKind.ENUM_CONSTANT))
                .map((e)->(VariableElement)e)
                .collect(Collectors.toList());
    }
}
