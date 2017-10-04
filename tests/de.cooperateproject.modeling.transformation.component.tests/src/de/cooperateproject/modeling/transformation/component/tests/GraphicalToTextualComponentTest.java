package de.cooperateproject.modeling.transformation.component.tests;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import de.cooperateproject.modeling.textual.cmp.cmp.CmpPackage;
import de.cooperateproject.modeling.transformation.component.ComponentActivator;

public class GraphicalToTextualComponentTest extends ComponentDirectionalTransformationTestBase {

    private static final URI TRANSFORMATION_URI = createTransformationURI(ComponentActivator.PLUGIN_ID, 
            "Graphical_to_Textual_for_Component.qvto");

    static {
        CmpPackage.eINSTANCE.eClass();
    }

    public GraphicalToTextualComponentTest() {
        super(TRANSFORMATION_URI, "notation", "xmi", TestEnvironmentConstants.TEST_PLUGIN_ID);
    }

    @Test
    public void testMinimal() throws Exception {
        testRegular("ComponentMinimal");
    }

    @Test
    public void testMinimalIncremental() throws Exception {
        testIncremental("ComponentMinimal");
    }

    @Test
    public void testSingleComponent() throws Exception {
        testRegular("ComponentDiagramSingleComponent");
    }

    @Test
    public void testSingleInterface() throws Exception {
        testRegular("ComponentDiagramSingleInterface");
    }

    @Test
    public void testInnerClassifiers() throws Exception {
        testRegular("ComponentDiagramInnerClassifiers");
    }

    @Test
    public void testMultipleClassifiers() throws Exception {
        testRegular("ComponentDiagramMultipleClassifiers");
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
    public void testProvide() throws Exception {
        testRegular("ComponentDiagramProvide");
    }

    @Test
    public void testMultipleProvide() throws Exception {
        testRegular("ComponentDiagramMultipleProvide");
    }

    @Test
    public void testRequire() throws Exception {
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
    public void testComponentDiagramEntireClassifierRelations() throws Exception {
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
