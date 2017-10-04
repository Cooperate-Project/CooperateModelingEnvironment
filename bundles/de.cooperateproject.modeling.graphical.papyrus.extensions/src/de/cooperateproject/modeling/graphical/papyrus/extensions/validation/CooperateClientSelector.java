package de.cooperateproject.modeling.graphical.papyrus.extensions.validation;

import java.util.Arrays;
import java.util.Optional;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.validation.model.IClientSelector;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.uml2.uml.UMLPackage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.ui.nature.NatureUtils;

public class CooperateClientSelector implements IClientSelector {

    private static final Logger LOGGER = LoggerFactory.getLogger(CooperateClientSelector.class);

    @Override
    public boolean selects(Object object) {
        if (!Optional.ofNullable(object).filter(EObject.class::isInstance).map(EObject.class::cast).map(EObject::eClass)
                .map(EClass::getEPackage)
                .filter(p -> Arrays.asList(UMLPackage.eINSTANCE, NotationPackage.eINSTANCE).contains(p)).isPresent()) {
            return false;
        }

        Optional<URI> elementUri = Optional.of((EObject) object).map(EObject::eResource).map(Resource::getURI)
                .filter(u -> u.segmentCount() > 0);
        if (!elementUri.isPresent()) {
            return false;
        }

        try {

            Optional<IProject> project = Optional.empty();
            if (elementUri.map(URI::scheme).filter(scheme -> scheme.startsWith("cdo")).isPresent()) {
                project = elementUri.map(uri -> uri.segment(0))
                        .map(ResourcesPlugin.getWorkspace().getRoot()::getProject);
            } else if (elementUri.filter(URI::isPlatform).isPresent()) {
                project = elementUri.map(uri -> new Path(uri.toPlatformString(true)))
                        .map(ResourcesPlugin.getWorkspace().getRoot()::getFile).map(IFile::getProject);
            }
            project = project.filter(IProject::exists);

            return project.isPresent() && NatureUtils.hasCooperateNature(project.get());

        } catch (Exception e) {
            LOGGER.error("Error while checking applicability of Cooperate constraints.", e);
        }

        return false;
    }

}
