package de.cooperateproject.ui.wizards.modelnew;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.tuple.Pair;
import org.apache.log4j.Logger;
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

import com.google.common.base.Strings;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.ui.Activator;

public class AtomicModelNameProcessor implements IValidator, IConverter {

    private static final Logger LOGGER = Logger.getLogger(AtomicModelNameProcessor.class);

    public static class ModelName {
        private final IProject project;
        private final String name;

        public ModelName(IProject project, String modelName) {
            super();
            this.project = project;
            this.name = modelName;
        }

        public IProject getProject() {
            return project;
        }

        public String getModelName() {
            return name;
        }

        public String getResourcePath() {
            // TODO This should not be located here
            return String.format("%s/%s.%s", project.getName(), name, "notation");
        }
    }

    @Override
    public IStatus validate(Object value) {
        Pair<ModelName, IStatus> result = converter(value);
        return result.getRight();
    }

    @Override
    public Object getFromType() {
        return String.class;
    }

    @Override
    public Object getToType() {
        return ModelName.class;
    }

    @Override
    public Object convert(Object fromObject) {
        Pair<ModelName, IStatus> result = converter(fromObject);
        return result.getLeft();
    }

    private static Pair<ModelName, IStatus> converter(Object o) {
        String modelAndProjectName = (String) o;
        if (Strings.isNullOrEmpty(modelAndProjectName)) {
            return Pair.of(null, new Status(IStatus.ERROR, Activator.PLUGIN_ID, "The model name must not be empty."));
        }

        Pattern modleNamePattern = Pattern.compile("([^/]+)/([^/]+)");
        Matcher modelNameMatcher = modleNamePattern.matcher(modelAndProjectName);
        if (!modelNameMatcher.matches()) {
            return Pair.of(null, new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                    "The model name must be of form \"<project>/<filename>\"."));
        }

        String projectName = modelNameMatcher.group(1);
        String modelName = modelNameMatcher.group(2);

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

        return Pair.of(new ModelName(project, modelName), Status.OK_STATUS);
    }
}
