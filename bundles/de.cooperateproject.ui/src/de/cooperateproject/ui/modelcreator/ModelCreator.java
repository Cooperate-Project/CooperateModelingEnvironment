package de.cooperateproject.ui.modelcreator;

import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.cdo.common.branch.CDOBranch;
import org.eclipse.emf.cdo.common.util.CDOException;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.eresource.CDOResourceFolder;
import org.eclipse.emf.cdo.explorer.checkouts.CDOCheckout;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.spi.cdo.DefaultCDOMerger;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.StringValueStyle;
import org.eclipse.net4j.util.io.IOUtil;
import org.eclipse.papyrus.infra.gmfdiag.style.PapyrusDiagramStyle;
import org.eclipse.papyrus.infra.gmfdiag.style.StyleFactory;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.cdo.util.resources.CDOResourceHandler;
import de.cooperateproject.modeling.common.conventions.ModelNamingConventions;
import de.cooperateproject.modeling.common.types.IDiagramType;
import de.cooperateproject.ui.Activator;

public class ModelCreator {

    private static final Logger LOGGER = LoggerFactory.getLogger(ModelCreator.class);

    private static class ModelCreatorException extends Exception {

        private static final long serialVersionUID = -6483202457818490926L;

        public ModelCreatorException(String msg, Throwable exception) {
            super(msg, exception);
        }
    }

    public static IStatus createDiagram(IProject project, String modelName, String diagramName,
            IDiagramType diagramType) {
        CDOCheckout checkout = CDOConnectionManager.getInstance().createCDOCheckout(project, true, true);
        checkout.open();
        CDOSession session = checkout.getView().getSession();
        try {
            CDOBranch tmpBranch = checkout.getView().getBranch();
            CDOTransaction mainTransaction = session.openTransaction(session.getBranchManager().getMainBranch());
            CDOTransaction branchTransaction = session.openTransaction(tmpBranch);
            try {
                CDOResourceFolder folder = branchTransaction.getResourceFolder(project.getName());
                createModel(branchTransaction, folder, modelName, diagramName, diagramType);
                branchTransaction.commit();

                mainTransaction.merge(tmpBranch.getHead(), tmpBranch.getBase(),
                        new DefaultCDOMerger.PerFeature.ManyValued());
                mainTransaction.setCommitComment("Diagram " + diagramName + " in project " + project.getName()
                        + " created by " + System.getProperty("user.name") + ".");
                mainTransaction.commit();

                return Status.OK_STATUS;
            } catch (ModelCreatorException e) {
                LOGGER.error("Error during model creation", e);
                return new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e.getCause());
            } catch (CommitException e) {
                LOGGER.error("Error during commit", e);
                return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Could not persist created diagrams.", e);
            } finally {
                IOUtil.closeSilent(branchTransaction);
                IOUtil.closeSilent(mainTransaction);
            }
        } finally {
            CDOConnectionManager.getInstance().deleteCDOCheckout(checkout);
        }
    }

    private static CDOResource getOrCreate(CDOTransaction transaction, CDOResourceFolder folder, String modelName) {
        String modelPath = String.format("%s%s%s", folder.getPath(), folder.getPath().endsWith("/") ? "" : "/",
                modelName);
        return transaction.getOrCreateResource(modelPath);
    }

    private static void createModel(CDOTransaction transaction, CDOResourceFolder folder, String modelName,
            String diagramName, IDiagramType diagramType) throws ModelCreatorException {
        CDOResource umlResource = createUMLModel(transaction, folder, modelName);
        CDOResource papyrusResource = createGraphicalModel(transaction, folder, modelName, diagramName, diagramType,
                umlResource);
        CDOResource textualResource = createTextualModel(transaction, folder, papyrusResource, diagramName,
                diagramType);
        try {
            transaction.commit();
        } catch (CDOException | CommitException e) {
            throw new ModelCreatorException("Creation of model resources failed.", e);
        }

        // transform one time to initialize diagrams
        try {
            EObject addedElement = papyrusResource.getContents().get(papyrusResource.getContents().size() - 1);
            URI papyrusURI = papyrusResource.getURI().appendFragment(papyrusResource.getURIFragment(addedElement));
            // TODO set factory in resourceset // should be dependency injection
            ResourceSet rs = transaction.getResourceSet();
            rs.setResourceFactoryRegistry(CDOResourceHandler.createFactoryWrapper(rs.getResourceFactoryRegistry()));
            Activator.getDefault().getTransformationExecutor().transformChanged(papyrusURI, rs);
            Activator.getDefault().getTransformationExecutor().transformChanged(textualResource.getURI(), rs);
        } catch (IOException e) {
            throw new ModelCreatorException("Initial transformation of models failed.", e);
        }
    }

    private static CDOResource createUMLModel(CDOTransaction transaction, CDOResourceFolder folder, String modelName) {
        CDOResource umlResource = getOrCreate(transaction, folder, modelName + ".uml");
        if (umlResource.getContents().isEmpty()) {
            Model umlModel = UMLFactory.eINSTANCE.createModel();
            umlModel.setName("RootElement");
            umlResource.getContents().add(umlModel);
        }
        return umlResource;
    }

    @SuppressWarnings("unchecked")
    private static CDOResource createGraphicalModel(CDOTransaction transaction, CDOResourceFolder folder,
            String modelName, String diagramName, IDiagramType diagramType, CDOResource umlResource) {
        getOrCreate(transaction, folder, modelName + ".di");

        CDOResource notationResource = getOrCreate(transaction, folder, modelName + ".notation");

        EObject umlRoot = umlResource.getContents().get(0);

        Diagram diagram = NotationFactory.eINSTANCE.createDiagram();
        diagram.setType(diagramType.getPapyrusDiagramType());
        diagram.setName(diagramName);
        diagram.setElement(umlRoot);

        StringValueStyle stringValueStyle = NotationFactory.eINSTANCE.createStringValueStyle();
        stringValueStyle.setName("diagram_compatibility_version");
        stringValueStyle.setStringValue("1.3.0");
        diagram.getStyles().add(stringValueStyle);

        diagram.getStyles().add(NotationFactory.eINSTANCE.createDiagramStyle());

        PapyrusDiagramStyle papyrusDiagramStyle = StyleFactory.eINSTANCE.createPapyrusDiagramStyle();
        papyrusDiagramStyle.setOwner(umlRoot);
        papyrusDiagramStyle.setDiagramKindId(diagramType.getPapyrusDiagramKindId());
        diagram.getStyles().add(papyrusDiagramStyle);

        notationResource.getContents().add(diagram);

        ModelCreatorPostProcessorRegistry.getInstance().getPostProcessors()
                .forEach(processor -> processor.postProcessModel(diagram));

        return notationResource;
    }

    private static CDOResource createTextualModel(CDOTransaction transaction, CDOResourceFolder folder,
            CDOResource papyrusResource, String diagramName, IDiagramType diagramType) {
        URI textualURI = ModelNamingConventions.getTextualFromGraphicalURI(papyrusResource.getURI(), diagramName,
                diagramType.getTextualFileExtension());
        return getOrCreate(transaction, folder, textualURI.lastSegment());
    }

}
