package de.cooperateproject.ui.focus.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.cooperateproject.ui.focus.views.FocusView;

/**
 * Handler for sending a focus request.
 * @author Jasmin
 *
 */
public class FocusHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		FocusView focusView = null;

		focusView = (FocusView) page.findView(FocusView.ID);

		if (focusView != null) {
			focusView.sendFocusRequest();
		}
		return null;
	}

}
