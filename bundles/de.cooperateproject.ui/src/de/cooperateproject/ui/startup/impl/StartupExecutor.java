package de.cooperateproject.ui.startup.impl;

import java.util.Collection;

import org.eclipse.ui.IStartup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.ui.startup.IStartupAction;
import de.cooperateproject.util.eclipse.ExtensionPointHelper;

/**
 * Executor for Cooperate startup actions.
 * 
 * The executor gathers actions from the extension point {@link #StartupExecutor#EP_ID}.
 */
public class StartupExecutor implements IStartup {

    private static final Logger LOGGER = LoggerFactory.getLogger(StartupExecutor.class);
    private static final String EP_ID = "de.cooperateproject.ui.startup";
    private static final String EP_ATTR = "class";

    @Override
    public void earlyStartup() {
        Collection<IStartupAction> startupActions = ExtensionPointHelper.getExtensions(EP_ID, EP_ATTR,
                IStartupAction.class);
        for (IStartupAction action : startupActions) {
            try {
                LOGGER.debug("Executing {}", action.getClass().getSimpleName());
                action.run();
            } catch (Exception e) {
                LOGGER.error("Execution of {} failed.", action.getClass().getSimpleName(), e);
            }
        }
    }

}
