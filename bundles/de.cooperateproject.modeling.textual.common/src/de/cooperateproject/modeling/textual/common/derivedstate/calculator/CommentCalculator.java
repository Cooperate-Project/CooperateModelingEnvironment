package de.cooperateproject.modeling.textual.common.derivedstate.calculator;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.xtext.scoping.IScope;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IGlobalScopeTypeQueryProvider;

/**
 * State calculation for comments.
 */
@Applicability(applicabilities = DerivedStateProcessorApplicability.CALCULATION)
public class CommentCalculator extends AtomicDerivedStateProcessorBase<Comment> {

    @Inject
    private IGlobalScopeTypeQueryProvider globalScopeProvider;

    /**
     * Constructs the calculator.
     */
    public CommentCalculator() {
        super(Comment.class);
    }

    @Override
    protected void applyTyped(Comment object) {
        UMLReferencingElement<?> realElement = object.getCommentedElement();
        if (realElement != null) {
            Element umlCommentedElement = realElement.getReferencedElement();

            IScope candidates = globalScopeProvider.queryScope(object.eResource(), true, UMLPackage.Literals.COMMENT,
                    c -> ((org.eclipse.uml2.uml.Comment) c.getEObjectOrProxy()).getAnnotatedElements()
                            .contains(umlCommentedElement)
                            && ((org.eclipse.uml2.uml.Comment) c.getEObjectOrProxy()).getBody()
                                    .equals(object.getBody()));
            Iterable<org.eclipse.uml2.uml.Comment> typedCandidates = Iterables.transform(candidates.getAllElements(),
                    e -> (org.eclipse.uml2.uml.Comment) e.getEObjectOrProxy());
            if (Iterables.size(typedCandidates) == 1) {
                object.setReferencedElement(Iterables.getFirst(typedCandidates, null));
                return;
            }
        }
    }

    @Override
    public Collection<Class<? extends EObject>> getReplacements() {
        return Arrays.asList(UMLReferencingElement.class);
    }

}
