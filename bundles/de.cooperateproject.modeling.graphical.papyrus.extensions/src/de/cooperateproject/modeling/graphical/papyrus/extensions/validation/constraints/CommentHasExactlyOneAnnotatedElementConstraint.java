package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints;

import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Comment;

/**
 * Constraint ensuring that a comment has exactly one annotated element.
 */
public class CommentHasExactlyOneAnnotatedElementConstraint extends CooperateConstraintBase<Comment> {

    /**
     * Constructs the constraint.
     */
    public CommentHasExactlyOneAnnotatedElementConstraint() {
        super(Comment.class);
    }

    @Override
    protected boolean validateCooperateModel(IValidationContext ctx, Comment target) {
        return target.getAnnotatedElements().size() == 1;
    }

}
