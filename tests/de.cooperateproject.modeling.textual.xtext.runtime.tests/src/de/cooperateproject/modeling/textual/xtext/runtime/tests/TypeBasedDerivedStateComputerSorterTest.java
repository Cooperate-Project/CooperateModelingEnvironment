package de.cooperateproject.modeling.textual.xtext.runtime.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.TypeBasedDerivedStateComputerSorter;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.IDerivedStateComputerSorter;

public class TypeBasedDerivedStateComputerSorterTest {

    private int objectCreationIndex;

    @Before
    public void setup() {
        objectCreationIndex = 0;
    }

    @Test
    public void testNoChanges() {
        IDerivedStateComputerSorter subject = new TypeBasedDerivedStateComputerSorter(Collections.emptyList());
        List<EObject> expected = Arrays.asList(createEAttribute(), createEAttribute(), createEAttribute(),
                createEAttribute());
        List<EObject> actual = new ArrayList<>(expected);
        actual.sort(subject);
        assertEquals(expected, actual);
    }

    @Test
    public void testPrioritizedTypesBeforeLowerTypes() {
        List<EClass> typeOrder = Arrays.asList(EcorePackage.Literals.ECLASS, EcorePackage.Literals.EATTRIBUTE);
        IDerivedStateComputerSorter subject = new TypeBasedDerivedStateComputerSorter(typeOrder);
        List<ENamedElement> input = Arrays.asList(createEAttribute(), createEClass(), createEAttribute(),
                createEClass());
        List<ENamedElement> actual = new ArrayList<>(input);
        actual.sort(subject);

        assertCorrectOrder(typeOrder, actual);
    }

    @Test
    @Ignore
    public void testPrioritizedTypesBeforeOthers() {
        List<EClass> typeOrder = Arrays.asList(EcorePackage.Literals.ECLASS);
        IDerivedStateComputerSorter subject = new TypeBasedDerivedStateComputerSorter(typeOrder);
        List<ENamedElement> input = Arrays.asList(createEAttribute(), createEClass(), createEAttribute(),
                createEClass());
        List<ENamedElement> actual = new ArrayList<>(input);
        actual.sort(subject);

        assertCorrectOrder(typeOrder, actual);
    }

    private static void assertCorrectOrder(List<EClass> typeOrder, List<ENamedElement> actual) {
        int previousOrderNumber = Integer.MIN_VALUE;
        for (ENamedElement actualObject : actual) {
            int currentOrderNumber = findMatchingIndex(typeOrder, actualObject);
            assertFalse(
                    "The object " + actualObject.getName()
                            + " should be located before the current position. The list looks like follows: "
                            + actual.stream().map(ENamedElement::getName).collect(Collectors.joining(", ", "(", ")")),
                    currentOrderNumber < previousOrderNumber);
            previousOrderNumber = currentOrderNumber;
        }
    }

    private static int findMatchingIndex(List<EClass> typeOrder, EObject actual) {
        for (int i = 0; i < typeOrder.size(); ++i) {
            if (typeOrder.get(i).isSuperTypeOf(actual.eClass())) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }

    private ENamedElement createEClass() {
        return createElement(EcorePackage.Literals.ECLASS);
    }

    private ENamedElement createEAttribute() {
        return createElement(EcorePackage.Literals.EATTRIBUTE);
    }

    private ENamedElement createElement(EClass eclass) {
        ENamedElement element = (ENamedElement) EcoreFactory.eINSTANCE.create(eclass);
        element.setName(Integer.toString(objectCreationIndex++));
        return element;
    }

}
