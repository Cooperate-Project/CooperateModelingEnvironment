package de.cooperateproject.ui.wizards.modelnew;

import java.io.IOException;
import java.util.Optional;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.cdo.common.branch.CDOBranch;
import org.eclipse.emf.cdo.common.util.CDOException;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.eresource.CDOResourceFolder;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.spi.cdo.DefaultCDOMerger;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.StringValueStyle;
import org.eclipse.net4j.util.io.IOUtil;
import org.eclipse.papyrus.infra.viewpoints.style.PapyrusViewStyle;
import org.eclipse.papyrus.infra.viewpoints.style.StyleFactory;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLFactory;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.cdo.util.utils.CDOHelper;
import de.cooperateproject.modeling.common.types.DiagramTypes;
import de.cooperateproject.modeling.graphical.common.conventions.NotationDiagramTypes;
import de.cooperateproject.modeling.textual.common.convetions.FileExtensions;
import de.cooperateproject.modeling.textual.common.convetions.ModelNamingConventions;
import de.cooperateproject.modeling.transformation.engine.executor.TransformationExecutor;
import de.cooperateproject.ui.Activator;

public class ModelCreator {

	private static class ModelCreatorException extends Exception {

		private static final long serialVersionUID = -6483202457818490926L;

		public ModelCreatorException(String msg) {
			super(msg);
		}
		
		public ModelCreatorException(String msg, Throwable exception) {
			super(msg, exception);
		}
	}
	
	public static IStatus createDiagram(IProject project, String modelName, String diagramName, DiagramTypes diagramType) {
		CDOSession session = CDOConnectionManager.getInstance().acquireSession(project);
		try {
			CDOBranch tmpBranch = CDOHelper.createRandomBranchFromMain(session);
			CDOTransaction mainTransaction = session.openTransaction();
			CDOTransaction branchTransaction = session.openTransaction(tmpBranch);
			try {
				CDOResourceFolder folder = branchTransaction.getResourceFolder(project.getName());
				createModel(branchTransaction, folder, modelName, diagramName, diagramType);
				branchTransaction.commit();
				
				mainTransaction.merge(tmpBranch.getHead(), tmpBranch.getBase(), new DefaultCDOMerger.PerFeature.ManyValued());
				mainTransaction.commit();
				
				return Status.OK_STATUS;
			} catch (ModelCreatorException e) {
				return new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e.getCause());
			} catch (CommitException e) {
				return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Could not persist created diagrams.", e);
			} finally {
				IOUtil.closeSilent(branchTransaction);
				IOUtil.closeSilent(mainTransaction);
			}
		} finally {
			CDOConnectionManager.getInstance().releaseSession(session);
		}
	}
	
	private static CDOResource getOrCreate(CDOTransaction transaction, CDOResourceFolder folder, String modelName) {
		String modelPath = String.format("%s%s%s", folder.getPath(), folder.getPath().endsWith("/") ? "" : "/", modelName);
		return transaction.getOrCreateResource(modelPath);
	}
	
	private static void createModel(CDOTransaction transaction, CDOResourceFolder folder, String modelName, String diagramName, DiagramTypes diagramType) throws ModelCreatorException {
		CDOResource umlResource = createUMLModel(transaction, folder, modelName);
		CDOResource papyrusResource = createGraphicalModel(transaction, folder, modelName, diagramName, diagramType, umlResource);
		CDOResource textualResource = createTextualModel(transaction, folder, papyrusResource, diagramName, diagramType);
		try {
			transaction.commit();
		} catch (CDOException | CommitException e) {
			throw new ModelCreatorException("Creation of model resources failed.", e);
		}
		
		// transform one time to initialize diagrams
		try {
			EObject addedElement = papyrusResource.getContents().get(papyrusResource.getContents().size() - 1);
			URI papyrusURI = papyrusResource.getURI().appendFragment(papyrusResource.getURIFragment(addedElement));
			TransformationExecutor.getInstance().transformChanged(papyrusURI, transaction.getResourceSet());
			TransformationExecutor.getInstance().transformChanged(textualResource.getURI(), transaction.getResourceSet());
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
	private static CDOResource createGraphicalModel(CDOTransaction transaction, CDOResourceFolder folder, String modelName,
			String diagramName, DiagramTypes diagramType, CDOResource umlResource) throws ModelCreatorException {
		getOrCreate(transaction, folder, modelName + ".di");
		
		CDOResource notationResource = getOrCreate(transaction, folder, modelName + ".notation");

		Optional<NotationDiagramTypes> notationType = NotationDiagramTypes.getByDiagramType(diagramType);
		if (!notationType.isPresent()) {
			throw new ModelCreatorException("Could not determine graphical model type.");
		}
		
		EObject umlRoot = umlResource.getContents().get(0);
		
		Diagram diagram = NotationFactory.eINSTANCE.createDiagram();
		diagram.setType(notationType.get().getNotationDiagramType());
		diagram.setName(diagramName);
		diagram.setElement(umlRoot);
		
		StringValueStyle stringValueStyle = NotationFactory.eINSTANCE.createStringValueStyle();
		stringValueStyle.setName("diagram_compatibility_version");
		stringValueStyle.setStringValue("1.2.0");
		diagram.getStyles().add(stringValueStyle);
		
		diagram.getStyles().add(NotationFactory.eINSTANCE.createDiagramStyle());
		
		PapyrusViewStyle papyrusViewStyle = StyleFactory.eINSTANCE.createPapyrusViewStyle();
		papyrusViewStyle.setOwner(umlRoot);
		diagram.getStyles().add(papyrusViewStyle);
		
		notationResource.getContents().add(diagram);
		
		return notationResource;
	}
	
	private static CDOResource createTextualModel(CDOTransaction transaction, CDOResourceFolder folder, CDOResource papyrusResource, String diagramName,
			DiagramTypes diagramType) throws ModelCreatorException {
		
		Optional<FileExtensions> textualFileExtension = FileExtensions.getByDiagramType(diagramType);
		if (!textualFileExtension.isPresent()) {
			throw new ModelCreatorException("Could not determine textual file extension.");
		}
		
		URI textualURI = ModelNamingConventions.getTextualFromGraphicalURI(papyrusResource.getURI(), diagramName, textualFileExtension.get().getFileExtension());
		CDOResource textualResource = getOrCreate(transaction, folder, textualURI.lastSegment());
		
		return textualResource;
	}

}
