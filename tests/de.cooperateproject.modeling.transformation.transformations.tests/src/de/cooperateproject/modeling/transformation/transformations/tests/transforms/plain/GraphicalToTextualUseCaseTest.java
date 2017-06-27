package de.cooperateproject.modeling.transformation.transformations.tests.transforms.plain;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;

public class GraphicalToTextualUseCaseTest extends DirectionalTransformationTestBase {

    private static final URI TRANSFORMATION_URI = createTransformationURI("Graphical_to_Textual_for_Usecase.qvto");

    static {
        UsecasePackage.eINSTANCE.eClass();
    }

    public GraphicalToTextualUseCaseTest() {
        super(TRANSFORMATION_URI, "notation", "xmi");
    }

    @Test
    public void testDefault() throws Exception {
        testRegular("UseCaseDiagram");
    }

    @Test
    public void testDefaultIncremental() throws Exception {
        testIncremental("UseCaseDiagram");
    }

    @Test
    public void testNotes() throws Exception {
        testRegular("UseCaseDiagramNotes");
    }

    @Test
    public void testNotesIncremental() throws Exception {
        testIncremental("UseCaseDiagramNotes");
    }

}
