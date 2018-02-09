package de.cooperateproject.modeling.graphical.papyrus.extensions.usecase.validation.constraints;

import org.junit.Test;

import de.cooperateproject.modeling.graphical.papyrus.extensions.tests.commons.constraints.CooperateConstraintTestBase;

public class UseCaseDiagramConditionAvailableForMultipleExtensionsTest extends CooperateConstraintTestBase {

	public UseCaseDiagramConditionAvailableForMultipleExtensionsTest() {
		super(UseCaseDiagramConditionAvailableForMultipleExtensions.class);
	}

	@Test
    public void testMultipleExtensions() {
		testFail("ucMultipleExtensionsWithoutConditions.uml");
    }
	
	@Test
    public void testMultipleExtensionsWithCondition() {
		testSuccess("ucMultipleExtensionsWithCondition.uml");
    }

}
