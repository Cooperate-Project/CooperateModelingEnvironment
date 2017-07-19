package de.cooperate.modeling.graphical.papyrus.extensions.outline.util;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartSite;

/**
 * Delegating class to a contained {@link IWorkbenchPart} element.
 */
public class WorkbenchPartDelegate implements IWorkbenchPart {

    private final IWorkbenchPart delegate;

    protected WorkbenchPartDelegate(IWorkbenchPart part) {
        this.delegate = part;
    }

    @Override
    public <T> T getAdapter(Class<T> adapter) {
        return delegate.getAdapter(adapter);
    }

    @Override
    public void addPropertyListener(IPropertyListener listener) {
        delegate.addPropertyListener(listener);
    }

    @Override
    public void createPartControl(Composite parent) {
        delegate.createPartControl(parent);
    }

    @Override
    public void dispose() {
        delegate.dispose();
    }

    @Override
    public IWorkbenchPartSite getSite() {
        return delegate.getSite();
    }

    @Override
    public String getTitle() {
        return delegate.getTitle();
    }

    @Override
    public Image getTitleImage() {
        return delegate.getTitleImage();
    }

    @Override
    public String getTitleToolTip() {
        return delegate.getTitleToolTip();
    }

    @Override
    public void removePropertyListener(IPropertyListener listener) {
        delegate.removePropertyListener(listener);
    }

    @Override
    public void setFocus() {
        delegate.setFocus();
    }

}
