package de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.resource.DerivedStateAwareResource;

import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.xtext.runtime.service.transientstatus.ITransientStatusProvider;

/**
 * State-aware resource that handles the state initialization as required by {@link IDerivedStateProcessor}.
 * 
 * Changes regarding the {@link DerivedStateAwareResource} are:
 * <li>Call of {@link IDerivedStateProcessor#initState(org.eclipse.emf.ecore.resource.Resource)} at first loading of
 * contents</li>
 * <li>The resource fixes the handling of transient features regarding linking behavior.</li>
 */
public class InitializingStateAwareResource extends DerivedStateAwareResource {

    @Inject
    private IDerivedStateProcessor derivedStateProcessor;

    @Inject
    private ITransientStatusProvider transientStatusProvider;

    private volatile boolean firstTimeInitialization = false;

    @Override
    public void installDerivedState(boolean preIndexingPhase) {
        if (!doGetContents().stream().allMatch(InitializingStateAwareResource::hasResource)) {
            // this method might be called before all EObjects have been properly assigned to a resource. This causes
            // heavy problems when trying to resolve cross references. In all tested cases, the state installation can
            // be skipped to prevent further issues.
            return;
        }
        if (!firstTimeInitialization) {
            boolean priorValue = isInitializing;
            isInitializing = true;
            try {
                doGetContents().forEach(derivedStateProcessor::initState);
                firstTimeInitialization = true;
            } finally {
                isInitializing = priorValue;
            }
        }
        super.installDerivedState(preIndexingPhase);
    }

    private static boolean hasResource(EObject o) {
        return o.eResource() != null;
    }

    @Override
    protected boolean isPotentialLazyCrossReference(EStructuralFeature feature) {
        return !feature.isDerived() && !isFeatureConsideredTransient(feature) && feature instanceof EReference
                && ((EReference) feature).isResolveProxies();
    }

    private boolean isFeatureConsideredTransient(EStructuralFeature feature) {
        return (feature.isTransient() && !transientStatusProvider.isFeatureConsideredNonTransient(feature))
                || transientStatusProvider.isFeatureConsideredTransient(feature);
    }
}
