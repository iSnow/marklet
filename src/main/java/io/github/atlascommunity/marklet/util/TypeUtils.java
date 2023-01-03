package io.github.atlascommunity.marklet.util;

import jdk.javadoc.doclet.DocletEnvironment;

import javax.lang.model.element.*;
import javax.lang.model.util.ElementFilter;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class TypeUtils {

    /**
     * Find all package classes
     *
     * @param root the DocletEnvironment to scan
     */
    public static Set<TypeElement> findPackageClasses(DocletEnvironment root) {
        Set<TypeElement> packageClasses = new LinkedHashSet<>();
        for (PackageElement t : ElementFilter.packagesIn(root.getIncludedElements())) {
            packageClasses.addAll(findPackageClasses(t));
        }
        return packageClasses;
    }

    /**
     * Find all package classes
     *
     * @param t the PackageElement to scan
     */
    public static Set<TypeElement> findPackageClasses(PackageElement t) {
        Set<TypeElement> packageClasses = new LinkedHashSet<>();
        for (Element e : t.getEnclosedElements()) {
            if ((e.getKind().equals (ElementKind.CLASS))
                    || (e.getKind().equals (ElementKind.INTERFACE))){
                packageClasses.add((TypeElement) e);
            }
        }
        return packageClasses;
    }

    /**
     * Find all class constructors
     *
     * @param classElement the class to scan
     */
    public static Set<Element> findClassConstructors(TypeElement classElement) {
        return findInClass(ElementKind.CONSTRUCTOR, classElement);
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
                .collect(Collectors.toSet());
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
                .collect(Collectors.toSet());
    }

    public static Set<Element> findInClass(ElementKind kind, TypeElement classElement) {
        Set<Element> elements = new LinkedHashSet<>();
        for (Element e : classElement.getEnclosedElements()) {
            if (e.getKind().equals(kind)) {
                elements.add(e);
            }
        }
        return elements;
    }
}
