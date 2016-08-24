package de.cooperateproject.modeling.textual.xtext.runtime.editor.input;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.cdo.eresource.CDOResourceLeaf;
import org.eclipse.emf.cdo.internal.ui.CDOLobEditorInput;

public class CooperateCDOLobEditorInput extends CDOLobEditorInput {

	private final IFile associatedLauncherFile;
	
	public CooperateCDOLobEditorInput(CDOResourceLeaf resource, IFile associatedLauncherFile) {
		super(resource);
		this.associatedLauncherFile = associatedLauncherFile;
	}

	public IFile getAssociatedLauncherFile() {
		return associatedLauncherFile;
	}

}
