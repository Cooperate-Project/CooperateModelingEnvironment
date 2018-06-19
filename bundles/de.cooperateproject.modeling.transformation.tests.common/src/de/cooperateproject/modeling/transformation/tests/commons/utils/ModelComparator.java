package de.cooperateproject.modeling.transformation.tests.commons.utils;

import java.util.Collection;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.DifferenceSource;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.diff.DiffBuilder;
import org.eclipse.emf.compare.diff.IDiffEngine;
import org.eclipse.emf.compare.diff.IDiffProcessor;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.postprocessor.IPostProcessor;
import org.eclipse.emf.compare.postprocessor.PostProcessorDescriptorRegistryImpl;
import org.eclipse.emf.compare.rcp.EMFCompareRCPPlugin;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.runtime.notation.BooleanValueStyle;
import org.eclipse.gmf.runtime.notation.HintedDiagramLinkStyle;

public class ModelComparator {

    private final Collection<EAttribute> IGNORED_EATTRIBUTES;
    private final Collection<EClass> IGNORED_ECLASSES;
    
    private ModelComparisonFactory comparisonFactory;

    public ModelComparator(ModelComparisonFactory comparisonFactory) {
        this.comparisonFactory = comparisonFactory;
        this.IGNORED_EATTRIBUTES = comparisonFactory.createIgnoredEAttributes();
        this.IGNORED_ECLASSES = comparisonFactory.createIgnoredEClasses();
    }

    public Comparison compareStrict(Notifier expected, Notifier actual) {
        DefaultComparisonScope scope = new DefaultComparisonScope(expected, actual, null);
        return EMFCompare.builder().build().compare(scope);
    }

    public Comparison compare(Notifier expected, Notifier actual) {
        DefaultComparisonScope scope = new DefaultComparisonScope(expected, actual, null);
        scope.setEObjectContentFilter(o -> IGNORED_ECLASSES.stream().allMatch(c -> !c.isSuperTypeOf(o.eClass())));
        return createComparator().compare(scope);
    }

    protected EMFCompare createComparator() {
        // customize diff processor
        IDiffProcessor customDiffProcessor = new DiffBuilder() {
            @Override
            public void attributeChange(Match match, EAttribute attribute, Object value, DifferenceKind kind,
                    DifferenceSource source) {
                if (!IGNORED_EATTRIBUTES.contains(attribute)) {
                    super.attributeChange(match, attribute, value, kind, source);
                }
            }

            @Override
            public void referenceChange(Match match, EReference reference, EObject value, DifferenceKind kind,
                    DifferenceSource source) {
                if (!(value instanceof BooleanValueStyle) && !(value instanceof HintedDiagramLinkStyle)) {
                    super.referenceChange(match, reference, value, kind, source);
                }
            }
        };
        IDiffEngine diffEngine = comparisonFactory.createEMFCompareDiffEngine(customDiffProcessor);

        // customize matcher
        IMatchEngine.Factory.Registry matchEngineRegistry = null;
        if (isPluginEnvironment()) {
            matchEngineRegistry = EMFCompareRCPPlugin.getDefault().getMatchEngineFactoryRegistry();
        } else {
            matchEngineRegistry = MatchEngineFactoryRegistryImpl.createStandaloneInstance();
        }
        
        matchEngineRegistry.add(comparisonFactory.createMatchEngineFactory());

        // customize post processing
        IPostProcessor.Descriptor.Registry<String> postProcessorRegistry = null;
        if (isPluginEnvironment()) {
            postProcessorRegistry = EMFCompareRCPPlugin.getDefault().getPostProcessorRegistry();
        } else {
            postProcessorRegistry = new PostProcessorDescriptorRegistryImpl<String>();
        }
        comparisonFactory.registerPostProcessors(postProcessorRegistry);

        // create comparator
        return EMFCompare.builder().setMatchEngineFactoryRegistry(matchEngineRegistry).setDiffEngine(diffEngine)
                .setPostProcessorRegistry(postProcessorRegistry).build();
    }
    
    private static boolean isPluginEnvironment() {
        return ResourcesPlugin.getPlugin() != null;
    }

}
