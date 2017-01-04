package de.cooperateproject.modeling.textual.xtext.runtime.editor.errorindicator;

import java.util.EnumMap;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

import de.cooperateproject.ui.preferences.ErrorIndicatorSettings;

public class ErrorIndicatorContext {

	private static final EnumMap<ErrorIndicatorSettings, AbstractErrorIndicator> lookupStrategy = new EnumMap<>(
			ErrorIndicatorSettings.class);
	{
		lookupStrategy.put(ErrorIndicatorSettings.LINE, new LineErrorIndicator());
		lookupStrategy.put(ErrorIndicatorSettings.AREA, new AreaErrorIndicator());
	}

	private int oldColumn = 0;
	private int oldLine = 0;

	public void createSignal(List<Diagnostic> errors, String cursorPosition, ErrorIndicatorSettings type) {
		if (type == null || type.equals("") || type.equals(ErrorIndicatorSettings.NONE)) {
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
