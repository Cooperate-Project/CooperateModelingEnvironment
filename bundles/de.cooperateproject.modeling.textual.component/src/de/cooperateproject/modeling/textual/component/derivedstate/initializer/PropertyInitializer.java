package de.cooperateproject.modeling.textual.component.derivedstate.initializer;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.INITIALIZATION;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.NamedElement;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.component.cmp.Property;
import de.cooperateproject.modeling.textual.component.derivedstate.utils.TypeFeatureFinderSwitch;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * Initializes the derived state of {@link Property} elements.
 */
@Applicability(applicabilities = INITIALIZATION)
public class PropertyInitializer extends AtomicDerivedStateProcessorBase<Property<NamedElement>> {

    /**
     * Instantiates the initializer.
     */
    @SuppressWarnings("unchecked")
    public PropertyInitializer() {
        super((Class<Property<NamedElement>>) (Class<?>) Property.class);
    }

    @Override
    protected void applyTyped(Property<NamedElement> object) {
        if (!object.isSetType()) {
            Optional<EReference> feature = TypeFeatureFinderSwitch.doSwitch(object.getReferencedElement());
            feature.map(f -> object.getReferencedElement().eGet(f, true)).filter(Classifier.class::isInstance)
                    .map(Classifier.class::cast).ifPresent(object::setType);
        }
    }

    @Override
    public Collection<java.lang.Class<? extends EObject>> getRequirements() {
        return Arrays.asList(UMLReferencingElement.class);
    }

}