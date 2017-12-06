package de.cooperateproject.ui.diff.component.labelhandling;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.component.cmp.util.CmpSwitch;
import de.cooperateproject.ui.diff.labeling.LabelHandler;

public class ComponentLabelHandler implements LabelHandler {
    
    private CmpSwitch<String> classTextSwitch = new ComponentClassTextSwitch();
    private CmpSwitch<String> labelSwitch = new ComponentLabelSwitch();

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
