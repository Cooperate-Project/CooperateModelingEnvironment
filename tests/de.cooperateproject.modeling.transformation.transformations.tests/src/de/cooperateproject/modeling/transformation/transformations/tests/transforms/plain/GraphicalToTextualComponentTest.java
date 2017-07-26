package de.cooperateproject.modeling.transformation.transformations.tests.transforms.plain;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage;

public class GraphicalToTextualComponentTest extends DirectionalTransformationTestBase {

    private static final URI TRANSFORMATION_URI = createTransformationURI("Graphical_to_Textual_for_Component.qvto");

    static {
        ComponentPackage.eINSTANCE.eClass();
    }

    public GraphicalToTextualComponentTest() {
        super(TRANSFORMATION_URI, "notation", "xmi");
    }

    @Test
    public void testMinimal() throws Exception {
        testRegular("ComponentMinimal");
    }

    @Test
    public void testMinimalIncremental() throws Exception {
        testIncremental("ComponentMinimal");
    }

}
