package de.cooperateproject.modeling.textual.xtext.runtime.editor;

import java.util.Optional;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.eresource.CDOResourceLeaf;
import org.eclipse.emf.cdo.internal.ui.CDOLobEditorInput;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.part.FileEditorInput;

import de.cooperateproject.modeling.textual.xtext.runtime.AnnotationFileProviderRegistry;
import net.winklerweb.cdoxtext.runtime.CDOXtextDocumentProvider;

public class CooperateCDOXtextDocumentProvider extends CDOXtextDocumentProvider {

	@Override
	public IAnnotationModel createAnnotationModel(Object element) {
		if (element instanceof CDOLobEditorInput) {
			Optional<IFile> annotationFile = determineFile(((CDOLobEditorInput)element).getResource());
			if (annotationFile.isPresent()) {
				IFileEditorInput annotationFileEditorInput = new FileEditorInput(annotationFile.get());
				return super.createAnnotationModel(annotationFileEditorInput);				
			}
		}
		return super.createAnnotationModel(element);
	}
	
	private static Optional<IFile> determineFile(CDOResourceLeaf editorInput) {
		CDOResource resource = (CDOResource) editorInput;
		return AnnotationFileProviderRegistry.getInstance().getProviders().stream().map(p -> p.determineIFile(resource)).filter(p -> p.isPresent()).map(p -> p.get()).findAny();
	}
	
}
