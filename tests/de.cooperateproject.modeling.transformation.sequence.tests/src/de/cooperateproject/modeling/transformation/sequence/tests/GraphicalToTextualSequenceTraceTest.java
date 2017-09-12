package de.cooperateproject.modeling.transformation.sequence.tests;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage;
import de.cooperateproject.modeling.transformation.sequence.SequenceActivator;

public class GraphicalToTextualSequenceTraceTest extends SequenceDirectionalTraceTransformationTestBase {

    private static final URI G2T_MODEL_TRANSFORMATION_URI = createTransformationURI(SequenceActivator.PLUGIN_ID,
            "Graphical_to_Textual_for_Sequence.qvto");
    private static final URI T2G_MODEL_TRANSFORMATION_URI = createTransformationURI(SequenceActivator.PLUGIN_ID,
            "Textual_to_Graphical_for_Sequence.qvto");
    private static final URI G2T_TRACE_TRANSFORMATION_URI = createTransformationURI(SequenceActivator.PLUGIN_ID,
            "Graphical_to_Textual_for_Sequence_Trace.qvto");

    static {
        SequencePackage.eINSTANCE.eClass();
    }

    public GraphicalToTextualSequenceTraceTest() {
        super("notation", "xmi", G2T_MODEL_TRANSFORMATION_URI, T2G_MODEL_TRANSFORMATION_URI,
                G2T_TRACE_TRANSFORMATION_URI, TestEnvironmentConstants.TEST_PLUGIN_ID);
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
