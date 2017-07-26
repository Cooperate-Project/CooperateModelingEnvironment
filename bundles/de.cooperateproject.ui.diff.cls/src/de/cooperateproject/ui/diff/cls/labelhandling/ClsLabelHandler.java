package de.cooperateproject.ui.diff.cls.labelhandling;

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

	private ClsSwitch<String> classTextSwitch = new ClsClassTextSwitch();
	private ClsSwitch<String> labelSwitch = new ClsLabelSwitch();

	@Override
	public String getText(EObject item) {
	    if (item == null) {
	        return null;
	    }
		return labelSwitch.doSwitch(item);
	}

	@Override
	public String getClassText(EObject item) {
	    if (item == null) {
            return null;
        }
		return classTextSwitch.doSwitch(item);
	}

}
