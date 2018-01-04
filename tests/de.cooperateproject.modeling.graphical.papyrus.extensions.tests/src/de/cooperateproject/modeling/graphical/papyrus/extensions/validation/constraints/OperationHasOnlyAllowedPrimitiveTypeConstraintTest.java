package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints;

import org.junit.Test;

import de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.general.OperationHasOnlyAllowedPrimitiveTypeConstraint;

public class OperationHasOnlyAllowedPrimitiveTypeConstraintTest extends CooperateConstraintTestBase {

	public OperationHasOnlyAllowedPrimitiveTypeConstraintTest() {
		super(OperationHasOnlyAllowedPrimitiveTypeConstraint.class);
	}

	@Test
    public void testType() {
        testSuccess("operationWithAllowedPrimitveType.uml");
    }
	
	@Test
    public void testNoType() {
        testSuccess("operationWithNoType.uml");
    }
	
	@Test
    public void testWrongType() {
        testFail("operationWithNotAllowedType.uml");
    }
	
}
