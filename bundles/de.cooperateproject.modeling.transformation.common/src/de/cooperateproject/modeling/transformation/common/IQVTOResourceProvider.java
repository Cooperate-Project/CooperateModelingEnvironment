package de.cooperateproject.modeling.transformation.common;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;

import de.cooperateproject.modeling.transformation.common.impl.QVTOResource;

public interface IQVTOResourceProvider {

    QVTOResource getQVTOResource(URI resourceURI) throws IOException;

}
