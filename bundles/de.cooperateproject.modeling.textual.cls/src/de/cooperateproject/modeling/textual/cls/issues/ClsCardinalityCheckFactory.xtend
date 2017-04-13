package de.cooperateproject.modeling.textual.cls.issues

import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality

import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*

class ClsCardinalityCheckFactory extends ClsAutomatedIssueResolutionFactoryBase<AssociationMemberEnd> {
	
    public static val ISSUE_CODE = "associationMemberEndCardinalityMismatch";

    new() {
        super(ISSUE_CODE, [isResolvable], AssociationMemberEnd);
    }
    
    static def isResolvable(AssociationMemberEnd element) {
		if (!element.hasReferencedElement || element.cardinality === null) {
			return false
		}
		
		val lower = element.cardinality.lowerBound
		val upper = element.cardinality.upperBound

		if (lower > upper && upper > 0) {
			return false
		}
		element.association.hasReferencedElement
	}

    override hasIssueInternal(AssociationMemberEnd element) {
        val property = element.getReferencedElement();
        if (property === null) {
            return false;
        }

        val clsCardinality = element.getCardinality();
        if (clsCardinality === null) {
            return false;
        }

        if (clsCardinality.getLowerBound() == -1 && property.lowerBound() == 0 && clsCardinality.getUpperBound() == 0
                && property.upperBound() == -1) {
            return false;
        }
        if (clsCardinality.getUpperBound() == 0) {
            if (clsCardinality.getLowerBound() == property.lowerBound()
                    && property.lowerBound() == property.upperBound()) {
                return false;
            }
        }

        return clsCardinality.getLowerBound() != property.lowerBound()
                || clsCardinality.getUpperBound() != property.upperBound();
    }

    override createInternal(AssociationMemberEnd element) {
        new ClsCardinalityCheckResolution(element, getResolvableChecker());
    }

    override getResolutionNameInternal(AssociationMemberEnd element) {
        "Use given cardinality in UML model.";
    }

    private static def toString(Cardinality cardinality) {
        return String.format("%s..%s", toCardinalityString(cardinality.getLowerBound()),
                toCardinalityString(cardinality.getUpperBound()));
    }

    private static def toCardinalityString(int bound) {
        if (bound < 0) {
            return "*";
        }
        return Integer.toString(bound);
    }

    override getIssueDescriptionInternal(AssociationMemberEnd element) {
        return "The cardinality " + toString(element.getCardinality())
                + " does not match the existing cardinality in UML.";
    }

    override getIssueFeatureInternal(AssociationMemberEnd eObject) {
        return ClsPackage.Literals.XTEXT_ASSOCIATION__MEMBER_END_CARDINALITIES;
    }
	
}