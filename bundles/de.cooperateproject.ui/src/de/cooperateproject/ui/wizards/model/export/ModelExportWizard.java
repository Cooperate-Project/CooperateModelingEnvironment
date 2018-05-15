package de.cooperateproject.ui.wizards.model.export;

import java.io.File;

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.spi.transfer.FileSystemTransferSystem;
import org.eclipse.emf.cdo.transfer.CDOTransfer;
import org.eclipse.emf.cdo.transfer.CDOTransferElement;
import org.eclipse.emf.cdo.transfer.CDOTransferMapping;
import org.eclipse.emf.cdo.transfer.CDOTransferSystem;
import org.eclipse.emf.cdo.transfer.CDOTransferType;
import org.eclipse.emf.cdo.transfer.spi.repository.RepositoryTransferSystem;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.net4j.util.io.IOUtil;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.cdo.util.resources.CDOResourceHandler;
import de.cooperateproject.cdo.util.resources.IExtensionConverter;
import de.cooperateproject.cdo.util.resources.IFactoryWrapper;
import de.cooperateproject.ui.util.CDOTransferUMLFirst;
import de.cooperateproject.ui.util.CustomModelTransferContext;
import de.cooperateproject.ui.util.PathmapFilteringTransferSystem;

/**
 * Wizard for exporting an UML model from the Cooperate repository to the file system.
 */
public class ModelExportWizard extends Wizard implements IExportWizard {

    private final WritableValue<IProject> selectedProject = new WritableValue<>();
    private final WritableValue<String> selectedUMLModelName = new WritableValue<>();
    private final WritableValue<Long> selectedVersion = new WritableValue<>();
    private final WritableValue<File> selectedDestination = new WritableValue<>();

    @Override
    public void addPages() {
        super.addPages();
        addPage(new ModelExportPage(selectedProject, selectedUMLModelName, selectedVersion, selectedDestination));
    }

    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        setWindowTitle("Export Cooperate Model");
        setNeedsProgressMonitor(true);
    }

    @Override
    public boolean performFinish() {
        CDOSession session = CDOConnectionManager.INSTANCE.acquireSession(selectedProject.doGetValue());
        try {
            CDOView view = session.openView(selectedVersion.doGetValue());
            try {
                return exportModel(view);
            } finally {
                IOUtil.closeSilent(view);
            }
        } finally {
            CDOConnectionManager.INSTANCE.releaseSession(session);
        }
    }

    protected boolean exportModel(CDOView view) {
        CDOTransferSystem target = new PathmapFilteringTransferSystem(new FileSystemTransferSystem());
        RepositoryTransferSystem source = new RepositoryTransferSystem(view);

        CDOTransfer transfer = new ExportTransfer(source, target);
        transfer.setTargetPath(selectedDestination.doGetValue().getAbsolutePath());
        view.getResourceFolder(selectedProject.doGetValue().getName()).getNodes()
                .forEach(n -> transfer.map(n.getPath(), new NullProgressMonitor()));
        transfer.perform();

        return true;
    }

    protected static class ExportTransfer extends CDOTransferUMLFirst {

        private static final URI UML_PRIMITIVE_TYPES_URI = URI.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI);
        private final IExtensionConverter extensionConverter = CDOResourceHandler.getExtensionConverter();

        public ExportTransfer(CDOTransferSystem sourceSystem, CDOTransferSystem targetSystem) {
            super(sourceSystem, targetSystem);
            initSource();
            initTarget();
        }

        protected void initSource() {
            ResourceSet srcRs = getModelTransferContext().getSourceResourceSet();
            IFactoryWrapper factoryWrapper = CDOResourceHandler
                    .createFactoryWrapper(srcRs.getResourceFactoryRegistry());
            srcRs.setResourceFactoryRegistry(factoryWrapper);
        }

        protected void initTarget() {
            ModelTransferContext mtc = getModelTransferContext();
            mtc.registerTargetExtension("*", new XMIResourceFactoryImpl());
            UMLUtil.init(mtc.getTargetResourceSet());
            mtc.getTargetResourceSet().getResource(UML_PRIMITIVE_TYPES_URI, true);
        }

        @Override
        protected CDOTransferType getTransferType(CDOTransferElement source) {
            if (extensionConverter.getRelevantExtension(source.getURI()).isPresent()) {
                return CDOTransferType.MODEL;
            }
            return super.getTransferType(source);
        }

        @Override
        protected CDOTransferMapping createMapping(CDOTransferElement source, CDOTransferMapping parent,
                IProgressMonitor monitor) {
            CDOTransferMapping mapping = super.createMapping(source, parent, monitor);
            URI virtualUri = extensionConverter.getVirtualUri(source.getURI());
            mapping.setName(virtualUri.lastSegment());
            return mapping;
        }

        @Override
        protected ModelTransferContext createModelTransferContext() {
            return new ExportModelTransferContext(this);
        }

    }

    protected static class ExportModelTransferContext extends CustomModelTransferContext {

        private final IExtensionConverter extensionConverter = CDOResourceHandler.getExtensionConverter();

        protected ExportModelTransferContext(CDOTransfer transfer) {
            super(transfer);
        }

        @Override
        protected Resource getSourceResource(CDOTransferMapping mapping) {
            URI uri = extensionConverter.getVirtualUri(mapping.getSource().getURI());
            ResourceSet sourceResourceSet = getSourceResourceSet();
            return sourceResourceSet.getResource(uri, true);
        }
    }

}