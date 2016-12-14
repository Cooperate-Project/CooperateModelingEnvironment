package de.cooperateproject.modeling.textual.xtext.runtime.editor.errorsignalization;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

import de.cooperateproject.ui.preferences.preferencepage.WorkbenchPreferenceErrorBeep;

public class ErrorSignalContext {

	private static final Map<String, AbstractErrorSignal> lookupStrategy = new HashMap<>();
	{
		lookupStrategy.put(WorkbenchPreferenceErrorBeep.LINE_SIGNALIZATION, new LineErrorSignal());
		lookupStrategy.put(WorkbenchPreferenceErrorBeep.AREA_SIGNALIZATION, new AreaErrorSignal());
	}

	private int oldColumn = 0;
	private int oldLine = 0;

	public void createSignal(List<Diagnostic> errors, String cursorPosition, String type) {
		if (type == null || type.equals("") || type.equals(WorkbenchPreferenceErrorBeep.NO_SIGNALIZATION)) {
			return;
		}
		
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
		
		lookupStrategy.get(type).doSignal(errors, cursorColumn, cursorLine, oldLine, oldColumn);

		oldColumn = cursorColumn;
		oldLine = cursorLine;
	}
}
