package de.cooperateproject.ui.diff.component.labelhandling;

import de.cooperateproject.modeling.textual.component.cmp.Abstraction;
import de.cooperateproject.modeling.textual.component.cmp.Attribute;
import de.cooperateproject.modeling.textual.component.cmp.Class;
import de.cooperateproject.modeling.textual.component.cmp.Component;
import de.cooperateproject.modeling.textual.component.cmp.Connector;
import de.cooperateproject.modeling.textual.component.cmp.Dependency;
import de.cooperateproject.modeling.textual.component.cmp.Generalization;
import de.cooperateproject.modeling.textual.component.cmp.Interface;
import de.cooperateproject.modeling.textual.component.cmp.Manifestation;
import de.cooperateproject.modeling.textual.component.cmp.Method;
import de.cooperateproject.modeling.textual.component.cmp.Port;
import de.cooperateproject.modeling.textual.component.cmp.Provide;
import de.cooperateproject.modeling.textual.component.cmp.Require;
import de.cooperateproject.modeling.textual.component.cmp.RootPackage;
import de.cooperateproject.modeling.textual.component.cmp.Substitution;
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
    public String caseAbstraction(Abstraction object) {
        return String.format("%s abs %s",  object.getLeftClassifier().getName(), object.getRightClassifier().getName());
    }
    @Override
    public String caseManifestation(Manifestation object) {
        return String.format("%s man %s",  object.getLeftClassifier().getName(), object.getRightClassifier().getName());
    }
    @Override
    public String caseSubstitution(Substitution object) {
        return String.format("%s sub %s",  object.getLeftClassifier().getName(), object.getRightClassifier().getName());
    }
    @Override
    public String caseDependency(Dependency object) {
        return String.format("%s dep %s",  object.getLeftClassifier().getName(), object.getRightClassifier().getName());
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
