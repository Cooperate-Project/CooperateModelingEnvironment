package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints;

import org.junit.Test;

import de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.general.ParameterMustHaveATypeConstraint;

public class ParameterMustHaveATypeConstraintTest extends CooperateConstraintTestBase {

	public ParameterMustHaveATypeConstraintTest() {
		super(ParameterMustHaveATypeConstraint.class);
	}

	@Test
	public void testMissingType() {
		testFail("parameterWithoutType.uml");
	}
	
	@Test
	public void testExistingType() {
		testSuccess("parameterWithType.uml");
	}
	
}
