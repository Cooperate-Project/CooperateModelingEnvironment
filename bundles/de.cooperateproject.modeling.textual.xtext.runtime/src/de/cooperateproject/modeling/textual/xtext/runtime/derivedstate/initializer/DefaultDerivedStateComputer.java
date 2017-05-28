package de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer;

import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;

import com.google.inject.Inject;

public class DefaultDerivedStateComputer implements IDerivedStateComputer {

    @Inject
    private IDerivedStateProcessor derivedStateProcessor;

    @Override
    public void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
        if (preLinkingPhase) {
            return;
        }

        if (resource.getContents().isEmpty()
                || resource.getContents().stream().allMatch(o -> o.eResource() != resource)) {
            // prohibits the derived state calculator from calculating stuff before the contained elements belong to the
            // resource
            return;
        }

        resource.getContents().forEach(derivedStateProcessor::calculateState);
    }

    @Override
    public void discardDerivedState(DerivedStateAwareResource resource) {
        return;
    }

}
