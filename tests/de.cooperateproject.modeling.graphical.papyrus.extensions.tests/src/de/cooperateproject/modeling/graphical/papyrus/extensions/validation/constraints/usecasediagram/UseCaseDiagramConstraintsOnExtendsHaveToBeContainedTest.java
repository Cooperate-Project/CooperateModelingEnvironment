package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.usecasediagram;

import org.junit.Test;

import de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.CooperateConstraintTestBase;

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
