package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints;

import org.junit.Test;

import de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.general.AttributeMustHaveATypeConstraint;

public class AttributeMustHaveATypeConstraintTest extends CooperateConstraintTestBase {

	public AttributeMustHaveATypeConstraintTest() {
		super(AttributeMustHaveATypeConstraint.class);
	}

	@Test
	public void testMissingType() {
		testFail("attributeWithoutType.uml");
	}
	
	@Test
	public void testExistingType() {
		testSuccess("attributeWithType.uml");
	}
	
	@Test
	public void testNonAttributeProperty() {
		testSuccess("propertyWithoutType.uml");
	}
}
