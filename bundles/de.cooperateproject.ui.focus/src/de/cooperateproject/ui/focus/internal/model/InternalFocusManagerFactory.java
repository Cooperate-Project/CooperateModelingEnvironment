package de.cooperateproject.ui.focus.internal.model;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.ui.IWorkbenchPart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.ui.focus.manager.IFocusManager;
import de.cooperateproject.ui.focus.manager.IFocusManagerFactory;
import de.cooperateproject.util.eclipse.ExtensionPointHelper;

enum InternalFocusManagerFactory implements IFocusManagerFactory {

    INSTANCE;

    private static final String EXTENSION_POINT_ID = "de.cooperateproject.ui.focus.manager.factory";
    private static final String EXTENSION_POINT_ATTRIBUTE = "factory";
    private static final Logger LOGGER = LoggerFactory.getLogger(InternalFocusManagerFactory.class);
    private final Collection<IFocusManagerFactory> factories;

    @Override
    public IFocusManager create(IWorkbenchPart workbenchPart) {
        Set<IFocusManagerFactory> matchingFactories = findMatchingFactories(workbenchPart);
        if (matchingFactories.size() == 1) {
            return matchingFactories.iterator().next().create(workbenchPart);
        }
        throw new IllegalArgumentException(
                String.format("The factory cannot handle the given workbench part %s.", workbenchPart));
    }

    @Override
    public boolean canHandle(IWorkbenchPart workbenchPart) {
        Set<IFocusManagerFactory> matchingFactories = findMatchingFactories(workbenchPart);
        return matchingFactories.size() == 1;
    }

    private Collection<IFocusManagerFactory> getRegisteredFactories() {
        return ExtensionPointHelper.getExtensions(EXTENSION_POINT_ID, EXTENSION_POINT_ATTRIBUTE,
                IFocusManagerFactory.class);
    }

    private InternalFocusManagerFactory() {
        factories = getRegisteredFactories();
    }

    private Set<IFocusManagerFactory> findMatchingFactories(IWorkbenchPart workbenchPart) {
        Set<IFocusManagerFactory> matchingFactories = factories.stream().filter(f -> f.canHandle(workbenchPart))
                .collect(Collectors.toSet());
        if (matchingFactories.size() > 1) {
            LOGGER.warn("There are multiple factories that can handle the workbench part {}.", workbenchPart);
        }
        return matchingFactories;
    }

}
