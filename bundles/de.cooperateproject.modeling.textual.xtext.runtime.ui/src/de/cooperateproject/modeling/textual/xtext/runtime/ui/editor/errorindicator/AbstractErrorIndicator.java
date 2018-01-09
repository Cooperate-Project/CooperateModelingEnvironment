package de.cooperateproject.modeling.textual.xtext.runtime.ui.editor.errorindicator;

import java.awt.Toolkit;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

/**
 * Creates an error indicator.
 * 
 * @author czogalik
 *
 */
public abstract class AbstractErrorIndicator {

    public void doSignal(List<Diagnostic> errors, String cursorPosition) {
        String[] parts = cursorPosition.split(" : ");

        int cursorLine = 0;
        int cursorColumn = 0;
        if (parts.length == 2) {
            try {
                cursorLine = Integer.parseInt(parts[0]);
                cursorColumn = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                return;
            }
        }
        doSignal(errors, cursorColumn, cursorLine);
    }

    /**
     * Does a signal for the given error in the given line and column.
     * 
     * @param errors
     *            given errors.
     * @param column
     *            actual cursor column
     * @param line
     *            actual cursor line
     * @param oldLine
     *            old cursor line
     * @param oldColumn
     *            old cursor column
     */
    protected abstract void doSignal(List<Diagnostic> errors, int column, int line);

    protected void startBeep() {
        Runnable runnable = () -> Toolkit.getDefaultToolkit().beep();
        new Thread(runnable).start();
    }

}
