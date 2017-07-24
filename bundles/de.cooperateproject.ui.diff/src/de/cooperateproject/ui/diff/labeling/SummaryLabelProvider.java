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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.ui.diff.content.SummaryItem;

/**
 * Label provider for a table viewer which lists all changes in a commit.
 * Delegates the labeling to the meta-model-specific label handler.
 * 
 * @author Jasmin, czogalik
 *
 */
public class SummaryLabelProvider extends LabelProvider implements ITableLabelProvider {

	private static final String EXTENSION_POINT_ID = "de.cooperateproject.ui.diff.labelHandlers";
	private static final String METAMODEL_ATTRIBUTE_ID = "metamodel";
	private static final String CLASS_ATTRIBUTE_ID = "class";
	private static final Logger logger = LoggerFactory.getLogger(SummaryLabelProvider.class);
	private LabelHandler labelHandler = null;

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {

		if (!(element instanceof SummaryItem)) {
			return null;
		}

		SummaryItem item = (SummaryItem) element;

		if (labelHandler == null) {
			labelHandler = findLabelHandler(item);
		}

		if (item.getDifferenceKind() == DifferenceKind.MOVE) {
			return getColumnTextForMoveModification(columnIndex, item);
		} else {
			return getColumnTextForModification(columnIndex, item);
		}
	}

    private String getColumnTextForModification(int columnIndex, SummaryItem item) {
        switch (columnIndex) {
        case 0:
        	String appendix = DifferenceKindHelper.convertToVerbalized(item.getDifferenceKind()) + " ";
        	if (item.getLeft() != null) {
        	    return appendix + labelHandler.getClassText(item.getLeft());
        	} else if (item.getRight() != null) {
        	    return appendix + labelHandler.getClassText(item.getRight());
        	}
        	return null;
        case 1:
            return labelHandler.getText(item.getCommonParent());
        case 2:
            return labelHandler.getText(item.getRight());
        case 3:
            return labelHandler.getText(item.getLeft());
        default:
            return null;
        }
    }

    private String getColumnTextForMoveModification(int columnIndex, SummaryItem item) {
        switch (columnIndex) {
        case 0:
            return DifferenceKindHelper.convertToVerbalized(item.getDifferenceKind()) + " "
        			+ labelHandler.getClassText(item.getLeft());
        case 1:
            return labelHandler.getText(item.getLeft());
        case 2:
            return labelHandler.getText(item.getRight());
        case 3:
            return labelHandler.getText(item.getCommonParent());
        default:
            return null;
        }
    }

	private LabelHandler findLabelHandler(SummaryItem item) {
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IExtensionPoint ep = reg.getExtensionPoint(EXTENSION_POINT_ID);
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
				String attribute = ce[j].getAttribute(METAMODEL_ATTRIBUTE_ID);
                if (!(attribute.contains(left) || attribute.contains(right) || attribute.contains(parent))) {
					continue;
				}
				try {
					labelHandler = (LabelHandler) ce[j].createExecutableExtension(CLASS_ATTRIBUTE_ID);
				} catch (CoreException e) {
				    logger.error(e.getMessage());
				}

			}
		}
		return labelHandler;
	}

}
