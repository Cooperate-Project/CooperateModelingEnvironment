package de.cooperateproject.modeling.textual.usecase.derivedstate.calculator;

import org.eclipse.uml2.uml.Classifier;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.usecase.usecase.Generalization;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.AtomicStateProcessorExtensionBase;

public class GeneralizationCalculator extends AtomicStateProcessorExtensionBase<Generalization> {

    public GeneralizationCalculator(Class<Generalization> clazz) {
        super(Generalization.class);
    }

    @Override
    protected Boolean applyTyped(Generalization object) {
        @SuppressWarnings({ "rawtypes", "unchecked" })
        UMLReferencingElement<Classifier> specific = (UMLReferencingElement) object.getSpecific();
        @SuppressWarnings({ "rawtypes", "unchecked" })
        UMLReferencingElement<Classifier> general = (UMLReferencingElement) object.getGeneral();

        Classifier umlSpecific = specific.getReferencedElement();
        Classifier umlGeneral = general.getReferencedElement();

        if (umlSpecific == null || umlGeneral == null) {
            return false;
        }

        org.eclipse.uml2.uml.Generalization umlGeneralization = umlSpecific.getGeneralization(umlGeneral);
        if (umlGeneralization != null) {
            object.setReferencedElement(umlGeneralization);
            return true;
        }

        return false;
    }

}
