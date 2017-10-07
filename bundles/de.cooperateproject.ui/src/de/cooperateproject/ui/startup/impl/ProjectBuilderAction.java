package de.cooperateproject.ui.startup.impl;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.ui.nature.NatureUtils;
import de.cooperateproject.ui.startup.IStartupAction;

/**
 * Start rebuilding of all Cooperate projects.
 */
public class ProjectBuilderAction implements IStartupAction {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProjectBuilderAction.class);

    @Override
    public void run() {
        for (IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
            try {
                if (project.isOpen() && NatureUtils.hasCooperateNature(project)) {
                    project.build(IncrementalProjectBuilder.FULL_BUILD, null);
                }
            } catch (CoreException e) {
                LOGGER.error("Exception during rebuild on startup", e);
            }

        }
    }

}
