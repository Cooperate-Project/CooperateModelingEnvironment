package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.usecasediagram;

import org.junit.Test;

import de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.CooperateConstraintTestBase;

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
