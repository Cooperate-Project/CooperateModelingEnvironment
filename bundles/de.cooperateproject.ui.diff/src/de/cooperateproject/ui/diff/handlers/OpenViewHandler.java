package de.cooperateproject.ui.diff.handlers;

import java.awt.Toolkit;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.ui.diff.views.DiffView;

/**
 * Handler for filling this plugin's view with content and passing the selected
 * .cooperate-file to the view.
 * 
 * @author Jasmin
 *
 */
public class OpenViewHandler extends AbstractHandler {

	private static final String errorTitle = "Error: Diff View";
	private static final Logger LOGGER = LoggerFactory.getLogger(OpenViewHandler.class);

	@Override
	/**
	 * Called by a command from the plugin.xml extension points.
	 */
	public Object execute(ExecutionEvent event) {

		DiffView diffView;
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		IWorkbenchPage page = window.getActivePage();

		ISelection selection = page.getSelection();

		if (selection != null && selection instanceof ITreeSelection) {

			diffView = getDiffView(window, page);

			if (diffView != null) {
				IStructuredSelection strucSelection = (ITreeSelection) selection;
				diffView.setSelectedFile((IFile) strucSelection.getFirstElement());
			}

		} else {
			openErrorDialog("Diff View wasn't opened due to unexpected selection type.", window.getShell());
		}

		return null;
	}

	private DiffView getDiffView(IWorkbenchWindow window, IWorkbenchPage page) {
		try {
			return (DiffView) page.showView(DiffView.ID);
		} catch (PartInitException e) {
			LOGGER.error(e.getMessage());
			openErrorDialog("Diff View couldn't be initialized. " + e.getMessage(), window.getShell());
			return null;
		}
	}

	private void openErrorDialog(String message, Shell shell) {
		MessageDialog errorDialog;
		Toolkit.getDefaultToolkit().beep();
		errorDialog = new MessageDialog(shell, errorTitle, null, message, MessageDialog.ERROR, new String[] { "Ok" },
				0);
		errorDialog.open();
	}
}
