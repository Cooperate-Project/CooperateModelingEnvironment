package de.cooperateproject.modeling.textual.cls.generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.ComposedSwitch;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd;
import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.cls.cls.ClsFactory;
import de.cooperateproject.modeling.textual.cls.cls.CommentLink;
import de.cooperateproject.modeling.textual.cls.cls.Generalization;
import de.cooperateproject.modeling.textual.cls.cls.Implementation;
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociation;
import de.cooperateproject.modeling.textual.cls.cls.util.ClsSwitch;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.util.TextualCommonsSwitch;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IGlobalScopeTypeQueryProvider;

public class ClsDerivedStateComputer implements IDerivedStateComputer {

    @Inject
    private IQualifiedNameProvider qualifiedNameProvider;

    @Inject
    private IGlobalScopeTypeQueryProvider globalScopeProvider;

    private final Switch<Boolean> calculator = new ComposedSwitch<>(
            Arrays.asList(new ClsStateCalculator(), new TextualCommonsStateCalculator()));

    @Override
    public void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
        if (preLinkingPhase) {
            return;
        }

        List<EObject> allContent = new ArrayList<>();
        resource.getAllContents().forEachRemaining(allContent::add);
        allContent.sort(ClsDerivedStateComputer::prioritize);
        for (EObject object : allContent) {
            calculator.doSwitch(object);
        }
    }

    private static int prioritize(EObject o1, EObject o2) {
        int prio1 = o1 instanceof Classifier ? 1 : 0;
        int prio2 = o2 instanceof Classifier ? 1 : 0;
        return prio2 - prio1;
    }

    @Override
    public void discardDerivedState(DerivedStateAwareResource resource) {
        return;
    }

    private class TextualCommonsStateCalculator extends TextualCommonsSwitch<Boolean> {

        private class RealCommentableFinder
                extends ClsSwitch<UMLReferencingElement<? extends org.eclipse.uml2.uml.Classifier>> {

            @Override
            public UMLReferencingElement<? extends org.eclipse.uml2.uml.Classifier> caseCommentLink(
                    CommentLink object) {
                return object.getCommentedElement();
            }

            @Override
            public UMLReferencingElement<? extends org.eclipse.uml2.uml.Classifier> caseAssociation(
                    de.cooperateproject.modeling.textual.cls.cls.Association object) {
                return object;
            }

        }

        private final RealCommentableFinder commentableFinder = new RealCommentableFinder();

        @Override
        public Boolean caseComment(Comment object) {
            UMLReferencingElement<? extends org.eclipse.uml2.uml.Classifier> realElement = commentableFinder
                    .doSwitch(object.getCommentedElement());
            if (realElement != null) {
                Element umlCommentedElement = realElement.getReferencedElement();

                IScope candidates = globalScopeProvider.queryScope(object.eResource(), true,
                        UMLPackage.Literals.COMMENT,
                        c -> ((org.eclipse.uml2.uml.Comment) c.getEObjectOrProxy()).getAnnotatedElements()
                                .contains(umlCommentedElement)
                                && ((org.eclipse.uml2.uml.Comment) c.getEObjectOrProxy()).getBody()
                                        .equals(object.getBody()));
                Iterable<org.eclipse.uml2.uml.Comment> typedCandidates = Iterables.transform(
                        candidates.getAllElements(), e -> (org.eclipse.uml2.uml.Comment) e.getEObjectOrProxy());
                if (Iterables.size(typedCandidates) == 1) {
                    object.setReferencedElement(Iterables.getFirst(typedCandidates, null));
                }
            }
            return true;
        }

        @Override
        public Boolean defaultCase(EObject object) {
            return true;
        }

    }

    private class ClsStateCalculator extends ClsSwitch<Boolean> {

        @Override
        public Boolean caseGeneralization(Generalization object) {
            if (object.getLeft() != null && object.getLeft().getReferencedElement() != null && object.getRight() != null
                    && object.getRight().getReferencedElement() != null) {
                org.eclipse.uml2.uml.Generalization umlGeneralization = object.getLeft().getReferencedElement()
                        .getGeneralization(object.getRight().getReferencedElement());
                object.setReferencedElement(umlGeneralization);
            }
            return true;
        }

        @Override
        public Boolean caseImplementation(Implementation object) {
            if (object.getLeft() != null && object.getLeft().getReferencedElement() != null && object.getRight() != null
                    && object.getRight().getReferencedElement() != null) {
                InterfaceRealization umlInterfaceRealization = ((Class) object.getLeft().getReferencedElement())
                        .getInterfaceRealization(null, (Interface) object.getRight().getReferencedElement());
                object.setReferencedElement(umlInterfaceRealization);
            }
            return true;
        }

        @Override
        public Boolean caseXtextAssociation(XtextAssociation object) {
            if (object.getMemberEndTypes().isEmpty()) {
                for (AssociationMemberEnd memberEnd : object.getMemberEnds()) {
                    object.getMemberEndTypes().add(memberEnd.getType());
                    if (memberEnd.getCardinality() != null) {
                        object.getMemberEndCardinalities().add(memberEnd.getCardinality());
                    }
                    if (memberEnd.getName() != null) {
                        object.getMemberEndNames().add(memberEnd.getName());
                    }
                    object.getMemberEndNavigabilities().add(memberEnd.isNavigable());
                }
            }

            List<Classifier<?>> types = object.getMemberEndTypes();
            List<String> names = object.getMemberEndNames();
            List<Cardinality> cardinalities = object.getMemberEndCardinalities();
            EList<Boolean> navigabilities = object.getMemberEndNavigabilities();

            if (object.getMemberEnds().size() > types.size()) {
                List<AssociationMemberEnd> memberEndToBeDeleted = object.getMemberEnds().subList(types.size(),
                        object.getMemberEnds().size());
                memberEndToBeDeleted.stream().forEach(EcoreUtil::delete);
            }
            for (int i = 0; i < types.size(); ++i) {
                AssociationMemberEnd memberEnd = null;
                if (object.getMemberEnds().size() > i) {
                    memberEnd = object.getMemberEnds().get(i);
                } else {
                    memberEnd = ClsFactory.eINSTANCE.createAssociationMemberEnd();
                    object.getMemberEnds().add(memberEnd);
                }
                memberEnd.setType(types.get(i));
                if (cardinalities.size() > i) {
                    memberEnd.setCardinality(EcoreUtil.copy(cardinalities.get(i)));
                }
                if (names.size() > i) {
                    memberEnd.setName(names.get(i));
                }
                if (navigabilities.size() > i) {
                    memberEnd.setNavigable(navigabilities.get(i));
                }
            }
            if (types.size() == 2) {
                AssociationMemberEnd firstMemberEnd = object.getMemberEnds().get(0);
                firstMemberEnd.setAggregationKind(object.getTwoSideAggregationKind());
                firstMemberEnd.setNavigable(true);
                AssociationMemberEnd secondMemberEnd = object.getMemberEnds().get(1);
                secondMemberEnd.setNavigable(object.isTwoSideBidirectionality());
            }

            caseUMLReferencingElement(object);
            object.getMemberEnds().forEach(this::caseAssociationMemberEnd);
            return true;
        }

        @Override
        public Boolean caseAssociationMemberEnd(AssociationMemberEnd object) {
            Association umlAssociation = object.getAssociation().getReferencedElement();
            if (umlAssociation == null) {
                return super.caseAssociationMemberEnd(object);
            }

            List<Property> candidates = umlAssociation.getMemberEnds().stream()
                    .filter(umlMemberEnd -> umlMemberEnd.getType() == object.getType().getReferencedElement())
                    .collect(Collectors.toList());

            if (candidates.size() > 1 && StringUtils.isNotBlank(object.getName())) {
                candidates = candidates.stream().filter(umlMemberEnd -> object.getName().equals(umlMemberEnd.getName()))
                        .collect(Collectors.toList());
            }

            if (candidates.size() == 1) {
                object.setReferencedElement(candidates.get(0));
                return true;
            }

            return super.caseAssociationMemberEnd(object);
        }

        @Override
        public <UMLType extends Element> Boolean caseUMLReferencingElement(UMLReferencingElement<UMLType> object) {
            QualifiedName objectName = qualifiedNameProvider.apply(object);
            if (objectName == null) {
                return super.caseUMLReferencingElement(object);
            }

            EGenericType requiredType = object.eClass()
                    .getFeatureType(TextualCommonsPackage.eINSTANCE.getUMLReferencingElement_ReferencedElement());
            Collection<IEObjectDescription> foundElements = Sets
                    .newHashSet(globalScopeProvider.queryScope(object.eResource(), true,
                            (EClass) requiredType.getEClassifier(), Predicates.alwaysTrue()).getAllElements());

            List<EObject> matchingElements = foundElements.stream().filter(d -> objectName.equals(d.getQualifiedName()))
                    .map(IEObjectDescription::getEObjectOrProxy).distinct().collect(Collectors.toList());
            if (matchingElements.size() == 1) {
                object.setReferencedElement((UMLType) matchingElements.get(0));
                return true;
            }

            return super.caseUMLReferencingElement(object);
        }

        @Override
        public Boolean defaultCase(EObject object) {
            return true;
        }

    }

}
