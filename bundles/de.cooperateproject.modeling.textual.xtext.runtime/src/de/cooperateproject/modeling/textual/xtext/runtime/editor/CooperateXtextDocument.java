package de.cooperateproject.modeling.textual.xtext.runtime.editor;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.DocumentTokenSource;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.ITextEditComposer;

import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.xtext.runtime.resources.IResourceChangeManager;
import de.cooperateproject.modeling.textual.xtext.runtime.resources.ReloadingResourceChangeManager;

public class CooperateXtextDocument extends XtextDocument {

	private final IResourceChangeManager resourceChangeManager = new ReloadingResourceChangeManager((r, p) -> r.setTrackingModification(true));
	private Resource resource; 
	
	@Inject
	public CooperateXtextDocument(DocumentTokenSource tokenSource, ITextEditComposer composer) {
		super(tokenSource, composer);
	}

	public Resource getResource() {
		return resource;
	}

	@Override
	public void setInput(XtextResource resource) {
		super.setInput(resource);
		this.resource = resource;
		resourceChangeManager.addEventFilterFor(resource);
		resourceChangeManager.setResourceSet(resource.getResourceSet());
	}

	@Override
	public void disposeInput() {
		super.disposeInput();
		this.resource = null;
		resourceChangeManager.removeEventFilterFor(resource);
		resourceChangeManager.setResourceSet(null);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdapter(Class<T> adapterType) {
		if (adapterType.isAssignableFrom(CooperateXtextDocument.class)) {
			return (T) this;
		}
		return super.getAdapter(adapterType);
	}
	
}
