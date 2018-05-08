package de.cooperateproject.ui.wizards.modelimport;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.spi.transfer.FileSystemTransferSystem;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.transfer.CDOTransfer;
import org.eclipse.emf.cdo.transfer.CDOTransferSystem;
import org.eclipse.emf.cdo.transfer.spi.repository.RepositoryTransferSystem;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.cdo.util.resources.CDOResourceHandler;
import de.cooperateproject.ui.util.CDOTransferUMLFirst;
import de.cooperateproject.ui.util.PathmapFilteringTransferSystem;

/**
 * Wizard for importing an UML model from the file system to the Cooperate repository.
 */
public class ModelImportWizard extends Wizard implements IImportWizard {

    private final WritableValue<IProject> selectedProject = new WritableValue<>();
    private final WritableValue<String> selectedUMLModel = new WritableValue<>();
    private static final URI UML_PRIMITIVE_TYPES_URI = URI.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI);

    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        setWindowTitle("Import Cooperate Model");
        setNeedsProgressMonitor(true);
    }

    @Override
    public void addPages() {
        super.addPages();
        addPage(new ModelImportPage(selectedProject, selectedUMLModel));
    }

    @Override
    public boolean performFinish() {
        String umlModel = selectedUMLModel.getValue();
        IProject project = selectedProject.getValue();
        CDOSession session = CDOConnectionManager.INSTANCE.acquireSession(project);

        CDOTransaction trans = session.openTransaction();
        CDOTransferSystem source = new PathmapFilteringTransferSystem(new FileSystemTransferSystem());
        RepositoryTransferSystem target = new RepositoryTransferSystem(trans);

        EList<Path> diagramPaths = getDiagramPaths(umlModel);
        CDOTransfer transfer = new CDOTransferUMLFirst(source, target);

        transfer.setTargetPath(project.getFullPath());
        transfer.getModelTransferContext().getTargetResourceSet()
                .setResourceFactoryRegistry((CDOResourceHandler.createFactoryWrapper(
                        transfer.getModelTransferContext().getTargetResourceSet().getResourceFactoryRegistry())));
        diagramPaths.forEach(n -> transfer.map(n.toString(), new NullProgressMonitor()));

        transfer.getModelTransferContext().registerTargetExtension("*", new XMIResourceFactoryImpl());
        UMLUtil.init(transfer.getModelTransferContext().getTargetResourceSet());
        transfer.getModelTransferContext().getTargetResourceSet().getResource(UML_PRIMITIVE_TYPES_URI, true);
        transfer.perform();
        return true;
    }

    private EList<Path> getDiagramPaths(String path) {
        // TODO: Preliminary method to get relevant resources, might need to be changed after talking to Stephan
        // Problems: files models and model exist, we filter for model and get all the models, need to change to naming
        // template
        EList<Path> paths = new BasicEList<Path>();
        String modelName = path.substring(path.lastIndexOf("\\") + 1, path.lastIndexOf("."));
        String folderPath = path.substring(0, path.lastIndexOf("\\") + 1);

        File[] allFiles = (new File(folderPath)).listFiles();
        for (int i = 0; i < allFiles.length; i++) {
            if (allFiles[i].getName().contains(modelName)) {
                paths.add(Paths.get(folderPath + allFiles[i].getName()));
            }
        }
        return paths;
    }

}
