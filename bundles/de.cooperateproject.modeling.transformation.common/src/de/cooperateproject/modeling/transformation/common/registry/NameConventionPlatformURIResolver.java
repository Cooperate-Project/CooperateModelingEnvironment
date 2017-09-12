package de.cooperateproject.modeling.transformation.common.registry;

import de.cooperateproject.modeling.transformation.common.TransformationCharacteristic;
import de.cooperateproject.modeling.transformation.common.TransformationType;
import de.cooperateproject.modeling.transformation.common.impl.TransformationNameUtilsOld;

public class NameConventionPlatformURIResolver extends TransformationUnitPlatformURIResolverBase {

    private final String relativeBasePath;

    public NameConventionPlatformURIResolver(String relativeBasePath) {
        this.relativeBasePath = relativeBasePath;
    }

    @Override
    protected String getFileName(TransformationCharacteristic characteristic, TransformationType type) {
        switch (type) {
        case REGULAR:
            return TransformationNameUtilsOld.createTransformationFileName(characteristic);
        case TRACE:
            return TransformationNameUtilsOld.createTraceTransformationFileName(characteristic);
        }
        throw new IllegalArgumentException("Unsupported transformation type");
    }

    @Override
    protected String getRelativePath(TransformationCharacteristic characteristic, TransformationType type) {
        return relativeBasePath;
    }

}
