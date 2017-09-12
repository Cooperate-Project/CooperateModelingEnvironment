package de.cooperateproject.modeling.transformation.usecase.tests;

import org.eclipse.emf.common.util.URI;
import org.junit.BeforeClass;

import de.cooperateproject.modeling.transformation.tests.commons.DirectionalTransformationTestBase;
import de.cooperateproject.modeling.transformation.tests.commons.TransformationTestBase;
import de.cooperateproject.modeling.transformation.usecase.UsecaseActivator;

public class UsecaseDirectionalTransformationTestBase extends DirectionalTransformationTestBase {

    protected UsecaseDirectionalTransformationTestBase(URI transformationUri, String sourceFileExtension,
            String targetFileExtension, String resourcePluginId) {
        super(transformationUri, sourceFileExtension, targetFileExtension, resourcePluginId);
    }
    
    @BeforeClass
    public static void initialize() throws Exception {
        TransformationTestBase.initialize(delegate -> {
            delegate.registerPlatformUris(UsecaseActivator.PLUGIN_ID, UsecaseActivator.class);
            delegate.registerPlatformUris(TestEnvironmentConstants.TEST_PLUGIN_ID, TestEnvironmentConstants.class);
            delegate.registerQVTOResolutionURIs(createPlatformURI(UsecaseActivator.PLUGIN_ID).appendSegment("transforms"));
            TransformationTestBase.initEnvironment(delegate);
        });
    }

}
