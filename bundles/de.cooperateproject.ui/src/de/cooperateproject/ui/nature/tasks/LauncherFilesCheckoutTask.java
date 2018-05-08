package de.cooperateproject.ui.nature.tasks;

import java.io.IOException;
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.eresource.CDOResourceFolder;
import org.eclipse.emf.cdo.eresource.CDOResourceNode;
import org.eclipse.emf.cdo.view.CDOViewInvalidationEvent;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.modeling.common.conventions.ModelNamingConventions;
import de.cooperateproject.modeling.common.types.DiagramTypeRegistry;
import de.cooperateproject.modeling.common.types.IDiagramType;
import de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.Launcher.LauncherFactory;
import de.cooperateproject.ui.launchermodel.Launcher.util.LauncherResourceImpl;
import de.cooperateproject.ui.properties.ProjectPropertiesDTO;

/**
 * Assumptions:
 * <ul>
 * <li>Graphical and textual models exist</li>
 * <li>Naming patterns of</li>
 * </ul>
 * graphical and textual models match
 */
public class LauncherFilesCheckoutTask extends CDOHandlingBackgroundTask {

    private static final Logger LOGGER = LoggerFactory.getLogger(LauncherFilesCheckoutTask.class);
    private static final String LAUNCHER_FILE_EXTENSION = LauncherResourceImpl.EXTENSION;
    private static final String NOTATION_FILE_EXTENSION = "notation";
    public static final String MODELS_DIRECTORY_NAME = "models";

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
        IFolder folder = createLauncherFolder(getProject());
        removeAllLauncherFiles(folder);
        createAllLauncherFiles(folder, getRepositoryFolder());
        refreshFolder(folder);
    }

    private static void removeAllLauncherFiles(IFolder launcherFolder) throws CoreException {
        cleanUpFolder(launcherFolder);
    }

    private static void createAllLauncherFiles(IFolder folder, CDOResourceFolder repositoryFolder)
            throws CoreException {
        Set<de.cooperateproject.ui.launchermodel.Launcher.Diagram> diagrams = repositoryFolder.getNodes().stream()
                .filter(n -> NOTATION_FILE_EXTENSION.equals(n.getExtension()))
                .flatMap(n -> n.eContents().stream().filter(o -> o instanceof Diagram).map(o -> (Diagram) o))
                .map(d -> createLauncher(d, repositoryFolder)).filter(Objects::nonNull).collect(Collectors.toSet());
        saveLaunchers(diagrams, folder);
    }

    private static de.cooperateproject.ui.launchermodel.Launcher.Diagram createLauncher(Diagram papyrusDiagram,
            CDOResourceFolder repositoryFolder) {

        Optional<IDiagramType> diagramTypeQueryResult = DiagramTypeRegistry.getInstance()
                .getByNotationDiagramType(papyrusDiagram.getType());
        if (!diagramTypeQueryResult.isPresent()) {
            LOGGER.warn(String.format("Unknown papyrus diagram type \"%s\".", papyrusDiagram.getType()));
            return null;
        }
        String textualFileExtension = diagramTypeQueryResult.get().getTextualFileExtension();

        URI graphicalModelURI = papyrusDiagram.eResource().getURI();
        URI textualModelURI = ModelNamingConventions.getTextualFromGraphicalURI(graphicalModelURI,
                papyrusDiagram.getName(), textualFileExtension);

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

        CDOResourceNode textualResourceNode = repositoryFolder.getNode(URI.decode(relativeURI.lastSegment()));
        if (!(textualResourceNode instanceof CDOResource)) {
            LOGGER.error("Textual resource not available.");
            return null;
        }

        CDOResource textualModelResource = (CDOResource) textualResourceNode;
        if (textualModelResource.getContents().isEmpty()) {
            LOGGER.warn(String.format("There is no textual model with URI \"%s\".", textualModelURI.toString()));
        }

        ConcreteSyntaxModel textualModel = LauncherFactory.eINSTANCE.createTextualConcreteSyntaxModel();
        textualModel.setExtension(textualFileExtension);
        textualModel.setRootElement(textualModelResource.getContents().get(0));
        launcherDiagram.getConcreteSyntaxModels().add(textualModel);

        return launcherDiagram;
    }

    private static void saveLaunchers(Iterable<de.cooperateproject.ui.launchermodel.Launcher.Diagram> launchers,
            IFolder launchersFolder) throws CoreException {
        for (de.cooperateproject.ui.launchermodel.Launcher.Diagram launcher : launchers) {
            try {
                saveLauncher(launcher, launchersFolder);
            } catch (IOException e) {
                LOGGER.warn("Could not create launcher file.", e);
            }
        }
    }

    private static void saveLauncher(de.cooperateproject.ui.launchermodel.Launcher.Diagram launcher,
            IFolder launchersFolder) throws IOException, CoreException {
        ResourceSet rs = new ResourceSetImpl();
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
