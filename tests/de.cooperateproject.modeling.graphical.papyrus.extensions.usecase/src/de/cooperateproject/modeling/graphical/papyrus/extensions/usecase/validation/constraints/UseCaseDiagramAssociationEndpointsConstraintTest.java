package de.cooperateproject.modeling.graphical.papyrus.extensions.usecase.validation.constraints;

import org.junit.Test;

import de.cooperateproject.modeling.graphical.papyrus.extensions.tests.commons.constraints.CooperateConstraintTestBase;
import de.cooperateproject.modeling.graphical.papyrus.extensions.usecase.validation.constraints.UseCaseDiagramAssociationEndpointsConstraint;

public class UseCaseDiagramAssociationEndpointsConstraintTest extends CooperateConstraintTestBase {

	public UseCaseDiagramAssociationEndpointsConstraintTest() {
		super(UseCaseDiagramAssociationEndpointsConstraint.class);
	}

	@Test 
    public void testAssociationWrongEndpoints() {
        testFail("ucAssociationWrongEndpoints.uml");
    }
    
    @Test 
    public void testAssociationWithCorrectEndpoints() {
        testSuccess("ucAssociationEndpoints.uml");
    }
}
