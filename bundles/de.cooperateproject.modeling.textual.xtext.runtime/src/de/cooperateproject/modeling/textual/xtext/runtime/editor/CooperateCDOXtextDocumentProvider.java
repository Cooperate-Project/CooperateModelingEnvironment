package de.cooperateproject.modeling.textual.xtext.runtime.editor;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.cdo.internal.ui.CDOLobEditorInput;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.text.IDocument;

import de.cooperateproject.modeling.textual.xtext.runtime.Activator;
import net.winklerweb.cdoxtext.runtime.CDOXtextDocumentProvider;

public class CooperateCDOXtextDocumentProvider extends CDOXtextDocumentProvider {
	
	@Override
	public void doSaveDocument(IProgressMonitor monitor, Object element, IDocument document, boolean overwrite)
			throws CoreException {
		if (!(element instanceof CDOLobEditorInput) && (document instanceof CooperateXtextDocument)) {
			CooperateXtextDocument realDocument = (CooperateXtextDocument) document;
			ResourceSet rs = realDocument.getResource().getResourceSet();
			List<Resource> resourcesToBeSaved = rs.getResources().stream().filter(r -> r != realDocument.getResource()).filter(r -> !r.isTrackingModification() || r.isModified()).collect(Collectors.toList());
			
			for (Resource r : resourcesToBeSaved) {
				try {
					r.save(Collections.emptyMap());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
//			Job saveJob = new Job("Save associated resources") {
//				
//				@Override
//				protected IStatus run(IProgressMonitor monitor) {
//					try {
//						for (Resource r : resourcesToBeSaved) {
//							r.save(Collections.emptyMap());
//						}
//						return Status.OK_STATUS;
//					} catch (IOException e) {
//						return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Could not save associated resource.", e);
//					}
//				}
//				
//			};
//			saveJob.schedule();
		}
		super.doSaveDocument(monitor, element, document, overwrite);
	}

}
