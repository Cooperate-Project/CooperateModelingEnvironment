package de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing;

import org.eclipse.emf.ecore.EObject;

public abstract class IssueRevalidatingAutomatedIssueResolutionFactoryBase<T extends EObject>
        extends AutomatedIssueResolutionFactoryBase<T> {

    protected class IssueRevalidationDelegate implements IAutomatedIssueResolution {
        private final IAutomatedIssueResolution delegate;
        private final EObject element;

        protected IssueRevalidationDelegate(IAutomatedIssueResolution delegate, EObject element) {
            this.delegate = delegate;
            this.element = element;
        }

        @Override
        public boolean resolvePossible() {
            return delegate.resolvePossible();
        }

        @Override
        public void resolve() {
            if (hasIssue(element) && resolvePossible()) {
                delegate.resolve();
            }
        }

    }

    public IssueRevalidatingAutomatedIssueResolutionFactoryBase(String issueId, IResolvableChecker<T> checker,
            Class<T> acceptedType) {
        super(issueId, checker, acceptedType);
    }

    @Override
    public IAutomatedIssueResolution create(EObject element) throws CreationException {
        return new IssueRevalidationDelegate(super.create(element), element);
    }
}