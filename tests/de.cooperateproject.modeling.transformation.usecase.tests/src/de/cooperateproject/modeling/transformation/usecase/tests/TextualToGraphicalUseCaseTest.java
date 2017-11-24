package de.cooperateproject.modeling.transformation.usecase.tests;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;

public class TextualToGraphicalUseCaseTest extends UsecaseDirectionalTransformationTestBase {

    private static final URI TRANSFORMATION_URI = createTransformationURI(TestEnvironmentConstants.PLUGIN_ID,
            "Textual_to_Graphical_for_UseCase.qvto");

    static {
        UsecasePackage.eINSTANCE.eClass();
    }

    public TextualToGraphicalUseCaseTest() {
        super(TRANSFORMATION_URI, "xmi", "notation", TestEnvironmentConstants.TEST_PLUGIN_ID);
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
    
    @Test
    public void testExtension() throws Exception {
        testRegular("UseCaseDiagramExtension");
    }

    @Test
    public void testExtensionIncremental() throws Exception {
        testIncremental("UseCaseDiagramExtension");
    }
    
    @Test
    public void testActorTypes() throws Exception {
        testRegular("UseCaseDiagramActorTypes");
    }
    
    @Test
    public void testActorTypesIncremental() throws Exception {
        testIncremental("UseCaseDiagramActorTypes");
    }

}
