package de.cooperateproject.modeling.transformation.cls.tests;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.transformation.cls.ClsActivator;

public class TextualToGraphicalClassTraceTest extends ClsDirectionalTraceTransformationTestBase {

    private static final URI T2G_MODEL_TRANSFORMATION_URI = createTransformationURI(ClsActivator.PLUGIN_ID,
            "Textual_to_Graphical_for_Class.qvto");
    private static final URI G2T_MODEL_TRANSFORMATION_URI = createTransformationURI(ClsActivator.PLUGIN_ID,
            "Graphical_to_Textual_for_Class.qvto");
    private static final URI T2G_TRACE_TRANSFORMATION_URI = createTransformationURI(ClsActivator.PLUGIN_ID,
            "Textual_to_Graphical_for_Class_Trace.qvto");

    static {
        ClsPackage.eINSTANCE.eClass();
    }

    public TextualToGraphicalClassTraceTest() {
        super("xmi", "notation", T2G_MODEL_TRANSFORMATION_URI, G2T_MODEL_TRANSFORMATION_URI,
                T2G_TRACE_TRANSFORMATION_URI, TestEnvironmentConstants.TEST_PLUGIN_ID);
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

    @Test
    public void testClassCommentedGeneralization() throws Exception {
       testTraceTransformation("ClassDiagramCommentedGeneralization");
    }
    
    @Test
    public void testClassCommentedImpl() throws Exception {
       testTraceTransformation("ClassDiagramCommentedImpl");
    }
}
