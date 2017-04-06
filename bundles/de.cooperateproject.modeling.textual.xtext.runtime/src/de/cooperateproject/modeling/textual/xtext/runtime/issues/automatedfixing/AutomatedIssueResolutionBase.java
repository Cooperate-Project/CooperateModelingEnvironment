package de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing;

import org.eclipse.emf.ecore.EObject;

public abstract class AutomatedIssueResolutionBase<T extends EObject> implements IAutomatedIssueResolution {

    private final T problematicElement;
    private final IResolvableChecker<T> resolvableChecker;

    public AutomatedIssueResolutionBase(T problematicElement, IResolvableChecker<T> checker) {
        this.problematicElement = problematicElement;
        this.resolvableChecker = checker;
    }

    public T getProblematicElement() {
        return problematicElement;
    }

    public IResolvableChecker<T> getResolvableChecker() {
        return resolvableChecker;
    }

    @Override
    public boolean resolvePossible() {
        return resolvableChecker.isResolvable(getProblematicElement());
    }

}
