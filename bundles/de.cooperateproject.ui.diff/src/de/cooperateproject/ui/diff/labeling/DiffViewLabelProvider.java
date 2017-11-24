package de.cooperateproject.ui.diff.labeling;

import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

import de.cooperateproject.ui.diff.LabelHandlerRegistry;
import de.cooperateproject.ui.diff.content.DiffTreeItem;

/**
 * Label Provider for the diff viewer's items of the diagram.
 * 
 * @author Jasmin, czogalik
 *
 */
public class DiffViewLabelProvider extends LabelProvider implements IColorProvider {

    @Override
    public String getText(Object element) {
		Optional<DiffTreeItem> item = Optional.ofNullable(element).filter(DiffTreeItem.class::isInstance)
				.map(DiffTreeItem.class::cast);
		Optional<EObject> containedObject = item.map(DiffTreeItem::getObject).filter(EObject.class::isInstance)
				.map(EObject.class::cast);

		if (!item.isPresent() || !containedObject.isPresent()) {
			return null;
		}

		Collection<LabelHandler> labelHandler = item.map(DiffViewLabelProvider::findLabelHandler)
				.orElse(Collections.emptyList());
		Optional<String> elementName = labelHandler.stream().map(lh -> lh.getText(containedObject.get()))
				.filter(Objects::nonNull).findFirst();
		Optional<String> diffKind = item.get().getDiffKinds().stream().findFirst().map(DifferenceKindHelper::convertToToken);

		return elementName.map(name -> diffKind.map(dk -> dk + " - ").orElse("") + name).orElse(null);
    }
    
    private static Collection<LabelHandler> findLabelHandler(DiffTreeItem item) {
    	String packageName = item.getObject().getClass().getPackage().getName();
    	return LabelHandlerRegistry.getInstance().getLabelHandlers(packageName);
	}

	@Override
    public Color getForeground(Object element) {
        DiffTreeItem item = (DiffTreeItem) element;
        if (item.getDiffKinds().isEmpty()) {
            return null;
        }
        switch (item.getDiffKinds().iterator().next()) {
            case ADD:
                return new Color(Display.getDefault(), 0, 100, 0);
            case MOVE:
            case CHANGE:
                return new Color(Display.getDefault(), 255, 69, 0);
            case DELETE:
                return new Color(Display.getDefault(), 139, 0, 0);
            default:
                return null;
        }
    }

    @Override
    public Color getBackground(Object element) {
        // no changes to background color
        return null;
    }

}