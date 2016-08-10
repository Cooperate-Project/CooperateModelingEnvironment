package de.cooperateproject.modeling.transformation.transformations.tests.util;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.compare.CompareFactory;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.DifferenceSource;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.diff.DiffBuilder;
import org.eclipse.emf.compare.diff.IDiffEngine;
import org.eclipse.emf.compare.diff.IDiffProcessor;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.postprocessor.BasicPostProcessorDescriptorImpl;
import org.eclipse.emf.compare.postprocessor.IPostProcessor;
import org.eclipse.emf.compare.postprocessor.PostProcessorDescriptorRegistryImpl;
import org.eclipse.emf.compare.rcp.EMFCompareRCPPlugin;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.net4j.util.collection.Pair;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class ModelComparator {

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
	
	private static final Collection<EAttribute> IGNORED_EATTRIBUTES = createIgnoredEAttributes();
	private static final Collection<EClass> IGNORED_ECLASSES = createIgnoredEClasses();
	
	public static Comparison compare(EObject expected, EObject actual) {
		DefaultComparisonScope scope = new DefaultComparisonScope(expected, actual, null);
		scope.setEObjectContentFilter(o -> IGNORED_ECLASSES.stream().allMatch(c -> !c.isSuperTypeOf(o.eClass())));
		return createComparator().compare(scope);
	}
	
	private static EMFCompare createComparator() {
		// customize diff processor
		IDiffProcessor customDiffProcessor = new DiffBuilder() {
			@Override
			public void attributeChange(Match match, EAttribute attribute, Object value, DifferenceKind kind,
					DifferenceSource source) {
				if (!IGNORED_EATTRIBUTES.contains(attribute)) {
					super.attributeChange(match, attribute, value, kind, source);
				}
			}
		};
		IDiffEngine diffEngine = new DefaultDiffEngine(customDiffProcessor);

		// customize matcher
		IMatchEngine.Factory.Registry matchEngineRegistry = null;
		if (isPluginEnvironment()) {
			matchEngineRegistry = EMFCompareRCPPlugin.getDefault().getMatchEngineFactoryRegistry();
		} else {
			matchEngineRegistry = MatchEngineFactoryRegistryImpl.createStandaloneInstance();
		}
		final MatchEngineFactoryImpl matchEngineFactory = new MatchEngineFactoryImpl(UseIdentifiers.NEVER);
		matchEngineFactory.setRanking(20);
		matchEngineRegistry.add(matchEngineFactory);

		// customize post processing
		IPostProcessor.Descriptor.Registry<String> postProcessorRegistry = null;
		if (isPluginEnvironment()) {
			postProcessorRegistry = EMFCompareRCPPlugin.getDefault().getPostProcessorRegistry();
		} else {
			postProcessorRegistry = new PostProcessorDescriptorRegistryImpl<String>();
		}
		postProcessorRegistry.put(NotationPostProcessor.class.getName(), NotationPostProcessor.getDescriptor());

		// create comparator
		return EMFCompare.builder().setMatchEngineFactoryRegistry(matchEngineRegistry)
				.setDiffEngine(diffEngine).setPostProcessorRegistry(postProcessorRegistry).build();
	}
	
	private static Collection<EClass> createIgnoredEClasses() {
		Collection<EClass> filter = Sets.newHashSet();
		
		filter.add(NotationPackage.eINSTANCE.getIdentityAnchor());
		
		return filter;
	}

	private static Collection<EAttribute> createIgnoredEAttributes() {
		Collection<EAttribute> filter = Sets.newHashSet();
		
		filter.add(NotationPackage.eINSTANCE.getLocation_X());
		filter.add(NotationPackage.eINSTANCE.getLocation_Y());
		filter.add(NotationPackage.eINSTANCE.getRelativeBendpoints_Points());
		
		return filter;
	}
	
	private static boolean isPluginEnvironment() {
		return ResourcesPlugin.getPlugin() != null;
	}
	
}
