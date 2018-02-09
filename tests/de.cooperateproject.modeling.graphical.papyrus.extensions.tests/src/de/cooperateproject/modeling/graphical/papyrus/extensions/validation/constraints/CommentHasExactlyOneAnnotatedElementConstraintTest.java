package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints;

import org.junit.Test;

import de.cooperateproject.modeling.graphical.papyrus.extensions.tests.commons.constraints.CooperateConstraintTestBase;
import de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.general.CommentHasExactlyOneAnnotatedElementConstraint;

public class CommentHasExactlyOneAnnotatedElementConstraintTest extends CooperateConstraintTestBase {

	public CommentHasExactlyOneAnnotatedElementConstraintTest() {
		super(CommentHasExactlyOneAnnotatedElementConstraint.class);
	}

	@Test
	public void testSingleAnnotatedElement() {
		testSuccess("commentForClass.uml");
	}
	
	@Test
	public void testNoAnnotatedElement() {
		testFail("commentWithoutElement.uml");
	}
	
	@Test
	public void testMultipleAnnotatedElements() {
		testFail("commentWithMultipleElements.uml");
	}
}
