package de.cooperateproject.modeling.textual.xtext.runtime.service.transientstatus;

import java.util.Collection;

import org.eclipse.emf.ecore.EStructuralFeature;

import de.cooperateproject.util.eclipse.ExtensionPointHelper;

/**
 * Transient status provider that delegates to multiple other providers registered via extension point
 * {@link DelegatingTransientStatusProvider#EP_ID}.
 * 
 * The result of the methods to query the transient status will return true if any of the delegates considers the
 * feature to have the queried status.
 */
public class DelegatingTransientStatusProvider implements ITransientStatusProvider {

    private static final String EP_ID = "de.cooperateproject.modeling.textual.xtext.runtime.service.transientstatus";
    private static final String EP_ATTR = "class";

    protected final Collection<ITransientStatusProvider> delegates;

    /**
     * Constructs the provider.
     */
    public DelegatingTransientStatusProvider() {
        this(collectDelegates());
    }

    protected DelegatingTransientStatusProvider(Collection<ITransientStatusProvider> delegates) {
        this.delegates = delegates;
    }

    private static Collection<ITransientStatusProvider> collectDelegates() {
        return ExtensionPointHelper.getExtensions(EP_ID, EP_ATTR, ITransientStatusProvider.class);
    }

    @Override
    public boolean isFeatureConsideredTransient(EStructuralFeature feature) {
        return delegates.stream().anyMatch(delegate -> delegate.isFeatureConsideredTransient(feature));
    }

    @Override
    public boolean isFeatureConsideredNonTransient(EStructuralFeature feature) {
        return delegates.stream().anyMatch(delegate -> delegate.isFeatureConsideredNonTransient(feature));
    }
}
