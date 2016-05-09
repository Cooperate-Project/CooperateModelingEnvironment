package de.cooperateproject.ui.nature;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;

public class CooperateProjectNature implements IProjectNature {

	public static final String NATURE_ID = "de.cooperateproject.ui.CooperateProjectNature";
	private static final String XTEXT_NATURE_ID = "org.eclipse.xtext.ui.shared.xtextNature";
	private IProject project;

	@Override
	public void configure() throws CoreException {
		IProjectDescription projectDescription = project.getDescription();

		NatureUtils.addNatureToProjectDescription(projectDescription, XTEXT_NATURE_ID);
		NatureUtils.addBuilderToProjectDescription(projectDescription, CooperateProjectBuilder.BUILDER_ID);

		project.setDescription(projectDescription, new NullProgressMonitor());
	}

	@Override
	public void deconfigure() throws CoreException {
		IProjectDescription projectDescription = project.getDescription();

		NatureUtils.removeBuilderFromProjectDescription(projectDescription, CooperateProjectBuilder.BUILDER_ID);

		project.setDescription(projectDescription, new NullProgressMonitor());
	}

	@Override
	public IProject getProject() {
		return project;
	}

	@Override
	public void setProject(IProject project) {
		this.project = project;
	}

}
