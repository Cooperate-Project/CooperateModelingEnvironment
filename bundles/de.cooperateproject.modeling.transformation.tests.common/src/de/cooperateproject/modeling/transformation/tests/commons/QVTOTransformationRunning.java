package de.cooperateproject.modeling.transformation.tests.commons;

import static de.cooperateproject.modeling.transformation.tests.commons.TestModelsHandling.createModelExtent;
import static de.cooperateproject.modeling.transformation.tests.commons.TestModelsHandling.createResource;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.m2m.internal.qvt.oml.evaluator.QVTEvaluationOptions;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.Trace;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Iterables;

import de.cooperateproject.modeling.transformation.common.impl.Slf4JLogger;
import de.cooperateproject.modeling.transformation.common.impl.Slf4JLogger.Level;

@SuppressWarnings("restriction")
public interface QVTOTransformationRunning {
    static final Logger LOGGER = LoggerFactory.getLogger(QVTOTransformationRunning.class);

    ResourceSet getResourceSet();

    default EObject getRootElement(URI modelUri) throws IOException {
        Resource r = createResource(getResourceSet(), modelUri, true);
        return r.getContents().get(0);
    }

    default List<ModelExtent> runTransformation(URI transformationURI, List<URI> sourceModelURIs, List<URI> targetModelURIs)
            throws IOException {
        return runTransformation(transformationURI, sourceModelURIs, targetModelURIs,
                new Trace(Collections.emptyList()));
    }
    
    default List<ModelExtent> runTransformation(URI transformationURI, List<URI> sourceModelURIs,
            List<URI> auxiliaryModelURIs, List<URI> targetModelURIs, Trace traceModel) {
        List<URI> sourceURIs = new ArrayList<>(sourceModelURIs.size() + auxiliaryModelURIs.size());
        sourceURIs.addAll(sourceModelURIs);
        sourceURIs.addAll(auxiliaryModelURIs);
        return runTransformation(transformationURI, sourceURIs, targetModelURIs, traceModel);
    }
    
    default List<ModelExtent> modelUrisToModelExtents(List<URI> uris, ResourceSet resourceSet, boolean load) {
        return uris.stream()
                .map(uri -> createModelExtent(createResource(resourceSet, uri, load))).collect(Collectors.toList());
    }
    
    default List<ModelExtent> modelUrisToModelExtents(List<URI> uris, boolean load) {
        return modelUrisToModelExtents(uris, getResourceSet(), load);        
    }
    
    default List<ModelExtent> runTransformation(URI transformationURI, List<URI> sourceModelURIs,
            List<URI> targetModelURIs, Trace traceModel) {
        List<ModelExtent> sourceModelExtents = modelUrisToModelExtents(sourceModelURIs, true);
        List<ModelExtent> targetModelExtents = modelUrisToModelExtents(targetModelURIs, false);
        
        List<ModelExtent> parameterExtents = new ArrayList<>(sourceModelExtents.size() + targetModelExtents.size());
        parameterExtents.addAll(sourceModelExtents);
        parameterExtents.addAll(targetModelExtents);
        runTransformation(transformationURI, parameterExtents, traceModel);
        
        for (Iterator<?> extentIter = targetModelExtents.iterator(), uriIter = targetModelURIs.iterator(); extentIter
                .hasNext();) {
            getResourceSet().getResource((URI) uriIter.next(), false).getContents()
                    .addAll(((ModelExtent) extentIter.next()).getContents());
        }

        return targetModelExtents;
    }

    default void runTransformation(URI transformationURI, List<ModelExtent> transformationParameters,
            Trace traceModel) {
        TransformationExecutor executor = new TransformationExecutor(transformationURI);
        ExecutionContextImpl ctx = new ExecutionContextImpl();
        ctx.setLog(new Slf4JLogger(LOGGER, Level.INFO));
        ctx.getSessionData().setValue(QVTEvaluationOptions.INCREMENTAL_UPDATE_TRACE, traceModel);
        ExecutionDiagnostic result = executor.execute(ctx,
                Iterables.toArray(transformationParameters, ModelExtent.class));
        assertEquals(result.getMessage(), ExecutionDiagnostic.OK, result.getSeverity());
    }

}
