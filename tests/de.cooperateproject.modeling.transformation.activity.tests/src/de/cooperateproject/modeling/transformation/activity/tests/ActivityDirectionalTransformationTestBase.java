package de.cooperateproject.modeling.transformation.activity.tests;

import org.eclipse.emf.common.util.URI;
import org.junit.BeforeClass;

import de.cooperateproject.modeling.transformation.activity.ActivityActivator;
import de.cooperateproject.modeling.transformation.tests.commons.DirectionalTransformationTestBase;
import de.cooperateproject.modeling.transformation.tests.commons.TransformationTestBase;

public class ActivityDirectionalTransformationTestBase extends DirectionalTransformationTestBase {

    protected ActivityDirectionalTransformationTestBase(URI transformationUri, String sourceFileExtension,
            String targetFileExtension, String resourcePluginId) {
        super(transformationUri, sourceFileExtension, targetFileExtension, resourcePluginId);
    }
    
    @BeforeClass
    public static void initialize() throws Exception {
        TransformationTestBase.initialize(delegate -> {
            delegate.registerPlatformUris(ActivityActivator.PLUGIN_ID, ActivityActivator.class);
            delegate.registerPlatformUris(TestEnvironmentConstants.TEST_PLUGIN_ID, TestEnvironmentConstants.class);
            delegate.registerQVTOResolutionURIs(createPlatformURI(ActivityActivator.PLUGIN_ID).appendSegment("transforms"));
            TransformationTestBase.initEnvironment(delegate);
        });
    }

}
