package de.cooperateproject.modeling.textual.usecase.generator;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.eclipse.xtext.resource.IEObjectDescription;

import com.google.common.base.Predicates;
import com.google.common.collect.Sets;
import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.usecase.usecase.Association;
import de.cooperateproject.modeling.textual.usecase.usecase.BehavioredClassifier;
import de.cooperateproject.modeling.textual.usecase.usecase.Comment;
import de.cooperateproject.modeling.textual.usecase.usecase.Extend;
import de.cooperateproject.modeling.textual.usecase.usecase.Generalization;
import de.cooperateproject.modeling.textual.usecase.usecase.Include;
import de.cooperateproject.modeling.textual.usecase.usecase.UMLReferencingElement;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;
import de.cooperateproject.modeling.textual.usecase.usecase.util.UsecaseSwitch;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IGlobalScopeTypeQueryProvider;

public class UsecaseDerivedStateGenerator implements IDerivedStateComputer {

    @Inject
    private IQualifiedNameProvider qualifiedNameProvider;

    @Inject
    private IGlobalScopeTypeQueryProvider globalScopeProvider;

    private final UsecaseStateCalculator calculator = new UsecaseStateCalculator();

    @Override
    public void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
        if (preLinkingPhase) {
            return;
        }

        if (resource.getContents().isEmpty() || resource.getContents().get(0).eResource() != resource) {
            // prohibits the derived state calculator from calculating stuff before the contained elements belong to the
            // resource
            return;
        }

        EObject rootObject = resource.getContents().get(0);
        installDerivedState(rootObject);
    }

    public void installDerivedState(EObject object) {
        StreamSupport.stream(Spliterators.spliteratorUnknownSize(object.eAllContents(), Spliterator.ORDERED), false)
                .sorted(new ContentSorter()).forEach(calculator::doSwitch);
    }

    @Override
    public void discardDerivedState(DerivedStateAwareResource resource) {

        return;
        // TODO Auto-generated method stub

    }

    private static class ContentSorter implements Comparator<EObject> {

        @Override
        public int compare(EObject o1, EObject o2) {
            boolean o1Prioritized = o1 instanceof BehavioredClassifier;
            boolean o2Prioritized = o2 instanceof BehavioredClassifier;

            if (o1Prioritized == o2Prioritized) {
                return 0;
            }

            return o1Prioritized ? -1 : 1;
        }

    }

    private class UsecaseStateCalculator extends UsecaseSwitch<Boolean> {

        @Override
        public Boolean defaultCase(EObject object) {
            return true;
        }

        @Override
        public Boolean caseComment(Comment object) {
            if (!(object.getCommentedElement() instanceof UMLReferencingElement)) {
                return super.caseComment(object);
            }

            @SuppressWarnings("unchecked")
            UMLReferencingElement<Element> commentedElement = (UMLReferencingElement<Element>) object
                    .getCommentedElement();
            Element umlCommentedElement = commentedElement.getReferencedElement();
            if (umlCommentedElement == null) {
                return false;
            }

            EObject rootElement = EcoreUtil.getRootContainer(umlCommentedElement);
            Set<org.eclipse.uml2.uml.Comment> candidates = StreamSupport
                    .stream(Spliterators.spliteratorUnknownSize(rootElement.eAllContents(), Spliterator.ORDERED), false)
                    .filter(org.eclipse.uml2.uml.Comment.class::isInstance)
                    .map(org.eclipse.uml2.uml.Comment.class::cast)
                    .filter(c -> c.getAnnotatedElements().contains(umlCommentedElement)
                            && c.getBody().equals(object.getComment()))
                    .collect(Collectors.toSet());

            if (candidates.size() == 1) {
                object.setReferencedElement(candidates.iterator().next());
                return false;
            }

            return super.caseComment(object);
        }

        @Override
        public Boolean caseExtend(Extend object) {
            UseCase umlExtendedCase = object.getExtendedCase().getReferencedElement();
            UseCase umlExtension = object.getExtension().getReferencedElement();
            org.eclipse.uml2.uml.ExtensionPoint umlExtensionPoint = object.getExtensionLocation()
                    .getReferencedElement();

            if (umlExtendedCase == null || umlExtension == null || umlExtensionPoint == null) {
                return super.caseExtend(object);
            }

            Set<org.eclipse.uml2.uml.Extend> candidates = umlExtension.getExtends().stream()
                    .filter(e -> e.getExtendedCase() == umlExtendedCase
                            && e.getExtensionLocations().contains(umlExtensionPoint))
                    .collect(Collectors.toSet());
            if (candidates.size() == 1) {
                object.setReferencedElement(candidates.iterator().next());
                return true;
            }

            return super.caseExtend(object);
        }

        @Override
        public Boolean caseGeneralization(Generalization object) {

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
                return false;
            }

            return super.caseGeneralization(object);
        }

        @Override
        public Boolean caseInclude(Include object) {
            UseCase umlIncludingCase = object.getIncludingCase().getReferencedElement();
            UseCase umlAddition = object.getAddition().getReferencedElement();

            if (umlIncludingCase == null || umlAddition == null) {
                return super.caseInclude(object);
            }

            Set<org.eclipse.uml2.uml.Include> candidates = umlIncludingCase.getIncludes().stream()
                    .filter(i -> umlAddition == i.getAddition()).collect(Collectors.toSet());
            if (candidates.size() == 1) {
                object.setReferencedElement(candidates.iterator().next());
                return false;
            }

            return super.caseInclude(object);
        }

        @Override
        public Boolean caseAssociation(Association object) {
            if (object.getActor() == null || object.getUsecase() == null) {
                return false;
            }

            Actor actor = object.getActor().getReferencedElement();
            UseCase usecase = object.getUsecase().getReferencedElement();

            if (actor == null || usecase == null) {
                return false;
            }

            Set<org.eclipse.uml2.uml.Association> matchingAssociations = actor.getAssociations().stream()
                    .filter(a -> isAssociationBetween(a, actor, usecase)).collect(Collectors.toSet());
            if (matchingAssociations.size() == 1) {
                object.setReferencedElement(matchingAssociations.iterator().next());
                return false;
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
        public <UMLType extends Element> Boolean caseUMLReferencingElement(UMLReferencingElement<UMLType> object) {
            QualifiedName qn = qualifiedNameProvider.getFullyQualifiedName(object);
            if (qn == null) {
                return super.caseUMLReferencingElement(object);
            }

            EGenericType requiredType = object.eClass()
                    .getFeatureType(UsecasePackage.eINSTANCE.getUMLReferencingElement_ReferencedElement());
            Collection<IEObjectDescription> foundElements = Sets
                    .newHashSet(globalScopeProvider.queryScope(object.eResource(), true,
                            (EClass) requiredType.getEClassifier(), Predicates.alwaysTrue()).getAllElements());

            List<EObject> matchingElements = foundElements.stream().filter(d -> qn.equals(d.getQualifiedName()))
                    .map(IEObjectDescription::getEObjectOrProxy).distinct().collect(Collectors.toList());
            if (matchingElements.size() == 1) {
                object.setReferencedElement((UMLType) matchingElements.get(0));
                return true;
            } else {
                object.setReferencedElement(null);
            }
            return super.caseUMLReferencingElement(object);
        }

    }

}
