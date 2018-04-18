package de.cooperateproject.modeling.textual.component.derivedstate.initializer;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.INITIALIZATION;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.cooperateproject.modeling.textual.common.util.UMLReferencingElementFinder;
import de.cooperateproject.modeling.textual.component.component.Classifier;
import de.cooperateproject.modeling.textual.component.component.ClassifierRelation;
import de.cooperateproject.modeling.textual.component.component.Generalization;
import de.cooperateproject.modeling.textual.component.component.Interface;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * Initializes the state of {@link Generalization} elements.
 * @param <LeftUMLType>
 */
@Applicability(applicabilities = INITIALIZATION)
public class GeneralizationInitializer extends AtomicDerivedStateProcessorBase<Generalization> {

    /**
     * Instantiates the initializer.
     */
    public GeneralizationInitializer() {
        super(Generalization.class);
    }

    @Override
    protected void applyTyped(Generalization object) {

        if (object.getReferencedElement() != null) {
            org.eclipse.uml2.uml.Generalization umlGeneralization = object.getReferencedElement();
            org.eclipse.uml2.uml.Classifier specific = umlGeneralization.getSpecific();
            org.eclipse.uml2.uml.Classifier general = umlGeneralization.getGeneral();
            
            UMLReferencingElementFinder finder = UMLReferencingElementFinder.create(EcoreUtil.getRootContainer(object));

            if (object.getLeftClassifier() == null) {
                Optional<Interface> leftElement = finder.findElement(specific,
                        Interface.class);
                leftElement.ifPresent(object::setLeftClassifier);
            }

            if (object.getRightClassifier() == null) {
                Optional<Interface> rightElement = finder.findElement(general,
                        Interface.class);
                rightElement.ifPresent(object::setRightClassifier);
            }
        }
    }


    @Override
    public Collection<Class<? extends EObject>> getReplacements() {
        return Arrays.asList(ClassifierRelation.class);
    }
    
    /**
     * @return The type of the left and right features.
     */
    @SuppressWarnings({ "unchecked", "squid:S1452" })
    static Class<Classifier<? extends org.eclipse.uml2.uml.Classifier>> getQueryClass() {
        return (Class<Classifier<? extends org.eclipse.uml2.uml.Classifier>>) (Class<?>) Classifier.class;
    }

}

