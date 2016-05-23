package de.cooperateproject.ui.editors.launcher;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorLauncher;
import org.eclipse.ui.PartInitException;

import com.google.common.base.Optional;

import de.cooperateproject.ui.constants.UIConstants;
import de.cooperateproject.ui.editors.launcher.extensions.ConcreteSyntaxTypeNotAvailableException;
import de.cooperateproject.ui.editors.launcher.extensions.EditorType;
import de.cooperateproject.ui.editors.launcher.extensions.IEditorLauncherFactory;

public class EditorLauncher implements IEditorLauncher {

	private static final Logger LOGGER = Logger.getLogger(EditorLauncher.class);

	@Override
	public void open(IPath file) {
		// check if launcher is applicable for file type
		if (!UIConstants.LAUNCHER_EXTENSION.equals(file.getFileExtension())) {
			return;
		}

		// find workspace file
		IFile[] foundFiles = ResourcesPlugin.getWorkspace().getRoot().findFilesForLocation(file.makeAbsolute());
		if (foundFiles.length != 1) {
			return;
		}
		IFile launcherFile = foundFiles[0];

		// determine preferred editor type
		Optional<EditorType> preferredEditorType = getPreferredEditorType();
		if (!preferredEditorType.isPresent()) {
			return;
		}

		
		// open the editor
		try {
			java.util.Optional<IEditorLauncherFactory> editorLauncherFactory = EditorLauncherRegistry.getInstance().getFactory(preferredEditorType.get());
			if (!editorLauncherFactory.isPresent()) {
				throw new PartInitException("No editor available for that type.");
			}
			de.cooperateproject.ui.editors.launcher.extensions.IEditorLauncher launcher = editorLauncherFactory.get().create(launcherFile, preferredEditorType.get());
			launcher.openEditor();
		} catch (IOException e) {
			LOGGER.error("Could not read launcher file.", e);
		} catch (ConcreteSyntaxTypeNotAvailableException e) {
			LOGGER.warn("The selected editor type is not available for this model.", e);
			// TODO maybe display warning to user
		} catch (PartInitException e) {
			LOGGER.error("Error during initialization of editor.", e);
		}

	}
	
	private Optional<EditorType> getPreferredEditorType() {
		MessageDialog dlg = new MessageDialog(Display.getCurrent().getActiveShell(), "Editor Type Selection", null,
				"Which editor type do you prefer?", MessageDialog.QUESTION_WITH_CANCEL,
				new String[] { "Textual", "Graphical", "Cancel" }, 0);
		int result = dlg.open();
		switch (result) {
		case 1:
			return Optional.fromNullable(EditorType.GRAPHICAL);
		case 0:
			return Optional.fromNullable(EditorType.TEXTUAL);
		default:
			return Optional.absent();
		}
	}

}
