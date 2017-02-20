package de.cooperateproject.modeling.textual.xtext.runtime.editor;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;

import com.google.inject.Inject;

public class DerivedStateResourceHandlerFactory implements IDerivedStateResourceHandlerFactory {

    private static class NOPDerivedStateHandler implements IDerivedStateHandler {

        @Override
        public void disableCalculation() {
            return;
        }

        @Override
        public void enableCalculation() {
            return;
        }

    }

    private static class StateComputerSwitcher implements IDerivedStateHandler {

        private final DerivedStateAwareResource resource;
        private final IDerivedStateComputer originalComputer;

        public StateComputerSwitcher(DerivedStateAwareResource resource, IDerivedStateComputer originalComputer) {
            this.resource = resource;
            this.originalComputer = originalComputer;
        }

        @Override
        public void disableCalculation() {
            resource.setDerivedStateComputer(null);
        }

        @Override
        public void enableCalculation() {
            resource.setDerivedStateComputer(originalComputer);
        }

    }

    private static final IDerivedStateHandler NOPHandler = new NOPDerivedStateHandler();

    @Inject(optional = true)
    private IDerivedStateComputer derivedStateComputer;

    @Override
    public IDerivedStateHandler create(Resource r) {
        if (r instanceof DerivedStateAwareResource && derivedStateComputer != null) {
            return new StateComputerSwitcher((DerivedStateAwareResource) r, derivedStateComputer);
        }
        return NOPHandler;
    }

}
