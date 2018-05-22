package de.cooperateproject.modeling.transformation.tests.commons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.util.Trace;
import org.eclipse.uml2.uml.resource.UMLResource;

import de.cooperateproject.modeling.transformation.common.impl.QVTOResource;

public abstract class DirectedTraceTransformationTestBase extends TraceRecordTransformationTestBase implements AuxiliaryModelsAddingTransformationRunning {

    private final String testPluginId;
    private final List<String> sourceFileExtensions;
    private final List<String> targetFileExtensions;
    private final List<String> auxiliaryFileExtensions;
    private final URI sourceToTargetTransformationUri;
    private final URI targetToSourceTransformationUri;
    private final URI sourceToTargetTraceTransformationUri;

    protected DirectedTraceTransformationTestBase(String sourceFileExtension, String targetFileExtension,
            URI sourceToTargetTransformationUri, URI targetToSourceTransformationUri,
            URI sourceToTargetTraceTransformationUri, String testPluginId) {
        super();
        this.sourceFileExtensions = Collections.singletonList(sourceFileExtension);
        this.targetFileExtensions = Collections.singletonList(targetFileExtension);
        this.auxiliaryFileExtensions = Collections.singletonList("uml");
        this.sourceToTargetTransformationUri = sourceToTargetTransformationUri;
        this.targetToSourceTransformationUri = targetToSourceTransformationUri;
        this.sourceToTargetTraceTransformationUri = sourceToTargetTraceTransformationUri;
        this.testPluginId = testPluginId;
    }

    protected void testTraceTransformation(String modelName) throws Exception {
        // test parameters
        List<URI> targetModelURIs = targetFileExtensions.stream().map(
                ext -> createResourceModelURI(testPluginId, modelName + "." + ext)).collect(Collectors.toList());
        List<URI> sourceModelURIs = sourceFileExtensions.stream().map(
                ext -> createResourceModelURI(testPluginId, modelName + ".output." + ext)).collect(Collectors.toList());

        /*
         * Run original transformation that yields
         * - the textual model
         * - the trace model to be compared (expected)
         */
        Trace target2sourceTraceModel = new Trace(Collections.emptyList());
        runTransformation(targetToSourceTransformationUri, targetModelURIs, sourceModelURIs, target2sourceTraceModel);

        /*
         * Run text to graphics transformation that yields
         * - the second graphical model
         * - the t2g trace model (input for trace transformation)
         */
        List<ModelExtent> targetModels2 = targetModelURIs.stream().map(uri -> new BasicModelExtent()).collect(Collectors.toList());
        Trace source2targetTrace = new Trace(Collections.emptyList());
        List<ModelExtent> transformationParameters = new ArrayList<>(sourceModelURIs.size() + targetModelURIs.size());
        transformationParameters.addAll(modelUrisToModelExtents(sourceModelURIs));
        transformationParameters.addAll(targetModels2);
        runTransformation(sourceToTargetTransformationUri, transformationParameters, source2targetTrace);

        /*
         * Transform trace model to point to elements of graphicalModel instead of graphicalModel2
         */
        repairTransformationTrace(modelUrisToModelExtents(targetModelURIs), targetModels2, source2targetTrace);

        /*
         * Run trace transformation that yields
         * - the actual trace model to be compared (actual)
         */
        ModelExtent actualTraceModel = new BasicModelExtent();
        List<ModelExtent> traceTransformationParameters = new ArrayList<>();
        traceTransformationParameters.add(new BasicModelExtent(source2targetTrace.getTraceContent()));
        traceTransformationParameters.add(actualTraceModel);
        traceTransformationParameters.addAll(modelUrisToModelExtents(targetModelURIs));
        traceTransformationParameters.add(new BasicModelExtent(
                new QVTOResource(targetToSourceTransformationUri, getResourceSet().getPackageRegistry()).getContents()));
        runTransformation(sourceToTargetTraceTransformationUri, traceTransformationParameters, new Trace(Collections.emptyList()));

        // compare expected and actual
        assertTraceEquals(target2sourceTraceModel, actualTraceModel);
    }
    
    @Override
    public List<ModelExtent> addAuxiliaryModels(URI transformationURI, List<ModelExtent> parameters) {
        if (sourceToTargetTransformationUri.equals(transformationURI) || targetToSourceTransformationUri.equals(transformationURI)) {
            ArrayList<ModelExtent> result = new ArrayList<>(parameters);
            String modelNameRaw = parameters.get(0).getContents().get(0).eResource().getURI().trimFileExtension().lastSegment();
            int pointPos = modelNameRaw.indexOf('.');
            final String modelName = pointPos > -1 ? modelNameRaw.substring(0, pointPos) : modelNameRaw;
            
            List<URI> auxiliaryModelURIs = auxiliaryFileExtensions.stream().map(
                    ext -> createResourceModelURI(testPluginId, modelName + "." + ext)).collect(Collectors.toList());
            result.addAll(modelUrisToModelExtents(auxiliaryModelURIs));
            result.add(new BasicModelExtent(getResourceSet()
                .getResource(URI.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI), true).getContents()));
            return result;
        }
        return parameters;
    }

}
