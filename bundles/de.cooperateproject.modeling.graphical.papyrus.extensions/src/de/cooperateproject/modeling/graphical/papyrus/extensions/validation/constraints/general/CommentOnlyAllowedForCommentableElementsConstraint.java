package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.general;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.UseCase;

/**
 * Constraint ensuring that a comment is only about commentable elements.
 */
public class CommentOnlyAllowedForCommentableElementsConstraint extends CooperateConstraintBase<Comment> {

    private static final Collection<Class<? extends Element>> COMMENTABLE_ELEMENTS = Arrays.asList(
            org.eclipse.uml2.uml.Class.class, Interface.class, Association.class, Actor.class, UseCase.class,
            Component.class);

    /**
     * Constructs the constraint.
     */
    public CommentOnlyAllowedForCommentableElementsConstraint() {
        super(Comment.class);
    }

    @Override
    protected boolean validateCooperateModel(IValidationContext ctx, Comment target) {
        return target.getAnnotatedElements().stream()
                .allMatch(commentable -> COMMENTABLE_ELEMENTS.stream().anyMatch(clz -> clz.isInstance(commentable)));
    }

}
