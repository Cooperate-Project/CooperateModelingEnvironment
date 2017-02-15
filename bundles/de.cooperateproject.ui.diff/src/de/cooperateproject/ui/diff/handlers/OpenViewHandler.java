package de.cooperateproject.ui.diff.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;

import de.cooperateproject.ui.diff.views.DiffView;

/**
 * Handler for filling this plugin's view with content and passing the selected
 * .cooperate-file to the view.
 * 
 * @author Jasmin
 *
 */
public class OpenViewHandler extends AbstractHandler {
	@Override
	/**
	 * Called by a command from the plugin.xml extension points.
	 */
	public Object execute(ExecutionEvent event) {

		DiffView diffView = null;
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		IWorkbenchPage page = window.getActivePage();
		/**
		 * The current user's selection, has to be a .cooperate-file, since the
		 * command is only visible on them.
		 */
		ISelection selection = page.getSelection();

		if (selection != null && selection instanceof ITreeSelection) {

			try {
				// open the DiffView
				diffView = (DiffView) page.showView(DiffView.ID);
			} catch (PartInitException e) {
				throw new RuntimeException(e);
			}

			if (diffView != null) {
				IStructuredSelection strucSelection = (ITreeSelection) selection;
				// tells the diffView, that the user opened the plugin's view on
				// a diagram and wants to see the commits etc. of it.
				diffView.setSelectedFile((IFile) strucSelection.getFirstElement());
			}

		}

		return null;
	}
}
