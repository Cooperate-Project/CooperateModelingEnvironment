package de.cooperateproject.ui.diff.usecase.labeling;

import de.cooperateproject.modeling.textual.usecase.usecase.Actor;
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

}
