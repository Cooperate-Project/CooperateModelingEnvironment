/*
 * generated by Xtext 2.10.0
 */
package de.cooperateproject.modeling.textual.cls.validation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.Generalization;
import de.cooperateproject.modeling.textual.cls.cls.Interface;
import de.cooperateproject.modeling.textual.cls.cls.Package;
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociation;
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociationMemberEndReferencedType;
import de.cooperateproject.modeling.textual.cls.utils.AssociationMatcher;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.IIssueCodeRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.validator.ICooperateAutomatedValidator;

/**
 * Cls-validator for the editor.
 */
public class ClsValidator extends AbstractClsValidator {

    private static final String NOT_AN_INTERFACE = "not_an_interface";
    private static final String NOT_A_CLASS = "not_a_class";
    private static final String ALIAS_TAKEN = "alias_taken";
    private static final String NAME_TAKEN = "name_taken";
    private static final String NOT_ENOUGH_ROLE_NAMES = "not_enough_role_names";
    private static final String GEN_NO_SELF = "no_self_generalization";
    private static final String ASSOCIATION_AMBIGUOUS = "cls_association_ambiguous";

    @Inject
    @SuppressWarnings("unused")
    private ICooperateAutomatedValidator automatedValidator;

    @Inject
    private IIssueCodeRegistry issueCodeRegistry;

    @Check
    private void checkCorrectClassifierType(de.cooperateproject.modeling.textual.cls.cls.Class classifier) {
        Element element = classifier.getReferencedElement();
        if (element != null && !(element instanceof org.eclipse.uml2.uml.Class)) {
            error(classifier.getName() + " should be an interface but it's not!",
                    TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, NOT_A_CLASS);
        }
    }

    @Check
    private void checkUniqueNamedElementInItsNamespace(NamedElement element) {
        if (StringUtils.isEmpty(element.getName())) {
            return;
        }

        int depth = 1;
        EObject namespaceCandidate = Optional.ofNullable(element).map(EObject::eContainer).orElse(null);
        while (namespaceCandidate != null && !(namespaceCandidate instanceof NamedElement)) {
            namespaceCandidate = namespaceCandidate.eContainer();
            depth++;
        }

        if (namespaceCandidate == null) {
            return;
        }

        Collection<NamedElement> elementsToCheck = getElementsToCheck(Arrays.asList(namespaceCandidate), depth).stream()
                .filter(NamedElement.class::isInstance).map(NamedElement.class::cast).filter(o -> o != element)
                .collect(Collectors.toSet());

        if (elementsToCheck.stream()
                .anyMatch(elementToTest -> Objects.equals(elementToTest.getName(), element.getName()))) {
            error("\"" + element.getName() + "\"" + " no duplicates!",
                    TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, NAME_TAKEN);
        }

    }

    private static Collection<EObject> getElementsToCheck(Collection<EObject> elementsToCheck, int depth) {
        if (depth == 0) {
            return elementsToCheck;
        }
        Set<EObject> result = new HashSet<>(elementsToCheck);
        result.addAll(getElementsToCheck(elementsToCheck.stream().map(EObject::eContents).flatMap(Collection::stream)
                .collect(Collectors.toSet()), depth - 1));
        return result;
    }

    @Check
    private void checkUniqueNamedElementInItsUMLNamespace(NamedElement element) {
        if (StringUtils.isEmpty(element.getName())) {
            return;
        }

        Optional<UMLReferencingElement<Element>> referencedUMLElement = Optional.ofNullable(element)
                .filter(UMLReferencingElement.class::isInstance).map(UMLReferencingElement.class::cast);
        Optional<Namespace> relevantUMLNamespace = referencedUMLElement
                .map(UMLReferencingElement::getUMLParentNamespace);
        if (!relevantUMLNamespace.isPresent()) {
            return;
        }

        if (relevantUMLNamespace.get().getMembers().stream().filter(org.eclipse.uml2.uml.NamedElement.class::isInstance)
                .map(org.eclipse.uml2.uml.NamedElement.class::cast)
                .filter(o -> o != referencedUMLElement.get().getReferencedElement())
                .anyMatch(elementToTest -> Objects.equals(element.getName(), elementToTest.getName()))) {
            error("\"" + element.getName() + "\"" + " no duplicates!",
                    TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, NAME_TAKEN);
        }
    }

    @Check
    private void checkUniqueAliasInItsPackage(AliasedElement aliasedElement) {
        PackageBase<?> nearestPackage = aliasedElement.getNearestPackage();
        if (!(nearestPackage instanceof Package)) {
            return;
        }
        List<? extends AliasedElement> classifiers = ((Package) nearestPackage).getClassifiers();

        checkUniqueAlias(aliasedElement, classifiers);
    }

    private void checkUniqueAlias(AliasedElement aliasedElement, List<? extends AliasedElement> aliasedElements) {
        for (AliasedElement alias : aliasedElements) {
            if (alias.equals(aliasedElement)) {
                continue;
            }
            String classifierAlias = aliasedElement.getAlias();
            if (Optional.ofNullable(alias.getAlias()).filter(StringUtils::isNotEmpty)
                    .map(a -> Objects.equals(classifierAlias, a)).orElse(false)) {
                error("\"" + classifierAlias + "\"" + " Alias is taken!",
                        TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS, ALIAS_TAKEN);
            }
        }
    }

    @Check
    private void checkCorrectClassifierType(Interface classifier) {
        Element element = classifier.getReferencedElement();
        if (element != null && !(element instanceof org.eclipse.uml2.uml.Interface)) {
            error(classifier.getName() + " should be a class but it's not!",
                    TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, NOT_AN_INTERFACE);
        }
    }

    @Check
    private void checkNoSelfGeneralization(Generalization gen) {
        if (gen.getLeft() == gen.getRight()) {
            error("A classifier can not be a generalization of itself!", ClsPackage.Literals.TYPED_CONNECTOR__RIGHT,
                    GEN_NO_SELF);
        }
    }

    @Check
    private void checkUnambiguousMemberEnds(XtextAssociation asc) {
        List<Classifier<?>> memberEndTypes = asc.collectMemberEndTypes();

        Set<Classifier<?>> duplicatedTypes = new HashSet<>();

        Set<Classifier<?>> seenTypes = new HashSet<>();
        for (Classifier<?> type : memberEndTypes) {
            if (seenTypes.contains(type)) {
                duplicatedTypes.add(type);
            }
            seenTypes.add(type);
        }

        for (Classifier<?> type : duplicatedTypes) {
            List<Integer> duplicatedIndices = new ArrayList<>();
            for (int i = 0; i < memberEndTypes.size(); ++i) {
                if (memberEndTypes.get(i) == type) {
                    duplicatedIndices.add(i);
                }
            }
            int maxIndex = duplicatedIndices.stream().max(Integer::compare).get();
            if (asc.getMemberEndNames().size() <= maxIndex) {
                error("Not enough role names given to distinguish the involved association participants unambiguously!",
                        ClsPackage.Literals.XTEXT_ASSOCIATION__MEMBER_END_NAMES, NOT_ENOUGH_ROLE_NAMES);
            } else {
                Set<String> roleNames = duplicatedIndices.stream().map(i -> asc.getMemberEndNames().get(i))
                        .collect(Collectors.toSet());
                if (roleNames.size() != duplicatedIndices.size()) {
                    error("Role names for the same type have to be unambiguous!",
                            ClsPackage.Literals.XTEXT_ASSOCIATION__MEMBER_END_NAMES, NOT_ENOUGH_ROLE_NAMES);
                }
            }

        }

    }

    @Check
    private void checkAssociationsUnambigous(XtextAssociation association) {
        if (StringUtils.isNotEmpty(association.getName())) {
            return;
        }

        List<Classifier<? extends org.eclipse.uml2.uml.Classifier>> chosenTypes = getTypes(association);
        if (association.getOwningPackage().getConnectors().stream().filter(XtextAssociation.class::isInstance)
                .map(XtextAssociation.class::cast).filter(a -> a != association).map(ClsValidator::getTypes)
                .anyMatch(chosenTypes::equals)) {
            error("The association is not clearly distinguishable from other associations in this diagram.",
                    ClsPackage.Literals.XTEXT_ASSOCIATION__MEMBER_END_TYPES, ASSOCIATION_AMBIGUOUS);
            return;
        }

        Collection<Association> candidates = Optional.ofNullable(association.getOwningPackage().getReferencedElement())
                .map(umlPackage -> AssociationMatcher.findUMLElements(association, umlPackage))
                .orElse(Collections.emptySet());
        candidates.remove(association.getReferencedElement());
        if (!candidates.isEmpty()) {
            error("The association is not clearly distinguishable from other associations in the UML model.",
                    ClsPackage.Literals.XTEXT_ASSOCIATION__MEMBER_END_TYPES, ASSOCIATION_AMBIGUOUS);
        }

    }

    private static List<Classifier<? extends org.eclipse.uml2.uml.Classifier>> getTypes(XtextAssociation association) {
        return association.getMemberEndTypes().stream().map(XtextAssociationMemberEndReferencedType::getType)
                .collect(Collectors.toList());
    }

    private void error(String message, EStructuralFeature feature, String code) {
        if (!issueCodeRegistry.hasIssueCode(code)) {
            issueCodeRegistry.registerIssueCode(code);
        }
        error(message, feature, code, new String[0]);
    }

}
