package de.cooperateproject.modeling.graphical.papyrus.extensions.usecase.validation.constraints;

import org.junit.Test;

import de.cooperateproject.modeling.graphical.papyrus.extensions.tests.commons.constraints.CooperateConstraintTestBase;

public class UseCaseDiagramAssociationNoNameConstraintTest extends CooperateConstraintTestBase {

	public UseCaseDiagramAssociationNoNameConstraintTest() {
		super(UseCaseDiagramAssociationNoNameConstraint.class);
	}

	@Test 
	public void testAssociationHasName() {
		testFail("ucAssociationWithName.uml");
	}
	
	@Test 
	public void testAssociationWithoutName() {
	    testSuccess("ucAssociationWithoutName.uml");
	}
}
