package de.cooperateproject.modeling.transformation.transformations.tests.transforms.plain;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import de.cooperateproject.modeling.textual.cmp.cmp.CmpPackage;

public class TextualToGraphicalComponentTest extends DirectionalTransformationTestBase {

    private static final URI TRANSFORMATION_URI = createTransformationURI("Textual_to_Graphical_for_Component.qvto");

    static {
        CmpPackage.eINSTANCE.eClass();
    }

    public TextualToGraphicalComponentTest() {
        super(TRANSFORMATION_URI, "xmi", "notation");
    }

    @Test
    public void testMinimal() throws Exception {
        setDebugSerializationDir(new File("D:\\Debug\\normaldebug1"));
        testRegular("ComponentMinimal");
    }

    @Test
    public void testSingleComponent() throws Exception {
        setDebugSerializationDir(new File("D:\\Debug\\normaldebug"));
        testRegular("ComponentDiagramSingleComponent");
    }

    @Test
    public void testMinimalIncremental() throws Exception {
        testIncremental("ComponentMinimal");
    }

}
