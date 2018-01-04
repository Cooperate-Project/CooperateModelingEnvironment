package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.usecasediagram;

import org.junit.Test;

import de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.CooperateConstraintTestBase;

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
