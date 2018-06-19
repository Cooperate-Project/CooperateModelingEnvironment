package de.cooperateproject.modeling.transformation.tests.commons;

import static de.cooperateproject.modeling.transformation.tests.commons.TestModelsHandling.createModelExtent;
import static de.cooperateproject.modeling.transformation.tests.commons.TestModelsHandling.createResource;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.util.Trace;

public interface LegacyTransformationRunning extends QVTOTransformationRunning {
    static final URI UML_PRIMITIVE_TYPES = URI
            .createURI("pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml");
    
    
    default ModelExtent runTransformation(URI transformationURI, URI sourceModelURI, URI umlModelURI)
            throws IOException {
        return runTransformation(transformationURI, sourceModelURI, umlModelURI, new BasicModelExtent(),
                new Trace(Collections.emptyList()));
    }

    default ModelExtent runTransformation(URI transformationURI, URI sourceModelURI, URI umlModelURI,
            Trace traceModel) throws IOException {
        return runTransformation(transformationURI, sourceModelURI, umlModelURI, new BasicModelExtent(), traceModel);
    }

    default ModelExtent runTransformation(URI transformationURI, URI sourceModelURI, URI umlModelURI,
            ModelExtent destination, Trace traceModel) throws IOException {
        ModelExtent source = createModelExtent(createResource(getResourceSet(), sourceModelURI, true));
        ModelExtent uml = createModelExtent(createResource(getResourceSet(), umlModelURI, true));
        return runTransformation(transformationURI, source, uml, destination, traceModel);
    }

    default ModelExtent runTransformation(URI transformationURI, ModelExtent sourceModel, ModelExtent umlModel,
            ModelExtent destination, Trace traceModel) throws IOException {
        ModelExtent umlPrimitives = createModelExtent(createResource(getResourceSet(), UML_PRIMITIVE_TYPES, true));
        List<ModelExtent> transformationParameters = Arrays.asList(sourceModel, destination, umlModel,
                umlPrimitives);

        runTransformation(transformationURI, transformationParameters, traceModel);

        URI virtualResultModelURI = umlModel.getContents().get(0).eResource().getURI().trimFileExtension()
                .trimFragment().trimQuery().trimSegments(1).appendSegment("resultModel").appendFileExtension("xmi");
        Resource resultResource = createResource(getResourceSet(), virtualResultModelURI, true);
        resultResource.getContents().addAll(destination.getContents());

        return destination;
    }

}
