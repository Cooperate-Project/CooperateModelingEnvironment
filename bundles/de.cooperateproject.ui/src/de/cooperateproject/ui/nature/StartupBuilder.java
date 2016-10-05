package de.cooperateproject.ui.nature;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IStartup;

public class StartupBuilder implements IStartup {

	private static final Logger LOGGER = Logger.getLogger(StartupBuilder.class);

	@Override
	public void earlyStartup() {
		for (IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
			try {
				if (project.isOpen() && NatureUtils.hasCooperateNature(project)) {
					project.build(IncrementalProjectBuilder.CLEAN_BUILD, null);
				}
			} catch (CoreException e) {
				LOGGER.error("Exception during rebuild on startup", e);
			}

		}
		ResourcesPlugin.getWorkspace().addResourceChangeListener(new ProjectOpenedListener());
	}

}
