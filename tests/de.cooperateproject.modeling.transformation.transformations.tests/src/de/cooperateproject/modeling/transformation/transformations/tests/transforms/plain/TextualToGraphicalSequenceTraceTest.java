package de.cooperateproject.modeling.transformation.transformations.tests.transforms.plain;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage;

public class TextualToGraphicalSequenceTraceTest extends DirectedTraceTransformationTestBase {

    private static final URI G2T_MODEL_TRANSFORMATION_URI = createTransformationURI(
            "Graphical_to_Textual_for_Sequence.qvto");
    private static final URI T2G_MODEL_TRANSFORMATION_URI = createTransformationURI(
            "Textual_to_Graphical_for_Sequence.qvto");
    private static final URI T2G_TRACE_TRANSFORMATION_URI = createTransformationURI(
            "Textual_to_Graphical_for_Sequence_Trace.qvto");

    static {
        SequencePackage.eINSTANCE.eClass();
    }

    public TextualToGraphicalSequenceTraceTest() {
        super("xmi", "notation", T2G_MODEL_TRANSFORMATION_URI, G2T_MODEL_TRANSFORMATION_URI,
                T2G_TRACE_TRANSFORMATION_URI);
    }

    @Test
    public void testDefault() throws Exception {
        testTraceTransformation("SequenceDiagram");
    }

    @Test
    public void testNestedExecutions() throws Exception {
        testTraceTransformation("SequenceNestedExecutionSpecification");
    }

    @Test
    public void testCombinedFragments() throws Exception {
        testTraceTransformation("SequenceCombinedFragments");
    }

    @Test
    public void testCreationDestruction() throws Exception {
        testTraceTransformation("SequenceCreationDestruction");
    }

}
