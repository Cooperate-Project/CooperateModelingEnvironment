package de.cooperateproject.modeling.textual.usecase.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality

import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactory.IssueLocator
import de.cooperateproject.modeling.textual.common.issues.CommonAutomatedIssueResolutionFactoryBase
import java.util.List
import de.cooperateproject.modeling.textual.usecase.usecase.Association

class UsecaseInteractionCardinalityFactory extends CommonAutomatedIssueResolutionFactoryBase<Cardinality> {
	
    public static val ISSUE_CODE = "associationCardinalityMismatch";

    new() {
        super(ISSUE_CODE, [isResolvable], Cardinality);
    }
    
    static def isResolvable(Cardinality element) {
		if (!element.hasReferencedElement) {
			return false
		}
		return element.valid
	}
	
	static def isValid(Cardinality cardinality) {
		val lower = cardinality.lowerBound
		val upper = cardinality.upperBound
		return (lower <= upper || upper < 0)
	}

    override hasIssueInternal(Cardinality cardinality) {
        val multiplicity = cardinality.getReferencedElement();
        
        if (multiplicity === null) {
            return false;
        }
        
        if (!(cardinality.eContainer instanceof Association)) {
        	return false
        }
        	

       

        if (cardinality.getLowerBound() == -1 && multiplicity.lowerBound() == 0 && cardinality.getUpperBound() == 0
                && multiplicity.upperBound() == -1) {
            return false;
        }
        if (cardinality.getUpperBound() == 0) {
            if (cardinality.getLowerBound() == multiplicity.lowerBound()
                    && multiplicity.lowerBound() == multiplicity.upperBound()) {
                return false;
            }
        }

        return cardinality.getLowerBound() != multiplicity.lowerBound()
                || cardinality.getUpperBound() != multiplicity.upperBound();
    }

    override createInternal(Cardinality element) {
        new UsecaseInteractionCardinalityResolution(element, getResolvableChecker());
    }

    override getResolutionNameInternal(Cardinality element) {
        "Update given cardinality in UML model.";
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

    override getIssueDescriptionInternal(Cardinality element) {
        return "The cardinality " + toString(element)
                + " does not match the existing cardinality in UML " + element.referencedElement.lower + ".." + element.referencedElement.upper  + ".";
    }

    override getIssueFeatureInternal(Cardinality eObject) {
    	var index = -1
    	if(eObject.eContainingFeature.isMany) {
    		index =  (eObject.eContainer.eGet(eObject.eContainingFeature) as List).indexOf(eObject)
    	}

        return new IssueLocator(eObject.eContainingFeature, index, eObject.eContainer, eObject)
    }
	
}
			