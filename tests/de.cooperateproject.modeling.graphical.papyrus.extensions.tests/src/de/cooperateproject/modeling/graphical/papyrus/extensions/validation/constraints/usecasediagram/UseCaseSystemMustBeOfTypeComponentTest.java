package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.usecasediagram;

import org.junit.Test;

import de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.CooperateConstraintTestBase;

public class UseCaseSystemMustBeOfTypeComponentTest extends CooperateConstraintTestBase {

	public UseCaseSystemMustBeOfTypeComponentTest() {
		super(UseCaseSystemMustBeOfTypeComponent.class);
	}

	@Test 
    public void testSystemMustBeOfTypeComponent() {
        testSuccess("ucSystemOfTypeComponent.notation");
    }
    
}
