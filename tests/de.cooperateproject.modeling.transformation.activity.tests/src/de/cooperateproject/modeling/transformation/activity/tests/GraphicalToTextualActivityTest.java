package de.cooperateproject.modeling.transformation.activity.tests;

import org.eclipse.emf.common.util.URI;

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

}
