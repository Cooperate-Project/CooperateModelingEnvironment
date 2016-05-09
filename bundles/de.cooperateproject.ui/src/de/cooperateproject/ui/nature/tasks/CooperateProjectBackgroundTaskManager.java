package de.cooperateproject.ui.nature.tasks;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IProject;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import de.cooperateproject.ui.properties.ProjectPropertiesDTO;
import de.cooperateproject.ui.properties.ProjectPropertiesStore;

public class CooperateProjectBackgroundTaskManager {

	private final Map<IProject, Collection<BackgroundTask>> tasks = Maps.newHashMap();
	private final Collection<BackgroundTaskFactory<?>> taskFactories = Sets.newHashSet();

	public void registerTaskFactory(BackgroundTaskFactory<?> factory) {
		if (taskFactories.add(factory)) {
			startTaskForProjects(factory);
		}
	}

	public void deregsiterTaskFactory(BackgroundTaskFactory<BackgroundTask> factory) {
		if (taskFactories.remove(factory)) {
			stopTaskForProjects(factory);
		}
	}

	public void registerProject(IProject project) {
		if (!tasks.containsKey(project)) {
			tasks.put(project, Sets.newHashSet());
			startTasksFor(project);
		}
	}

	public void deregisterProject(IProject project) {
		if (tasks.containsKey(project)) {
			stopTasksFor(project);
			tasks.remove(project);
		}
	}

	private void startTasksFor(IProject project) {
		for (BackgroundTaskFactory<?> taskFactory : taskFactories) {
			startTaskFor(project, taskFactory);
		}
	}

	private void startTaskFor(IProject project, BackgroundTaskFactory<?> taskFactory) {
		BackgroundTask task = taskFactory.create(project, createProjectProperties(project));
		tasks.get(project).add(task);
		try {
			task.start();
		} catch (TaskException e) {
			// TODO Log error
			e.printStackTrace();
		}

	}

	private void stopTasksFor(IProject project) {
		for (Iterator<BackgroundTask> taskIterator = tasks.get(project).iterator(); taskIterator.hasNext();) {
			BackgroundTask task = taskIterator.next();
			task.stop();
			taskIterator.remove();
		}
	}

	private void startTaskForProjects(BackgroundTaskFactory<?> factory) {
		for (IProject project : tasks.keySet()) {
			startTaskFor(project, factory);
		}
	}

	private void stopTaskForProjects(BackgroundTaskFactory<BackgroundTask> factory) {
		for (IProject project : tasks.keySet()) {
			stopTaskFor(project, factory);
		}
	}

	private void stopTaskFor(IProject project, BackgroundTaskFactory<?> factory) {
		Set<BackgroundTask> tasksToRemove = tasks.get(project).stream()
				.filter(t -> factory.getTaskType().isAssignableFrom(t.getClass())).collect(Collectors.toSet());
		tasksToRemove.forEach(t -> t.stop());
		tasks.get(project).removeAll(tasksToRemove);
	}

	private static ProjectPropertiesDTO createProjectProperties(IProject project) {
		ProjectPropertiesStore propertiesStore = new ProjectPropertiesStore(project);
		propertiesStore.initFromStore();
		return propertiesStore.getPreferences();
	}
}
