package de.cooperateproject.modeling.transformation.transformations.tests.transforms.plain;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import de.cooperateproject.modeling.textual.cmp.cmp.CmpPackage;

public class TextualToGraphicalComponentTraceTest extends DirectedTraceTransformationTestBase {

    private static final URI T2G_MODEL_TRANSFORMATION_URI = createTransformationURI(
            "Textual_to_Graphical_for_Component.qvto");
    private static final URI G2T_MODEL_TRANSFORMATION_URI = createTransformationURI(
            "Graphical_to_Textual_for_Component.qvto");
    private static final URI T2G_TRACE_TRANSFORMATION_URI = createTransformationURI(
            "Textual_to_Graphical_for_Component_Trace.qvto");

    static {
        CmpPackage.eINSTANCE.eClass();
    }

    public TextualToGraphicalComponentTraceTest() {
        super("xmi", "notation", T2G_MODEL_TRANSFORMATION_URI, G2T_MODEL_TRANSFORMATION_URI,
                T2G_TRACE_TRANSFORMATION_URI);
    }

    @Test
    public void testMinimal() throws Exception {
        testTraceTransformation("ComponentMinimal");
    }

    @Test
    public void testSingleComponent() throws Exception {
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
        setDebugSerializationDir(new File("D:\\Debug\\T2G_Trace"));
        testTraceTransformation("ComponentDiagramInterfaceMembers");
    }

}
