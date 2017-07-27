package de.cooperateproject.ui.diff.usecase.labeling;

import de.cooperateproject.modeling.textual.usecase.usecase.Actor;
import de.cooperateproject.modeling.textual.usecase.usecase.RootPackage;
import de.cooperateproject.modeling.textual.usecase.usecase.System;
import de.cooperateproject.modeling.textual.usecase.usecase.UseCase;
import de.cooperateproject.modeling.textual.usecase.usecase.util.UsecaseSwitch;

public class UsecaseLabelSwitch extends UsecaseSwitch<String> {
    
    @Override
    public String caseRootPackage(RootPackage object) {
        return "rootpackage " + object.getName();
    }
    
    @Override
    public String caseActor(Actor object) {
        return "actor " + object.getName();
    }
    
    @Override
    public String caseSystem(System object) {
        return "system " + object.getName();
    }

    @Override
    public String caseUseCase(UseCase object) {
        return "usecase " + object.getName();
    }
}
