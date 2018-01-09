package de.cooperateproject.modeling.graphical.papyrus.extensions.outline.util;

import org.eclipse.papyrus.infra.core.sasheditor.editor.IPage;
import org.eclipse.papyrus.infra.core.sasheditor.editor.IPageLifeCycleEventsListener2;

/**
 * Dummy implementation of {@link IPageLifeCycleEventsListener2} that does nothing when receiving an event.
 */
public abstract class NOPPageLifeCycleEventsListener2 implements IPageLifeCycleEventsListener2 {

    @Override
    public void pageOpened(IPage page) {
        // intentionally left blank
        return;
    }

    @Override
    public void pageClosed(IPage page) {
        // intentionally left blank
        return;
    }

    @Override
    public void pageActivated(IPage page) {
        // intentionally left blank
        return;
    }

    @Override
    public void pageDeactivated(IPage page) {
        // intentionally left blank
        return;
    }

    @Override
    public void pageAboutToBeOpened(IPage page) {
        // intentionally left blank
        return;
    }

    @Override
    public void pageAboutToBeClosed(IPage page) {
        // intentionally left blank
        return;
    }

    @Override
    public void pageChanged(IPage newPage) {
        // intentionally left blank
        return;
    }

    @Override
    public void pageFirePropertyChange(IPage page, int propertyId) {
        // intentionally left blank
        return;
    }

}
