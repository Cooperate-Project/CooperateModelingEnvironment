package de.cooperateproject.modeling.textual.xtext.runtime.editor.errorindicator;

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
    public abstract void doSignal(List<Diagnostic> errors, int column, int line, int oldLine, int oldColumn);

    protected void startBeep() {
        Runnable runnable = () -> Toolkit.getDefaultToolkit().beep();
        new Thread(runnable).start();
    }

}
