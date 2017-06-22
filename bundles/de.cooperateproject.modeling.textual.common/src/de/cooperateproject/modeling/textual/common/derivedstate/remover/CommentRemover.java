package de.cooperateproject.modeling.textual.common.derivedstate.remover;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.CLEANING;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * Removes the state of {@link Comment} elements.
 */
@Applicability(applicabilities = CLEANING)
public class CommentRemover extends AtomicDerivedStateProcessorBase<Comment> {

    /**
     * Instantiates the processor.
     */
    public CommentRemover() {
        super(Comment.class);
    }

    @Override
    protected void applyTyped(Comment object) {
        if (object.getReferencedElement() != null) {
            object.eUnset(TextualCommonsPackage.Literals.COMMENT__BODY);
        }
    }

    @Override
    public Collection<Class<? extends EObject>> getReplacements() {
        return Arrays.asList(UMLReferencingElement.class);
    }

}
