package de.cooperateproject.modeling.graphical.papyrus.extensions.usecase.validation.constraints;

import org.junit.Ignore;
import org.junit.Test;

import de.cooperateproject.modeling.graphical.papyrus.extensions.tests.commons.constraints.CooperateConstraintTestBase;

public class UseCaseDiagramConditionAvailableForMultipleExtensionsTest extends CooperateConstraintTestBase {

	public UseCaseDiagramConditionAvailableForMultipleExtensionsTest() {
		super(UseCaseDiagramConditionAvailableForMultipleExtensions.class);
	}

	@Test @Ignore
    public void testMultipleExtensions() {
        testSuccess("ucMultipleExtensions.uml");
    }
    
	/*@Test 
	public void testUseCaseExtendMultipleLocation() {
	    testFail("ucExtendMultipleLocation.uml");
	}*/
}
