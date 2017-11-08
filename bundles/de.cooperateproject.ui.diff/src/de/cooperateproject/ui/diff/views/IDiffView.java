package de.cooperateproject.ui.diff.views;

import org.eclipse.core.resources.IFile;
import de.cooperateproject.ui.diff.internal.CommitCDOViewManager;

/**
 * View that shows history and commits of given file.
 * @author czogalik
 *
 */
public interface IDiffView {

    /**
     * Sets file the view should show history of.
     * @param file the view should show history of.
     */
    void setSelectedFile(IFile file);
    
    /**
     * Shows the differences of commit from the given commit view manager.
     * @param cdoViewManager the given commit view manager.
     */
    void showDiffViewOfCommit(CommitCDOViewManager cdoViewManager);

    void showDiffViewOfCommit(CommitCDOViewManager cdoViewManager1, CommitCDOViewManager cdoViewManager2);
}
