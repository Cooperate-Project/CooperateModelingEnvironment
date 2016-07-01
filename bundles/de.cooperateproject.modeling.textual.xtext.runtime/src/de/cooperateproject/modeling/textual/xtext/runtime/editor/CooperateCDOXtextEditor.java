package de.cooperateproject.modeling.textual.xtext.runtime.editor;

import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;

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
		super.doSave(progressMonitor);
		try {
			postProcessorHandler.executePostProcessors();
		} catch (Exception e) {
			throw new RuntimeException("Error during post processing.", e);
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
