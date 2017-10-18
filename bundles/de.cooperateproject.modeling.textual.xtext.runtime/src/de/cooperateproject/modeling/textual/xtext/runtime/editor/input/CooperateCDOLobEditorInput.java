package de.cooperateproject.modeling.textual.xtext.runtime.editor.input;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.cdo.eresource.CDOResourceLeaf;
import org.eclipse.emf.cdo.internal.ui.CDOLobEditorInput;
import org.eclipse.net4j.util.lifecycle.LifecycleException;

import de.cooperateproject.modeling.common.editorInput.ILauncherFileEditorInput;
import de.cooperateproject.modeling.common.types.ConcreteSyntaxTypes;

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

    @Override
    public ConcreteSyntaxTypes getEditorType() {
        return ConcreteSyntaxTypes.TEXTUAL;
    }

    @Override
    public String getName() {
        String name;
        try {
            name = super.getName();
        } catch (LifecycleException ex) {
            name = associatedLauncherFile.getName();
        }

        return name;
    }

}
