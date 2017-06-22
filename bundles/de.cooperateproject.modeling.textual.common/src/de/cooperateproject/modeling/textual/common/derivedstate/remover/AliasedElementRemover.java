package de.cooperateproject.modeling.textual.common.derivedstate.remover;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.CLEANING;

import java.util.Optional;

import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.StringExpression;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * State remover for {@link AliasedElement}.
 */
@Applicability(applicabilities = CLEANING)
public class AliasedElementRemover extends AtomicDerivedStateProcessorBase<AliasedElement> {

    /**
     * Constructs the processor.
     */
    public AliasedElementRemover() {
        super(AliasedElement.class);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void applyTyped(AliasedElement object) {
        if (object instanceof UMLReferencingElement
                && Optional.ofNullable(((UMLReferencingElement<NamedElement>) object).getReferencedElement())
                        .map(NamedElement::getNameExpression).map(StringExpression::getName)
                        .map(alias -> alias.equals(object.getAlias())).orElse(false)) {
            object.eUnset(TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS);
        }
    }

}
