package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints;

import org.junit.Test;

import de.cooperateproject.modeling.graphical.papyrus.extensions.tests.commons.constraints.CooperateConstraintTestBase;
import de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.general.NameHasToBeIDForNonAliasedElementsClassConstraint;

public class NameHasToBeIDForNonAliasedElementsClassConstraintTest extends CooperateConstraintTestBase {

	public NameHasToBeIDForNonAliasedElementsClassConstraintTest() {
		super(NameHasToBeIDForNonAliasedElementsClassConstraint.class);
	}

	@Test
	public void testEmptyName() {
		testSuccess("classWithoutName.uml");
	}
	
	@Test
	public void testNameIsID() {
		testSuccess("associationWithIDName.uml");
	}
	
	@Test
	public void testNameIsNoID() {
		testFail("associationWithNonIDName.uml");
	}
	
	@Test
	public void testNameIsNoIDAndAliasIsIgnored() {
		testFail("associationWithNonIDNameAndIDAlias.uml");
	}
	
}
