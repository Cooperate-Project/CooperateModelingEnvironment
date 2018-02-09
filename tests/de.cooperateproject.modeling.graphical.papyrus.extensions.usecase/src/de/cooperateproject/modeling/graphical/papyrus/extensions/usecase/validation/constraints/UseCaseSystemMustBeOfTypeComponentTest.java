package de.cooperateproject.modeling.graphical.papyrus.extensions.usecase.validation.constraints;

import org.junit.Test;

import de.cooperateproject.modeling.graphical.papyrus.extensions.tests.commons.constraints.CooperateConstraintTestBase;

public class UseCaseSystemMustBeOfTypeComponentTest extends CooperateConstraintTestBase {

	public UseCaseSystemMustBeOfTypeComponentTest() {
		super(UseCaseSystemMustBeOfTypeComponent.class);
	}

	@Test 
    public void testSystemMustBeOfTypeComponent() {
        testSuccess("ucSystemOfTypeComponent.notation");
    }
    
}
