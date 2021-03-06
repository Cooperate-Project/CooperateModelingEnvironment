package de.cooperateproject.ui.editors.launcher;

import java.io.IOException;
import java.net.URI;
import java.util.Optional;

import org.eclipse.core.filesystem.URIUtil;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.ui.editors.launcher.extensions.EditorType;
import de.cooperateproject.ui.editors.launcher.extensions.IEditorLauncher;
import de.cooperateproject.ui.editors.launcher.extensions.IEditorLauncherFactory;
import de.cooperateproject.ui.launchermodel.helper.ConcreteSyntaxTypeNotAvailableException;
import de.cooperateproject.ui.launchermodel.helper.LauncherModelHelper;

/**
 * Launcher to be used with the Eclipse IDE to open editors for a Cooperate launcher file.
 * 
 * The editor asks for the preferred {@link EditorType} and launches a matching editor. It prevents editors from being
 * launched twice for the same file.
 */
public class EditorLauncher implements org.eclipse.ui.IEditorLauncher {

    private static final Logger LOGGER = LoggerFactory.getLogger(EditorLauncher.class);

    @Override
    public void open(IPath file) {
        // check if launcher is applicable for file type
        if (!LauncherModelHelper.FILE_EXTENSION.equals(file.getFileExtension())) {
            return;
        }

        // find workspace file
        URI fileURI = URIUtil.toURI(file);
        IFile[] foundResources = ResourcesPlugin.getWorkspace().getRoot().findFilesForLocationURI(fileURI);
        if (foundResources == null || foundResources.length != 1) {
            return;
        }
        IFile launcherFile = foundResources[0];

        Optional<IEditorPart> existingEditor = findAnyOpenEditor(launcherFile);
        if (existingEditor.isPresent()) {
            existingEditor.get().setFocus();
            return;
        }

        // determine preferred editor type
        Optional<EditorType> preferredEditorType = getPreferredEditorType();
        if (!preferredEditorType.isPresent()) {
            return;
        }

        // open the editor
        try {
            Optional<IEditorLauncherFactory> editorLauncherFactory = EditorLauncherRegistry.getInstance()
                    .getFactory(preferredEditorType.get());
            if (!editorLauncherFactory.isPresent()) {
                throw new PartInitException("No editor available for that type.");
            }
            IEditorLauncher launcher = editorLauncherFactory.get().create(launcherFile);
            launcher.openEditor();
        } catch (IOException e) {
            LOGGER.error("Could not read launcher file.", e);
        } catch (ConcreteSyntaxTypeNotAvailableException e) {
            final String errorMessage = "The selected editor type is not available for this model.";
            MessageDialog.openError(Display.getCurrent().getActiveShell(), "Error in opening the editor", errorMessage);
            LOGGER.warn(errorMessage, e);
        } catch (PartInitException e) {
            final String errorMessage = "Error during initialization of editor.";
            LOGGER.error(errorMessage, e);
            MessageDialog.openError(Display.getCurrent().getActiveShell(), "Error in opening the editor", errorMessage);
        }

    }

    private static Optional<IEditorPart> findAnyOpenEditor(IFile launcherFile) {
        for (IEditorLauncherFactory factory : EditorLauncherRegistry.getInstance().getFactories()) {
            try {
                Optional<IEditorPart> foundEditor = factory.findExistingEditor(launcherFile);
                if (foundEditor.isPresent()) {
                    return foundEditor;
                }
            } catch (ConcreteSyntaxTypeNotAvailableException e) {
                LOGGER.trace("The launcher file {} does not contain information about the concrete syntax type of {}.",
                        launcherFile, factory, e);
            } catch (IOException e) {
                LOGGER.error("Could not read launcher file {}.", launcherFile, e);
            }
        }
        return Optional.empty();
    }

    private static Optional<EditorType> getPreferredEditorType() {
        MessageDialog dlg = new MessageDialog(Display.getCurrent().getActiveShell(), "Editor Type Selection", null,
                "Which editor type do you prefer?", MessageDialog.QUESTION_WITH_CANCEL,
                new String[] { "Textual", "Graphical", "Cancel" }, 0);
        int result = dlg.open();
        switch (result) {
        case 1:
            return Optional.ofNullable(EditorType.GRAPHICAL);
        case 0:
            return Optional.ofNullable(EditorType.TEXTUAL);
        default:
            return Optional.empty();
        }
    }

}
