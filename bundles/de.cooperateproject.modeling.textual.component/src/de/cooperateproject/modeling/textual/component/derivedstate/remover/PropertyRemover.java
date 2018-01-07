package de.cooperateproject.modeling.textual.component.derivedstate.remover;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.CLEANING;

import java.util.Optional;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.uml2.uml.NamedElement;

import de.cooperateproject.modeling.textual.component.cmp.Property;
import de.cooperateproject.modeling.textual.component.derivedstate.utils.TypeFeatureFinderSwitch;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * Removes the derived state for {@link Property} elements.
 */
@Applicability(applicabilities = CLEANING)
public class PropertyRemover extends AtomicDerivedStateProcessorBase<Property<NamedElement>> {

    /**
     * Instantiates the remover.
     */
    @SuppressWarnings("unchecked")
    public PropertyRemover() {
        super((Class<Property<NamedElement>>) (Class<?>) Property.class);
    }

    @Override
    protected void applyTyped(Property<NamedElement> object) {
        Optional<NamedElement> referencedElement = Optional.ofNullable(object.getReferencedElement());
        Optional<EReference> feature = referencedElement.flatMap(TypeFeatureFinderSwitch::doSwitch);

        if (feature.flatMap(f -> referencedElement.map(e -> e.eGet(f, true)))
                .map(umlValue -> umlValue == object.getType()).orElse(false)) {
            object.unsetType();
        } else if (object.getType() == null && undergoesAutomatedIssueResolution(object)) {
            object.setType(null);
        }
    }

}
