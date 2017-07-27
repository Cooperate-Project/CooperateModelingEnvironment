package de.cooperateproject.ui.diff.labeling;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.ecore.EObject;
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

		List<LabelHandler> labelHandlers = findLabelHandlers(item);
		if (labelHandlers.isEmpty()) {
		    return null;
		}

		if (item.getDifferenceKind() == DifferenceKind.MOVE) {
		    for (LabelHandler labelHandler : labelHandlers) {
		        String columnTextForMoveModification = getColumnTextForMoveModification(columnIndex, item, labelHandler);
		        if (columnTextForMoveModification != null) {
		            return columnTextForMoveModification;
		        }		        
		    }
		} else {
		    for (LabelHandler labelHandler : labelHandlers) {
		        String columnTextForModification = getColumnTextForModification(columnIndex, item, labelHandler);
		        if (columnTextForModification != null) {
		            return columnTextForModification;
		        }		        
		    }
		}
		return null;
	}
	
	private EObject getEObjectOrNull(Object object) {
	    if (object instanceof EObject) {
            return (EObject) object;
        }
	    return null;
	}

    private String getColumnTextForModification(int columnIndex, SummaryItem item, LabelHandler labelHandler) {
        EObject left = getEObjectOrNull(item.getLeft());
        EObject right = getEObjectOrNull(item.getRight());
        
        switch (columnIndex) {
        case 0:            
        	return getChangeKindColum(item, labelHandler, left, right);
        case 1:
            return labelHandler.getText(item.getCommonParent());
        case 2:
            return labelHandler.getText(right);
        case 3:
            return labelHandler.getText(left);
        default:
            return null;
        }
    }

    private String getChangeKindColum(SummaryItem item, LabelHandler labelHandler, EObject left, EObject right) {
        String changeKindColumn = getChangeKindColumn(item, labelHandler, left);
        if (changeKindColumn == null) {
            return getChangeKindColumn(item, labelHandler, right);
        }
        return changeKindColumn;
    }

    private String getChangeKindColumn(SummaryItem item, LabelHandler labelHandler, EObject value) {
        String appendix = DifferenceKindHelper.convertToVerbalized(item.getDifferenceKind()) + " ";
        if (value != null) {
            String classTextLeft = labelHandler.getClassText(value);
            if (classTextLeft == null) {
                return null;
            }
            return appendix + classTextLeft;
        }
        return null;
    }

    private String getColumnTextForMoveModification(int columnIndex, SummaryItem item, LabelHandler labelHandler) {
        EObject left = getEObjectOrNull(item.getLeft());
        EObject right = getEObjectOrNull(item.getRight());
        switch (columnIndex) {
        case 0:
            return DifferenceKindHelper.convertToVerbalized(item.getDifferenceKind()) + " "
        			+ labelHandler.getClassText(left);
        case 1:
            return labelHandler.getText(left);
        case 2:
            return labelHandler.getText(right);
        case 3:
            return labelHandler.getText(item.getCommonParent());
        default:
            return null;
        }
    }

    /**
     * Get all LabelHandlers associated with the SummaryItem. 
     * @param item the SummaryItem to find LabelHandlers for.
     * @return all LabelHandlers associated with the SummaryItem.
     */
	private List<LabelHandler> findLabelHandlers(SummaryItem item) {
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IExtensionPoint ep = reg.getExtensionPoint(EXTENSION_POINT_ID);
		IExtension[] extensions = ep.getExtensions();

		String left = "";
		String right = "";
		String parent = "";

		if (item.getLeft() != null) {
			left = item.getLeft().getClass().getPackage().getName();
		}
		if (item.getRight() != null) {
			right = item.getRight().getClass().getPackage().getName();
		}
		if (item.getCommonParent() != null) {
			parent = item.getCommonParent().getClass().getPackage().getName();
		}

		return getListOfLabelHandlers(extensions, left, right, parent);
	}

    private List<LabelHandler> getListOfLabelHandlers(IExtension[] extensions, String left,
            String right, String parent) {
        List<LabelHandler> labelHandlers = new ArrayList<>();
        for (IExtension extension : extensions) {
			IConfigurationElement[] configurationElements = extension.getConfigurationElements();
			for (IConfigurationElement element : configurationElements) {
				String attribute = element.getAttribute(METAMODEL_ATTRIBUTE_ID);
                if (!(attribute.contains(left) || attribute.contains(right) || attribute.contains(parent))) {
					continue;
				}
				try {
					labelHandlers.add((LabelHandler) element.createExecutableExtension(CLASS_ATTRIBUTE_ID));
				} catch (CoreException e) {
				    logger.error(e.getMessage());
				}

			}
		}
        return labelHandlers;
    }

}
