package de.cooperateproject.modeling.transformation.common.registry;

import org.eclipse.emf.common.util.URI;

import de.cooperateproject.modeling.transformation.common.ITransformationUnitURIResolver;
import de.cooperateproject.modeling.transformation.common.TransformationCharacteristic;
import de.cooperateproject.modeling.transformation.common.TransformationType;

public abstract class TransformationUnitPlatformURIResolverBase implements ITransformationUnitURIResolver {

    @Override
    public URI getTransformationURI(TransformationCharacteristic characteristic, TransformationType type) {
        final String path = String.format("/%s/%s", getRelativePath(characteristic, type),
                getFileName(characteristic, type));
        return URI.createPlatformPluginURI(path, true);
    }

    abstract protected String getFileName(TransformationCharacteristic characteristic, TransformationType type);

    abstract protected String getRelativePath(TransformationCharacteristic characteristic, TransformationType type);

}
