package de.cooperateproject.ui.editors.launcher.extensions;

import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.ui.IEditorInput;

import de.cooperateproject.ui.editors.launcher.extensions.TransformationManager.TransformationException;

/**
 * Handler for save and merge requests from an editor.
 * 
 * The handler ensures consistency between various representations of diagrams by triggering transformations and
 * handling merges to the master branch.
 */
public interface ITransformationManager {

    /**
     * Handles the editor save event by triggering according transformations.
     * 
     * @param editorInput
     *            The {@link IEditorInput} that shall be saved.
     * @throws TransformationException
     *             If the transformation to other representations fail.
     */
    public void handleEditorSave(IEditorInput editorInput) throws TransformationException;

    /**
     * Merges the already committed changes back into the master branch.
     * 
     * @param commitMessage
     *            The message to be shown for the merge commit.
     * @throws CommitException
     *             If the merge and commit on the master branch fails.
     */
    public void handleEditorMerge(String commitMessage) throws CommitException;

    /**
     * Tests if a merge to the master branch is necessary.
     * 
     * @return True if not all changes from the branch have been merged to the master branch yet. False otherwise.
     */
    public boolean isMergeNecessary();

}