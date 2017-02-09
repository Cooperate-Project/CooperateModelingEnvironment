package de.cooperateproject.ui.focus.internal;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
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
import de.cooperateproject.modeling.textual.xtext.runtime.editor.CooperateCDOXtextEditor;

public class FocusManager {
	
	private static FocusManager instance;
	private CooperateCDOXtextEditor xTextEditor;
	private PapyrusMultiDiagramEditor papyrusEditor;
		
	public static FocusManager getInstance(){
		if(instance == null){
			instance = new FocusManager();
		}
		return instance;
	}
	
	public void setFocusedElement(EObject element){ 
		if(xTextEditor != null){ //set focus in textual editor
			ICompositeNode node = NodeModelUtils.findActualNodeFor(element);
			ITextSelection selection = new TextSelection(xTextEditor.getDocument(), node.getOffset(), 0);
			xTextEditor.getSelectionProvider().setSelection(selection);
		}
		else if(papyrusEditor != null){ //set focus in graphical editor
			try {
				OpenElementService openService = papyrusEditor.getServicesRegistry().getService(OpenElementService.class);
				openService.openSemanticElement(element);
			} catch (PartInitException | ServiceException e) {
				e.printStackTrace();
			}
		}
	}

	public EObject getFocusedElement(){
		//TODO somewhere add conversion from org.eclipse.uml2.uml.internal.impl to de.cooperateproject.modeling.textual.cls.cls and vice versa
		//At the moment, focus in textual editor is of cooperate-internal types and the focus in graphical editor of eclipse-internal types.

		EObject focusedElement = null;
		if(xTextEditor != null){ //user is currently working with textual editor 		
			FocusIUnitOfWork unit = new FocusIUnitOfWork();
			unit.setOffset(((TextSelection)xTextEditor.getSelectionProvider().getSelection()).getOffset());
			xTextEditor.getDocument().modify(unit);
			
			focusedElement = unit.getFocusedElement();
		}
		else if(papyrusEditor != null){ //user is currently working with graphical editor
			ISelection selection = papyrusEditor.getSite().getSelectionProvider().getSelection();
			Object selectedObject = null;
			if(selection instanceof IStructuredSelection){
				selectedObject = ((IStructuredSelection)selection).getFirstElement();
			}
			focusedElement = getSelectedUmlObject(selectedObject);
		}		
		return focusedElement;
	}
	
	private NamedElement getSelectedUmlObject(Object selection) {
		
		  NamedElement result = null;
		  
		  if(selection != null){
			    if(selection instanceof IAdaptable) {
			      result = (NamedElement)((IAdaptable)selection).getAdapter(NamedElement.class);
			    }
			    else{
			      result = (NamedElement)Platform.getAdapterManager().getAdapter(selection, NamedElement.class);
			    }	
			}
		  return result;
	}
		 
	public void setEditor(IWorkbenchPart pSite){
		if(pSite instanceof CooperateCDOXtextEditor){
			xTextEditor = (CooperateCDOXtextEditor)pSite;

		}else if(pSite instanceof PapyrusMultiDiagramEditor){
			papyrusEditor = (PapyrusMultiDiagramEditor) pSite;
		}
	}
	
	private class FocusIUnitOfWork extends IUnitOfWork.Void<XtextResource>{

		private int offset = -1;
		private EObject focusedElement = null;
		
		public void setOffset(int offset){
			this.offset = offset;
		}
		@Override
		public void process(XtextResource state) throws Exception {
			  EObjectAtOffsetHelper helper = new EObjectAtOffsetHelper();
			  if(offset != -1){
				  focusedElement = helper.resolveContainedElementAt(state, offset);
			  }    
		}
		
		public EObject getFocusedElement(){
			return focusedElement;
		}
		
	}
}