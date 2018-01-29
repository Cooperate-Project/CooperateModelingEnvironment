package de.cooperateproject.ui.diff.component.labelhandling;


import de.cooperateproject.modeling.textual.component.cmp.Attribute;
import de.cooperateproject.modeling.textual.component.cmp.Class;
import de.cooperateproject.modeling.textual.component.cmp.Component;
import de.cooperateproject.modeling.textual.component.cmp.Connector;
import de.cooperateproject.modeling.textual.component.cmp.Generalization;
import de.cooperateproject.modeling.textual.component.cmp.Interface;
import de.cooperateproject.modeling.textual.component.cmp.Method;
import de.cooperateproject.modeling.textual.component.cmp.Port;
import de.cooperateproject.modeling.textual.component.cmp.Provide;
import de.cooperateproject.modeling.textual.component.cmp.Require;
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
