package de.cooperate.modeling.graphical.papyrus.extensions.outline;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Label provider for UML elements used in Papyrus editors (same as
 * {@link org.eclipse.papyrus.uml.tools.providers.UMLLabelProvider}) that does not accept registrations of listeners.
 */
public class NonObservableUMLLabelProvider extends org.eclipse.papyrus.uml.tools.providers.UMLLabelProvider {

    private static final Logger LOGGER = LoggerFactory.getLogger(NonObservableUMLLabelProvider.class);

    @Override
    public void addListener(ILabelProviderListener listener) {
        LOGGER.debug("Discarded listener registration request of listener {}", listener);
    }

}
