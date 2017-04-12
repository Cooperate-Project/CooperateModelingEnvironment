package de.cooperateproject.ui.focus.internal.model;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.ui.IWorkbenchPart;

import de.cooperateproject.ui.focus.manager.IFocusManager;
import de.cooperateproject.ui.focus.manager.IFocusManagerFactory;
import de.cooperateproject.util.eclipse.ExtensionPointHelper;

public enum InternalFocusManagerFactory implements IFocusManagerFactory {

    INSTANCE;

    private static final String EXTENSION_POINT_ID = "de.cooperateproject.ui.focus.manager.factory";
    private static final String EXTENSION_POINT_ATTRIBUTE = "factory";
    private static final Logger LOGGER = Logger.getLogger(InternalFocusManagerFactory.class);
    private final Collection<IFocusManagerFactory> factories;

    public static IFocusManagerFactory getInstance() {
        return INSTANCE;
    }

    private InternalFocusManagerFactory() {
        factories = getRegisteredFactories();
    }

    private Collection<IFocusManagerFactory> getRegisteredFactories() {
        return ExtensionPointHelper.getExtensions(EXTENSION_POINT_ID, EXTENSION_POINT_ATTRIBUTE,
                IFocusManagerFactory.class);
    }

    @Override
    public boolean canHandle(IWorkbenchPart workbenchPart) {
        Set<IFocusManagerFactory> matchingFactories = findMatchingFactories(workbenchPart);
        return matchingFactories.size() == 1;
    }

    private Set<IFocusManagerFactory> findMatchingFactories(IWorkbenchPart workbenchPart) {
        Set<IFocusManagerFactory> matchingFactories = factories.stream().filter(f -> f.canHandle(workbenchPart))
                .collect(Collectors.toSet());
        if (matchingFactories.size() > 1) {
            LOGGER.warn(String.format("There are multiple factories that can handle the workbench part %s.",
                    workbenchPart));
        }
        return matchingFactories;
    }

    @Override
    public IFocusManager create(IWorkbenchPart workbenchPart) {
        Set<IFocusManagerFactory> matchingFactories = findMatchingFactories(workbenchPart);
        if (matchingFactories.size() == 1) {
            return matchingFactories.iterator().next().create(workbenchPart);
        }
        throw new IllegalArgumentException(
                String.format("The factory cannot handle the given workbench part %s.", workbenchPart));
    }

}
