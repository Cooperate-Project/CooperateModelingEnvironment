package de.cooperateproject.ui.focus.internal;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.editor.PapyrusMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.services.openelement.service.OpenElementService;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import de.cooperateproject.modeling.textual.cls.cls.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.editor.CooperateCDOXtextEditor;

public class FocusManager {

	private static FocusManager instance;
	private CooperateCDOXtextEditor xTextEditor;
	private PapyrusMultiDiagramEditor papyrusEditor;

	public static FocusManager getInstance() {
		if (instance == null) {
			instance = new FocusManager();
		}
		return instance;
	}

	public void setFocusedElement(EObject element) {
		// set focus in textual editor
		if (xTextEditor != null) {

			UMLToClsIUnitOfWork unit = new UMLToClsIUnitOfWork();
			unit.setUmlElement(element);
			xTextEditor.getDocument().modify(unit);

			ICompositeNode node = NodeModelUtils.findActualNodeFor(unit.getClsElement());
			if (node == null) {
				System.err.println(
						"Focus View: Couldn't set the focus on requested element. Element couldn't be found in Xtext resource.");
				return;
			}
			ITextSelection selection = new TextSelection(xTextEditor.getDocument(), node.getOffset(), 0);
			xTextEditor.getSelectionProvider().setSelection(selection);
		}
		// set focus in graphical editor
		else if (papyrusEditor != null) {
			try {
				OpenElementService openService = papyrusEditor.getServicesRegistry()
						.getService(OpenElementService.class);
				openService.openSemanticElement(element);
			} catch (PartInitException | ServiceException e) {
				e.printStackTrace();
			}
		}
	}

	@SuppressWarnings("rawtypes")
	public EObject getFocusedElement() {

		EObject focusedElement = null;
		// user is currently working with textual editor
		if (xTextEditor != null) {
			FocusIUnitOfWork unit = new FocusIUnitOfWork();
			unit.setOffset(((TextSelection) xTextEditor.getSelectionProvider().getSelection()).getOffset());
			xTextEditor.getDocument().modify(unit);

			focusedElement = unit.getFocusedElement();

			if (focusedElement instanceof UMLReferencingElement) {
				// get the referenced element corresponding to the UML model
				// from the cooperate-internal element
				focusedElement = ((UMLReferencingElement) focusedElement).getReferencedElement();
			}

		}
		// user is currently working with graphical editor
		else if (papyrusEditor != null) {
			ISelection selection = papyrusEditor.getSite().getSelectionProvider().getSelection();
			Object selectedObject = null;
			if (selection instanceof IStructuredSelection) {
				selectedObject = ((IStructuredSelection) selection).getFirstElement();
			}
			focusedElement = getSelectedUmlObject(selectedObject);
		}
		return focusedElement;
	}

	public void setEditor(IWorkbenchPart pSite) {
		if (pSite instanceof CooperateCDOXtextEditor) {
			xTextEditor = (CooperateCDOXtextEditor) pSite;

		} else if (pSite instanceof PapyrusMultiDiagramEditor) {
			papyrusEditor = (PapyrusMultiDiagramEditor) pSite;
		}
	}

	public void setInvalid() {
		instance = null;
	}

	private NamedElement getSelectedUmlObject(Object selection) {

		NamedElement result = null;

		if (selection != null) {
			if (selection instanceof IAdaptable) {
				result = (NamedElement) ((IAdaptable) selection).getAdapter(NamedElement.class);
			} else {
				result = (NamedElement) Platform.getAdapterManager().getAdapter(selection, NamedElement.class);
			}
		}
		return result;
	}

	private class FocusIUnitOfWork extends IUnitOfWork.Void<XtextResource> {

		private int offset = -1;
		private EObject focusedElement = null;

		public void setOffset(int offset) {
			this.offset = offset;
		}

		@Override
		public void process(XtextResource state) throws Exception {
			EObjectAtOffsetHelper helper = new EObjectAtOffsetHelper();
			if (offset != -1) {
				focusedElement = helper.resolveContainedElementAt(state, offset);
			}
		}

		public EObject getFocusedElement() {
			return focusedElement;
		}

	}

	private class UMLToClsIUnitOfWork extends IUnitOfWork.Void<XtextResource> {

		private EObject umlElement = null;
		private EObject clsElement = null;

		public void setUmlElement(EObject element) {
			umlElement = element;
		}

		@Override
		public void process(XtextResource state) throws Exception {
			if (umlElement == null) {
				return;
			}
			SwitchUMLToCls clsSwitch = new SwitchUMLToCls();
			TreeIterator<EObject> it = state.getAllContents();
			while (it.hasNext()) {
				EObject clsTempElement = it.next();
				EObject referencedUMLElement = clsSwitch.doSwitch(clsTempElement);

				if (EcoreUtil.equals(referencedUMLElement, umlElement)) {
					clsElement = clsTempElement;
					break;
				}
			}
		}

		public EObject getClsElement() {
			return clsElement;
		}

	}

}
