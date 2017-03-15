package de.cooperateproject.modeling.textual.cls.issues

import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import org.eclipse.uml2.uml.Property
import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd

import static extension de.cooperateproject.modeling.textual.cls.issues.ClsIssueResolutionUtilities.*

class ClsCardinalityCheck extends AutomatedIssueResolutionBase<AssociationMemberEnd> {

	public static val ISSUE_CODE = "wrongCardinality"

	new(AssociationMemberEnd problematicElement) {
		super(problematicElement)
	}
	
	public static def hasIssues(AssociationMemberEnd element) {
		val property = getProperty(element)
		val clsCardinality = element.cardinality
		if (clsCardinality.lowerBound == -1 && property.lower == 0 && clsCardinality.upperBound == 0 &&
			property.upper == -1) {
			return false;
		}
		if (clsCardinality.upperBound == 0) {
			if (clsCardinality.lowerBound == property.lower && property.lower == property.upper) {
				return false;
			}
		}

		return clsCardinality.lowerBound != property.lowerBound || clsCardinality.upperBound != property.upperBound
	}

	override resolvePossible() {
		val lower = problematicElement.cardinality.lowerBound
		val upper = problematicElement.cardinality.upperBound
		
		if (lower > upper && upper > 0) {
			return false
		}
		problematicElement.association.hasReferencedElement
	}

	override resolve() {
		if (resolvePossible) {
			val property = getProperty(problematicElement)
			
			val lower = problematicElement.cardinality.lowerBound
			val upper = problematicElement.cardinality.upperBound

			if (lower < 0) {
				//[*]
				property.lower = 0
				property.upper = -1
			} else {
				property.lower = lower
				if (lower > upper) {
					if (upper < 0) {
						//[x..*]
						property.upper = -1
					} else {
						//[x]
						property.upper = lower	
					}
				} else {
					//[x..y], x < y
					property.upper = upper
				}
			}
		}
	}

	private static def getProperty(AssociationMemberEnd element) {
		val umlAsc = element.association?.referencedElement
		return umlAsc.memberEnds.filter(Property).findFirst[x|x.type.name.equals(element.type.name)]
	}

}
