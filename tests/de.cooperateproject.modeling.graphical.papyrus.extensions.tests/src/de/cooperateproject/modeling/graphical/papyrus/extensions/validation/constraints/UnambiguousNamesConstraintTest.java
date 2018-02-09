package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints;

import org.junit.Test;

import de.cooperateproject.modeling.graphical.papyrus.extensions.tests.commons.constraints.CooperateConstraintTestBase;
import de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.general.UnambiguousNamesConstraint;

public class UnambiguousNamesConstraintTest extends CooperateConstraintTestBase {

	public UnambiguousNamesConstraintTest() {
		super(UnambiguousNamesConstraint.class);
	}

	@Test
    public void testAmbiguousNames() {
        testFail("classifierWithUnambiguousName.uml");
    }
	
	@Test
    public void testUnambiguousNames() {
        testFail("classifierWithUnambiguousName.uml");
    }
	
}
