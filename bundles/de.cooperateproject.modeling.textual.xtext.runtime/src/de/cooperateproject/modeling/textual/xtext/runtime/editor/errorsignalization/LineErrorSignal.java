package de.cooperateproject.modeling.textual.xtext.runtime.editor.errorsignalization;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

public class LineErrorSignal extends AbstractErrorSignal {
	
	@Override
	public void doSignal(List<Diagnostic> errors, int x, int line, int oldLine, int oldColumn) {
		for (Diagnostic error : errors) {
			int errorLine = error.getLine();
			//is the cursor in the error line and was not in the error line before
			if (oldLine != line && errorLine == line) {
				startBeep();
			}
		}	
	}

}
