package de.cooperateproject.ui.diff.common.labeling;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.util.TextualCommonsSwitch;
import de.cooperateproject.ui.diff.labeling.LabelHandler;

/**
 * Labeling for the common meta-model.
 * 
 * @author czogalik
 *
 */
public class CommonLabelHandler implements LabelHandler {

    private TextualCommonsSwitch<String> labelSwitch = new CommonLabelSwitch();
    private TextualCommonsSwitch<String> classTextSwitch = new CommonClassTextSwitch();

    @Override
    public String getText(EObject item) {
        if (item == null) {
            return null;
        }
        return labelSwitch.doSwitch(item);
    }

    @Override
    public String getClassText(EObject item, Object context) {
        if (item == null) {
            return null;
        }
        return classTextSwitch.doSwitch(item);
    }

}
