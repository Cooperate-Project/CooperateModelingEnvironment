package de.cooperateproject.modeling.transformation.transformations.tests.transforms.plain;

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
        testTraceTransformation("ComponentMinimal");
    }

}
