package de.cooperateproject.modeling.textual.common.derivedstate.initializer;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.INITIALIZATION;

import java.util.Arrays;
import java.util.Collection;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * Initializes the state of {@link Comment} elements.
 */
@Applicability(applicabilities = INITIALIZATION)
public class CommentInitializer extends AtomicDerivedStateProcessorBase<Comment> {

    /**
     * Constructs the processor.
     */
    public CommentInitializer() {
        super(Comment.class);
    }

    @Override
    protected void applyTyped(Comment object) {
        if (StringUtils.isEmpty(object.getBody()) && object.getReferencedElement() != null) {
            object.setBody(object.getReferencedElement().getBody());
        }
    }

    @Override
    public Collection<Class<? extends EObject>> getReplacements() {
        return Arrays.asList(UMLReferencingElement.class);
    }

}
