package de.cooperateproject.modeling.transformation.tests.commons.utils;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.compare.CompareFactory;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.compare.diff.IDiffEngine;
import org.eclipse.emf.compare.diff.IDiffProcessor;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.postprocessor.BasicPostProcessorDescriptorImpl;
import org.eclipse.emf.compare.postprocessor.IPostProcessor;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.net4j.util.collection.Pair;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class ModelComparisonFactoryImpl implements ModelComparisonFactory {
    private static class NotationPostProcessor extends NOPPostProcessor {

        public static IPostProcessor.Descriptor getDescriptor() {
            NotationPostProcessor instance = new NotationPostProcessor();
            return new BasicPostProcessorDescriptorImpl(instance,
                    Pattern.compile("http://www.eclipse.org/gmf/runtime/[0-9.]+/notation"), null);
        }

        @FunctionalInterface
        private interface ValueGetter {
            public EObject getValue(Match m);
        }

        private interface ValueAccessor {
            public EObject getValue(Match m);

            public void setValue(Match m, EObject v);
        }

        private static class LeftValueAccessor implements ValueAccessor {
            @Override
            public EObject getValue(Match m) {
                return m.getLeft();
            }

            @Override
            public void setValue(Match m, EObject v) {
                m.setLeft(v);
            }
        }

        private static class RightValueAccessor implements ValueAccessor {
            @Override
            public EObject getValue(Match m) {
                return m.getRight();
            }

            @Override
            public void setValue(Match m, EObject v) {
                m.setRight(v);
            }
        }

        @Override
        public void postMatch(Comparison comparison, Monitor monitor) {
            LinkedList<Match> queue = Lists.newLinkedList(comparison.getMatches());
            while (!queue.isEmpty()) {
                Match currentMatch = queue.pop();
                queue.addAll(currentMatch.getSubmatches());

                if (currentMatch.getLeft() != null && currentMatch.getRight() != null) {
                    continue;
                }

                ValueAccessor originalValueAccessor = currentMatch.getLeft() != null ? new LeftValueAccessor()
                        : new RightValueAccessor();
                ValueAccessor candidateValueAccessor = currentMatch.getLeft() != null ? new RightValueAccessor()
                        : new LeftValueAccessor();

                EObject value = originalValueAccessor.getValue(currentMatch);
                EReference valueReference = value.eContainmentFeature();
                EClass valueClass = value.eClass();

                Match parentMatch = (Match) currentMatch.eContainer();
                Set<Match> candidates = parentMatch.getSubmatches().stream()
                        .filter(m -> originalValueAccessor.getValue(m) == null)
                        .filter(m -> candidateValueAccessor.getValue(m) != null)
                        .map(m -> Pair.create(m, candidateValueAccessor.getValue(m)))
                        .filter(m -> valueClass.isSuperTypeOf(m.getElement2().eClass()))
                        .filter(m -> valueReference == m.getElement2().eContainmentFeature()).map(m -> m.getElement1())
                        .collect(Collectors.toSet());

                if (candidates.size() != 1) {
                    continue;
                }

                Match identifiedMatch = candidates.iterator().next();
                EObject identifiedValue = candidateValueAccessor.getValue(identifiedMatch);

                Match newMatch = CompareFactory.eINSTANCE.createMatch();
                originalValueAccessor.setValue(newMatch, value);
                candidateValueAccessor.setValue(newMatch, identifiedValue);

                queue.remove(identifiedMatch);
                parentMatch.getSubmatches().remove(currentMatch);
                parentMatch.getSubmatches().remove(identifiedMatch);
                parentMatch.getSubmatches().add(newMatch);
            }
        }
    };
	
    private FeatureFilterFactory featureFilterFactory = null;

    public ModelComparisonFactoryImpl() {
        featureFilterFactory = new DefaultFeatureFilterFactory();
    }

    @Override
    public IDiffEngine createEMFCompareDiffEngine(IDiffProcessor processor) {
        return new DefaultDiffEngine(processor) {
            @Override
            protected FeatureFilter createFeatureFilter() {
                return featureFilterFactory.createFeatureFilter();
            }
        };
    }

    public void setFeatureFilterFactory(FeatureFilterFactory featureFilterFactory) {
        this.featureFilterFactory = featureFilterFactory;
    }
    
    public IMatchEngine.Factory createMatchEngineFactory() {
        final MatchEngineFactoryImpl matchEngineFactory = new MatchEngineFactoryImpl(UseIdentifiers.NEVER);
        matchEngineFactory.setRanking(20);
        return matchEngineFactory;
    }
    
    public void registerPostProcessors(IPostProcessor.Descriptor.Registry<String> registry) {
        registry.put(NotationPostProcessor.class.getName(), NotationPostProcessor.getDescriptor());
    }
    
    public Collection<EClass> createIgnoredEClasses() {
        Collection<EClass> filter = Sets.newHashSet();

        filter.add(NotationPackage.eINSTANCE.getIdentityAnchor());
        filter.add(EcorePackage.eINSTANCE.getEAnnotation());
        filter.add(EcorePackage.eINSTANCE.getEStringToStringMapEntry());

        return filter;
    }

    public Collection<EAttribute> createIgnoredEAttributes() {
        Collection<EAttribute> filter = Sets.newHashSet();

        filter.add(NotationPackage.eINSTANCE.getLocation_X());
        filter.add(NotationPackage.eINSTANCE.getLocation_Y());
        filter.add(NotationPackage.eINSTANCE.getSize_Height());
        filter.add(NotationPackage.eINSTANCE.getSize_Width());
        filter.add(NotationPackage.eINSTANCE.getRelativeBendpoints_Points());
        filter.add(NotationPackage.eINSTANCE.getRoutingStyle_Routing());
        filter.add(NotationPackage.eINSTANCE.getFillStyle_FillColor());

        return filter;
    }

}
