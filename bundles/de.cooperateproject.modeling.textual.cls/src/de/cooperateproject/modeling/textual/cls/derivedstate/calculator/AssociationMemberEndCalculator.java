package de.cooperateproject.modeling.textual.cls.derivedstate.calculator;

import java.util.Optional;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Property;

import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.AtomicStateProcessorExtensionBase;

/**
 * State calculator for member ends of associations.
 */
public class AssociationMemberEndCalculator extends AtomicStateProcessorExtensionBase<AssociationMemberEnd> {

    /**
     * Constructs the calculator.
     */
    public AssociationMemberEndCalculator() {
        super(AssociationMemberEnd.class);
    }

    @Override
    protected Boolean applyTyped(AssociationMemberEnd object) {
        Optional<Property> umlMemberEnd = getUmlMemberEnd(object);
        if (!umlMemberEnd.isPresent()) {
            return false;
        }
        object.setReferencedElement(umlMemberEnd.get());
        return true;
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

}
