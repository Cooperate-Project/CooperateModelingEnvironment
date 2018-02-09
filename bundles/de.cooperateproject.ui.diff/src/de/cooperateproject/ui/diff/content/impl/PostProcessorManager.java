package de.cooperateproject.ui.diff.content.impl;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import de.cooperateproject.ui.diff.content.DiffTreeItem;
import de.cooperateproject.ui.diff.content.IPostProcessor;
import de.cooperateproject.ui.diff.content.SummaryItem;
import de.cooperateproject.ui.diff.internal.IsTransitiveChildPredicate;
import de.cooperateproject.util.eclipse.ExtensionPointHelper;

/**
 * Finds the correct post-processor for the specific meta-model. Delegates the post-processing
 * request.
 * 
 * @author Jasmin, czogalik
 *
 */
public final class PostProcessorManager {

    private static final String EXTENSION_POINT_ID = "de.cooperateproject.ui.diff.postProcessor";
    private static final String METAMODEL_ATTRIBUTE_ID = "metamodel";
    private static final String CLASS_ATTRIBUTE_ID = "class";

    private PostProcessorManager() {
        // private constructor to hide creation of object
    }

    static Map<EObject, DiffTreeItem> postProcessDiffTree(Map<EObject, DiffTreeItem> tree) {
        if (tree.isEmpty()) {
            return tree;
        }

        Collection<EObject> keys = tree.keySet();
        // Find one item in the tree and check its type to know from
        // which meta model it is.
        EObject oneKey = keys.iterator().next();
        String objectType = oneKey.getClass().getPackage().getName();
        findPostProcessor(objectType).ifPresent(p -> p.postProcessDiffTreeBuilder(tree));
        return tree;
    }

	static List<SummaryItem> postProcessSummaryList(List<SummaryItem> summaryList) {
		if (summaryList.isEmpty()) {
			return summaryList;
		}

		List<SummaryItem> result = determineRelevantPackageName(summaryList)
				.flatMap(PostProcessorManager::findPostProcessor)
				.map(processor -> processor.postProcessSummaryViewBuilder(summaryList)).orElse(summaryList);

		return filterTransitivelyContainedChanges(result);
	}

	private static Optional<String> determineRelevantPackageName(Collection<SummaryItem> items) {
		return items.stream().map(PostProcessorManager::determineRelevantPackageName).filter(Optional::isPresent)
				.map(Optional::get).findAny();
	}

	private static Optional<String> determineRelevantPackageName(SummaryItem item) {
		return Arrays.asList(item.getChangedObject(), item.getNewValue(), item.getOldValue()).stream()
				.filter(Objects::nonNull).map(Object::getClass).map(Class::getPackage).map(Package::getName)
				.findFirst();
	}
    
    private static List<SummaryItem> filterTransitivelyContainedChanges(Collection<SummaryItem> summaryList) {
		Map<EObject, SummaryItem> parentItems = findAllAddAndDeleteChanges(summaryList);
		
		Collection<EObject> rootParentItems = parentItems.keySet().stream()
				.filter(test -> !parentItems.keySet().stream()
						.anyMatch(parent -> new IsTransitiveChildPredicate(parent, true).test(test)))
				.collect(Collectors.toSet());
		parentItems.entrySet().removeIf(entry -> !rootParentItems.contains(entry.getKey()));

		return summaryList.stream().filter(
				item -> !isAlreadyCoveredByParentElement(item, rootParentItems) || parentItems.containsValue(item))
				.collect(Collectors.toList());
	}

	private static Map<EObject, SummaryItem> findAllAddAndDeleteChanges(Collection<SummaryItem> summaryList) {
		Map<EObject, SummaryItem> parentItems = new HashMap<>();
		for (SummaryItem item : summaryList.stream().filter(PostProcessorManager::isContainmentChange)
				.collect(Collectors.toList())) {
			EObject changedElement;
			if (item.getDifferenceKind() == DifferenceKind.ADD) {
				changedElement = (EObject) item.getNewValue();
			} else if (item.getDifferenceKind() == DifferenceKind.DELETE) {
				changedElement = (EObject) item.getOldValue();
			} else {
				continue;
			}
			parentItems.put(changedElement, item);
		}
		return parentItems;
	}
    
	private static boolean isAlreadyCoveredByParentElement(SummaryItem summaryItem, Collection<EObject> parentElements) {
		Collection<EObject> summaryElements = Arrays
				.asList(summaryItem.getChangedObject(), summaryItem.getNewValue(), summaryItem.getOldValue()).stream()
				.filter(EObject.class::isInstance).map(EObject.class::cast).collect(Collectors.toSet());
		return parentElements.stream().anyMatch(
				parent -> summaryElements.stream().anyMatch(new IsTransitiveChildPredicate(parent, false)::test));
	}
    
    private static boolean isContainmentChange(SummaryItem item) {
    	return item.getChangedFeature() instanceof EReference && ((EReference)item.getChangedFeature()).isContainment();
    }

	private static Optional<IPostProcessor> findPostProcessor(String objectType) {
		Collection<Pair<IPostProcessor, Map<String, String>>> extensions = ExtensionPointHelper
				.getExtensions(EXTENSION_POINT_ID, CLASS_ATTRIBUTE_ID, IPostProcessor.class, METAMODEL_ATTRIBUTE_ID);
		return extensions.stream()
				.filter(ext -> ext.getRight().getOrDefault(METAMODEL_ATTRIBUTE_ID, "").contains(objectType)).findAny()
				.map(Pair::getLeft);
	}
}
