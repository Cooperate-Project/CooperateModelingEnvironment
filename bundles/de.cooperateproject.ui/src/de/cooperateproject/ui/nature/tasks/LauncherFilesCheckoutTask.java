package de.cooperateproject.ui.nature.tasks;

import java.io.IOException;
import java.util.Collections;
import java.util.Objects;
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

import de.cooperateproject.modeling.textual.common.convetions.ModelNamingConventions;
import de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.Launcher.LauncherFactory;
import de.cooperateproject.ui.launchermodel.Launcher.util.LauncherResourceImpl;
import de.cooperateproject.ui.properties.ProjectPropertiesDTO;
import de.cooperateproject.ui.util.TextualModelFileExtensions;

/**
 * Assumptions:
 * <ul>
 * <li>Graphical and textual models exist</li>
 * <li>Naming patterns of</li>
 * </ul>
 * graphical and textual models match
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
				.map(this::createLauncher).filter(Objects::nonNull).collect(Collectors.toSet());
		saveLaunchers(diagrams);
	}

	private de.cooperateproject.ui.launchermodel.Launcher.Diagram createLauncher(Diagram papyrusDiagram) {
		Optional<TextualModelFileExtensions> textualModelType = TextualModelFileExtensions
				.getByPapyrusType(papyrusDiagram.getType());
		if (!textualModelType.isPresent()) {
			LOGGER.warn(String.format("There is no textual model type associated with the papyrus diagram type \"%s\".",
					papyrusDiagram.getType()));
			return null;
		}

		URI graphicalModelURI = papyrusDiagram.eResource().getURI();
		URI textualModelURI = ModelNamingConventions.getTextualFromGraphicalURI(graphicalModelURI,
				papyrusDiagram.getName(), textualModelType.get().getExtension());

		String launcherFileName = URI.decode(textualModelURI.trimFileExtension().lastSegment());
		de.cooperateproject.ui.launchermodel.Launcher.Diagram launcherDiagram = LauncherFactory.eINSTANCE
				.createDiagram();
		launcherDiagram.setName(launcherFileName);

		ConcreteSyntaxModel papyrusModel = LauncherFactory.eINSTANCE.createGraphicalConcreteSyntaxModel();
		papyrusModel.setExtension(NOTATION_FILE_EXTENSION);
		papyrusModel.setRootElement(papyrusDiagram);
		launcherDiagram.getConcreteSyntaxModels().add(papyrusModel);

		URI relativeURI = textualModelURI.deresolve(graphicalModelURI);
		if (relativeURI.segmentCount() > 1) {
			LOGGER.warn("Textual and graphical models that are not in the same directory are not supported yet.");
			return null;
		}
		
		CDOResourceNode textualResourceNode = getRepositoryFolder().getNode(URI.decode(relativeURI.lastSegment()));
		if (!(textualResourceNode instanceof CDOResource)) {
			LOGGER.error("Textual resource not available.");
			return null;
		}
		
		CDOResource textualModelResource = (CDOResource)textualResourceNode;
		if (textualModelResource.getContents().isEmpty()) {
			LOGGER.warn(String.format("There is no textual model with URI \"%s\".", textualModelURI.toString()));
		}

		ConcreteSyntaxModel textualModel = LauncherFactory.eINSTANCE.createTextualConcreteSyntaxModel();
		textualModel.setExtension(textualModelType.get().getExtension());
		textualModel.setRootElement(textualModelResource.getContents().get(0));
		launcherDiagram.getConcreteSyntaxModels().add(textualModel);

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
