package de.cooperateproject.ui.diff.usecase.labeling;

import de.cooperateproject.modeling.textual.usecase.usecase.Actor;
import de.cooperateproject.modeling.textual.usecase.usecase.Association;
import de.cooperateproject.modeling.textual.usecase.usecase.Extend;
import de.cooperateproject.modeling.textual.usecase.usecase.ExtensionPoint;
import de.cooperateproject.modeling.textual.usecase.usecase.Generalization;
import de.cooperateproject.modeling.textual.usecase.usecase.Include;
import de.cooperateproject.modeling.textual.usecase.usecase.RootPackage;
import de.cooperateproject.modeling.textual.usecase.usecase.UseCase;
import de.cooperateproject.modeling.textual.usecase.usecase.util.UsecaseSwitch;
import de.cooperateproject.modeling.textual.usecase.usecase.System;

public class UsecaseClassTextSwitch extends UsecaseSwitch<String> {
    
    @Override
    public String caseRootPackage(RootPackage object) {
        return "rootpackage";
    }
    
    @Override
    public String caseActor(Actor object) {
        return "act";
    }
    
    @Override
    public String caseSystem(System object) {
        return "sys";
    }

    @Override
    public String caseUseCase(UseCase object) {
        return "uc";
    }
    
    @Override
    public String caseExtensionPoint(ExtensionPoint object) {
        return "ep";
    }
    
    @Override
    public String caseAssociation(Association object) {
        return "asc";
    }
    
    @Override
    public String caseGeneralization(Generalization object) {
        return "isa";
    }
    
    @Override
    public String caseInclude(Include object) {
        return "incl";
    }
    
    @Override
    public String caseExtend(Extend object) {
        return "ext";
    }

}
