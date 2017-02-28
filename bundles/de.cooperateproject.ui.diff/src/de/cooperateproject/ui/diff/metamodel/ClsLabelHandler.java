package de.cooperateproject.ui.diff.metamodel;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.cls.cls.util.ClsSwitch;
import de.cooperateproject.ui.diff.labeling.LabelHandler;

/**
 * Labeling for the cls meta-model.
 * 
 * @author Jasmin
 *
 */
public class ClsLabelHandler extends ClsSwitch<String> implements LabelHandler {

	private ClsClassTextSwitch classTextSwitch = new ClsClassTextSwitch();
	private ClsLabelSwitch labelSwitch = new ClsLabelSwitch();

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
		return classTextSwitch.doSwitch((EObject) item);
	}

}
