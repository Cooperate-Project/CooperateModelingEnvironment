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

        testRegular("ComponentDiagramSingleComponent");
    }

    @Test
    public void testMinimalIncremental() throws Exception {
        testIncremental("ComponentMinimal");
    }

    @Test
    public void testSingleInterface() throws Exception {
        // setDebugSerializationDir(new File("D:\\Debug\\normaldebug"));
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
        // setDebugSerializationDir(new File("D:\\Debug\\T2G_Normal"));
        testRegular("ComponentDiagramInterfaceAttribute");
    }

    @Test
    public void testInterfaceMembers() throws Exception {
        // setDebugSerializationDir(new File("D:\\Debug\\T2G_Normal"));
        testRegular("ComponentDiagramInterfaceMembers");
    }

    @Test
    public void testProvideInterface() throws Exception {
        // setDebugSerializationDir(new File("D:\\Debug\\T2G_Normal"));
        testRegular("ComponentDiagramProvide");
    }

    @Test
    public void testMultipleProvide() throws Exception {
        // setDebugSerializationDir(new File("D:\\Debug\\T2G_Normal"));
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
        setDebugSerializationDir(new File("D:\\Debug\\T2G_Normal"));
        testRegular("ComponentDiagramManifestation");
    }
}
