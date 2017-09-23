package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints;

import org.junit.Test;

import de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.general.CommentOnlyAllowedForCommentableElementsConstraint;

public class CommentOnlyAllowedForCommentableElementsConstraintFailTest extends CooperateConstraintTestBase {

	public CommentOnlyAllowedForCommentableElementsConstraintFailTest() {
		super(CommentOnlyAllowedForCommentableElementsConstraint.class);
	}
	
	@Test
	public void testUnsupportedElement() {
		testFail("commentForOperation.uml");
	}

}
