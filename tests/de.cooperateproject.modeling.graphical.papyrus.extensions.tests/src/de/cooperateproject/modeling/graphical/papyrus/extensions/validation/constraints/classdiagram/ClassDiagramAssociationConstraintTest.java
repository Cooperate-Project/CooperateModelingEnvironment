package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.classdiagram;

import org.junit.Ignore;
import org.junit.Test;

import de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.CooperateConstraintTestBase;

public class ClassDiagramAssociationConstraintTest extends CooperateConstraintTestBase {

	public ClassDiagramAssociationConstraintTest() {
		super(ClassDiagramAssociationConstraint.class);
	}

	@Test 
	public void testAssociationHasName() {
		testFail("associationWithNoName.uml");
	}
	
}
