package de.cooperateproject.ui.diff.usecase.labeling;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.usecase.usecase.util.UsecaseSwitch;
import de.cooperateproject.ui.diff.labeling.LabelHandler;

/**
 * Labeling for the usecase meta-model.
 * 
 * @author czogalik
 *
 */
public class UsecaseLabelHandler implements LabelHandler {


    private UsecaseSwitch<String> labelSwitch = new UsecaseLabelSwitch();
    private UsecaseSwitch<String> classTextSwitch = new UsecaseClassTextSwitch();
    
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
