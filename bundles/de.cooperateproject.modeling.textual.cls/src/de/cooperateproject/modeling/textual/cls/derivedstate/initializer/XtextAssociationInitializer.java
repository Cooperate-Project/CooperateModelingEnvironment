package de.cooperateproject.modeling.textual.cls.derivedstate.initializer;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;

import de.cooperateproject.modeling.textual.cls.cls.AggregationKind;
import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd;
import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.cls.cls.ClsFactory;
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociation;
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociationMemberEndReferencedType;
import de.cooperateproject.modeling.textual.cls.utils.ClsConversionUtilities;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.common.util.UMLReferencingElementFinder;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;

/**
 * Initializing processor for XtextAssociation elements.
 * 
 * This processor handles the contained AssociationMemberEnds as well.
 */
@Applicability(applicabilities = DerivedStateProcessorApplicability.INITIALIZATION)
public class XtextAssociationInitializer extends AtomicDerivedStateProcessorBase<XtextAssociation> {

    /**
     * Constructs the processor.
     */
    public XtextAssociationInitializer() {
        super(XtextAssociation.class);
    }

    @Override
    protected void applyTyped(XtextAssociation object) {
        if (object.getMemberEnds().isEmpty()) {
            return;
        }
        object.getMemberEndNames().clear();
        object.getMemberEndCardinalities().clear();
        object.getMemberEndNavigabilities().clear();
        object.getMemberEndTypes().clear();
        for (AssociationMemberEnd memberEnd : object.getMemberEnds()) {
            init(memberEnd);
            XtextAssociationMemberEndReferencedType typeReference = ClsFactory.eINSTANCE
                    .createXtextAssociationMemberEndReferencedType();
            typeReference.setType(memberEnd.getType());
            object.getMemberEndTypes().add(typeReference);
            if (memberEnd.getCardinality() != null) {
                object.getMemberEndCardinalities().add(EcoreUtil.copy(memberEnd.getCardinality()));
            }
            object.getMemberEndNames().add(memberEnd.getName());
            object.getMemberEndNavigabilities().add(memberEnd.isNavigable());
        }
        if (object.getMemberEndNames().stream().allMatch(Objects::isNull)) {
            object.getMemberEndNames().clear();
        }

        if (!object.isSetTwoSideAggregationKind()) {
            object.setTwoSideAggregationKind(AggregationKind.NONE);
            if (object.getMemberEnds().size() == 2) {
                object.setTwoSideBidirectionality(
                        object.getMemberEndNavigabilities().stream().allMatch(Boolean.TRUE::equals));
                object.setTwoSideAggregationKind(object.getMemberEnds().get(1).getAggregationKind());
            }
        }
    }

    private static void init(AssociationMemberEnd memberEnd) {
        if (memberEnd.getReferencedElement() == null) {
            return;
        }
        Optional<Property> referencedElement = Optional.ofNullable(memberEnd.getReferencedElement());
        initName(memberEnd, referencedElement);
        initNavigability(memberEnd, referencedElement);
        initType(memberEnd, referencedElement);
        initAggregationKind(memberEnd, referencedElement);
        initCardinality(memberEnd.getCardinality());
    }

    private static void initName(AssociationMemberEnd memberEnd, Optional<Property> referencedElement) {
        if (!memberEnd.isSetName() && StringUtils.isEmpty(memberEnd.getName())) {
            referencedElement.map(NamedElement::getName).ifPresent(memberEnd::setName);
        }
    }

    private static void initNavigability(AssociationMemberEnd memberEnd, Optional<Property> referencedElement) {
        if (!memberEnd.isSetNavigable()) {
            referencedElement.map(Property::isNavigable).ifPresent(memberEnd::setNavigable);
        }
    }

    private static void initType(AssociationMemberEnd memberEnd, Optional<Property> referencedElement) {
        if (memberEnd.getType() == null) {
            Optional<Type> foundClassifier = referencedElement.map(TypedElement::getType);
            UMLReferencingElementFinder elementFinder = UMLReferencingElementFinder
                    .create(EcoreUtil.getRootContainer(memberEnd));
            foundClassifier
                    .ifPresent(t -> elementFinder.findElement(t, getClassifierClass()).ifPresent(memberEnd::setType));
        }
    }

    private static void initAggregationKind(AssociationMemberEnd memberEnd, Optional<Property> referencedElement) {
        if (!memberEnd.isSetAggregationKind()) {
            referencedElement.map(Property::getAggregation).map(ClsConversionUtilities::convert)
                    .ifPresent(memberEnd::setAggregationKind);
        }
    }

    @SuppressWarnings("unchecked")
    private static Class<Classifier<? extends org.eclipse.uml2.uml.Classifier>> getClassifierClass() {
        return (Class<Classifier<? extends org.eclipse.uml2.uml.Classifier>>) (Class<?>) Classifier.class;
    }

    private static void initCardinality(Cardinality cardinality) {
        if (cardinality == null) {
            return;
        }
        Optional<MultiplicityElement> multiplicityElement = Optional.ofNullable(cardinality.getReferencedElement());
        if (!cardinality.isSetLowerBound()) {
            multiplicityElement.map(MultiplicityElement::getLower).ifPresent(cardinality::setLowerBound);
        }
        if (!cardinality.isSetUpperBound()) {
            multiplicityElement.map(MultiplicityElement::getUpper).ifPresent(cardinality::setUpperBound);
        }
    }

    @Override
    public Collection<Class<? extends EObject>> getRequirements() {
        return Arrays.asList(UMLReferencingElement.class);
    }

}
