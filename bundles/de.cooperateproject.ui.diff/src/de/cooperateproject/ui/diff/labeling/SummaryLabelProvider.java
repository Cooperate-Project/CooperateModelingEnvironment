package de.cooperateproject.ui.diff.labeling;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import de.cooperateproject.ui.diff.content.SummaryItem;

/**
 * Label provider for a table viewer which lists all changes in a commit.
 * Delegates the labeling to the meta-model-specific label handler.
 * 
 * @author Jasmin
 *
 */
public class SummaryLabelProvider extends LabelProvider implements ITableLabelProvider {

	private static final String extensionPointId = "de.cooperateproject.ui.diff.labelHandlers";
	private static final String metamodelAttributeId = "metamodel";
	private static final String classAttributeId = "class";

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {

		String ret = "";
		if (!(element instanceof SummaryItem)) {
			return ret;
		}

		SummaryItem item = (SummaryItem) element;
		LabelHandler generalLabelHandler = null;
		LabelHandler parentLabelHandler = null;

		if (item.getLeft() != null) {
			generalLabelHandler = findLabelHandler(item.getLeft().getClass().getPackage().getName());
		} else {
			generalLabelHandler = findLabelHandler(item.getRight().getClass().getPackage().getName());
		}

		if (item.getCommonParent() != null) {
			parentLabelHandler = findLabelHandler(item.getCommonParent().getClass().getPackage().getName());
		}

		if (item.getDifferenceKind() == DifferenceKind.MOVE) {
			switch (columnIndex) {
			case 0:
				ret = DifferenceKindHelper.convertToVerbalized(item.getDifferenceKind()) + " "
						+ generalLabelHandler.getClassText(item.getLeft());
				break;
			case 1:
				ret = generalLabelHandler.getText(item.getLeft());
				break;
			case 2:
				ret = generalLabelHandler.getText(item.getRight());
				break;
			case 3:
				ret = parentLabelHandler.getText(item.getCommonParent());
				break;
			default:
			}
		} else {
			switch (columnIndex) {
			case 0:
				String appendix = DifferenceKindHelper.convertToVerbalized(item.getDifferenceKind()) + " ";
				if (item.getLeft() != null) {
					ret = appendix + generalLabelHandler.getClassText(item.getLeft());

				} else if (item.getRight() != null) {
					ret = appendix + generalLabelHandler.getClassText(item.getRight());
				}
				break;
			case 1:
				ret = parentLabelHandler.getText(item.getCommonParent());
				break;
			case 2:
				ret = generalLabelHandler.getText(item.getRight());
				break;
			case 3:
				ret = generalLabelHandler.getText(item.getLeft());
				break;
			default:
			}
		}

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
				if (!objectType.contains(ce[j].getAttribute(metamodelAttributeId))) {
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
