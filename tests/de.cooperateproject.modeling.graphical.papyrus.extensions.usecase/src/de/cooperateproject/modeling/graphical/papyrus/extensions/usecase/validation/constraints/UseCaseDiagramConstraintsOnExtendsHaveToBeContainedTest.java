package de.cooperateproject.modeling.graphical.papyrus.extensions.usecase.validation.constraints;

import org.junit.Test;

import de.cooperateproject.modeling.graphical.papyrus.extensions.tests.commons.constraints.CooperateConstraintTestBase;

public class UseCaseDiagramConstraintsOnExtendsHaveToBeContainedTest extends CooperateConstraintTestBase {

	public UseCaseDiagramConstraintsOnExtendsHaveToBeContainedTest() {
		super(UseCaseDiagramConstraintsOnExtendsHaveToBeContained.class);
	}

	@Test 
    public void testExtendContainsConstraint() {
        testSuccess("ucExtendContainsConstraint.uml");
    }
	@Test 
	public void testConstraintNotContainedInExtend() {
	    testFail("ucExtendConstraintNotContained.uml");
	}
    
}
