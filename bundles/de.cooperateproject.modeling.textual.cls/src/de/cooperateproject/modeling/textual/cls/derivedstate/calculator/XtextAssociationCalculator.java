package de.cooperateproject.modeling.textual.cls.derivedstate.calculator;

import java.util.List;
import java.util.Objects;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd;
import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.cls.cls.ClsFactory;
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociation;
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociationMemberEndReferencedType;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.AtomicStateProcessorExtensionBase;

/**
 * State calculation for Xtext associations.
 */
public class XtextAssociationCalculator extends AtomicStateProcessorExtensionBase<XtextAssociation> {

    /**
     * Constructs the calculator.
     */
    public XtextAssociationCalculator() {
        super(XtextAssociation.class);
    }

    @Override
    protected Boolean applyTyped(XtextAssociation object) {
        initTransientMemberEnds(object);

        List<Classifier<?>> types = object.collectMemberEndTypes();
        List<String> names = object.getMemberEndNames();
        List<Cardinality> cardinalities = object.getMemberEndCardinalities();
        List<Boolean> navigabilities = object.getMemberEndNavigabilities();

        if (object.getMemberEnds().size() > types.size()) {
            List<AssociationMemberEnd> memberEndToBeDeleted = object.getMemberEnds().subList(types.size(),
                    object.getMemberEnds().size());
            memberEndToBeDeleted.stream().forEach(EcoreUtil::delete);
        }
        for (int i = 0; i < types.size(); ++i) {
            AssociationMemberEnd memberEnd;
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

        return true;
    }

    private static void initTransientMemberEnds(XtextAssociation object) {
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
                object.getMemberEndNames().add(memberEnd.getName());
                object.getMemberEndNavigabilities().add(memberEnd.isNavigable());
            }
            if (object.getMemberEndNames().stream().allMatch(Objects::isNull)) {
                object.getMemberEndNames().clear();
            }
            if (object.getMemberEnds().size() == 2) {
                object.setTwoSideBidirectionality(
                        object.getMemberEndNavigabilities().stream().allMatch(Boolean.TRUE::equals));
                object.setTwoSideAggregationKind(object.getMemberEnds().get(1).getAggregationKind());
            }
        }
    }

    @Override
    public Class<XtextAssociation> getSupportedType() {
        return XtextAssociation.class;
    }

}
