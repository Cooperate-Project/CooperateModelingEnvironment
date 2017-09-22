package de.cooperateproject.ui.diff.action;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.cdo.common.commit.CDOCommitInfo;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import de.cooperateproject.ui.diff.internal.CommitCDOViewManager;
import de.cooperateproject.ui.diff.views.IDiffView;

/**
 * Action triggered by double clicking on a commit.
 * 
 * @author Jasmin, czogalik
 *
 */
public class DoubleClickCommitViewerAction extends Action {

    private TableViewer commitViewer;
    private IFile file;
    private IDiffView diffView;

    /**
     * Triggered by double clicking on a commit.
     * 
     * @param diffView
     *            the DiffView the action is associated.
     * @param commitViewer
     *            TableView of the DiffView.
     * @param file
     *            the file in use.
     */
    public DoubleClickCommitViewerAction(IDiffView diffView, TableViewer commitViewer, IFile file) {
        this.file = file;
        this.commitViewer = commitViewer;
        this.diffView = diffView;
    }

    @Override
    public void run() {
        ISelection selection = commitViewer.getSelection();
        Object obj = ((IStructuredSelection) selection).getFirstElement();

        if (obj instanceof CDOCommitInfo) {
            diffView.showDiffViewOfCommit(new CommitCDOViewManager((CDOCommitInfo) obj, file));
        }
    }

}
