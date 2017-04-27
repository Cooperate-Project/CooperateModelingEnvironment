package de.cooperateproject.modeling.graphical.papyrus.extensions.validation;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.validation.model.IClientSelector;
import org.eclipse.uml2.uml.Element;

import de.cooperateproject.ui.nature.NatureUtils;

public class CooperateClientSelector implements IClientSelector {

    private static final Logger LOGGER = Logger.getLogger(CooperateClientSelector.class);

    @Override
    public boolean selects(Object object) {
        if (object instanceof Element) {
            Element model = (Element) object;
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
