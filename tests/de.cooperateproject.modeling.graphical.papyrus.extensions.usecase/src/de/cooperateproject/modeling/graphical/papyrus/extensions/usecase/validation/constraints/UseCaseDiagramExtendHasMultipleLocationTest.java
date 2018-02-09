package de.cooperateproject.modeling.graphical.papyrus.extensions.usecase.validation.constraints;

import org.junit.Test;

import de.cooperateproject.modeling.graphical.papyrus.extensions.tests.commons.constraints.CooperateConstraintTestBase;

public class UseCaseDiagramExtendHasMultipleLocationTest extends CooperateConstraintTestBase {

	public UseCaseDiagramExtendHasMultipleLocationTest() {
		super(UseCaseDiagramExtendHasOnlyOneLocation.class);
	}

	@Test 
    public void testUseCaseExtendOnlyOneLocation() {
        testSuccess("ucExtendOneLocation.uml");
    }
    
	@Test 
	public void testUseCaseExtendMultipleLocation() {
	    testFail("ucExtendMultipleLocation.uml");
	}
}
