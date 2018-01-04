package de.cooperateproject.modeling.textual.xtext.runtime.ui.editor.errorindicator;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.diagnostics.AbstractDiagnostic;

/**
 * Indicates an error if cursor enters an error area.
 * 
 * @author czogalik
 *
 */
public class AreaErrorIndicator extends AbstractErrorIndicator {
    private int oldColumn = 0;
    private int oldLine = 0;

    @Override
    public void doSignal(List<Diagnostic> errors, int cursorColumn, int cursorLine) {
        for (Diagnostic e : errors) {
            if (e instanceof AbstractDiagnostic) {
                AbstractDiagnostic error = (AbstractDiagnostic) e;

                int errorLine = error.getLine();
                int errorBegin = error.getColumn();
                int errorLength = error.getLength();

                if (errorLine != cursorLine) {
                    return;
                }
                doSignal(cursorColumn, cursorLine, errorBegin, errorLength);
            }
        }
        oldColumn = cursorColumn;
        oldLine = cursorLine;
    }

    private void doSignal(int cursorColumn, int cursorLine, int errorBegin, int errorLength) {

        boolean cursorIsInErrorArea = cursorColumn >= errorBegin && cursorColumn <= errorBegin + errorLength;
        boolean cursorWasInAreaBefore = oldColumn >= errorBegin && oldColumn <= errorBegin + errorLength;
        boolean cursorWasInSameColumnButAnotherLine = cursorLine != oldLine;

        if (!cursorIsInErrorArea) {
            return;
        }
        if (!cursorWasInAreaBefore) {
            startBeep();
        } else if (cursorWasInSameColumnButAnotherLine) {
            startBeep();
        }
    }

}
