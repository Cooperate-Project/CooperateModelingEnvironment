package de.cooperateproject.ui.focus;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.ResourceUtil;

import de.cooperateproject.ui.focus.connection.ConnectionManager;
import de.cooperateproject.ui.focus.connection.SubscriberManager;
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
			ConnectionManager.disconnect();
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
				focusView = (FocusView) page.showView(FocusView.ID);
            } catch (PartInitException e) {
            	throw new RuntimeException(e);
            }
			
			IEditorInput fileInput = part.getSite().getPage().getActiveEditor().getEditorInput();
					
		 	IFile file = ResourceUtil.getFile(fileInput);
		 	if(file != null){
		 		focusView.setTitleText(part.getTitle());
				SubscriberManager.setView(focusView);
			 	ConnectionManager.connect(file);
		 	}

		}
		
	}

}
