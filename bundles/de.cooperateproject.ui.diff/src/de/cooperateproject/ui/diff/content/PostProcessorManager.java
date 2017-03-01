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

/**
 * Finds the correct post-processor for the specific meta-model. Delegates the
 * post-processing request.
 * 
 * @author Jasmin
 *
 */
public class PostProcessorManager {

	private static final String extensionPointId = "de.cooperateproject.ui.diff.postProcessor";
	private static final String metamodelAttributeId = "metamodel";
	private static final String classAttributeId = "class";

	static HashMap<EObject, DiffTreeItem> postProcessDiffTree(HashMap<EObject, DiffTreeItem> tree) {
		HashMap<EObject, DiffTreeItem> ret = tree;
		if (tree.isEmpty()) {
			return ret;
		}

		Collection<EObject> keys = tree.keySet();
		// Find one item in the tree and check its type to know from
		// which meta model it is.
		EObject oneKey = keys.iterator().next();
		String objectType = oneKey.getClass().getPackage().getName();
		IPostProcessor postProcessor = findPostProcessor(objectType);
		if (postProcessor != null) {
			ret = postProcessor.postProcessDiffTreeBuilder(tree);
		}

		return ret;

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
		IExtensionPoint ep = reg.getExtensionPoint(extensionPointId);
		IExtension[] extensions = ep.getExtensions();

		for (int i = 0; i < extensions.length; i++) {
			IExtension ext = extensions[i];
			IConfigurationElement[] ce = ext.getConfigurationElements();
			for (int j = 0; j < ce.length; j++) {
				if (!ce[j].getAttribute(metamodelAttributeId).contains(objectType)) {
					continue;
				}
				try {
					postProcessor = (IPostProcessor) ce[j].createExecutableExtension(classAttributeId);

				} catch (CoreException e) {
					e.printStackTrace();
				}

			}
		}

		return postProcessor;
	}
}
