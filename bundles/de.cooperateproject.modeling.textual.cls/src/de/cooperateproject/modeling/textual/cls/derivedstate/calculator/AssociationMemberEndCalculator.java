package de.cooperateproject.modeling.textual.cls.derivedstate.calculator;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Property;

import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;

/**
 * State calculator for member ends of associations.
 */
@Applicability(applicabilities = DerivedStateProcessorApplicability.CALCULATION)
public class AssociationMemberEndCalculator extends AtomicDerivedStateProcessorBase<AssociationMemberEnd> {

    /**
     * Constructs the calculator.
     */
    public AssociationMemberEndCalculator() {
        super(AssociationMemberEnd.class);
    }

    @Override
    protected void applyTyped(AssociationMemberEnd object) {
        Optional<Property> umlMemberEnd = getUmlMemberEnd(object);
        if (!umlMemberEnd.isPresent()) {
            return;
        }
        object.setReferencedElement(umlMemberEnd.get());
        object.setName(umlMemberEnd.get().getName());
        return;
    }

    private static Optional<Property> getUmlMemberEnd(AssociationMemberEnd object) {
        int index = object.getAssociation().getMemberEnds().indexOf(object);
        if (object.getAssociation().getMemberEnds().size() == 2) {
            index = Math.abs(index - 1);
        }
        Association umlAssociation = object.getAssociation().getReferencedElement();
        if (umlAssociation == null || umlAssociation.getMemberEnds().size() <= index) {
            return Optional.empty();
        }
        return Optional.of(umlAssociation.getMemberEnds().get(index));
    }

    @Override
    public Collection<Class<? extends EObject>> getReplacements() {
        return Arrays.asList(UMLReferencingElement.class);
    }

}
