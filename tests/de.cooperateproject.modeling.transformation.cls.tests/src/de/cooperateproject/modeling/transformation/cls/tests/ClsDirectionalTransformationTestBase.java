package de.cooperateproject.modeling.transformation.cls.tests;

import org.eclipse.emf.common.util.URI;
import org.junit.BeforeClass;

import de.cooperateproject.modeling.transformation.cls.ClsActivator;
import de.cooperateproject.modeling.transformation.tests.commons.DirectionalTransformationTestBase;
import de.cooperateproject.modeling.transformation.tests.commons.TransformationTestBase;

public class ClsDirectionalTransformationTestBase extends DirectionalTransformationTestBase {

    protected ClsDirectionalTransformationTestBase(URI transformationUri, String sourceFileExtension,
            String targetFileExtension, String resourcePluginId) {
        super(transformationUri, sourceFileExtension, targetFileExtension, resourcePluginId);
    }
    
    @BeforeClass
    public static void initialize() throws Exception {
        TransformationTestBase.initialize(delegate -> {
            delegate.registerPlatformUris(ClsActivator.PLUGIN_ID, ClsActivator.class);
            delegate.registerPlatformUris(TestEnvironmentConstants.TEST_PLUGIN_ID, TestEnvironmentConstants.class);
            delegate.registerQVTOResolutionURIs(createPlatformURI(ClsActivator.PLUGIN_ID).appendSegment("transforms"));
            TransformationTestBase.initEnvironment(delegate);
        });
    }

}
