package de.cooperateproject.modeling.graphical.papyrus.extensions.validation;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.validation.model.IClientSelector;
import org.eclipse.uml2.uml.Element;

import de.cooperateproject.ui.nature.NatureUtils;

public class CooperateClientSelector implements IClientSelector {

    private static final Logger LOGGER = Logger.getLogger(CooperateClientSelector.class);

    @Override
    public boolean selects(Object object) {
        if (object instanceof Element) {
            Element model = (Element) object;
            Resource res = model.eResource();
            Path path = new Path(res.getURI().toPlatformString(true));
            IProject project = ResourcesPlugin.getWorkspace().getRoot().getFile(path).getProject();
            try {
                if (NatureUtils.hasCooperateNature(project)) {
                    return true;
                }
            } catch (CoreException e) {
                LOGGER.error("Fehler beim Überprüfen der Nature", e);
            }
        }
        return false;
    }

}
