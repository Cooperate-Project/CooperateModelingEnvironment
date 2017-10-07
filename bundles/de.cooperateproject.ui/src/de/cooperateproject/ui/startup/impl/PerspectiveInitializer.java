package de.cooperateproject.ui.startup.impl;

import de.cooperateproject.ui.perspective.CooperatePerspective;
import de.cooperateproject.ui.startup.IStartupAction;

/**
 * Initializes the perspective as soon as it is activated.
 */
public class PerspectiveInitializer implements IStartupAction {

    @Override
    public void run() {
        CooperatePerspective.addPerspectiveActivatedListener();
    }

}
