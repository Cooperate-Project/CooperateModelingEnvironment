package de.cooperateproject.modeling.textual.xtext.runtime.editor;

public interface SaveablePostProcessingSupport {

	public void register(SavePostProcessor postProcessor);
	public void unregister(SavePostProcessor postProcessor);
	
}
