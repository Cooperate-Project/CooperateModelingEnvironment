package de.cooperateproject.modeling.transformation.activity.tests;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.junit.Test;

import com.google.common.collect.Lists;

import de.cooperateproject.modeling.textual.activity.act.ActPackage;
import de.cooperateproject.modeling.transformation.activity.ActivityActivator;
import de.cooperateproject.modeling.transformation.tests.commons.utils.MatchValueSideConverter;

public class TextualToGraphicalActivityTest extends ActivityDirectionalTransformationTestBase {

    private static final URI TRANSFORMATION_URI = createTransformationURI(ActivityActivator.PLUGIN_ID,
            "Textual_to_Graphical_for_Activity.qvto");

    static {
        ActPackage.eINSTANCE.eClass();
    }

    public TextualToGraphicalActivityTest() {
        super(TRANSFORMATION_URI, "xmi", "notation", TestEnvironmentConstants.TEST_PLUGIN_ID);
    }
    
    @Test
    public void testSimpleActivityDiagram() throws Exception {
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
		setDebugSerializationDir(new File("debug"));
        testRegular("ActivityDiagramDecision");
    }

    @Test
    public void testActivityDiagramDecisionIncremental() throws Exception {
        testIncremental("ActivityDiagramDecision");
    }

    @Override
    protected void testRegular(String modelName) throws Exception {
        super.testRegular(modelName, TextualToGraphicalActivityTest::postProcessDifferences);
    }

    private static Collection<Diff> postProcessDifferences(Collection<Diff> diffs) {
        List<Diff> result = Lists.newLinkedList();

        LinkedList<ReferenceChange> potentialCorrectReferences = Lists
                .newLinkedList(diffs.stream().filter(d -> d instanceof ReferenceChange).map(d -> (ReferenceChange) d)
                        .filter(d -> Arrays.asList(NotationPackage.eINSTANCE.getEdge_Source(),
                                NotationPackage.eINSTANCE.getEdge_Target()).contains(d.getReference()))
                        .collect(Collectors.toSet()));

        while (!potentialCorrectReferences.isEmpty()) {
            ReferenceChange c1 = potentialCorrectReferences.pop();
            Set<ReferenceChange> candidates = potentialCorrectReferences.stream()
                    .filter(c -> c.getMatch() == c1.getMatch()).collect(Collectors.toSet());
            if (candidates.size() != 1) {
                continue;
            }
            ReferenceChange c2 = candidates.iterator().next();

            Match parentMatch = c1.getMatch();

            Connector matchLeft = (Connector) parentMatch.getLeft();
            View matchLeftSource = matchLeft.getSource();
            View matchLeftTarget = matchLeft.getTarget();

            Connector matchRight = (Connector) parentMatch.getRight();
            View matchRightSource = matchRight.getSource();
            View matchRightTarget = matchRight.getTarget();

            MatchValueSideConverter sideConverter = new MatchValueSideConverter();
            sideConverter.add(parentMatch.getComparison().getMatch(c1.getValue()));
            sideConverter.add(parentMatch.getComparison().getMatch(c2.getValue()));

            if (sideConverter.convert(matchLeftSource) == matchRightTarget
                    && sideConverter.convert(matchLeftTarget) == matchRightSource) {
                potentialCorrectReferences.remove(c2);
                result.add(c1);
                result.add(c2);
            }
        }

        return result;
    }

}
