package de.cooperateproject.ui.papyrus.editorlauncher;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;

import de.cooperateproject.util.editor.ILauncherFileEditorInput;

public class CooperateURIEditorInput extends URIEditorInput implements ILauncherFileEditorInput {

    private final IFile launcherFile;

    public CooperateURIEditorInput(URI uri, IFile launcherFile) {
        super(uri);
        this.launcherFile = launcherFile;
    }

    @Override
    public IFile getAssociatedLauncherFile() {
        return launcherFile;
    }

    @Override
    public Object getAdapter(Class adapter) {
        if (adapter == ILauncherFileEditorInput.class) {
            return this;
        }
        return super.getAdapter(adapter);
    }

}
