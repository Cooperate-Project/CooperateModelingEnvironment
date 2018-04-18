package de.cooperateproject.ui.diff.component.labelhandling;

import de.cooperateproject.modeling.textual.component.component.Attribute;
import de.cooperateproject.modeling.textual.component.component.Class;
import de.cooperateproject.modeling.textual.component.component.Component;
import de.cooperateproject.modeling.textual.component.component.Connector;
import de.cooperateproject.modeling.textual.component.component.Generalization;
import de.cooperateproject.modeling.textual.component.component.Interface;
import de.cooperateproject.modeling.textual.component.component.Method;
import de.cooperateproject.modeling.textual.component.component.Port;
import de.cooperateproject.modeling.textual.component.component.Provide;
import de.cooperateproject.modeling.textual.component.component.Require;
import de.cooperateproject.modeling.textual.component.component.RootPackage;
import de.cooperateproject.modeling.textual.component.component.util.ComponentSwitch;

public class ComponentLabelSwitch extends ComponentSwitch<String> {

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
    
    @Override
    public String caseClass(Class object) {
        return "class " + object.getName();
    }
    @Override
    public String caseInterface(Interface object) {
        return "interface " + object.getName();
    }
    @Override
    public String caseGeneralization(Generalization object) {
        return String.format("%s isa %s",  object.getLeftClassifier().getName(), object.getRightClassifier().getName());
    }
    @Override
    public String caseRequire(Require object) {
        return "require " + object.getInterface().getName();
    }
    @Override
    public String caseProvide(Provide object) {
        return "provide " + object.getInterface().getName();
    }
    @Override
    public String caseConnector(Connector object) {
        return "connector " + object.getName();
    }
    @Override
    public String casePort(Port object) {
        return String.format("port %s realizes %s", object.getName(), object.getRealizedClassifier().getName());
    }
    
    @Override
    public String caseAttribute(Attribute object) {
        return String.format("%s %s", object.getType().getName(), object.getName());
    }
    @Override
    public String caseMethod(Method object) {
        return object.getName();
    }
}
