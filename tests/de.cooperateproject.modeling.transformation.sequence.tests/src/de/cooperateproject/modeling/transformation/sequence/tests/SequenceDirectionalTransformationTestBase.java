package de.cooperateproject.modeling.transformation.sequence.tests;

import org.eclipse.emf.common.util.URI;
import org.junit.BeforeClass;

import de.cooperateproject.modeling.transformation.sequence.SequenceActivator;
import de.cooperateproject.modeling.transformation.tests.commons.DirectionalTransformationTestBase;
import de.cooperateproject.modeling.transformation.tests.commons.TransformationTestBase;

public class SequenceDirectionalTransformationTestBase extends DirectionalTransformationTestBase {

    protected SequenceDirectionalTransformationTestBase(URI transformationUri, String sourceFileExtension,
            String targetFileExtension, String resourcePluginId) {
        super(transformationUri, sourceFileExtension, targetFileExtension, resourcePluginId);
    }
    
    @BeforeClass
    public static void initialize() throws Exception {
        TransformationTestBase.initialize(delegate -> {
            delegate.registerPlatformUris(SequenceActivator.PLUGIN_ID, SequenceActivator.class);
            delegate.registerPlatformUris(TestEnvironmentConstants.TEST_PLUGIN_ID, TestEnvironmentConstants.class);
            delegate.registerQVTOResolutionURIs(createPlatformURI(SequenceActivator.PLUGIN_ID).appendSegment("transforms"));
            TransformationTestBase.initEnvironment(delegate);
        });
    }

}
