package de.cooperateproject.modeling.transformation.cls.tests;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.transformation.cls.ClsActivator;

public class GraphicalToTextualClassTraceTest extends ClsDirectionalTraceTransformationTestBase {

    private static final URI G2T_MODEL_TRANSFORMATION_URI = createTransformationURI(ClsActivator.PLUGIN_ID,
            "Graphical_to_Textual_for_Class.qvto");
    private static final URI T2G_MODEL_TRANSFORMATION_URI = createTransformationURI(ClsActivator.PLUGIN_ID,
            "Textual_to_Graphical_for_Class.qvto");
    private static final URI G2T_TRACE_TRANSFORMATION_URI = createTransformationURI(ClsActivator.PLUGIN_ID,
            "Graphical_to_Textual_for_Class_Trace.qvto");

    static {
        ClsPackage.eINSTANCE.eClass();
    }
    
    public GraphicalToTextualClassTraceTest() {
        super("xmi", "notation", T2G_MODEL_TRANSFORMATION_URI, G2T_MODEL_TRANSFORMATION_URI,
                G2T_TRACE_TRANSFORMATION_URI, TestEnvironmentConstants.TEST_PLUGIN_ID);
    }

    @Test
    public void testWithoutPackages() throws Exception {
        testTraceTransformation("ClassDiagram");
    }

    @Test
    public void testWithPackages() throws Exception {
        testTraceTransformation("ClassDiagramPackages");
    }

    @Test
    public void testSelfReference() throws Exception {
        testTraceTransformation("ClassDiagramSelfReference");
    }

    @Test
    public void testClassNote() throws Exception {
        testTraceTransformation("ClassDiagramClassNote");
    }

    @Test
    public void testClassChangedRoot() throws Exception {
        testTraceTransformation("ClassDiagramChangedRoot");
    }

//    private void test(String modelName) throws Exception {
//        // test parameters
//        URI textualModelURI = createResourceModelURI(Constants.PLUGIN_ID, modelName + ".xmi");
//        URI umlModelURI = createResourceModelURI(Constants.PLUGIN_ID, modelName + ".uml");
//        URI graphicalModelURI = createResourceModelURI(Constants.PLUGIN_ID, modelName + "_tmp.notation");
//
//        /*
//         * Run original transformation that yields
//         * - the graphical model
//         * - the trace model to be compared (expected)
//         */
//        ModelExtent textualModel = createModelExtent(textualModelURI);
//        ModelExtent umlModel = createModelExtent(umlModelURI);
//        ModelExtent graphicalModel = createModelExtent(graphicalModelURI);
//        Trace t2gTraceModel = new Trace(Collections.emptyList());
//        runTransformation(T2G_MODEL_TRANSFORMATION_URI, textualModel, umlModel, graphicalModel, t2gTraceModel);
//
//        /*
//         * Run graphics to text transformation that yields
//         * - the second textual model
//         * - the g2t trace model (input for trace transformation)
//         */
//        ModelExtent textualModel2 = new BasicModelExtent();
//        Trace g2tTrace = new Trace(Collections.emptyList());
//        runTransformation(G2T_MODEL_TRANSFORMATION_URI, graphicalModel, umlModel, textualModel2, g2tTrace);
//
//        /*
//         * Transform trace model to point to elements of textualModel instead of textualModel2
//         */
//        repairTransformationTrace(textualModel, textualModel2, g2tTrace);
//
//        /*
//         * Run trace transformation that yields
//         * - the actual trace model to be compared (actual)
//         */
//        ModelExtent g2tTraceModel = new BasicModelExtent(g2tTrace.getTraceContent());
//        ModelExtent actualTraceModel = new BasicModelExtent();
//        ModelExtent t2gTransformationModel = new BasicModelExtent(
//                new QVTOResource(T2G_MODEL_TRANSFORMATION_URI, getResourceSet().getPackageRegistry()).getContents());
//        runTransformation(G2T_TRACE_TRANSFORMATION_URI,
//                Arrays.asList(g2tTraceModel, actualTraceModel, textualModel, t2gTransformationModel),
//                new Trace(Collections.emptyList()));
//
//        // compare expected and actual
//        assertTraceEquals(t2gTraceModel, actualTraceModel);
//    }

}
