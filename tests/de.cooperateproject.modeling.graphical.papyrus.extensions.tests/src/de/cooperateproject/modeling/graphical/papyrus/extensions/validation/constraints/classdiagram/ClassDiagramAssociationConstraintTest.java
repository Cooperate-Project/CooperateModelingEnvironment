package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.classdiagram;

import org.junit.Test;

import de.cooperateproject.modeling.graphical.papyrus.extensions.tests.commons.constraints.CooperateConstraintTestBase;

public class ClassDiagramAssociationConstraintTest extends CooperateConstraintTestBase {

	public ClassDiagramAssociationConstraintTest() {
		super(ClassDiagramAssociationConstraint.class);
	}

	@Test 
	public void testAssociationWithUnambiguousName() {
		testSuccess("associationWithUnambiguousName.uml");
	}
	@Test 
	public void testAssociationWithAmbiguousName() {
	    testFail("associationWithAmbiguousName.uml");
	}
	
}
