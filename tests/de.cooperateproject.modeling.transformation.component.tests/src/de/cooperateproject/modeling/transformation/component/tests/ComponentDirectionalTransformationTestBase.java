package de.cooperateproject.modeling.transformation.component.tests;

import org.eclipse.emf.common.util.URI;
import org.junit.BeforeClass;

import de.cooperateproject.modeling.transformation.component.ComponentActivator;
import de.cooperateproject.modeling.transformation.tests.commons.DirectionalTransformationTestBase;
import de.cooperateproject.modeling.transformation.tests.commons.TransformationTestBase;

public class ComponentDirectionalTransformationTestBase extends DirectionalTransformationTestBase {

    protected ComponentDirectionalTransformationTestBase(URI transformationUri, String sourceFileExtension,
            String targetFileExtension, String resourcePluginId) {
        super(transformationUri, sourceFileExtension, targetFileExtension, resourcePluginId);
    }
    
    @BeforeClass
    public static void initialize() throws Exception {
        TransformationTestBase.initialize(delegate -> {
            delegate.registerPlatformUris(ComponentActivator.PLUGIN_ID, ComponentActivator.class);
            delegate.registerPlatformUris(TestEnvironmentConstants.TEST_PLUGIN_ID, TestEnvironmentConstants.class);
            delegate.registerQVTOResolutionURIs(createPlatformURI(ComponentActivator.PLUGIN_ID).appendSegment("transforms"));
            TransformationTestBase.initEnvironment(delegate);
        });
    }

}
