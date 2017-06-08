package de.cooperateproject.modeling.textual.xtext.runtime.generator;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.stream.StreamSupport;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;

import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * Base class for derived state computers.
 * 
 * The computer provides abilities to install a derived state as well as simulating a reload event by discarding certain
 * states.
 */
public abstract class AbstractDerivedStateGenerator implements IDerivedStateComputer {

    @Inject
    @Named(IDerivedStateElementProcessor.DERIVED_STATE_PROCESSOR_MAIN_PROCESSOR)
    private IDerivedStateElementProcessor derivedStateElementProcessor;

    @Override
    public void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
        if (preLinkingPhase) {
            return;
        }

        if (resource.getContents().isEmpty() || resource.getContents().get(0).eResource() != resource) {
            // prohibits the derived state calculator from calculating stuff before the contained elements belong to the
            // resource
            return;
        }

        EObject rootObject = resource.getContents().get(0);
        installDerivedState(rootObject);
    }

    /**
     * Installs the derived state as described in {@link #installDerivedState(DerivedStateAwareResource, boolean)} for
     * the given object.
     * 
     * @param object
     *            The object into which the derived state shall be installed.
     */
    public void installDerivedState(EObject object) {
        executeForAllContents(object, derivedStateElementProcessor::processElement);
    }

    @Override
    public void discardDerivedState(DerivedStateAwareResource resource) {
        // intentionally left blank
    }

    /**
     * @return A comparator that orders the content before installing or removing the state.
     */
    protected abstract Comparator<EObject> getContentComparator();

    /**
     * Simulates the reloading of a resource by discarding specific states that are not recalculated automatically.
     * 
     * This differs from {@link #discardDerivedState(DerivedStateAwareResource)} because not all states are removed but
     * only a subset of the state. After running the state installation again, the effect should, however, be the same.
     * 
     * @param object
     *            The object for which a resource reload is simulated.
     */
    public void simulateReloadingResource(EObject object) {
        executeForAllContents(object, derivedStateElementProcessor::simulateReload);
    }

    private void executeForAllContents(EObject object, Consumer<EObject> function) {
        StreamSupport.stream(Spliterators.spliteratorUnknownSize(object.eAllContents(), Spliterator.ORDERED), false)
                .sorted(getContentComparator()).forEach(function::accept);
    }
}
