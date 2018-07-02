package de.cooperateproject.ui.wizards.modelimport;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.cdo.common.util.CDOException;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.spi.transfer.FileSystemTransferSystem;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.transfer.CDOTransfer;
import org.eclipse.emf.cdo.transfer.CDOTransferSystem;
import org.eclipse.emf.cdo.transfer.spi.repository.RepositoryTransferSystem;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.net4j.util.io.IOUtil;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.cdo.util.resources.CDOResourceHandler;
import de.cooperateproject.cdo.util.resources.IFactoryWrapper;
import de.cooperateproject.ui.util.CDOTransferUMLFirst;
import de.cooperateproject.ui.util.PathmapFilteringTransferSystem;

/**
 * Wizard for importing an UML model from the file system to the Cooperate repository.
 */
public class ModelImportWizard extends Wizard implements IImportWizard {

    private final static WritableValue<IProject> selectedProject = new WritableValue<>();
    private final WritableValue<String> selectedUMLModel = new WritableValue<>();

    @Override
    public void addPages() {
        super.addPages();
        addPage(new ModelImportPage(selectedProject, selectedUMLModel));
    }

    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        setWindowTitle("Import Cooperate Model into Project");
        setNeedsProgressMonitor(true);
    }

    @Override
    public boolean performFinish() {
        CDOSession session = CDOConnectionManager.INSTANCE.acquireSession(selectedProject.doGetValue());
        try {
            CDOTransaction trans = session.openTransaction();
            try {
                return importModel(trans);
            } finally {
                IOUtil.closeSilent(trans);
            }
        } finally {
            CDOConnectionManager.INSTANCE.releaseSession(session);
        }
    }

    protected boolean importModel(CDOTransaction trans) {
        RepositoryTransferSystem target = new ImportRepositoryTransferSystem(trans);
        CDOTransferSystem source = new PathmapFilteringTransferSystem(new FileSystemTransferSystem());

        CDOTransfer transfer = new ImportTransfer(source, target);
        transfer.setTargetPath(selectedProject.doGetValue().getFullPath());
        getDiagramPaths(selectedUMLModel.doGetValue()).forEach(n -> transfer.map(n, new NullProgressMonitor()));
        transfer.perform();

        return true;
    }

    protected static class ImportTransfer extends CDOTransferUMLFirst {

        private static final URI UML_PRIMITIVE_TYPES_URI = URI.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI);

        public ImportTransfer(CDOTransferSystem sourceSystem, CDOTransferSystem targetSystem) {
            super(sourceSystem, targetSystem);
            initSource();
            initTarget();
        }

        protected void initSource() {
            ModelTransferContext mtc = getModelTransferContext();
            mtc.registerSourceExtension("*", new XMIResourceFactoryImpl());
            mtc.getTargetResourceSet().getResource(UML_PRIMITIVE_TYPES_URI, true);
        }

        protected void initTarget() {
            ModelTransferContext mtc = getModelTransferContext();
            mtc.registerTargetExtension("*", new XMIResourceFactoryImpl());
            ResourceSet targetRs = mtc.getTargetResourceSet();
            UMLUtil.init(targetRs);
            targetRs.getResource(UML_PRIMITIVE_TYPES_URI, true);

            IFactoryWrapper factoryWrapper = CDOResourceHandler
                    .createFactoryWrapper(targetRs.getResourceFactoryRegistry());
            targetRs.setResourceFactoryRegistry(factoryWrapper);

        }
    }

    private EList<String> getDiagramPaths(String path) {
        EList<String> paths = new BasicEList<String>();

        File[] allFiles = (new File(path)).listFiles();
        for (int i = 0; i < allFiles.length; i++) {
            paths.add(allFiles[i].getAbsolutePath());
        }
        return paths;
    }

    protected static class ImportRepositoryTransferSystem extends RepositoryTransferSystem {
        private final CDOView view;

        public ImportRepositoryTransferSystem(CDOView view) {
            super(view);
            this.view = view;
        }

        @Override
        public void saveModels(EList<Resource> resources, IProgressMonitor monitor) {
            try {
                monitor.subTask("Committing to " + this);

                CDOTransaction transaction = (CDOTransaction) view;
                for (Resource resource : resources) {
                    try {
                        resource.save(Collections.emptyMap());
                    } catch (IOException e) {
                    }
                }
                transaction.commit(monitor);
            } catch (CommitException ex) {
                throw new CDOException(ex);
            }
        }
    }
}
