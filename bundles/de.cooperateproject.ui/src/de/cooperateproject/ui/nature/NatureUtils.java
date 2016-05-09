package de.cooperateproject.ui.nature;

import java.util.Arrays;
import java.util.stream.Stream;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;

import com.google.common.collect.ObjectArrays;

public class NatureUtils {
	
	private NatureUtils() {
	}
	
	public static IStatus addNatureToProjectDescription(IProjectDescription description, String natureId) {
		String[] natureIds = description.getNatureIds();

		// calculate new nature IDs
		if (Arrays.asList(natureIds).contains(natureId)) {
			return Status.OK_STATUS;
		}		
		natureIds = ObjectArrays.concat(description.getNatureIds(), natureId);
		
		// validate the natures
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IStatus validationResult = workspace.validateNatureSet(natureIds);
		
		if (validationResult.getCode() == IStatus.OK) {
			description.setNatureIds(natureIds);
		}
		
		return validationResult;
	}

	public static void addNatureToProject(IProject project, String natureId) throws CoreException {
		IProjectDescription description = project.getDescription();
		IStatus status = addNatureToProjectDescription(description, natureId);
		if (status.getCode() == IStatus.OK) {
			project.setDescription(description, new NullProgressMonitor());
		} else {
			throw new CoreException(status);
		}
	}
	
	public static void addBuilderToProjectDescription(IProjectDescription description, String builderId) {
		if (!Arrays.asList(description.getBuildSpec()).stream()
				.anyMatch(cmd -> builderId.equals(cmd.getBuilderName()))) {
			ICommand buildCommand = description.newCommand();
			buildCommand.setBuilderName(builderId);
			ICommand[] newBuildSpec = ObjectArrays.concat(description.getBuildSpec(), buildCommand);
			description.setBuildSpec(newBuildSpec);
		}
	}
	
	public static void removeBuilderFromProjectDescription(IProjectDescription description, String builderId) {
		Stream<ICommand> newBuildSpec = Arrays.asList(description.getBuildSpec()).stream()
				.filter(cmd -> !builderId.equals(cmd.getBuilderName()));
		description.setBuildSpec(newBuildSpec.toArray(size -> new ICommand[size]));
	}
	
	public static boolean hasNature(IProject project, String natureId) throws CoreException {
		return Arrays.asList(project.getDescription().getNatureIds()).stream().anyMatch(id -> natureId.equals(id));
	}
	
	public static boolean hasCooperateNature(IProject project) throws CoreException {
		return hasNature(project, CooperateProjectNature.NATURE_ID);
	}

}
