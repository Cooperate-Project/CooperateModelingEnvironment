package de.cooperateproject.ui.diff.labeling;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.ui.diff.content.DiffTreeItem;

/**
 * Label Provider for the diff viewer's items of the diagram.
 * 
 * @author Jasmin, czogalik
 *
 */
public class DiffViewLabelProvider extends LabelProvider implements IColorProvider {

    private static final String EXTENSION_POINT_ID = "de.cooperateproject.ui.diff.labelHandlers";
    private static final String METAMODEL_ATTRIBUTE_ID = "metamodel";
    private static final String CLASS_ATTRIBUTE_ID = "class";
    private static final Logger LOGGER = LoggerFactory.getLogger(DiffViewLabelProvider.class);

    @Override
    public String getText(Object element) {
        StringBuilder result = new StringBuilder();
        if (!(element instanceof DiffTreeItem)) {
            return null;
        }
        DiffTreeItem item = (DiffTreeItem) element;
        Object object = item.getObject();
        LabelHandler labelHandler = findLabelHandler(object.getClass().getPackage().getName());

        if (labelHandler == null) {
            return null;
        }

        if (item.getDiffKind() != null) {
            result.append(DifferenceKindHelper.convertToToken(((DiffTreeItem) element).getDiffKind()) + " - ");
        }

        if (object instanceof EObject) {
            return result.append(labelHandler.getText((EObject) object)).toString();
        }
        return null;
    }

    private static LabelHandler findLabelHandler(String objectType) {
        LabelHandler labelHandler = null;
        IExtensionRegistry reg = Platform.getExtensionRegistry();
        IExtensionPoint ep = reg.getExtensionPoint(EXTENSION_POINT_ID);
        IExtension[] extensions = ep.getExtensions();

        for (IExtension ext : extensions) {
            IConfigurationElement[] configurationElements = ext.getConfigurationElements();
            for (IConfigurationElement configurationElement : configurationElements) {
                if (!configurationElement.getAttribute(METAMODEL_ATTRIBUTE_ID).contains(objectType)) {
                    continue;
                }
                try {
                    labelHandler = (LabelHandler) configurationElement.createExecutableExtension(CLASS_ATTRIBUTE_ID);

                } catch (CoreException e) {
                    LOGGER.error(e.getMessage(), e);
                }

            }
        }
        return labelHandler;
    }

    @Override
    public Color getForeground(Object element) {
        DiffTreeItem item = (DiffTreeItem) element;
        if (item.getDiffKind() == null) {
            return null;
        }
        switch (item.getDiffKind()) {
            case ADD:
                return new Color(Display.getDefault(), 0, 100, 0);
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