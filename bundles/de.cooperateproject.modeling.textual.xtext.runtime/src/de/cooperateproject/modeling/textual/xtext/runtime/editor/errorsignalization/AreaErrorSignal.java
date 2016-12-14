package de.cooperateproject.modeling.textual.xtext.runtime.editor.errorsignalization;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.diagnostics.AbstractDiagnostic;

public class AreaErrorSignal extends AbstractErrorSignal {
	
	@Override
	public void doSignal(List<Diagnostic> errors, int cursorColumn, int cursorLine, int oldLine, int oldColumn) {
		for (Diagnostic e : errors) {
			if (e instanceof AbstractDiagnostic) {
				AbstractDiagnostic error = (AbstractDiagnostic) e;

				int errorLine = error.getLine();
				int errorBegin = error.getColumn();
				int errorLength = error.getLength();

				if (errorLine == cursorLine) {
					//is cursor in area where error exists
					if (cursorColumn >= errorBegin && cursorColumn <= errorBegin + errorLength) {
						//were cursor in area before? no:
						if (!(oldColumn >= errorBegin && oldColumn <= errorBegin + errorLength)) {
							startBeep();
						} 
						//cursor were in same column but in another line 
						else if (cursorLine != oldLine) {
							startBeep();
						}
						//TODO: creating an error at cursor position does not create beep
					} 
				} 
			}
		}		
	}

}
