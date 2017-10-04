package de.cooperateproject.modeling.transformation.component.tests;

import org.eclipse.emf.common.util.URI;
import org.junit.BeforeClass;

import de.cooperateproject.modeling.transformation.tests.commons.DirectedTraceTransformationTestBase;

public class ComponentDirectionalTraceTransformationTestBase extends DirectedTraceTransformationTestBase {
    
    protected ComponentDirectionalTraceTransformationTestBase(String sourceFileExtension, String targetFileExtension,
            URI sourceToTargetTransformationUri, URI targetToSourceTransformationUri,
            URI sourceToTargetTraceTransformationUri, String testPluginId) {
        super(sourceFileExtension, targetFileExtension, sourceToTargetTransformationUri, targetToSourceTransformationUri,
                sourceToTargetTraceTransformationUri, testPluginId);
    }

    @BeforeClass
    public static void initTestSpecificMappings() throws Exception {
        ComponentDirectionalTransformationTestBase.initialize();
    }

}
