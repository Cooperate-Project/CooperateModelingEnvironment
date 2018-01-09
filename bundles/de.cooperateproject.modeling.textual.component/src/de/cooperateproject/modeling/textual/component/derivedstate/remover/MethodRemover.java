package de.cooperateproject.modeling.textual.component.derivedstate.remover;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.CLEANING;

import java.util.Optional;

import de.cooperateproject.modeling.textual.component.cmp.Method;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * State remover for {@link Method} elements.
 */
@Applicability(applicabilities = CLEANING)
public class MethodRemover extends AtomicDerivedStateProcessorBase<Method> {

    /**
     * Instantiates the remover.
     */
    public MethodRemover() {
        super(Method.class);
    }

    @Override
    protected void applyTyped(Method object) {
        Optional<org.eclipse.uml2.uml.Operation> umlClassifier = Optional.ofNullable(object.getReferencedElement());
        if (umlClassifier.map(operation -> operation.isAbstract() == object.isAbstract()).orElse(false)) {
            object.unsetAbstract();
        } else if (!object.isSetAbstract() && undergoesAutomatedIssueResolution(object)) {
            object.setAbstract(false);
        }
    }

}