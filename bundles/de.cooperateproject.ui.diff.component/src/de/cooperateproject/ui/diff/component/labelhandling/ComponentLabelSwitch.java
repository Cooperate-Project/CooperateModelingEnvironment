package de.cooperateproject.ui.diff.component.labelhandling;

import de.cooperateproject.modeling.textual.component.cmp.Component;
import de.cooperateproject.modeling.textual.component.cmp.RootPackage;
import de.cooperateproject.modeling.textual.component.cmp.util.CmpSwitch;

public class ComponentLabelSwitch extends CmpSwitch<String> {

    @Override
    public String caseRootPackage(RootPackage object) {
        if (object.getOwningPackage() == null) {
            return "rootpackage " + object.getReferencedElement().getName();
        }
        return "rootpackage " + object.getName();
    }

    @Override
    public String caseComponent(Component object) {
        return "component " + object.getName();
    }
}
