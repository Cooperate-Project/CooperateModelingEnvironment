package de.cooperateproject.modeling.textual.xtext.runtime.ui.editor.errorindicator;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

/**
 * Indicates an error if cursor enters the error line.
 * 
 * @author czogalik
 *
 */
public class LineErrorIndicator extends AbstractErrorIndicator {

    private int oldLine = 0;

    @Override
    public void doSignal(List<Diagnostic> errors, int x, int line) {
        for (Diagnostic error : errors) {
            int errorLine = error.getLine();

            boolean isCursorInErrorLine = errorLine == line;
            boolean wasCursorInLineBefore = oldLine == line;

            if (isCursorInErrorLine && !wasCursorInLineBefore) {
                startBeep();
            }
        }
        oldLine = line;
    }

}
