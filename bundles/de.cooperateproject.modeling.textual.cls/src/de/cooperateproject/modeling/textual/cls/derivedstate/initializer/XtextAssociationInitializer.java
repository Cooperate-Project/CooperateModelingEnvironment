package de.cooperateproject.modeling.textual.cls.derivedstate.initializer;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.MultiplicityElement;

import de.cooperateproject.modeling.textual.cls.cls.AggregationKind;
import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd;
import de.cooperateproject.modeling.textual.cls.cls.ClsFactory;
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociation;
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociationMemberEndReferencedType;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
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
            XtextAssociationMemberEndReferencedType typeReference = ClsFactory.eINSTANCE
                    .createXtextAssociationMemberEndReferencedType();
            typeReference.setType(memberEnd.getType());
            object.getMemberEndTypes().add(typeReference);
            if (memberEnd.getCardinality() != null) {
                initCardinality(memberEnd.getCardinality());
                object.getMemberEndCardinalities().add(EcoreUtil.copy(memberEnd.getCardinality()));
            }
            object.getMemberEndNames().add(memberEnd.getName());
            object.getMemberEndNavigabilities().add(memberEnd.isNavigable());
        }
        if (object.getMemberEndNames().stream().allMatch(Objects::isNull)) {
            object.getMemberEndNames().clear();
        }

        object.setTwoSideAggregationKind(AggregationKind.NONE);
        if (object.getMemberEnds().size() == 2) {
            object.setTwoSideBidirectionality(
                    object.getMemberEndNavigabilities().stream().allMatch(Boolean.TRUE::equals));
            object.setTwoSideAggregationKind(object.getMemberEnds().get(1).getAggregationKind());
        }
    }

    private static void initCardinality(Cardinality cardinality) {
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
