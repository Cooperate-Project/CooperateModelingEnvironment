package de.cooperateproject.ui.diff.content;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.ui.diff.internal.IsTransitiveChildPredicate;

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

    private static final Logger LOGGER = LoggerFactory.getLogger(PostProcessorManager.class);

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
        IPostProcessor postProcessor = findPostProcessor(objectType);
        if (postProcessor != null) {
            return postProcessor.postProcessDiffTreeBuilder(tree);
        }

        return tree;
    }

	static List<SummaryItem> postProcessSummaryList(List<SummaryItem> summaryList) {
		if (summaryList.isEmpty()) {
			return summaryList;
		}

		List<SummaryItem> result = determineRelevantPackageName(summaryList).map(PostProcessorManager::findPostProcessor)
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

    private static IPostProcessor findPostProcessor(String objectType) {
        IPostProcessor postProcessor = null;
        IExtensionRegistry reg = Platform.getExtensionRegistry();
        IExtensionPoint ep = reg.getExtensionPoint(EXTENSION_POINT_ID);
        IExtension[] extensions = ep.getExtensions();

        for (IExtension extension : extensions) {
            IConfigurationElement[] configurationElements = extension.getConfigurationElements();
            for (IConfigurationElement configurationElement : configurationElements) {
                if (!configurationElement.getAttribute(METAMODEL_ATTRIBUTE_ID).contains(objectType)) {
                    continue;
                }
                try {
                    postProcessor = (IPostProcessor) configurationElement.createExecutableExtension(CLASS_ATTRIBUTE_ID);
                } catch (CoreException e) {
                    LOGGER.error(e.getMessage(), e);
                }
            }
        }

        return postProcessor;
    }
}
