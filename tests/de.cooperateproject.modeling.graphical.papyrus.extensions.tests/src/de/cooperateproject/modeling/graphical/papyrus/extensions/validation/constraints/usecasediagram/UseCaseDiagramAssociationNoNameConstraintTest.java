package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.usecasediagram;

import org.junit.Test;

import de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.CooperateConstraintTestBase;

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
