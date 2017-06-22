package de.cooperateproject.modeling.textual.xtext.runtime.editor.input;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.cdo.eresource.CDOResourceLeaf;
import org.eclipse.emf.cdo.internal.ui.CDOLobEditorInput;

import de.cooperateproject.util.editor.ILauncherFileEditorInput;

public class CooperateCDOLobEditorInput extends CDOLobEditorInput implements ILauncherFileEditorInput {

    private final IFile associatedLauncherFile;

    public CooperateCDOLobEditorInput(CDOResourceLeaf resource, IFile associatedLauncherFile) {
        super(resource);
        this.associatedLauncherFile = associatedLauncherFile;
    }

    @Override
    public IFile getAssociatedLauncherFile() {
        return associatedLauncherFile;
    }

    @Override
    public <T> T getAdapter(Class<T> adapter) {
        if (adapter.isAssignableFrom(ILauncherFileEditorInput.class)) {
            return adapter.cast(this);
        }
        if (adapter.isAssignableFrom(CooperateCDOLobEditorInput.class)) {
            return adapter.cast(this);
        }
        return super.getAdapter(adapter);
    }

}
