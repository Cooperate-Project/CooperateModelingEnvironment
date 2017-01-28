package de.cooperateproject.ui.focus;

import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import de.cooperateproject.ui.focus.views.FocusView;

public class StartManager implements IStartup, IPartListener {
	
	private final String papyrusEditorID = "org.eclipse.papyrus.infra.core.papyrusEditor";
	private final String xTextEditorID = "de.cooperateproject.modeling.textual.cls.Cls";
	private FocusView focusView;

	@Override
	public void earlyStartup() {
		IWorkbenchPage page = null;
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (window != null)
		{
		    page = window.getActivePage();
		}
		
		if (page == null)
		{
		    IWorkbenchWindow[] windows = PlatformUI.getWorkbench().getWorkbenchWindows();
		    for (int i = 0; i < windows.length; i++)
		    {
		        if (windows[i] != null)
		        {
		            window = windows[i];
		            page = windows[i].getActivePage();
		            if (page != null) break;
		        }
		    }
		}	
		page.addPartListener(this);

	}

	@Override
	public void partActivated(IWorkbenchPart part) {
	}

	@Override
	public void partBroughtToTop(IWorkbenchPart part) {	
	}

	@Override
	public void partClosed(IWorkbenchPart part) {
		if(part.getSite().getId().contentEquals(papyrusEditorID)|| part.getSite().getId().contentEquals(xTextEditorID)){
			//TODO unsubscribe the topic and delete information from the view
		}
	}

	@Override	
	public void partDeactivated(IWorkbenchPart part) {
	}

	@Override
	public void partOpened(IWorkbenchPart part) {

		if(part.getSite().getId().contentEquals(papyrusEditorID)|| part.getSite().getId().contentEquals(xTextEditorID)){
			
			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			
			try {
				page.showView(FocusView.ID);
            } catch (PartInitException e) {
            	throw new RuntimeException(e);
            }
			
			focusView = (FocusView) page.findView(FocusView.ID);
			IEditorInput file = part.getSite().getPage().getActiveEditor().getEditorInput();
					
			if(part.getSite().getId().contentEquals(papyrusEditorID)){
				URI fileURI = ((URIEditorInput)file).getURI();
				//TODO get the diagram from URI

			}
			
			else{
				//TODO de.cooperateproject.modeling.textual.xtext.runtime.editor.input.CooperateCDOLobEditorInput
			}
			
			focusView.setTitleText(part.getTitle());
			
			//TODO focusView.setDiagram(...)
			//TODO subscribe the topic and feed the view with information

		}
		
	}

}
