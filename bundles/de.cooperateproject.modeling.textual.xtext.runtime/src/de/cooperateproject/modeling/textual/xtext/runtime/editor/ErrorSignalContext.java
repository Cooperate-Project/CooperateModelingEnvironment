package de.cooperateproject.modeling.textual.xtext.runtime.editor;

import java.util.EnumMap;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

public class ErrorSignalContext {

	public static enum ErrorSignalType {
		LINE, AREA
	}

	private static final EnumMap<ErrorSignalType, AbstractErrorSignal> lookupStrategy = new EnumMap<>(
			ErrorSignalType.class);
	{
		lookupStrategy.put(ErrorSignalType.LINE, new LineErrorSignal());
		lookupStrategy.put(ErrorSignalType.AREA, new AreaErrorSignal());
	}

	private int oldColumn = 0;
	private int oldLine = 0;

	public void createSignal(List<Diagnostic> errors, String cursorPosition, ErrorSignalType type) {
		if (type == null) {
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
