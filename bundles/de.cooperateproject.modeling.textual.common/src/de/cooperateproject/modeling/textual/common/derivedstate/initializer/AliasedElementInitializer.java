package de.cooperateproject.modeling.textual.common.derivedstate.initializer;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.INITIALIZATION;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.StringExpression;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * State initializer for {@link AliasedElement}.
 */
@Applicability(applicabilities = INITIALIZATION)
public class AliasedElementInitializer extends AtomicDerivedStateProcessorBase<AliasedElement> {

    /**
     * Constructs the processor.
     */
    public AliasedElementInitializer() {
        super(AliasedElement.class);
    }

    @Override
    protected void applyTyped(AliasedElement object) {
        if (!object.isSetAlias() && object instanceof UMLReferencingElement) {
            @SuppressWarnings("rawtypes")
            Element umlElement = ((UMLReferencingElement) object).getReferencedElement();
            if (umlElement instanceof NamedElement) {
                Optional.of((NamedElement) umlElement).map(NamedElement::getNameExpression)
                        .map(StringExpression::getName).ifPresent(object::setAlias);
            }
        }
    }

    @Override
    public Collection<Class<? extends EObject>> getRequirements() {
        return Arrays.asList(UMLReferencingElement.class);
    }

}
