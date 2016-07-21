package de.cooperateproject.ui.nature.tasks;

import java.io.IOException;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.eresource.CDOResourceNode;
import org.eclipse.emf.cdo.view.CDOViewInvalidationEvent;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmf.runtime.notation.Diagram;

import com.google.common.base.Optional;

import de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.Launcher.LauncherFactory;
import de.cooperateproject.ui.launchermodel.Launcher.util.LauncherResourceImpl;
import de.cooperateproject.ui.properties.ProjectPropertiesDTO;
import de.cooperateproject.ui.util.TextualModelFileExtensions;

/**
 * Assumptions:
 * - Graphical and textual models exist
 * - Naming patterns of graphical and textual models match
 */
public class LauncherFilesCheckoutTask extends CDOHandlingBackgroundTask {

	private static final Logger LOGGER = Logger.getLogger(LauncherFilesCheckoutTask.class);
	private static final String LAUNCHER_FILE_EXTENSION = LauncherResourceImpl.EXTENSION;
	private static final String NOTATION_FILE_EXTENSION = "notation";
	private static final String MODELS_DIRECTORY_NAME = "models";

	public LauncherFilesCheckoutTask(IProject project, ProjectPropertiesDTO properties) {
		super(project, properties);
	}

	@Override
	protected void handleChange(CDOViewInvalidationEvent cdoChangeEvent) {
		try {
			recreateAllLauncherFiles();
		} catch (CoreException e) {
			LOGGER.warn("Could not recreate launchers.", e);
		}
	}

	@Override
	protected void doStart() throws TaskException {
		try {
			recreateAllLauncherFiles();
		} catch (CoreException e) {
			throw new TaskException("Could not recreate launchers.", e);
		}
	}

	private void recreateAllLauncherFiles() throws CoreException {
		removeAllLauncherFiles();
		createAllLauncherFiles();
		getProject().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
	}

	private void removeAllLauncherFiles() throws CoreException {
		IFolder launcherFolder = createLauncherFolder(getProject());
		cleanUpFolder(launcherFolder);
	}

	private void createAllLauncherFiles() throws CoreException {
		Set<de.cooperateproject.ui.launchermodel.Launcher.Diagram> diagrams = getRepositoryFolder().getNodes().stream()
				.filter(n -> NOTATION_FILE_EXTENSION.equals(n.getExtension()))
				.flatMap(n -> n.eContents().stream().filter(o -> o instanceof Diagram).map(o -> (Diagram) o))
				.map(this::createLauncher).collect(Collectors.toSet());
		saveLaunchers(diagrams);
	}

	private de.cooperateproject.ui.launchermodel.Launcher.Diagram createLauncher(Diagram papyrusDiagram) {
		String originalFileName = papyrusDiagram.eResource().getURI().trimFileExtension().lastSegment();
		String fileName = String.format("%s - %s", originalFileName, papyrusDiagram.getName());

		de.cooperateproject.ui.launchermodel.Launcher.Diagram launcherDiagram = LauncherFactory.eINSTANCE
				.createDiagram();
		launcherDiagram.setName(fileName);

		ConcreteSyntaxModel papyrusModel = LauncherFactory.eINSTANCE.createGraphicalConcreteSyntaxModel();
		papyrusModel.setExtension(NOTATION_FILE_EXTENSION);
		papyrusModel.setRootElement(papyrusDiagram);
		launcherDiagram.getConcreteSyntaxModels().add(papyrusModel);

		Optional<TextualModelFileExtensions> textualModelType = TextualModelFileExtensions
				.getByPapyrusType(papyrusDiagram.getType());
		if (textualModelType.isPresent()) {
			
			String textualModelFileName = createFileName(fileName, textualModelType.get().getExtension());

			CDOResourceNode textualModelResourceNode = getRepositoryFolder().getNode(textualModelFileName);
			if (textualModelResourceNode != null && textualModelResourceNode instanceof CDOResource) {
				CDOResource textualModelResource = (CDOResource)textualModelResourceNode;
				ConcreteSyntaxModel textualModel = LauncherFactory.eINSTANCE.createTextualConcreteSyntaxModel();
				textualModel.setExtension(textualModelType.get().getExtension());
				textualModel.setRootElement(textualModelResource.eContents().get(0));
				launcherDiagram.getConcreteSyntaxModels().add(textualModel);
			}
		}

		return launcherDiagram;
	}

	private void saveLaunchers(Iterable<de.cooperateproject.ui.launchermodel.Launcher.Diagram> launchers)
			throws CoreException {
		for (de.cooperateproject.ui.launchermodel.Launcher.Diagram launcher : launchers) {
			try {
				saveLauncher(launcher);
			} catch (IOException e) {
				LOGGER.warn("Could not create launcher file.", e);
			}
		}
	}

	private void saveLauncher(de.cooperateproject.ui.launchermodel.Launcher.Diagram launcher)
			throws IOException, CoreException {
		ResourceSet rs = new ResourceSetImpl();
		IFolder launchersFolder = createLauncherFolder(getProject());
		IFile destinationFile = launchersFolder.getFile(createFileName(launcher.getName(), LAUNCHER_FILE_EXTENSION));
		URI destinationURI = URI.createPlatformResourceURI(destinationFile.getFullPath().toString(), true);
		Resource r = rs.createResource(destinationURI, LAUNCHER_FILE_EXTENSION);
		r.getContents().add(launcher);
		r.save(Collections.emptyMap());
	}

	private static IFolder createLauncherFolder(IProject project) throws CoreException {
		return createWorkspaceFolder(project, MODELS_DIRECTORY_NAME, false);
	}
	
	private static String createFileName(String filename, String extension) {
		return String.format("%s.%s", filename, extension);
	}
}
