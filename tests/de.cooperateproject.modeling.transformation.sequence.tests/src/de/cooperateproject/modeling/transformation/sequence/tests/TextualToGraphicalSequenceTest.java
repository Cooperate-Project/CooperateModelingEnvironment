package de.cooperateproject.modeling.transformation.sequence.tests;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.junit.Test;

import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage;
import de.cooperateproject.modeling.transformation.sequence.SequenceActivator;
import de.cooperateproject.modeling.transformation.tests.commons.utils.FeatureFilterFactory;
import de.cooperateproject.modeling.transformation.tests.commons.utils.ModelComparisonFactory;
import de.cooperateproject.modeling.transformation.tests.commons.utils.ModelComparisonFactoryImpl;

public class TextualToGraphicalSequenceTest extends SequenceDirectionalTransformationTestBase {

    private static final URI TRANSFORMATION_URI = createTransformationURI(SequenceActivator.PLUGIN_ID, "Textual_to_Graphical_for_Sequence.qvto");
    private static final Collection<EStructuralFeature> ORDER_INSENSITIVE_FEATURES = Collections
            .unmodifiableList(Arrays.asList(NotationPackage.eINSTANCE.getView_PersistedChildren(),
                    NotationPackage.eINSTANCE.getDiagram_PersistedEdges()));

    static {
        SequencePackage.eINSTANCE.eClass();
    }

    public TextualToGraphicalSequenceTest() {
        super(TRANSFORMATION_URI, "xmi", "notation", TestEnvironmentConstants.TEST_PLUGIN_ID);
    }

    @Override
    protected ModelComparisonFactory getModelComparisonFactory() {
        ModelComparisonFactoryImpl factory = new ModelComparisonFactoryImpl();
        factory.setFeatureFilterFactory(new FeatureFilterFactory() {

            @Override
            public FeatureFilter createFeatureFilter() {
                return new FeatureFilter() {
                    @Override
                    public boolean checkForOrderingChanges(EStructuralFeature feature) {
                        return ORDER_INSENSITIVE_FEATURES.contains(feature) ? false
                                : super.checkForOrderingChanges(feature);
                    }
                };
            }
        });

        return factory;
    }

    @Test
    public void testDefault() throws Exception {
        testRegular("SequenceDiagram");
    }

    @Test
    public void testDefaultIncremental() throws Exception {
        testIncremental("SequenceDiagram");
    }

    @Test
    public void testNestedExecutions() throws Exception {
        testRegular("SequenceNestedExecutionSpecification");
    }

    @Test
    public void testNestedExecutionsIncremental() throws Exception {
        testIncremental("SequenceNestedExecutionSpecification");
    }

    @Test
    public void testCombinedFragments() throws Exception {
        testRegular("SequenceCombinedFragments");
    }

    @Test
    public void testCombinedFragmentsIncremental() throws Exception {
        testIncremental("SequenceCombinedFragments");
    }

    @Test
    public void testCreationDestruction() throws Exception {
        testRegular("SequenceCreationDestruction");
    }

    @Test
    public void testCreationDestructionIncremental() throws Exception {
        testIncremental("SequenceCreationDestruction");
    }
}
