package de.cooperateproject.modeling.transformation.transformations.tests.transforms.plain;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import de.cooperateproject.modeling.textual.cmp.cmp.CmpPackage;

public class GraphicalToTextualComponentTraceTest extends DirectedTraceTransformationTestBase {

    private static final URI G2T_MODEL_TRANSFORMATION_URI = createTransformationURI(
            "Graphical_to_Textual_for_Component.qvto");
    private static final URI T2G_MODEL_TRANSFORMATION_URI = createTransformationURI(
            "Textual_to_Graphical_for_Component.qvto");
    private static final URI G2T_TRACE_TRANSFORMATION_URI = createTransformationURI(
            "Graphical_to_Textual_for_Component_Trace.qvto");

    static {
        CmpPackage.eINSTANCE.eClass();
    }

    public GraphicalToTextualComponentTraceTest() {
        super("notation", "xmi", G2T_MODEL_TRANSFORMATION_URI, T2G_MODEL_TRANSFORMATION_URI,
                G2T_TRACE_TRANSFORMATION_URI);
    }

    @Test
    public void testMinimal() throws Exception {
        // setDebugSerializationDir(new File("D:\\Debug\\tracedebug2"));
        testTraceTransformation("ComponentMinimal");
    }

    @Test
    public void testSingleComponent() throws Exception {
        setDebugSerializationDir(new File("D:\\Debug\\G2Ttrace_old"));
        testTraceTransformation("ComponentDiagramSingleComponent");
    }

    @Test
    public void testSingleInterface() throws Exception {

        testTraceTransformation("ComponentDiagramSingleInterface");
    }

    @Test
    public void testInnerClassifiers() throws Exception {

        testTraceTransformation("ComponentDiagramInnerClassifiers");
    }

    @Test
    public void testInterfaceAttribute() throws Exception {

        testTraceTransformation("ComponentDiagramInterfaceAttribute");
    }

    @Test
    public void testInterfaceMembers() throws Exception {
        setDebugSerializationDir(new File("D:\\Debug\\G2Ttrace"));
        testTraceTransformation("ComponentDiagramInterfaceMembers");
    }
}
