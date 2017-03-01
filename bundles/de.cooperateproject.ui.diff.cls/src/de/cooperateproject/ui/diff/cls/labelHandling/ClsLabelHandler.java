package de.cooperateproject.ui.diff.cls.labelHandling;

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
		return labelSwitch.doSwitch(item);
	}

	@Override
	public String getClassText(Object item) {
		return classTextSwitch.doSwitch(item);
	}

}
