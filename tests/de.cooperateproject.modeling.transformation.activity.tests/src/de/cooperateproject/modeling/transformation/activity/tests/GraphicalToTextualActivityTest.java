package de.cooperateproject.modeling.transformation.activity.tests;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import de.cooperateproject.modeling.textual.activity.act.ActPackage;
import de.cooperateproject.modeling.transformation.activity.ActivityActivator;

public class GraphicalToTextualActivityTest extends ActivityDirectionalTransformationTestBase {

    private static final URI TRANSFORMATION_URI = createTransformationURI(ActivityActivator.PLUGIN_ID,
            "Graphical_to_Textual_for_Activity.qvto");

    static {
        ActPackage.eINSTANCE.eClass();
    }

    public GraphicalToTextualActivityTest() {
        super(TRANSFORMATION_URI, "notation", "xmi", TestEnvironmentConstants.TEST_PLUGIN_ID);
    }
    
    @Test
    public void testSimpleActivityDiagram() throws Exception {
		setDebugSerializationDir(new File("db"));
        testRegular("SimpleActivityDiagram");
    }

    @Test
    public void testSimpleActivityDiagramIncremental() throws Exception {
        testIncremental("SimpleActivityDiagram");
    }
    
    @Test
    public void testActivityDiagramNodesFlowsAlias() throws Exception {
        testRegular("ActivityDiagramNodesFlowsAlias");
    }

    @Test
    public void testActivityDiagramNodesFlowsAliasIncremental() throws Exception {
        testIncremental("ActivityDiagramNodesFlowsAlias");
    }
    
    @Test
    public void testActivityDiagramDecision() throws Exception {
        testRegular("ActivityDiagramDecision");
    }

    @Test
    public void testActivityDiagramDecisionIncremental() throws Exception {
        testIncremental("ActivityDiagramDecision");
    }
    
    @Test
    public void testActivityDiagramAllNodes() throws Exception {
        testRegular("ActivityDiagramAllNodes");
    }

    @Test
    public void testActivityDiagramAllNodesIncremental() throws Exception {
        testIncremental("ActivityDiagramAllNodes");
    }
    
    @Test
    public void testActivityDiagramSwimlanes() throws Exception {
		setDebugSerializationDir(new File("debug"));
        testRegular("ActivityDiagramSwimlanes");
    }

    @Test
    public void testActivityDiagramSwimlanesIncremental() throws Exception {
        testIncremental("ActivityDiagramSwimlanes");
    }

}
