package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.ExtensionPoint;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.general.NameHasToBeIDForNonAliasedElementsClassConstraint;

@RunWith(Parameterized.class)
public class NameHasToBeIDForNonAliasedElementsClassConstraintAliasAvailableTest extends CooperateConstraintTestBase {

	@Parameter
	public Class<? extends NamedElement> classToTest;
	
	public NameHasToBeIDForNonAliasedElementsClassConstraintAliasAvailableTest() {
		super(NameHasToBeIDForNonAliasedElementsClassConstraint.class);
	}

    @Parameters(name="{0}")
    public static Collection<Object[]> data() {
    	Collection<Class<? extends NamedElement>> aliasedElements = Arrays.asList(
                org.eclipse.uml2.uml.Class.class, Interface.class, Actor.class, ExtensionPoint.class, UseCase.class);
    	return aliasedElements.stream().map(c -> new Object[] {c}).collect(Collectors.toList());
    }
	
    @Test
    public void testNameIsID() {
    	NamedElement objectToTest = createElementToTest();
    	objectToTest.setName("ABC123");
    	testSuccess(Arrays.asList(objectToTest));
    }
    
    @Test
    public void testNameIsNoID() {
    	NamedElement objectToTest = createElementToTest();
    	objectToTest.setName("ABC 123");
    	testFail(Arrays.asList(objectToTest));
    }
    
    @Test
    public void testNameIsNoIDButAlias() {
    	NamedElement objectToTest = createElementToTest();
    	objectToTest.setName("ABC 123");
    	StringExpression nameExpression = UMLFactory.eINSTANCE.createStringExpression();
    	nameExpression.setName("abc123");
    	objectToTest.setNameExpression(nameExpression);
    	testSuccess(Arrays.asList(objectToTest));
    }

	private NamedElement createElementToTest() {
		Optional<NamedElement> objectToTest = Optional.ofNullable(UMLPackage.eINSTANCE.getEClassifier(classToTest.getSimpleName())).filter(EClass.class::isInstance).map(EClass.class::cast).map(UMLFactory.eINSTANCE::create).filter(NamedElement.class::isInstance).map(NamedElement.class::cast);
		assertTrue(objectToTest.isPresent());
		return objectToTest.get();
	}
}
