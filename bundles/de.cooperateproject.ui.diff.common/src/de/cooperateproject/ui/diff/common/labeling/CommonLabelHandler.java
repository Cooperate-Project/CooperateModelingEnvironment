package de.cooperateproject.ui.diff.common.labeling;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.util.TextualCommonsSwitch;
import de.cooperateproject.ui.diff.labeling.LabelHandler;

public class CommonLabelHandler extends TextualCommonsSwitch<String> implements LabelHandler {

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
    public String getClassText(EObject item) {
        if (item == null) {
            return null;
        }
        return classTextSwitch.doSwitch(item);
    }

}
