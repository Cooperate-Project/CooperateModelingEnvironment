package de.cooperateproject.modeling.common.editorInput;

import de.cooperateproject.modeling.common.types.ConcreteSyntaxTypes;
import org.eclipse.core.resources.IFile;

public interface ILauncherFileEditorInput {

    public IFile getAssociatedLauncherFile();
    
    public ConcreteSyntaxTypes getEditorType();
}
