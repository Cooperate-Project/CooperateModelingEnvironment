package de.cooperateproject.modeling.transformation.tests.commons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.util.Trace;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.junit.Before;

import de.cooperateproject.modeling.transformation.common.impl.QVTOResource;

public abstract class DirectedTraceTransformationTestBase extends TraceRecordTransformationTestBase implements AuxiliaryModelsAddingTransformationRunning {

    private final String testPluginId;
    private final List<String> sourceFileExtensions;
    private final List<String> targetFileExtensions;
    private final List<String> auxiliaryFileExtensions;
    private final URI sourceToTargetTransformationUri;
    private final URI targetToSourceTransformationUri;
    private final URI sourceToTargetTraceTransformationUri;

    private ResourceSet secondaryResourceSet;
    

    
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
    
    protected DirectedTraceTransformationTestBase(List<String> sourceFileExtensions, List<String> targetFileExtensions,
            List<String> auxiliaryFileExtensions, URI sourceToTargetTransformationUri, URI targetToSourceTransformationUri,
            URI sourceToTargetTraceTransformationUri, String testPluginId) {
        super();
        this.sourceFileExtensions = sourceFileExtensions;
        this.targetFileExtensions = targetFileExtensions;
        this.auxiliaryFileExtensions = auxiliaryFileExtensions;
        this.sourceToTargetTransformationUri = sourceToTargetTransformationUri;
        this.targetToSourceTransformationUri = targetToSourceTransformationUri;
        this.sourceToTargetTraceTransformationUri = sourceToTargetTraceTransformationUri;
        this.testPluginId = testPluginId;
    }
    
    protected String getModelFileName(String modelName, String extension) {
        return modelName + "." + extension;
    }

    protected void testTraceTransformation(String modelName) throws Exception {
        // test parameters
        List<URI> targetModelURIs = targetFileExtensions.stream().map(
                ext -> createResourceModelURI(testPluginId, getModelFileName(modelName, ext))).collect(Collectors.toList());
        List<URI> sourceModelURIs = sourceFileExtensions.stream().map(
                ext -> createResourceModelURI(testPluginId, getModelFileName(modelName, ext))).collect(Collectors.toList());

        /*
         * Run original transformation that yields
         * - the textual model
         * - the trace model to be compared (expected)
         */
        Trace target2sourceTraceModel = new Trace(Collections.emptyList());
        List<ModelExtent> t2sModelExtents = new ArrayList<>();
        List<ModelExtent> sourceModelExtents = sourceModelURIs.stream().map(uri -> new BasicModelExtent()).collect(Collectors.toList());
        t2sModelExtents.addAll(modelUrisToModelExtents(targetModelURIs, true));
        t2sModelExtents.addAll(sourceModelExtents);   
        runTransformation(targetToSourceTransformationUri, t2sModelExtents, target2sourceTraceModel);

        for (Iterator<?> extentIter = sourceModelExtents.iterator(), uriIter = sourceModelURIs.iterator(); extentIter
                .hasNext();) {
            getResourceSet().createResource((URI) uriIter.next()).getContents()
                    .addAll(((ModelExtent) extentIter.next()).getContents());
        }
        
        /*
         * Run text to graphics transformation that yields
         * - the second graphical model
         * - the t2g trace model (input for trace transformation)
         */
        Trace source2targetTrace = new Trace(Collections.emptyList());
        List<ModelExtent> transformationParameters = new ArrayList<>(sourceModelURIs.size() + targetModelURIs.size());
        transformationParameters.addAll(sourceModelExtents);
        List<ModelExtent> targetModelExtents = modelUrisToModelExtents(targetModelURIs, getSecondaryResourceSet(), false);
        transformationParameters.addAll(targetModelExtents);
        runTransformation(sourceToTargetTransformationUri, transformationParameters, source2targetTrace);
        
        for (Iterator<?> extentIter = targetModelExtents.iterator(), uriIter = targetModelURIs.iterator(); extentIter
                .hasNext();) {
            getSecondaryResourceSet().getResource((URI) uriIter.next(), false).getContents()
                    .addAll(((ModelExtent) extentIter.next()).getContents());
        }

        /*
         * Transform trace model to point to elements of graphicalModel instead of graphicalModel2
         */
        repairTransformationTrace(getResourceSet(), getSecondaryResourceSet(), targetModelURIs, source2targetTrace);
        
        /*
         * Run trace transformation that yields
         * - the actual trace model to be compared (actual)
         */
        ModelExtent actualTraceModel = new BasicModelExtent();
        List<ModelExtent> traceTransformationParameters = new ArrayList<>();
        traceTransformationParameters.add(new BasicModelExtent(source2targetTrace.getTraceContent()));
        traceTransformationParameters.add(actualTraceModel);
        traceTransformationParameters.addAll(modelUrisToModelExtents(targetModelURIs, false));
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
            result.addAll(modelUrisToModelExtents(auxiliaryModelURIs, true));
            result.add(new BasicModelExtent(getResourceSet()
                .getResource(URI.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI), true).getContents()));
            return result;
        }
        return parameters;
    }
    
    @Before
    public void setup() {
        super.setup();
        secondaryResourceSet = new ResourceSetImpl();
    }
    
    protected ResourceSet getSecondaryResourceSet() {
        return this.secondaryResourceSet;
    }

}
