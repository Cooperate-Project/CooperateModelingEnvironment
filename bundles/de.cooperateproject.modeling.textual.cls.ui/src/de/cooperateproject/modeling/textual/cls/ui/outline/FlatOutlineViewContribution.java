package de.cooperateproject.modeling.textual.cls.ui.outline;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.actions.AbstractFilterOutlineContribution;
import org.eclipse.xtext.ui.editor.outline.impl.EStructuralFeatureNode;
import org.eclipse.xtext.ui.editor.outline.impl.OutlineFilterAndSorter;
import org.eclipse.xtext.ui.editor.outline.impl.OutlineFilterAndSorter.IFilter;
import org.eclipse.xtext.ui.editor.outline.impl.OutlinePage;

import de.cooperateproject.modeling.textual.cls.ui.labeling.UMLImage;

public class FlatOutlineViewContribution extends AbstractFilterOutlineContribution {

    public static final String PREFERENCE_KEY = "ui.outline.toggleOperations";

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
        action.setText("Toggle");
        action.setToolTipText("Toggle");
        action.setDescription("Toggle");
        action.setImageDescriptor(ImageDescriptor.createFromImage(UMLImage.ASSOCIATION.getImage()));
    }

    @Override
    protected void stateChanged(boolean newState) {
        if (treeViewer != null && !treeViewer.getTree().isDisposed())
            treeViewer.refresh();
    }

    @Override
    protected IFilter getFilter() {
        if (filter == null) {
            filter = new IFilter() {
                public boolean apply(IOutlineNode node) {
                    return FlatOutlineViewContribution.this.apply(node);
                }

                public boolean isEnabled() {
                    return !isPropertySet();
                }
            };
        }
        return filter;
    }

    @Override
    protected boolean apply(IOutlineNode node) {
        if (node instanceof EStructuralFeatureNode) {
            return false;
        }
        return true;
    }

}
