package de.cooperateproject.ui.outline;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.actions.AbstractFilterOutlineContribution;
import org.eclipse.xtext.ui.editor.outline.impl.EStructuralFeatureNode;
import org.eclipse.xtext.ui.editor.outline.impl.OutlineFilterAndSorter;
import org.eclipse.xtext.ui.editor.outline.impl.OutlineFilterAndSorter.IFilter;
import org.eclipse.xtext.ui.editor.outline.impl.OutlinePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Contribution for the flat outline view filter.
 * 
 * @author czogalik
 *
 */
public class FlatOutlineViewContribution extends AbstractFilterOutlineContribution {

    private final class IFilterImplementation implements IFilter {
        @Override
        public boolean apply(IOutlineNode node) {
            return FlatOutlineViewContribution.this.apply(node);
        }

        @Override
        public boolean isEnabled() {
            return !isPropertySet();
        }
    }

    private static final String PREFERENCE_KEY = "ui.outline.toggleOperations";

    private static final String ACTION_NAME = "Outline Hierarchy";
    private static final String ACTION_TOOLTIP = "Hierarchy/Flat";
    private static final String ACTION_DESCRIPTION = "Toggles beetween hierarchy and flat view";
    private static final String ACTION_IMAGE_URL = "platform:/plugin/org.eclipse.ui.ide/icons/full/elcl16/hierarchicalLayout.png";

    private static final Logger LOGGER = LoggerFactory.getLogger(FlatOutlineViewContribution.class);

    private TreeViewer treeViewer;
    private IFilter filter;
    private OutlineFilterAndSorter outlineFilterAndSorter;

    @Override
    public String getPreferenceKey() {
        return PREFERENCE_KEY;
    }

    @Override
    public void register(OutlinePage outlinePage) {
        super.register(outlinePage);
        outlineFilterAndSorter = outlinePage.getFilterAndSorter();
        outlineFilterAndSorter.addFilter(getFilter());
        treeViewer = outlinePage.getTreeViewer();
    }

    @Override
    public void deregister(OutlinePage outlinePage) {
        super.deregister(outlinePage);
        if (filter != null) {
            outlineFilterAndSorter.removeFilter(getFilter());
            filter = null;
        }
        outlineFilterAndSorter = null;
        treeViewer = null;
    }

    @Override
    protected void configureAction(Action action) {
        action.setText(ACTION_NAME);
        action.setToolTipText(ACTION_TOOLTIP);
        action.setDescription(ACTION_DESCRIPTION);
        action.setImageDescriptor(getImageDescriptor());
    }

    @Override
    protected void stateChanged(boolean newState) {
        if (treeViewer != null && !treeViewer.getTree().isDisposed()) {
            treeViewer.refresh();
        }
    }

    @Override
    protected IFilter getFilter() {
        if (filter == null) {
            filter = new IFilterImplementation();
        }
        return filter;
    }

    @Override
    protected boolean apply(IOutlineNode node) {
        return !(node instanceof EStructuralFeatureNode);
    }

    private static ImageDescriptor getImageDescriptor() {
        URL url = null;
        try {
            url = new URL(ACTION_IMAGE_URL);
        } catch (MalformedURLException e) {
            LOGGER.error(e.getMessage());
        }
        return ImageDescriptor.createFromURL(url);
    }

}
