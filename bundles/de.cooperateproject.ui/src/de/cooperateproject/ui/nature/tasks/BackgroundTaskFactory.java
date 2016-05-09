package de.cooperateproject.ui.nature.tasks;

import org.eclipse.core.resources.IProject;

import de.cooperateproject.ui.properties.ProjectPropertiesDTO;

public interface BackgroundTaskFactory<T extends BackgroundTask> {

	public T create(IProject project, ProjectPropertiesDTO properties);
	public Class<T> getTaskType();
	
}
