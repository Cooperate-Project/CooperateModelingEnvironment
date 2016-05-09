package de.cooperateproject.ui.nature.tasks;

public interface BackgroundTask {

	public void start() throws TaskException;
	public void stop();
	
}
