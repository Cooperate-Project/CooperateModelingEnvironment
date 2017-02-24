package de.cooperateproject.modeling.transformation.transformations.tests.transforms.plain;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;

public class TextualToGraphicalUseCaseTest extends DirectionalTransformationTestBase {

    private static final URI TRANSFORMATION_URI = createTransformationURI("Textual_to_Graphical_for_UseCase.qvto");

    static {
        UsecasePackage.eINSTANCE.eClass();
    }

    public TextualToGraphicalUseCaseTest() {
        super(TRANSFORMATION_URI, "xmi", "notation");
    }

    @Test
    public void testDefault() throws Exception {
        testRegular("UseCaseDiagram");
    }

    @Test
    public void testDefaultIncremental() throws Exception {
        testIncremental("UseCaseDiagram");
    }

}
