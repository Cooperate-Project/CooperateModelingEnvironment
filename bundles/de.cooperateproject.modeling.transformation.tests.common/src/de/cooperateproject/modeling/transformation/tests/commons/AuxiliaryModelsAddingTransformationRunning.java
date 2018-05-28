package de.cooperateproject.modeling.transformation.tests.commons;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.util.Trace;

public interface AuxiliaryModelsAddingTransformationRunning extends QVTOTransformationRunning {
    @Override
    default void runTransformation(URI transformationURI, List<ModelExtent> transformationParameters,
            Trace traceModel) {
        QVTOTransformationRunning.super.runTransformation(transformationURI,
                addAuxiliaryModels(transformationURI, transformationParameters), traceModel);
    }
    

    default List<ModelExtent> addAuxiliaryModels(URI transformationURI, List<ModelExtent> parameters) {
        return parameters;
    }

}
