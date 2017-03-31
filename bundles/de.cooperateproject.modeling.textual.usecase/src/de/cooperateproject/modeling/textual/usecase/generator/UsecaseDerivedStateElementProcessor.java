package de.cooperateproject.modeling.textual.usecase.generator;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UseCase;

import com.google.common.collect.Sets;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.usecase.usecase.Association;
import de.cooperateproject.modeling.textual.usecase.usecase.Extend;
import de.cooperateproject.modeling.textual.usecase.usecase.Generalization;
import de.cooperateproject.modeling.textual.usecase.usecase.Include;
import de.cooperateproject.modeling.textual.usecase.usecase.util.UsecaseSwitch;
import de.cooperateproject.modeling.textual.xtext.runtime.generator.IDerivedStateElementProcessor;

public class UsecaseDerivedStateElementProcessor extends UsecaseSwitch<Void> implements IDerivedStateElementProcessor {

    @Override
    public Void caseExtend(Extend object) {
        UseCase umlExtendedCase = object.getExtendedCase().getReferencedElement();
        UseCase umlExtension = object.getExtension().getReferencedElement();
        org.eclipse.uml2.uml.ExtensionPoint umlExtensionPoint = object.getExtensionLocation().getReferencedElement();

        if (umlExtendedCase == null || umlExtension == null || umlExtensionPoint == null) {
            return super.caseExtend(object);
        }

        Set<org.eclipse.uml2.uml.Extend> candidates = umlExtension.getExtends().stream().filter(
                e -> e.getExtendedCase() == umlExtendedCase && e.getExtensionLocations().contains(umlExtensionPoint))
                .collect(Collectors.toSet());
        if (candidates.size() == 1) {
            object.setReferencedElement(candidates.iterator().next());
            return null;
        }

        return super.caseExtend(object);
    }

    @Override
    public Void caseGeneralization(Generalization object) {

        @SuppressWarnings({ "rawtypes", "unchecked" })
        UMLReferencingElement<Classifier> specific = (UMLReferencingElement) object.getSpecific();
        @SuppressWarnings({ "rawtypes", "unchecked" })
        UMLReferencingElement<Classifier> general = (UMLReferencingElement) object.getGeneral();

        Classifier umlSpecific = specific.getReferencedElement();
        Classifier umlGeneral = general.getReferencedElement();

        if (umlSpecific == null || umlGeneral == null) {
            return super.caseGeneralization(object);
        }

        org.eclipse.uml2.uml.Generalization umlGeneralization = umlSpecific.getGeneralization(umlGeneral);
        if (umlGeneralization != null) {
            object.setReferencedElement(umlGeneralization);
            return null;
        }

        return super.caseGeneralization(object);
    }

    @Override
    public Void caseInclude(Include object) {
        UseCase umlIncludingCase = object.getIncludingCase().getReferencedElement();
        UseCase umlAddition = object.getAddition().getReferencedElement();

        if (umlIncludingCase == null || umlAddition == null) {
            return super.caseInclude(object);
        }

        Set<org.eclipse.uml2.uml.Include> candidates = umlIncludingCase.getIncludes().stream()
                .filter(i -> umlAddition == i.getAddition()).collect(Collectors.toSet());
        if (candidates.size() == 1) {
            object.setReferencedElement(candidates.iterator().next());
            return null;
        }

        return super.caseInclude(object);
    }

    @Override
    public Void caseAssociation(Association object) {
        if (object.getActor() == null || object.getUsecase() == null) {
            return null;
        }

        Actor actor = object.getActor().getReferencedElement();
        UseCase usecase = object.getUsecase().getReferencedElement();

        if (actor == null || usecase == null) {
            return null;
        }

        Set<org.eclipse.uml2.uml.Association> matchingAssociations = actor.getAssociations().stream()
                .filter(a -> isAssociationBetween(a, actor, usecase)).collect(Collectors.toSet());
        if (matchingAssociations.size() == 1) {
            object.setReferencedElement(matchingAssociations.iterator().next());
            return null;
        }

        return super.caseAssociation(object);
    }

    private boolean isAssociationBetween(org.eclipse.uml2.uml.Association a, Classifier c1, Classifier c2) {
        if (a.getMemberEnds().size() == 2) {
            HashSet<Classifier> candidates = Sets.newHashSet(c1, c2);
            long matchingMemberEnds = a.getMemberEnds().stream().map(Property::getType).filter(candidates::contains)
                    .count();
            return matchingMemberEnds == 2;
        }
        return false;
    }

    @Override
    public boolean isCompatibleWith(EPackage ePackage) {
        return isSwitchFor(ePackage);
    }

    @Override
    public void processElement(EObject object) {
        doSwitch(object);
    }
}
