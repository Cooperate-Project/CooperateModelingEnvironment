package de.cooperateproject.modeling.transformation.transformations.tests.transforms.plain;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage;

public class GraphicalToTextualSequenceTest extends DirectionalTransformationTestBase {

    private static final URI TRANSFORMATION_URI = createTransformationURI("Graphical_to_Textual_for_Sequence.qvto");

    static {
        SequencePackage.eINSTANCE.eClass();
    }

    public GraphicalToTextualSequenceTest() {
        super(TRANSFORMATION_URI, "notation", "xmi");
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
}
