package de.cooperateproject.modeling.textual.xtext.runtime.editor;

import java.awt.Toolkit;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

public abstract class AbstractErrorSignal {
	
	public abstract void doSignal(List<Diagnostic> errors, int column, int line, int oldLine, int oldColumn);

	protected void startBeep() {
		Runnable runnable = () -> Toolkit.getDefaultToolkit().beep();
		new Thread(runnable).start();
	}
}
