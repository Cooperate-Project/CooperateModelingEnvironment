package de.cooperateproject.modeling.transformation.transformations.tests.transforms.plain;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;

public class TextualToGraphicalUseCaseTraceTest extends DirectedTraceTransformationTestBase {

    private static final URI T2G_MODEL_TRANSFORMATION_URI = createTransformationURI(
            "Textual_to_Graphical_for_Usecase.qvto");
    private static final URI G2T_MODEL_TRANSFORMATION_URI = createTransformationURI(
            "Graphical_to_Textual_for_Usecase.qvto");
    private static final URI T2G_TRACE_TRANSFORMATION_URI = createTransformationURI(
            "Textual_to_Graphical_for_Usecase_Trace.qvto");

    static {
        UsecasePackage.eINSTANCE.eClass();
    }

    public TextualToGraphicalUseCaseTraceTest() {
        super("xmi", "notation", T2G_MODEL_TRANSFORMATION_URI, G2T_MODEL_TRANSFORMATION_URI,
                T2G_TRACE_TRANSFORMATION_URI);
    }

    @Test
    public void testDefault() throws Exception {
        testTraceTransformation("UseCaseDiagram");
    }
}
