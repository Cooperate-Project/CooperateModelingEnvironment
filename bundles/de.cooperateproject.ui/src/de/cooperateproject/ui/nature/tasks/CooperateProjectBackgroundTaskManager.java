package de.cooperateproject.ui.nature.tasks;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import de.cooperateproject.ui.nature.NatureUtils;

public class CooperateProjectBackgroundTaskManager {

    private static final Logger LOGGER = Logger.getLogger(CooperateProjectBackgroundTaskManager.class);
    private final Map<IProject, Collection<BackgroundTask>> tasks = Maps.newHashMap();
    private final Collection<BackgroundTaskFactory<?>> taskFactories = Sets.newHashSet();

    public void registerTaskFactory(BackgroundTaskFactory<?> factory) {
        if (taskFactories.add(factory)) {
            startTaskForProjects(factory);
        }
    }

    public void deregisterTaskFactory(BackgroundTaskFactory<BackgroundTask> factory) {
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
        BackgroundTask task = taskFactory.create(project, NatureUtils.createProjectProperties(project));
        LOGGER.debug(String.format("Starting of task %s for project %s.", task.getClass().getSimpleName(),
                project.getName()));
        try {
            tasks.get(project).add(task);
            task.start();
        } catch (TaskException e) {
            tasks.get(project).remove(task);
            LOGGER.error(String.format("Starting of task %s for project %s failed.", task.getClass().getSimpleName(),
                    project.getName()), e);
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
        tasksToRemove.forEach(BackgroundTask::stop);
        tasks.get(project).removeAll(tasksToRemove);
    }

}
