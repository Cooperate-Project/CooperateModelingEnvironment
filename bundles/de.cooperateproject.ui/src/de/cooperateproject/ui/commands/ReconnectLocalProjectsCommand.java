package de.cooperateproject.ui.commands;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.ui.nature.CooperateProjectNature;

/**
 * Handler which provides logic for reseting all open projects with CooperateProjectNature in the workspace.
 * 
 * @author persch
 *
 */
public class ReconnectLocalProjectsCommand extends AbstractHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReconnectLocalProjectsCommand.class);

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        for (IProject project : getCooperateProjects()) {
            try {
                project.build(IncrementalProjectBuilder.CLEAN_BUILD, new NullProgressMonitor());
            } catch (CoreException e) {
                LOGGER.error("Can't refresh project {}.", project.getName(), e);
            }
        }
        return null;
    }

    private static List<IProject> getCooperateProjects() {
        List<IProject> projectList = new LinkedList<>();
        IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
        for (IProject project : workspaceRoot.getProjects()) {
            try {
                if (project.isOpen() && project.hasNature(CooperateProjectNature.NATURE_ID)) {
                    projectList.add(project);
                }
            } catch (CoreException e) {
                LOGGER.error("Project {} is closed or does not exist.", project.getName(), e);
            }
        }
        return projectList;
    }

}
