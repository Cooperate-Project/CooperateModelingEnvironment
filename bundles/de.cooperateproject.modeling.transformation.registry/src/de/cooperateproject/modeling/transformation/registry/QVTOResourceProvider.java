package de.cooperateproject.modeling.transformation.registry;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.osgi.service.component.annotations.Component;

import de.cooperateproject.modeling.transformation.common.IQVTOResourceProvider;
import de.cooperateproject.modeling.transformation.common.impl.QVTOResource;

@Component(property = { "service.ranking:Integer=1" })
public class QVTOResourceProvider implements IQVTOResourceProvider {

    @Override
    public QVTOResource getQVTOResource(URI resourceURI) throws IOException {
        return new QVTOResource(resourceURI, EPackage.Registry.INSTANCE);
    }

}
