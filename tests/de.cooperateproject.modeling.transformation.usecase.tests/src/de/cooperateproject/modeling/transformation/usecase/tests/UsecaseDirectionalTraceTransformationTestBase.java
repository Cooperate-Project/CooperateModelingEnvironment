package de.cooperateproject.modeling.transformation.usecase.tests;

import org.eclipse.emf.common.util.URI;
import org.junit.BeforeClass;

import de.cooperateproject.modeling.transformation.tests.commons.DirectedTraceTransformationTestBase;

public class UsecaseDirectionalTraceTransformationTestBase extends DirectedTraceTransformationTestBase {

    
    protected UsecaseDirectionalTraceTransformationTestBase(String sourceFileExtension, String targetFileExtension,
            URI sourceToTargetTransformationUri, URI targetToSourceTransformationUri,
            URI sourceToTargetTraceTransformationUri, String testPluginId) {
        super(sourceFileExtension, targetFileExtension, sourceToTargetTransformationUri, targetToSourceTransformationUri,
                sourceToTargetTraceTransformationUri, testPluginId);
    }

    @BeforeClass
    public static void initTestSpecificMappings() throws Exception {
        UsecaseDirectionalTransformationTestBase.initialize();
    }

}
