package de.cooperateproject.modeling.textual.cls.generator;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.Property;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd;
import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.cls.cls.ClsFactory;
import de.cooperateproject.modeling.textual.cls.cls.Generalization;
import de.cooperateproject.modeling.textual.cls.cls.Implementation;
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociation;
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociationMemberEndReferencedType;
import de.cooperateproject.modeling.textual.cls.cls.util.ClsSwitch;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.xtext.runtime.generator.IDerivedStateElementProcessor;

public class ClsDerivedStateElementProcessor extends ClsSwitch<Optional<Void>>
        implements IDerivedStateElementProcessor {

    @Inject
    @Named("MainProcessor")
    protected IDerivedStateElementProcessor mainProcessor;

    @Override
    public Optional<Void> caseGeneralization(Generalization object) {
        if (object.getLeft() != null && object.getLeft().getReferencedElement() != null && object.getRight() != null
                && object.getRight().getReferencedElement() != null) {
            org.eclipse.uml2.uml.Generalization umlGeneralization = object.getLeft().getReferencedElement()
                    .getGeneralization(object.getRight().getReferencedElement());
            object.setReferencedElement(umlGeneralization);
        }
        return Optional.empty();
    }

    @Override
    public Optional<Void> caseImplementation(Implementation object) {
        if (object.getLeft() != null && object.getLeft().getReferencedElement() != null && object.getRight() != null
                && object.getRight().getReferencedElement() != null) {
            org.eclipse.uml2.uml.Classifier left = object.getLeft().getReferencedElement();
            org.eclipse.uml2.uml.Classifier right = object.getRight().getReferencedElement();
            if (left instanceof Class && right instanceof Interface) {
                InterfaceRealization umlInterfaceRealization = ((Class) left).getInterfaceRealization(null,
                        (Interface) right);
                object.setReferencedElement(umlInterfaceRealization);
            }

            // InterfaceRealization umlInterfaceRealization = ((Class) object.getLeft().getReferencedElement())
            // .getInterfaceRealization(null, (Interface) object.getRight().getReferencedElement());
            // object.setReferencedElement(umlInterfaceRealization);
        }
        return Optional.empty();
    }

    @Override
    public Optional<Void> caseXtextAssociation(XtextAssociation object) {
        if (object.getMemberEndTypes().isEmpty()) {
            object.getMemberEndNames().clear();
            object.getMemberEndCardinalities().clear();
            object.getMemberEndNavigabilities().clear();
            for (AssociationMemberEnd memberEnd : object.getMemberEnds()) {
                XtextAssociationMemberEndReferencedType typeReference = ClsFactory.eINSTANCE
                        .createXtextAssociationMemberEndReferencedType();
                typeReference.setType(memberEnd.getType());
                object.getMemberEndTypes().add(typeReference);
                if (memberEnd.getCardinality() != null) {
                    object.getMemberEndCardinalities().add(EcoreUtil.copy(memberEnd.getCardinality()));
                }
                if (memberEnd.getName() != null) {
                    object.getMemberEndNames().add(memberEnd.getName());
                }
                object.getMemberEndNavigabilities().add(memberEnd.isNavigable());
            }
            if (object.getMemberEnds().size() == 2) {
                object.setTwoSideBidirectionality(
                        object.getMemberEndNavigabilities().stream().allMatch(Boolean.TRUE::equals));
                object.setTwoSideAggregationKind(object.getMemberEnds().get(1).getAggregationKind());
            }
        }

        List<Classifier<?>> types = object.collectMemberEndTypes();
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
                if (memberEnd.getCardinality() != null) {
                    memberEnd.getCardinality().setLowerBound(cardinalities.get(i).getLowerBound());
                    memberEnd.getCardinality().setUpperBound(cardinalities.get(i).getUpperBound());
                } else {
                    memberEnd.setCardinality(EcoreUtil.copy(cardinalities.get(i)));
                }
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
            firstMemberEnd.setNavigable(object.isTwoSideBidirectionality());
            AssociationMemberEnd secondMemberEnd = object.getMemberEnds().get(1);
            secondMemberEnd.setNavigable(true);
            secondMemberEnd.setAggregationKind(object.getTwoSideAggregationKind());
        }

        mainProcessor.processElementUsingType(TextualCommonsPackage.eINSTANCE.getUMLReferencingElement(), object);
        object.getMemberEnds().forEach(mainProcessor::processElement);
        return Optional.empty();
    }

    @Override
    public Optional<Void> caseAssociationMemberEnd(AssociationMemberEnd object) {
        Association umlAssociation = object.getAssociation().getReferencedElement();
        if (umlAssociation == null) {
            return null;
        }

        List<Property> candidates = umlAssociation.getMemberEnds().stream()
                .filter(umlMemberEnd -> umlMemberEnd.getType() == object.getType().getReferencedElement())
                .collect(Collectors.toList());

        if (StringUtils.isNotBlank(object.getName())) {
            candidates = candidates.stream().filter(umlMemberEnd -> object.getName().equals(umlMemberEnd.getName()))
                    .collect(Collectors.toList());
        }

        if (candidates.size() == 1) {
            object.setReferencedElement(candidates.get(0));
            return null;
        }

        return Optional.empty();
    }

    @Override
    public boolean isDirectlyCompatibleWith(EClass eClass) {
        return isSwitchFor(eClass.getEPackage());
    }

    @Override
    public boolean processElementUsingType(EClass clazz, EObject object) {
        if (!clazz.isInstance(object)) {
            throw new IllegalArgumentException("The object is not a valid instance of the provided class");
        }
        return (doSwitch(clazz, object) != null);
    }

}
