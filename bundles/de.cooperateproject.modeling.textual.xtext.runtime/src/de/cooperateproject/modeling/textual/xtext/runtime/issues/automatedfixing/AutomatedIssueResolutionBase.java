package de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing;

import org.eclipse.emf.ecore.EObject;

public abstract class AutomatedIssueResolutionBase<T extends EObject> implements IAutomatedIssueResolution {

    private final T problematicElement;

    public AutomatedIssueResolutionBase(T problematicElement) {
        this.problematicElement = problematicElement;
    }

    public T getProblematicElement() {
        return problematicElement;
    }

}
