package de.cooperateproject.ui.editors.launcher.extensions;

import java.io.IOException;
import java.util.Optional;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.IEditorPart;

import de.cooperateproject.ui.launchermodel.helper.ConcreteSyntaxTypeNotAvailableException;

/**
 * Factory for {@link IEditorLauncher} elements.
 * 
 * The factory provides abilities for creating or finding existing editors.
 */
public interface IEditorLauncherFactory {

    /**
     * Creates an {@link IEditorLauncher} based on a launcher file.
     * 
     * @param launcherFile
     *            The launcher file to initialize the editor with.
     * @return The editor launcher for the given launcher file.
     * @throws IOException
     *             Thrown if the launcher file cannot be processed successfully.
     * @throws ConcreteSyntaxTypeNotAvailableException
     *             Thrown if launcher file does not contain the {@link EditorType} supported by this factory.
     */
    public IEditorLauncher create(IFile launcherFile) throws IOException, ConcreteSyntaxTypeNotAvailableException;

    /**
     * @return The {@link EditorType} supported by this factory.
     */
    public EditorType getSupportedEditorType();

    /**
     * Finds an existing editor of the supported {@link EditorType} that has been launched with the given launcher file.
     * 
     * @param launcherFile
     *            The launcher file that has been used to open a potentially existing editor.
     * @return The open editor or {@link Optional#empty()} if no open editor matches the given launcher file.
     * @throws IOException
     *             Thrown if the launcher file cannot be processed successfully.
     * @throws ConcreteSyntaxTypeNotAvailableException
     *             Thrown if launcher file does not contain the {@link EditorType} supported by this factory.
     */
    public Optional<IEditorPart> findExistingEditor(IFile launcherFile)
            throws IOException, ConcreteSyntaxTypeNotAvailableException;

}
