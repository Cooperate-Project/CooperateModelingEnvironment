package de.cooperateproject.modeling.transformation.transformations.tests.transforms.plain;

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
        testRegular("ComponentMinimal");
    }

    @Test
    public void testSingleComponent() throws Exception {
        testRegular("ComponentDiagramSingleComponent");
    }

    @Test
    public void testMinimalIncremental() throws Exception {
        testIncremental("ComponentMinimal");
    }

    @Test
    public void testSingleInterface() throws Exception {
        testRegular("ComponentDiagramSingleInterface");
    }

    @Test
    public void testMultipleClassifiers() throws Exception {
        testRegular("ComponentDiagramMultipleClassifiers");
    }

    @Test
    public void testInnerClassifiers() throws Exception {
        testRegular("ComponentDiagramInnerClassifiers");
    }

    @Test
    public void testInterfaceAttribute() throws Exception {
        testRegular("ComponentDiagramInterfaceAttribute");
    }

    @Test
    public void testInterfaceMembers() throws Exception {
        testRegular("ComponentDiagramInterfaceMembers");
    }

    @Test
    public void testProvideInterface() throws Exception {
        testRegular("ComponentDiagramProvide");
    }

    @Test
    public void testMultipleProvide() throws Exception {
        testRegular("ComponentDiagramMultipleProvide");
    }

    @Test
    public void testRequireInterface() throws Exception {
        testRegular("ComponentDiagramRequire");
    }

    @Test
    public void testMultipleRequire() throws Exception {
        testRegular("ComponentDiagramMultipleRequire");
    }

    @Test
    public void testManifestation() throws Exception {
        testRegular("ComponentDiagramManifestation");
    }

    @Test
    public void testEntireClassiferRelations() throws Exception {
        testRegular("ComponentDiagramEntireClassifierRelations");
    }

    @Test
    public void testComponentDiagramPorts() throws Exception {
        testRegular("ComponentDiagramPorts");
    }

    @Test
    public void testComponentDiagramSinglePort() throws Exception {
        testRegular("ComponentDiagramSinglePort");
    }

    @Test
    public void testComponentDiagramPortRelation() throws Exception {
        testRegular("ComponentDiagramPortRelation");
    }

    @Test
    public void testComponentDiagramAliasedClassifier() throws Exception {
        testRegular("ComponentDiagramAliasedClassifier");
    }
}
