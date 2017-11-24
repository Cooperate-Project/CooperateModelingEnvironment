package de.cooperateproject.ui.diff.component.labelhandling;

import de.cooperateproject.modeling.textual.component.cmp.Component;
import de.cooperateproject.modeling.textual.component.cmp.RootPackage;
import de.cooperateproject.modeling.textual.component.cmp.util.CmpSwitch;

public class ComponentClassTextSwitch extends CmpSwitch<String>{
    
    @Override
    public String caseRootPackage(RootPackage object) {
        return "rootpackage";
    }

    @Override
    public String caseComponent(Component object) {
        return "component";
    }
}
