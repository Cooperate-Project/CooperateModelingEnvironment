package de.cooperateproject.ui.diff.metamodel;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.ui.diff.labeling.LabelHandler;

public class Uml2LabelHandler implements LabelHandler {

	private UML2ClassTextSwitch textSwitch = new UML2ClassTextSwitch();
	private UML2LabelSwitch labelSwitch = new UML2LabelSwitch();

	@Override
	public String getText(Object item) {
		if (item == null) {
			return "";
		}
		return labelSwitch.doSwitch((EObject) item);
	}

	@Override
	public String getClassText(Object item) {
		if (item == null) {
			return "";
		}
		return textSwitch.doSwitch((EObject) item);
	}

}
