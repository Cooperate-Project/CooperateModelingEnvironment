package de.cooperateproject.modeling.textual.xtext.runtime.editor.fileprovider;

import java.util.Optional;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.cdo.eresource.CDOResource;

public interface AnnotationFileProvider {

	public Optional<IFile> determineIFile(CDOResource cdoResource);
	
}
