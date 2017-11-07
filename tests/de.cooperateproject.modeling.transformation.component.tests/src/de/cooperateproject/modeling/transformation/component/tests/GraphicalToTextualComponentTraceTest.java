package de.cooperateproject.modeling.transformation.component.tests;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import de.cooperateproject.modeling.textual.component.cmp.CmpPackage;
import de.cooperateproject.modeling.transformation.component.ComponentActivator;

public class GraphicalToTextualComponentTraceTest extends ComponentDirectionalTraceTransformationTestBase {

    private static final URI G2T_MODEL_TRANSFORMATION_URI = createTransformationURI(ComponentActivator.PLUGIN_ID,
            "Graphical_to_Textual_for_Component.qvto");
    private static final URI T2G_MODEL_TRANSFORMATION_URI = createTransformationURI(ComponentActivator.PLUGIN_ID,
            "Textual_to_Graphical_for_Component.qvto");
    private static final URI G2T_TRACE_TRANSFORMATION_URI = createTransformationURI(ComponentActivator.PLUGIN_ID,
            "Graphical_to_Textual_for_Component_Trace.qvto");

    static {
        CmpPackage.eINSTANCE.eClass();
    }

    public GraphicalToTextualComponentTraceTest() {
        super("notation", "xmi", G2T_MODEL_TRANSFORMATION_URI, T2G_MODEL_TRANSFORMATION_URI,
                G2T_TRACE_TRANSFORMATION_URI, TestEnvironmentConstants.TEST_PLUGIN_ID);
    }

    @Test
    public void testMinimal() throws Exception {
        testTraceTransformation("ComponentMinimal");
    }

    @Test
    public void testSingleComponent() throws Exception {
        testTraceTransformation("ComponentDiagramSingleComponent");
    }

    @Test
    public void testSingleInterface() throws Exception {
        testTraceTransformation("ComponentDiagramSingleInterface");
    }

    @Test
    public void testInnerClassifiers() throws Exception {
        testTraceTransformation("ComponentDiagramInnerClassifiers");
    }

    @Test
    public void testMultipleClassifiers() throws Exception {
        testTraceTransformation("ComponentDiagramMultipleClassifiers");
    }

    @Test
    public void testInterfaceAttribute() throws Exception {
        testTraceTransformation("ComponentDiagramInterfaceAttribute");
    }

    @Test
    public void testInterfaceMembers() throws Exception {
        testTraceTransformation("ComponentDiagramInterfaceMembers");
    }

    @Test
    public void testProvideInterface() throws Exception {
        testTraceTransformation("ComponentDiagramProvide");
    }

    @Test
    public void testProvideMultipleInterface() throws Exception {
        testTraceTransformation("ComponentDiagramMultipleProvide");
    }

    @Test
    public void testRequireInterface() throws Exception {
        testTraceTransformation("ComponentDiagramRequire");
    }

    @Test
    public void testRequireMultipleInterface() throws Exception {
        testTraceTransformation("ComponentDiagramMultipleRequire");
    }

    @Test
    public void testManifestation() throws Exception {
        testTraceTransformation("ComponentDiagramManifestation");
    }

    @Test
    public void testEntireClassifierRelations() throws Exception {
        testTraceTransformation("ComponentDiagramEntireClassifierRelations");
    }

    @Test
    public void testSinglePort() throws Exception {
        testTraceTransformation("ComponentDiagramSinglePort");
    }

    @Test
    public void testPorts() throws Exception {
        testTraceTransformation("ComponentDiagramPorts");
    }

    @Test
    public void testPortRelation() throws Exception {
        testTraceTransformation("ComponentDiagramPortRelation");
    }

    @Test
    public void testAliasedClassifier() throws Exception {
        testTraceTransformation("ComponentDiagramAliasedClassifier");
    }
    
    @Test
    public void testComponentDiagramPortTypeClass() throws Exception {
    	testTraceTransformation("ComponentDiagramPortTypeClass");
    }
}
