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

public class ComponentClassTextSwitch extends ComponentSwitch<String>{
    
    @Override
    public String caseRootPackage(RootPackage object) {
        return "rootpackage";
    }

    @Override
    public String caseComponent(Component object) {
        return "component";
    }
    @Override
    public String caseClass(Class object) {
        return "class";
    }
    @Override
    public String caseInterface(Interface object) {
        return "interface";
    }
    @Override
    public String caseGeneralization(Generalization object) {
        return "isa";
    }
    @Override
    public String caseRequire(Require object) {
        return "require";
    }
    @Override
    public String caseProvide(Provide object) {
        return "provide";
    }
    @Override
    public String caseConnector(Connector object) {
        return "connector";
    }
    @Override
    public String casePort(Port object) {
        return "port";
    }
    @Override
    public String caseAttribute(Attribute object) {
        return "attribute";
    }
    @Override
    public String caseMethod(Method object) {
        return "method";
    }
    
    
}
