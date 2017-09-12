package de.cooperateproject.ui.diff.listener;

import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPartReference;

import de.cooperateproject.ui.diff.views.IDiffView;

public class ViewPartListener implements IPartListener2 {

    private IDiffView diffView;

    public ViewPartListener(IDiffView diffView) {
        this.diffView = diffView;
    }

    @Override
    public void partOpened(IWorkbenchPartReference partRef) {
        if (partRef.getId().contains("de.cooperateproject.modeling.textual.")) {
            partRef.addPropertyListener((source, propId) -> diffView.setCommits());
        }
    }

    @Override
    public void partActivated(IWorkbenchPartReference partRef) {
        diffView.setCommits();
    }

    @Override
    public void partVisible(IWorkbenchPartReference partRef) {
        //Do nothing
    }

    @Override
    public void partInputChanged(IWorkbenchPartReference partRef) {
        //Do nothing
    }

    @Override
    public void partHidden(IWorkbenchPartReference partRef) {
        //Do nothing
    }

    @Override
    public void partDeactivated(IWorkbenchPartReference partRef) {
        //Do nothing
    }

    @Override
    public void partClosed(IWorkbenchPartReference partRef) {
        //Do nothing
    }

    @Override
    public void partBroughtToTop(IWorkbenchPartReference partRef) {
        //Do nothing
    }

}
