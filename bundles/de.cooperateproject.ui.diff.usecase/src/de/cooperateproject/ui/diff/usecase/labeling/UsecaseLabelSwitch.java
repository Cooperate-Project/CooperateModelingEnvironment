package de.cooperateproject.ui.diff.usecase.labeling;

import de.cooperateproject.modeling.textual.usecase.usecase.Actor;
import de.cooperateproject.modeling.textual.usecase.usecase.Association;
import de.cooperateproject.modeling.textual.usecase.usecase.BehavioredClassifier;
import de.cooperateproject.modeling.textual.usecase.usecase.Extend;
import de.cooperateproject.modeling.textual.usecase.usecase.ExtensionPoint;
import de.cooperateproject.modeling.textual.usecase.usecase.Generalization;
import de.cooperateproject.modeling.textual.usecase.usecase.Include;
import de.cooperateproject.modeling.textual.usecase.usecase.RootPackage;
import de.cooperateproject.modeling.textual.usecase.usecase.System;
import de.cooperateproject.modeling.textual.usecase.usecase.UseCase;
import de.cooperateproject.modeling.textual.usecase.usecase.util.UsecaseSwitch;

/**
 * Switch to invoke description method for each usecase model class.
 * 
 * @author czogalik
 *
 */
public class UsecaseLabelSwitch extends UsecaseSwitch<String> {

    @Override
    public String caseRootPackage(RootPackage object) {
        if (object.getOwningPackage() == null) {
            return "rootpackage " + object.getReferencedElement().getName();
        }
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

    @Override
    public String caseExtensionPoint(ExtensionPoint object) {
        return "ep " + object.getName();
    }

    @Override
    public String caseAssociation(Association object) {
        return "asc";
    }

    @Override
    public String caseGeneralization(Generalization object) {
        String specific = getNameFromBehavioredClassifier(object.getSpecific());
        String general = getNameFromBehavioredClassifier(object.getGeneral());
        return specific + " isa " + general;
    }

    @Override
    public String caseInclude(Include object) {
        String includingCase = object.getIncludingCase().getName();
        String addition = object.getAddition().getName();
        return includingCase + " incl " + addition;
    }

    @Override
    public String caseExtend(Extend object) {
        String extendedCase = object.getExtendedCase().getName();
        String extension = object.getExtension().getName();
        String condition = object.getCondition() == null ? "" : " cond " + object.getCondition();
        return extendedCase + " ext " + extension + condition;
    }

    private static String getNameFromBehavioredClassifier(
            BehavioredClassifier<? extends org.eclipse.uml2.uml.BehavioredClassifier> classifier) {
        if (classifier instanceof Actor) {
            return "act " + ((Actor) classifier).getName();
        } else if (classifier instanceof UseCase) {
            return "uc " + ((UseCase) classifier).getName();
        }
        return null;
    }
}
