package de.cooperateproject.ui.textualeditors.editorlauncher;

import java.io.IOException;
import java.util.Optional;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.IEditorPart;

import de.cooperateproject.ui.editors.launcher.extensions.EditorType;
import de.cooperateproject.ui.editors.launcher.extensions.IEditorLauncher;
import de.cooperateproject.ui.editors.launcher.extensions.IEditorLauncherFactory;
import de.cooperateproject.ui.launchermodel.helper.ConcreteSyntaxTypeNotAvailableException;

/**
 * Editor launcher factory for textual editors.
 */
public class TextualCDOEditorLauncherFactory implements IEditorLauncherFactory {

    public TextualCDOEditorLauncherFactory() {
        // intentionally left blank
    }

    @Override
    public EditorType getSupportedEditorType() {
        return EditorType.TEXTUAL;
    }

    @Override
    public IEditorLauncher create(IFile launcherFile) throws IOException, ConcreteSyntaxTypeNotAvailableException {
        return new TextualCDOEditorLauncher(launcherFile);
    }

    @Override
    public Optional<IEditorPart> findExistingEditor(IFile launcherFile)
            throws IOException, ConcreteSyntaxTypeNotAvailableException {
        return TextualCDOEditorLauncher.findExistingEditor(launcherFile);
    }

}
