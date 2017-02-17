package de.cooperateproject.ui.diff.labeling;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import de.cooperateproject.ui.diff.content.SummaryItem;
import de.cooperateproject.ui.diff.labeling.itemlabels.AssociationLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.AssociationPropertiesLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.AttributeLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.CardinalityLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.ClassDiagramLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.ClassLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.CommentLinkLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.GeneralizationLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.ImplementationLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.IntegerLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.InterfaceLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.MethodLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.PackageImportLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.PackageLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.ParameterLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.PrimitiveTypeLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.SummaryItemLabelHandler;
import de.cooperateproject.ui.diff.labeling.itemlabels.VisibilityLabel;

/**
 * Label Provider for a table viewer which lists all changes in a commit
 * 
 * @author Jasmin
 *
 */
public class SummaryLabelProvider extends LabelProvider implements ITableLabelProvider {

	private Map<String, SummaryItemLabelHandler> itemHandling = new HashMap<String, SummaryItemLabelHandler>();

	public SummaryLabelProvider() {
		itemHandling.put("AttributeImpl", new AttributeLabel());
		itemHandling.put("ClassImpl", new ClassLabel());
		itemHandling.put("MethodImpl", new MethodLabel());
		itemHandling.put("ParameterImpl", new ParameterLabel());
		itemHandling.put("PackageImpl", new PackageLabel());
		itemHandling.put("InterfaceImpl", new InterfaceLabel());
		itemHandling.put("AssociationImpl", new AssociationLabel());
		itemHandling.put("GeneralizationImpl", new GeneralizationLabel());
		itemHandling.put("ImplementationImpl", new ImplementationLabel());
		itemHandling.put("ClassDiagramImpl", new ClassDiagramLabel());
		itemHandling.put("Visibility", new VisibilityLabel());
		itemHandling.put("AssociationPropertiesImpl", new AssociationPropertiesLabel());
		itemHandling.put("CardinalityImpl", new CardinalityLabel());
		itemHandling.put("Integer", new IntegerLabel());
		itemHandling.put("PrimitiveTypeImpl", new PrimitiveTypeLabel());
		itemHandling.put("CommentLinkImpl", new CommentLinkLabel());
		itemHandling.put("PackageImportImpl", new PackageImportLabel());
	}

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {

		String ret = "";

		if (element instanceof SummaryItem) {

			SummaryItem item = ((SummaryItem) element);

			SummaryItemLabelHandler handlerClassLeft = null;
			SummaryItemLabelHandler handlerClassRight = null;
			SummaryItemLabelHandler handlerClassParent = null;

			if (item.getLeft() != null) {
				handlerClassLeft = itemHandling.get(item.getLeft().getClass().getSimpleName());
			}
			if (item.getRight() != null) {
				// important to differentiate because of MOVE
				handlerClassRight = itemHandling.get(item.getRight().getClass().getSimpleName());
			}
			if (item.getCommonParent() != null) {
				handlerClassParent = itemHandling.get(item.getCommonParent().getClass().getSimpleName());
			}

			if (item.getDifferenceKind() == DifferenceKind.MOVE) {
				switch (columnIndex) {
				case 0:
					if (handlerClassLeft != null) {
						ret = DifferenceKindHelper.convertToVerbalized(item.getDifferenceKind()) + " "
								+ handlerClassLeft.getClassText();
					}
					break;
				case 1:
					if (handlerClassLeft != null)
						ret = handlerClassLeft.getText(item.getLeft());
					break;
				case 2:
					if (handlerClassRight != null)
						ret = handlerClassRight.getText(item.getRight());
					break;
				case 3:
					if (handlerClassParent != null)
						ret = handlerClassParent.getText(item.getCommonParent());
					break;
				default:
				}
			} else {
				switch (columnIndex) {
				case 0:
					if (handlerClassLeft != null) {
						ret = DifferenceKindHelper.convertToVerbalized(item.getDifferenceKind()) + " "
								+ handlerClassLeft.getClassText();
					} else if (handlerClassRight != null) {
						ret = DifferenceKindHelper.convertToVerbalized(item.getDifferenceKind()) + " "
								+ handlerClassRight.getClassText();
					}
					break;
				case 1:
					if (handlerClassParent != null)
						ret = handlerClassParent.getText(item.getCommonParent());
					break;
				case 2:
					if (handlerClassRight != null)
						ret = handlerClassRight.getText(item.getRight());
					break;
				case 3:
					if (handlerClassLeft != null)
						ret = handlerClassLeft.getText(item.getLeft());
					break;
				default:
				}
			}
		}

		return ret;
	}

}
