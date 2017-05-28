package de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.DerivedStateAwareResource;

import com.google.inject.Inject;

public class InitializingStateAwareResource extends DerivedStateAwareResource {

    @Inject
    private IDerivedStateProcessor derivedStateProcessor;

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

}
