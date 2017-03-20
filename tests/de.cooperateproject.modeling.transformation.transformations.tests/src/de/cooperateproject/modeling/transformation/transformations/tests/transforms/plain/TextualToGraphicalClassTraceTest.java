package de.cooperateproject.modeling.transformation.transformations.tests.transforms.plain;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;

public class TextualToGraphicalClassTraceTest extends DirectedTraceTransformationTestBase {

    private static final URI T2G_MODEL_TRANSFORMATION_URI = createTransformationURI(
            "Textual_to_Graphical_for_Class.qvto");
    private static final URI G2T_MODEL_TRANSFORMATION_URI = createTransformationURI(
            "Graphical_to_Textual_for_Class.qvto");
    private static final URI T2G_TRACE_TRANSFORMATION_URI = createTransformationURI(
            "Textual_to_Graphical_for_Class_Trace.qvto");

    static {
        ClsPackage.eINSTANCE.eClass();
    }

    public TextualToGraphicalClassTraceTest() {
        super("xmi", "notation", T2G_MODEL_TRANSFORMATION_URI, G2T_MODEL_TRANSFORMATION_URI,
                T2G_TRACE_TRANSFORMATION_URI);
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

}
