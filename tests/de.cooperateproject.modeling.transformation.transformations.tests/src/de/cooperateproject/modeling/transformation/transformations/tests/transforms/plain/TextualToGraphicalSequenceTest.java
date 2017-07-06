package de.cooperateproject.modeling.transformation.transformations.tests.transforms.plain;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage;

public class TextualToGraphicalSequenceTest extends DirectionalTransformationTestBase {

    private static final URI TRANSFORMATION_URI = createTransformationURI("Textual_to_Graphical_for_Sequence.qvto");

    static {
        SequencePackage.eINSTANCE.eClass();
    }

    public TextualToGraphicalSequenceTest() {
        super(TRANSFORMATION_URI, "xmi", "notation");
    }

    @Test
    public void testDefault() throws Exception {
        testRegular("SequenceDiagram");
    }

    @Test
    public void testDefaultIncremental() throws Exception {
        testIncremental("SequenceDiagram");
    }
}
