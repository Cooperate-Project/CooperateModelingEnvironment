package de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing;

import java.util.Optional;
import java.util.function.Function;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;

import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.xtext.runtime.issues.IIssueCodeRegistry;

public abstract class AutomatedIssueResolutionFactoryBase<T extends EObject>
        implements IAutomatedIssueResolutionFactory {

    private static final Logger LOGGER = Logger.getLogger(AutomatedIssueResolutionFactoryBase.class);
    private final String issueId;
    private final IResolvableChecker<T> checker;
    private final Class<T> acceptedType;

    public AutomatedIssueResolutionFactoryBase(String issueId, IResolvableChecker<T> checker, Class<T> acceptedType) {
        this.issueId = issueId;
        this.checker = checker;
        this.acceptedType = acceptedType;
    }

    @Inject
    public void registerIssueCode(IIssueCodeRegistry registry) {
        registry.registerIssueCode(getIssueID());
    }

    @Override
    public String getIssueID() {
        return issueId;
    }

    protected IResolvableChecker<T> getResolvableChecker() {
        return checker;
    }

    @Override
    public boolean resolvePossible(EObject element) {
        Boolean result = delegateTyped(element, checker::isResolvable);
        return result != null && result;
    }

    @Override
    public boolean hasIssue(EObject element) {
        if (!hasCompatibleType(element)) {
            return false;
        }
        Boolean result = delegateTyped(element, this::hasIssueInternal);
        return result != null && result;
    }

    protected abstract boolean hasIssueInternal(T element);

    @Override
    public IAutomatedIssueResolution create(EObject element) throws CreationException {
        return delegateTyped(element, this::createInternal);
    }

    protected abstract IAutomatedIssueResolution createInternal(T element);

    @Override
    public String getResolutionName(EObject element) {
        return delegateTyped(element, this::getResolutionNameInternal);
    }

    protected abstract String getResolutionNameInternal(T element);

    @Override
    public String getIssueDescription(EObject element) {
        return delegateTyped(element, this::getIssueDescriptionInternal);
    }

    protected abstract String getIssueDescriptionInternal(T element);

    @Override
    public IssueLocator getIssueFeature(EObject element) {
        return delegateTyped(element, this::getIssueFeatureInternal);
    }

    protected abstract IssueLocator getIssueFeatureInternal(T element);

    private <R> R delegateTyped(EObject element, Function<T, R> delegate) {
        Optional<T> typedElement = getCompatibleElement(element);
        if (!typedElement.isPresent()) {
            LOGGER.warn("The given element " + element + " does not have the required type "
                    + acceptedType.getSimpleName());
            return null;
        }
        return delegate.apply(typedElement.get());
    }

    protected boolean hasCompatibleType(EObject element) {
        return acceptedType.isInstance(element);
    }

    protected Optional<T> getCompatibleElement(EObject element) {
        if (hasCompatibleType(element)) {
            return Optional.of((T) element);
        }
        return Optional.empty();
    }

}