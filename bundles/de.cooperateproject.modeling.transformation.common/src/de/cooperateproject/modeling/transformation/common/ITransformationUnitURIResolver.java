package de.cooperateproject.modeling.transformation.common;

import org.eclipse.emf.common.util.URI;

public interface ITransformationUnitURIResolver {

    URI getTransformationURI(TransformationCharacteristic characteristic, TransformationType type);

}
