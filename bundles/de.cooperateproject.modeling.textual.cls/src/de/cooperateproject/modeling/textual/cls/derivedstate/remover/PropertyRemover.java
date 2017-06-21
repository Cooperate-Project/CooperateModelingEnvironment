package de.cooperateproject.modeling.textual.cls.derivedstate.remover;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.CLEANING;

import java.util.Optional;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.uml2.uml.NamedElement;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.Property;
import de.cooperateproject.modeling.textual.cls.derivedstate.utils.TypeFeatureFinderSwitch;
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
        Optional<EReference> feature = TypeFeatureFinderSwitch.doSwitch(object.getReferencedElement());
        if (object.getReferencedElement() != null && feature.map(f -> object.getReferencedElement().eGet(f, true))
                .map(umlValue -> umlValue == object.getType()).orElse(false)) {
            object.eUnset(ClsPackage.Literals.PROPERTY__TYPE);
        }
    }

}
