package de.cooperateproject.ui.focus;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import de.cooperateproject.ui.focus.connection.ConnectionManager;
import de.cooperateproject.ui.focus.connection.SubscriberManager;
import de.cooperateproject.ui.focus.views.FocusView;

public class StartManager implements IStartup, IPartListener {
	
	private final String papyrusEditorID = "org.eclipse.papyrus.infra.core.papyrusEditor";
	private final String xTextEditorID = "de.cooperateproject.modeling.textual.cls.Cls";
	private final String projectExplorer = "org.eclipse.ui.navigator.ProjectExplorer";
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
		if(part.getSite().getId().contentEquals(papyrusEditorID)|| part.getSite().getId().contentEquals(xTextEditorID) || part == focusView){
			ConnectionManager.getInstance().disconnect();
	 	}
	}

	@Override	
	public void partDeactivated(IWorkbenchPart part) {
	}

	@Override
	public void partOpened(IWorkbenchPart part) {

		if(part.getSite().getId().contentEquals(papyrusEditorID)|| part.getSite().getId().contentEquals(xTextEditorID)){
			
			IWorkbenchWindow window =  PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			ISelectionService service = window.getSelectionService();
			IWorkbenchPage page = window.getActivePage();
			IStructuredSelection selection = (IStructuredSelection) service.getSelection(projectExplorer);
			IFile file = null;
			
			if(selection != null && selection.getFirstElement() instanceof IFile){
				file = (IFile) selection.getFirstElement();
				
				try {
		 			focusView = (FocusView) page.showView(FocusView.ID);
		 		} catch (PartInitException e) {
		 			throw new RuntimeException(e);
		 		}

		 		focusView.setTitleText(file.getName());
		 		SubscriberManager.getInstance().setView(focusView);
		 		ConnectionManager.getInstance().connect(file);
		 	}
			
		}


	}
		
}
