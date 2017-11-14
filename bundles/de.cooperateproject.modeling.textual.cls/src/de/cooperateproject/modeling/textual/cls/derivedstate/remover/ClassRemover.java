package de.cooperateproject.modeling.textual.cls.derivedstate.remover;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.CLEANING;

import java.util.Optional;

import de.cooperateproject.modeling.textual.cls.cls.Class;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * State remover for {@link Class} elements.
 */
@Applicability(applicabilities = CLEANING)
public class ClassRemover extends AtomicDerivedStateProcessorBase<de.cooperateproject.modeling.textual.cls.cls.Class> {

    /**
     * Instantiates the remover.
     */
    public ClassRemover() {
        super(de.cooperateproject.modeling.textual.cls.cls.Class.class);
    }

    @Override
    protected void applyTyped(Class object) {

        Optional<org.eclipse.uml2.uml.Class> umlClassifier = Optional.ofNullable(object.getReferencedElement());
        if (umlClassifier.map(classifier -> classifier.isAbstract() == object.isAbstract()).orElse(false)) {
            object.unsetAbstract();
        } else if (!object.isSetAbstract() && undergoesAutomatedIssueResolution(object)) {
            object.setAbstract(false);
        }
    }

}
