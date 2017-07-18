package de.cooperateproject.modeling.textual.xtext.runtime.editor.errorindicator;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

/**
 * Indicates an error if cursor enters the error line.
 * 
 * @author czogalik
 *
 */
public class LineErrorIndicator extends AbstractErrorIndicator {

    @Override
    public void doSignal(List<Diagnostic> errors, int x, int line, int oldLine, int oldColumn) {
        for (Diagnostic error : errors) {
            int errorLine = error.getLine();

            boolean isCursorInErrorLine = errorLine == line;
            boolean wasCursorInLineBefore = oldLine == line;

            if (isCursorInErrorLine && !wasCursorInLineBefore) {
                startBeep();
            }
        }
    }

}
