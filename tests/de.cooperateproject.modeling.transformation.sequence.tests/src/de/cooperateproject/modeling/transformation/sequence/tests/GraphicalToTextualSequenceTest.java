package de.cooperateproject.modeling.transformation.sequence.tests;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage;
import de.cooperateproject.modeling.transformation.sequence.SequenceActivator;

public class GraphicalToTextualSequenceTest extends SequenceDirectionalTransformationTestBase {

    private static final URI TRANSFORMATION_URI = createTransformationURI(SequenceActivator.PLUGIN_ID, "Graphical_to_Textual_for_Sequence.qvto");

    static {
        SequencePackage.eINSTANCE.eClass();
    }

    public GraphicalToTextualSequenceTest() {
        super(TRANSFORMATION_URI, "notation", "xmi", TestEnvironmentConstants.TEST_PLUGIN_ID);
    }

    @Test
    public void testDefault() throws Exception {
        testRegular("SequenceDiagram");
    }

    @Test
    public void testDefaultIncremental() throws Exception {
        testIncremental("SequenceDiagram");
    }

    @Test
    public void testNestedExecutions() throws Exception {
        testRegular("SequenceNestedExecutionSpecification");
    }

    @Test
    public void testNestedExecutionsIncremental() throws Exception {
        testIncremental("SequenceNestedExecutionSpecification");
    }

    @Test
    public void testCombinedFragments() throws Exception {
        testRegular("SequenceCombinedFragments");
    }

    @Test
    public void testCombinedFragmentsIncremental() throws Exception {
        testIncremental("SequenceCombinedFragments");
    }

    @Test
    public void testCreationDestruction() throws Exception {
        testRegular("SequenceCreationDestruction");
    }

    @Test
    public void testCreationDestructionIncremental() throws Exception {
        testIncremental("SequenceCreationDestruction");
    }
}
