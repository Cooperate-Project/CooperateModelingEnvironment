package de.cooperateproject.modeling.textual.xtext.runtime.editor;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;

import com.google.common.collect.Sets;

import net.winklerweb.cdoxtext.runtime.CDOXtextEditor;

public class CooperateCDOXtextEditor extends CDOXtextEditor {

	private static class PostProcessorHandler implements SaveablePostProcessingSupport {

		private final Set<SavePostProcessor> processors = Sets.newHashSet();
		
		@Override
		public void register(SavePostProcessor postProcessor) {
			processors.add(postProcessor);
		}

		@Override
		public void unregister(SavePostProcessor postProcessor) {
			processors.remove(postProcessor);
		}
		
		private void executePostProcessors() throws Exception {
			for (SavePostProcessor processor : processors) {
				processor.processAfterSafe();
			}
		}
		
	}
	private final PostProcessorHandler postProcessorHandler = new PostProcessorHandler();
	
	@Override
	public void doSave(IProgressMonitor progressMonitor) {
		if (getDocument() != null) {
			saveAllAssociated(getDocument());
		}
		super.doSave(progressMonitor);
		try {
			postProcessorHandler.executePostProcessors();
		} catch (Exception e) {
			throw new RuntimeException("Error during post processing.", e);
		}
	}
	
	private void saveAllAssociated(IXtextDocument iXtextDocument) {
		CooperateXtextDocument cooperateXtextDocument = getDocument().getAdapter(CooperateXtextDocument.class);
		if (cooperateXtextDocument != null) {
			saveAllAssociated(cooperateXtextDocument);
		}
	}
	
	private void saveAllAssociated(CooperateXtextDocument document) {
		ResourceSet rs = document.getResource().getResourceSet();
		List<Resource> resourcesToBeSaved = rs.getResources().stream().filter(r -> r != document.getResource()).filter(r -> !r.isTrackingModification() || r.isModified()).collect(Collectors.toList());
		
		for (Resource r : resourcesToBeSaved) {
			try {
				r.save(Collections.emptyMap());
			} catch (IOException e) {
				throw new RuntimeException("Error during save of associated resources.", e);
			}
		}
	}
	
	@SuppressWarnings("rawtypes")
	public Object getAdapter(Class requestedClass) {
		if (SaveablePostProcessingSupport.class.isAssignableFrom(requestedClass)) {
			return postProcessorHandler;
		}
		return super.getAdapter(requestedClass);
	}

	
}
