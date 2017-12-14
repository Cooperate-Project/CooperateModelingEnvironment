package de.cooperateproject.ui.nature;

import java.util.Collection;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.cdo.util.connection.CDOConnectionSettings;
import de.cooperateproject.ui.nature.tasks.BackgroundTasksAdapter;
import de.cooperateproject.ui.properties.ProjectPropertiesDTO;
import de.cooperateproject.ui.properties.ProjectPropertiesStore;
import de.cooperateproject.ui.util.ConnectionValidator;

/**
 * IncrementalProjectBuilder for cooperate projects which provides custom build logic.
 * 
 * @author seifermann, persch
 *
 */
public class CooperateProjectBuilder extends IncrementalProjectBuilder {

    private static final Logger LOGGER = LoggerFactory.getLogger(CooperateProjectBuilder.class);
    public static final String BUILDER_ID = "de.cooperateproject.ui.CooperateProjectBuilder";
    private final Map<IProject, ProjectPropertiesDTO> oldProperties = Maps.newHashMap();

    @Override
    protected IProject[] build(int kind, Map<String, String> args, IProgressMonitor monitor) throws CoreException {
        LOGGER.debug(String.format("%s started with kind %d.", CooperateProjectBuilder.class.getSimpleName(), kind));
        boolean treatAsNew = kind == CLEAN_BUILD || kind == FULL_BUILD;
        Collection<IProject> processedProjects = Lists.newArrayList();

        for (IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
            if (project.isOpen() && NatureUtils.hasCooperateNature(project)) {
                buildProject(project, treatAsNew, monitor);
                processedProjects.add(project);
            }
            if (!project.isOpen()) {
                BackgroundTasksAdapter.getManager().deregisterProject(project);
            }
        }
        deregisterOrphanProjects();
        return processedProjects.toArray(new IProject[0]);
    }

    private void buildProject(IProject project, boolean treatAsNew, IProgressMonitor monitor) {
        LOGGER.info(String.format("Starting build of project %s.", project.getName()));

        ProjectPropertiesStore propertiesStore = new ProjectPropertiesStore(project);
        propertiesStore.initFromStore();
        ProjectPropertiesDTO currentProperties = propertiesStore.getPreferences();

        if (ConnectionValidator.connectionInfoIsValid(currentProperties.getCdoHost(), currentProperties.getCdoPort(),
                currentProperties.getCdoRepo(), currentProperties.getMsgPort(), 1000)) {
            if (treatAsNew || !currentProperties.equals(oldProperties.get(project))) {
                deregisterProject(project);
            }
            CDOConnectionManager.getInstance().register(project, convert(currentProperties));
            BackgroundTasksAdapter.getManager().registerProject(project);
        } else {
            try {
                project.close(monitor);
            } catch (CoreException e) {
                LOGGER.error("Project can't be closed.", e);
            }
        }

        oldProperties.put(project, currentProperties);
    }

    private static CDOConnectionSettings convert(ProjectPropertiesDTO properties) {
        return CDOConnectionSettings.builder().setHost(properties.getCdoHost()).setPort(properties.getCdoPort())
                .setRepo(properties.getCdoRepo()).setUser(properties.getCdoUser())
                .setPassword(properties.getCdoPassword()).build();
    }

    private static void deregisterOrphanProjects() {
        boolean orphan = true;
        for (IProject project : CDOConnectionManager.getInstance().getProjects()) {
            for (IProject workspaceProject : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
                if (workspaceProject.getName().equals(project.getName())) {
                    orphan = false;
                }
            }
            if (orphan) {
                deregisterProject(project);
            }
        }
    }

    private static void deregisterProject(IProject project) {
        BackgroundTasksAdapter.getManager().deregisterProject(project);
        CDOConnectionManager.getInstance().unregister(project);
    }
}
