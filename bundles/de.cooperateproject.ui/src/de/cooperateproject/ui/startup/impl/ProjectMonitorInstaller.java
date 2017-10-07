package de.cooperateproject.ui.startup.impl;

import org.eclipse.core.resources.ResourcesPlugin;

import de.cooperateproject.ui.nature.ProjectOpenedListener;
import de.cooperateproject.ui.startup.IStartupAction;

/**
 * Installs a monitor to detect open/close events on projects.
 */
public class ProjectMonitorInstaller implements IStartupAction {

    @Override
    public void run() {
        ResourcesPlugin.getWorkspace().addResourceChangeListener(new ProjectOpenedListener());
    }

}
