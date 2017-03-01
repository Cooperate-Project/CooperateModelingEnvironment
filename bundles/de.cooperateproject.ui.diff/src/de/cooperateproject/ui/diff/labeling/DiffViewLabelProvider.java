package de.cooperateproject.ui.diff.labeling;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.LabelProvider;

import de.cooperateproject.ui.diff.content.DiffTreeItem;

/**
 * Label Provider for the diff viewer's items of the diagram.
 * 
 * @author Jasmin
 *
 */
public class DiffViewLabelProvider extends LabelProvider {

	private static final String extensionPointId = "de.cooperateproject.ui.diff.labelHandlers";
	private static final String metamodelAttributeId = "metamodel";
	private static final String classAttributeId = "class";

	@Override
	public String getText(Object element) {
		String ret = "";
		if (!(element instanceof DiffTreeItem)) {
			return ret;
		}
		DiffTreeItem item = (DiffTreeItem) element;
		LabelHandler labelHandler = findLabelHandler(item.getObject().getClass().getPackage().getName());

		if (item.getDiffKind() != null) {
			ret = DifferenceKindHelper.convertToToken(((DiffTreeItem) element).getDiffKind()) + " - ";
		}

		ret = ret + labelHandler.getText(item.getObject());

		return ret;

	}

	private LabelHandler findLabelHandler(String objectType) {
		LabelHandler labelHandler = null;
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
					labelHandler = (LabelHandler) ce[j].createExecutableExtension(classAttributeId);

				} catch (CoreException e) {
					e.printStackTrace();
				}

			}
		}
		return labelHandler;
	}

}