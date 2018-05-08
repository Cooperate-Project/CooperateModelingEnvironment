package de.cooperateproject.ui.wizards.model.export;

import java.io.File;

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.spi.transfer.FileSystemTransferSystem;
import org.eclipse.emf.cdo.transfer.CDOTransfer;
import org.eclipse.emf.cdo.transfer.CDOTransferSystem;
import org.eclipse.emf.cdo.transfer.spi.repository.RepositoryTransferSystem;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.cdo.util.resources.CDOResourceHandler;
import de.cooperateproject.ui.util.CDOTransferUMLFirst;
import de.cooperateproject.ui.util.PathmapFilteringTransferSystem;

/**
 * Wizard for exporting an UML model from the Cooperate repository to the file system.
 */
public class ModelExportWizard extends Wizard implements IExportWizard {

    private final WritableValue<IProject> selectedProject = new WritableValue<>();
    private final WritableValue<String> selectedUMLModelName = new WritableValue<>();
    private final WritableValue<Long> selectedVersion = new WritableValue<>();
    private final WritableValue<File> selectedDestination = new WritableValue<>();

    private static final URI UML_PRIMITIVE_TYPES_URI = URI.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI);

    @Override
    public void addPages() {
        super.addPages();
        addPage(new ModelExportPage(selectedProject, selectedUMLModelName, selectedVersion, selectedDestination));
    }

    @Override
    public boolean performFinish() {
        // copy from ModelGen
        CDOSession session = CDOConnectionManager.INSTANCE.acquireSession(selectedProject.doGetValue());
        CDOView view = session.openView(selectedVersion.doGetValue());

        CDOTransferSystem target = new PathmapFilteringTransferSystem(new FileSystemTransferSystem());
        RepositoryTransferSystem source = new RepositoryTransferSystem(new ViewExportWrapper(view));

        CDOTransfer transfer = new CDOTransferUMLFirst(source, target);
        transfer.setTargetPath(selectedDestination.doGetValue().getAbsolutePath());
        transfer.getModelTransferContext().getTargetResourceSet()
                .setResourceFactoryRegistry((CDOResourceHandler.createFactoryWrapper(
                        transfer.getModelTransferContext().getTargetResourceSet().getResourceFactoryRegistry())));

        view.getResourceFolder(selectedProject.doGetValue().getName()).getNodes()
                .forEach(n -> transfer.map(n.getPath(), new NullProgressMonitor()));

        // no default factory is registered in the CDO utilities
        transfer.getModelTransferContext().registerTargetExtension("*", new XMIResourceFactoryImpl());
        UMLUtil.init(transfer.getModelTransferContext().getTargetResourceSet());
        transfer.getModelTransferContext().getTargetResourceSet().getResource(UML_PRIMITIVE_TYPES_URI, true);
        transfer.perform();

        return true;
    }

    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        setWindowTitle("Export Cooperate Model");
        setNeedsProgressMonitor(true);
    }

}