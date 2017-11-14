package de.cooperateproject.ui.wizards.modelnew;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.cdo.common.util.CDOException;
import org.eclipse.emf.cdo.eresource.CDOResourceFolder;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.net4j.util.io.IOUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Strings;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.ui.Activator;

public class AtomicProjectNameProcessor implements IValidator, IConverter {

    private static final Logger LOGGER = LoggerFactory.getLogger(AtomicProjectNameProcessor.class);

    public static class ProjectName {
        private final IProject project;
        private final String name;

        public ProjectName(IProject project, String modelName) {
            super();
            this.project = project;
            this.name = modelName;
        }

        public IProject getProject() {
            return project;
        }

        public String getProjectName() {
            return name;
        }
    }

    @Override
    public IStatus validate(Object value) {
        Pair<ProjectName, IStatus> result = converter(value);
        return result.getRight();
    }

    @Override
    public Object getFromType() {
        return String.class;
    }

    @Override
    public Object getToType() {
        return ProjectName.class;
    }

    @Override
    public Object convert(Object fromObject) {
        Pair<ProjectName, IStatus> result = converter(fromObject);
        return result.getLeft();
    }

    private static Pair<ProjectName, IStatus> converter(Object o) {
        String projectName = (String) o;
        if (Strings.isNullOrEmpty(projectName)) {
            return Pair.of(null, new Status(IStatus.ERROR, Activator.PLUGIN_ID, "The project name must not be empty."));
        }

        IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
        if (project == null) {
            return Pair.of(null, new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                    String.format("The given project name \"%s\" is invalid.", projectName)));
        }

        CDOSession session = CDOConnectionManager.getInstance().acquireSession(project);
        try {
            CDOView view = session.openView();
            try {
                CDOResourceFolder folder = null;
                try {
                    folder = view.getResourceFolder(projectName);
                } catch (CDOException e) {
                    LOGGER.error("Ignore cdo exception", e);
                }
                if (folder == null) {
                    return Pair.of(null, new Status(IStatus.ERROR, Activator.PLUGIN_ID, String
                            .format("The given project \"%s\" is not available in the repository.", projectName)));
                }
            } finally {
                IOUtil.closeSilent(view);
            }
        } finally {
            CDOConnectionManager.getInstance().releaseSession(session);
        }

        return Pair.of(new ProjectName(project, projectName), Status.OK_STATUS);
    }
}
