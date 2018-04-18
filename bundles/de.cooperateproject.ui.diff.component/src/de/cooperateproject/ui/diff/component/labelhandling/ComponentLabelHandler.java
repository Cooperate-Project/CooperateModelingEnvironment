package de.cooperateproject.ui.diff.component.labelhandling;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.component.component.util.ComponentSwitch;
import de.cooperateproject.ui.diff.labeling.LabelHandler;

public class ComponentLabelHandler implements LabelHandler {
    
    private ComponentSwitch<String> classTextSwitch = new ComponentClassTextSwitch();
    private ComponentSwitch<String> labelSwitch = new ComponentLabelSwitch();

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
