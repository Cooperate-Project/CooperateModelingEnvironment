package de.cooperateproject.modeling.graphical.papyrus.extensions.validation;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.model.IClientSelector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.ui.nature.NatureUtils;

public class CooperateClientSelector implements IClientSelector {

    private static final Logger LOGGER = LoggerFactory.getLogger(CooperateClientSelector.class);

    @Override
    public boolean selects(Object object) {
        if (object instanceof EObject) {
            EObject model = (EObject) object;
            URI uri = model.eResource().getURI();
            IProject project;
            if (uri.scheme().startsWith("cdo")) {
                // The project name is by convention in the first segment of the uri
                String projectName = uri.segment(0);
                project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
            } else if (uri.isPlatform()) {
                Path path = new Path(uri.toPlatformString(true));
                project = ResourcesPlugin.getWorkspace().getRoot().getFile(path).getProject();
            } else {
                return false;
            }

            try {
                if (project.exists() && NatureUtils.hasCooperateNature(project)) {
                    return true;
                }
            } catch (CoreException e) {
                LOGGER.error("Error while checking for Cooperate Nature", e);
            }
        }
        return false;
    }

}
