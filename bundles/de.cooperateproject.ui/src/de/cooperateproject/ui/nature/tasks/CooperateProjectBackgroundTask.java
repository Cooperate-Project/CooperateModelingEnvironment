package de.cooperateproject.ui.nature.tasks;

import org.eclipse.core.resources.IProject;

import de.cooperateproject.ui.properties.ProjectPropertiesDTO;

public abstract class CooperateProjectBackgroundTask implements BackgroundTask {

	private IProject project;
	private ProjectPropertiesDTO properties;
	
	protected CooperateProjectBackgroundTask(IProject project, ProjectPropertiesDTO properties) {
		this.project = project;
		this.properties = properties;
	}
	
	public IProject getProject() {
		return project;
	}
	
	protected ProjectPropertiesDTO getProperties() {
		return properties;
	}
	
}
