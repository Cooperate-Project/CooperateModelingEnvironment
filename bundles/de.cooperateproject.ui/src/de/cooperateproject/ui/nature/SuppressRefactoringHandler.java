package de.cooperateproject.ui.nature;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.PlatformUI;

public class SuppressRefactoringHandler extends AbstractHandler {

    /**
     * Disables rename and move actions.
     */
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        MessageBox dialog = new MessageBox(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                SWT.ICON_INFORMATION | SWT.OK);
        dialog.setText("Refactoring deactivated");
        dialog.setMessage("Refactoring is deactivated for Cooperate projects.");
        dialog.open();
        return null;
    }

}
