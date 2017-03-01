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
	private LabelHandler labelHandler = null;

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

		if (labelHandler == null) {
			labelHandler = findLabelHandler(item);
		}

		if (item.getDifferenceKind() == DifferenceKind.MOVE) {
			switch (columnIndex) {
			case 0:
				ret = DifferenceKindHelper.convertToVerbalized(item.getDifferenceKind()) + " "
						+ labelHandler.getClassText(item.getLeft());
				break;
			case 1:
				ret = labelHandler.getText(item.getLeft());
				break;
			case 2:
				ret = labelHandler.getText(item.getRight());
				break;
			case 3:
				ret = labelHandler.getText(item.getCommonParent());
				break;
			default:
			}
		} else {
			switch (columnIndex) {
			case 0:
				String appendix = DifferenceKindHelper.convertToVerbalized(item.getDifferenceKind()) + " ";
				if (item.getLeft() != null) {
					ret = appendix + labelHandler.getClassText(item.getLeft());
				} else if (item.getRight() != null) {
					ret = appendix + labelHandler.getClassText(item.getRight());
				}
				break;
			case 1:
				ret = labelHandler.getText(item.getCommonParent());
				break;
			case 2:
				ret = labelHandler.getText(item.getRight());
				break;
			case 3:
				ret = labelHandler.getText(item.getLeft());
				break;
			default:
			}
		}

		return ret;

	}

	private LabelHandler findLabelHandler(SummaryItem item) {
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IExtensionPoint ep = reg.getExtensionPoint(extensionPointId);
		IExtension[] extensions = ep.getExtensions();

		String left = "-1";
		String right = "-1";
		String parent = "-1";

		if (item.getLeft() != null) {
			left = item.getLeft().getClass().getPackage().getName();
		}
		if (item.getRight() != null) {
			right = item.getRight().getClass().getPackage().getName();
		}
		if (item.getCommonParent() != null) {
			parent = item.getCommonParent().getClass().getPackage().getName();
		}

		for (int i = 0; i < extensions.length; i++) {
			IExtension ext = extensions[i];
			IConfigurationElement[] ce = ext.getConfigurationElements();
			for (int j = 0; j < ce.length; j++) {
				if (!(ce[j].getAttribute(metamodelAttributeId).contains(left)
						|| ce[j].getAttribute(metamodelAttributeId).contains(right)
						|| ce[j].getAttribute(metamodelAttributeId).contains(parent))) {
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
