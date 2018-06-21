package de.cooperateproject.modeling.transformation.activity.tests;

import org.eclipse.emf.common.util.URI;

import de.cooperateproject.modeling.textual.activity.act.ActPackage;
import de.cooperateproject.modeling.transformation.activity.ActivityActivator;

public class TextualToGraphicalActivityTraceTest extends ActivityDirectionalTraceTransformationTestBase {

    private static final URI T2G_MODEL_TRANSFORMATION_URI = createTransformationURI(ActivityActivator.PLUGIN_ID,
            "Textual_to_Graphical_for_Activity.qvto");
    private static final URI G2T_MODEL_TRANSFORMATION_URI = createTransformationURI(ActivityActivator.PLUGIN_ID,
            "Graphical_to_Textual_for_Activity.qvto");
    private static final URI T2G_TRACE_TRANSFORMATION_URI = createTransformationURI(ActivityActivator.PLUGIN_ID,
            "Textual_to_Graphical_for_Activity_Trace.qvto");

    static {
        ActPackage.eINSTANCE.eClass();
    }

    public TextualToGraphicalActivityTraceTest() {
        super("xmi", "notation", T2G_MODEL_TRANSFORMATION_URI, G2T_MODEL_TRANSFORMATION_URI,
                T2G_TRACE_TRANSFORMATION_URI, TestEnvironmentConstants.TEST_PLUGIN_ID);
    }
}
