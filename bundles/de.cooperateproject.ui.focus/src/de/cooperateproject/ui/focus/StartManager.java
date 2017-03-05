package de.cooperateproject.ui.focus;

import java.awt.Toolkit;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.dialogs.MessageDialog;
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
import de.cooperateproject.ui.focus.internal.FocusManager;
import de.cooperateproject.ui.focus.views.FocusView;

/**
 * This is the class which handles the start and closure of the plugin.
 * 
 * @author Jasmin
 *
 */

public class StartManager implements IStartup, IPartListener {

	private static final String papyrusEditorID = "org.eclipse.papyrus.infra.core.papyrusEditor";
	private static final String xTextEditorID = "de.cooperateproject.modeling.textual.cls.Cls";
	private static final String projectExplorer = "org.eclipse.ui.navigator.ProjectExplorer";
	private static Logger logger = Logger.getLogger(StartManager.class);
	private FocusManager focusMgr;
	private SubscriberManager subscriberMgr;
	private ConnectionManager connectionMgr;

	private FocusView focusView;

	@Override
	/**
	 * Will be called when the workbench is being initialized. The StartManager
	 * registers itself as PartListener so it will be notified when the user
	 * opens or closes an editor.
	 */
	public void earlyStartup() {
		IWorkbenchPage page = null;
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (window != null) {
			page = window.getActivePage();
		}

		if (page == null) {
			IWorkbenchWindow[] windows = PlatformUI.getWorkbench().getWorkbenchWindows();
			for (int i = 0; i < windows.length; i++) {
				if (windows[i] != null) {
					page = windows[i].getActivePage();
					if (page != null)
						break;
				}
			}

		}

		if (page != null) {
			page.addPartListener(this);
		}
		// The page is still null because no active page could be found. This
		// shouldn't happen.
		else {
			logger.error("Couldn't find an active page: it won't start.");
		}

	}

	@Override
	public void partActivated(IWorkbenchPart part) {
	}

	@Override
	public void partBroughtToTop(IWorkbenchPart part) {
	}

	@Override
	public void partClosed(IWorkbenchPart part) {

		if (focusView == null) {
			return;
		}

		if (((part.getSite().getId().contentEquals(papyrusEditorID)
				|| part.getSite().getId().contentEquals(xTextEditorID))
				&& focusView.getTitleText().contains(part.getTitle().split(Pattern.quote("."))[0]))
				|| part == focusView) {

			connectionMgr.disconnect();
			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			page.hideView(focusView);
			focusView = null;
		}
	}

	@Override
	public void partDeactivated(IWorkbenchPart part) {
	}

	@Override
	public void partOpened(IWorkbenchPart part) {

		// Open the view and tell needed components to be started if the editor
		// opened the Xtext or Papyrus editor.
		if (part.getSite().getId().contentEquals(papyrusEditorID)
				|| part.getSite().getId().contentEquals(xTextEditorID)) {

			IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			ISelectionService service = window.getSelectionService();
			IWorkbenchPage page = window.getActivePage();
			IStructuredSelection selection = (IStructuredSelection) service.getSelection(projectExplorer);
			IFile file;

			if (selection != null && selection.getFirstElement() instanceof IFile) {
				file = (IFile) selection.getFirstElement();

				try {
					focusView = (FocusView) page.showView(FocusView.ID);
					focusView.setTitleText(file.getName());

					buildInstances(part, file);

				} catch (PartInitException e) {
					Toolkit.getDefaultToolkit().beep();
					part.getSite().getShell().getDisplay().asyncExec(new Runnable() {
						public void run() {
							MessageDialog.openError(part.getSite().getShell(), "Failed to open view",
									"Focus view for the diagram couldn't be initialized.");
						}
					});
					logger.error("The view couldn't be opened.", e);
				}
			}

		}

	}

	private void buildInstances(IWorkbenchPart part, IFile file) {
		focusMgr = new FocusManager();
		focusMgr.setEditor(part);

		connectionMgr = new ConnectionManager();
		subscriberMgr = new SubscriberManager(connectionMgr, focusView);
		subscriberMgr.setView(focusView);
		connectionMgr.setSubscriberManager(subscriberMgr);

		focusView.setFocusManager(focusMgr);
		focusView.setSubscriberManager(subscriberMgr);

		connectionMgr.connect(file);
	}

}
