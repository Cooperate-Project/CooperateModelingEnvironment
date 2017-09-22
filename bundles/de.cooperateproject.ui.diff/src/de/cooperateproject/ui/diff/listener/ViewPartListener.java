package de.cooperateproject.ui.diff.listener;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.IWorkbenchPartSite;

import de.cooperateproject.modeling.common.editorInput.ILauncherFileEditorInput;
import de.cooperateproject.ui.diff.action.IToggleAction;
import de.cooperateproject.ui.diff.views.IDiffView;

/**
 * Listens to events concerning textual diagram switch.
 * 
 * @author czogalik
 *
 */
public class ViewPartListener implements IPartListener2 {

    private IDiffView diffView;
    private IWorkbenchPartSite workbenchPartSite;
    private IToggleAction liveUpdateAction;
    private static final String COOPERATE_EDITOR_ID = "de.cooperateproject.modeling.textual.";

    /**
     * Listens to events concerning textual diagram switch.
     * 
     * @param diffView
     *            to be updated if diagram changed.
     * @param workbenchPartSite
     *            to get actual IFile in case of diagram switch.
     * @param liveUpdateAction
     *            Action to check if user wants live updates.
     */
    public ViewPartListener(IDiffView diffView, IWorkbenchPartSite workbenchPartSite, IToggleAction liveUpdateAction) {
        this.diffView = diffView;
        this.workbenchPartSite = workbenchPartSite;
        this.liveUpdateAction = liveUpdateAction;
    }

    @Override
    public void partOpened(IWorkbenchPartReference partRef) {
        if (isPartTextEditor(partRef)) {
            partRef.addPropertyListener((source, propId) -> {
                if (liveUpdateAction.isLiveActivated()) {
                    diffView.setSelectedFile(getFile());
                }
            });
        }
    }

    @Override
    public void partActivated(IWorkbenchPartReference partRef) {
        if (isPartTextEditor(partRef)) {
            diffView.setSelectedFile(getFile());
        }
    }

    @Override
    public void partVisible(IWorkbenchPartReference partRef) {
        // Do nothing
    }

    @Override
    public void partInputChanged(IWorkbenchPartReference partRef) {
        // Do nothing
    }

    @Override
    public void partHidden(IWorkbenchPartReference partRef) {
        // Do nothing
    }

    @Override
    public void partDeactivated(IWorkbenchPartReference partRef) {
        // Do nothing
    }

    @Override
    public void partClosed(IWorkbenchPartReference partRef) {
        // Do nothing
    }

    @Override
    public void partBroughtToTop(IWorkbenchPartReference partRef) {
        // Do nothing
    }

    private IFile getFile() {
        IEditorPart activeEditor = workbenchPartSite.getPage().getActiveEditor();
        if (activeEditor == null) {
            return null;
        }
        IEditorInput input = activeEditor.getEditorInput();
        if (input instanceof ILauncherFileEditorInput) {
            ILauncherFileEditorInput launcherFileEditorInput = (ILauncherFileEditorInput) input;
            return launcherFileEditorInput.getAssociatedLauncherFile();
        }
        return null;
    }
    
    private static boolean isPartTextEditor(IWorkbenchPartReference partRef) {
        return partRef.getId().contains(COOPERATE_EDITOR_ID);
    }

}
