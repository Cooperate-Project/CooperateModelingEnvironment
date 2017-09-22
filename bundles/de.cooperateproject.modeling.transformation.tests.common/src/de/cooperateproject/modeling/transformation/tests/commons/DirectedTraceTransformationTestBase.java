package de.cooperateproject.modeling.transformation.tests.commons;

import java.util.Arrays;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.util.Trace;

import de.cooperateproject.modeling.transformation.common.impl.QVTOResource;

public abstract class DirectedTraceTransformationTestBase extends TraceRecordTransformationTestBase {

    private final String testPluginId;
    private final String sourceFileExtension;
    private final String targetFileExtension;
    private final URI sourceToTargetTransformationUri;
    private final URI targetToSourceTransformationUri;
    private final URI sourceToTargetTraceTransformationUri;

    protected DirectedTraceTransformationTestBase(String sourceFileExtension, String targetFileExtension,
            URI sourceToTargetTransformationUri, URI targetToSourceTransformationUri,
            URI sourceToTargetTraceTransformationUri, String testPluginId) {
        super();
        this.sourceFileExtension = sourceFileExtension;
        this.targetFileExtension = targetFileExtension;
        this.sourceToTargetTransformationUri = sourceToTargetTransformationUri;
        this.targetToSourceTransformationUri = targetToSourceTransformationUri;
        this.sourceToTargetTraceTransformationUri = sourceToTargetTraceTransformationUri;
        this.testPluginId = testPluginId;
    }

    protected void testTraceTransformation(String modelName) throws Exception {
        // test parameters
        URI targetModelURI = createResourceModelURI(testPluginId, modelName + "." + targetFileExtension);
        URI umlModelURI = createResourceModelURI(testPluginId, modelName + ".uml");
        URI sourceModelURI = createResourceModelURI(testPluginId, modelName + "_tmp." + sourceFileExtension);

        /*
         * Run original transformation that yields
         * - the textual model
         * - the trace model to be compared (expected)
         */
        ModelExtent targetModel = createModelExtent(targetModelURI);
        ModelExtent umlModel = createModelExtent(umlModelURI);
        ModelExtent sourceModel = createModelExtent(sourceModelURI);
        Trace target2sourceTraceModel = new Trace(Collections.emptyList());
        runTransformation(targetToSourceTransformationUri, targetModel, umlModel, sourceModel, target2sourceTraceModel);

        /*
         * Run text to graphics transformation that yields
         * - the second graphical model
         * - the t2g trace model (input for trace transformation)
         */
        ModelExtent targetModel2 = new BasicModelExtent();
        Trace source2targetTrace = new Trace(Collections.emptyList());
        runTransformation(sourceToTargetTransformationUri, sourceModel, umlModel, targetModel2, source2targetTrace);

        /*
         * Transform trace model to point to elements of graphicalModel instead of graphicalModel2
         */
        repairTransformationTrace(targetModel, targetModel2, source2targetTrace);

        /*
         * Run trace transformation that yields
         * - the actual trace model to be compared (actual)
         */
        ModelExtent sourceToTargetTraceModel = new BasicModelExtent(source2targetTrace.getTraceContent());
        ModelExtent actualTraceModel = new BasicModelExtent();
        ModelExtent target2sourceTransformationModel = new BasicModelExtent(
                new QVTOResource(targetToSourceTransformationUri, getResourceSet().getPackageRegistry()).getContents());
        runTransformation(sourceToTargetTraceTransformationUri, Arrays.asList(sourceToTargetTraceModel,
                actualTraceModel, targetModel, target2sourceTransformationModel), new Trace(Collections.emptyList()));

        // compare expected and actual
        assertTraceEquals(target2sourceTraceModel, actualTraceModel);
    }

}
