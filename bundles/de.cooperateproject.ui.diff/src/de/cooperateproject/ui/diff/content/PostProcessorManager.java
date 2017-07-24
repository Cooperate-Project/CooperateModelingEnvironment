package de.cooperateproject.ui.diff.content;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Finds the correct post-processor for the specific meta-model. Delegates the
 * post-processing request.
 * 
 * @author Jasmin, czogalik
 *
 */
public class PostProcessorManager {

	private static final String EXTENSION_POINT_ID = "de.cooperateproject.ui.diff.postProcessor";
	private static final String METAMODEL_ATTRIBUTE_ID = "metamodel";
	private static final String CLASS_ATTRIBUTE_ID = "class";
	
	private static final Logger logger = LoggerFactory.getLogger(PostProcessorManager.class);
	
	private PostProcessorManager() {
	    //private constructor to hide creation of object
	}

	static HashMap<EObject, DiffTreeItem> postProcessDiffTree(HashMap<EObject, DiffTreeItem> tree) {
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
		List<SummaryItem> ret = summaryList;
		if (summaryList.isEmpty()) {
			return ret;
		}

		SummaryItem summaryItem = summaryList.get(0);
		String objectType;
		Object concreteItem;
		// Find one item of the summary list and check its type to know from
		// which meta model it is.
		if (summaryItem.getLeft() != null) {
			concreteItem = summaryItem.getLeft();
		} else {
			concreteItem = summaryItem.getRight();
		}
		objectType = concreteItem.getClass().getPackage().getName();
		IPostProcessor postProcessor = findPostProcessor(objectType);

		if (postProcessor != null) {
			ret = postProcessor.postProcessSummaryViewBuilder(summaryList);
		}
		return ret;
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
                    logger.error(e.getMessage());
                }
			}
		}

		return postProcessor;
	}
}
