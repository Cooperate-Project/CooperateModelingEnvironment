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

	/* TODO: Sonderfälle behandeln:
	 * - card[x : y .. z]
	 * - card[*]
	 * - card[x..y|*]
	 */
	public static def hasIssues(AssociationMemberEnd element) {
		val property = getProperty(element)
		val clsCardinality = element.cardinality
		
		return clsCardinality.lowerBound != property.lowerBound || clsCardinality.upperBound != property.upperBound
	}
	

	override resolvePossible() {
		problematicElement.association.hasReferencedElement
	}

	override resolve() {
		if (resolvePossible) {
			val property = getProperty(problematicElement)
		
			property.lower = problematicElement.cardinality.lowerBound
			property.upper = problematicElement.cardinality.upperBound
		}
	}
	
	private static def getProperty(AssociationMemberEnd element) {
		val umlAsc = element.association?.referencedElement
		return umlAsc.memberEnds.filter(Property).findFirst[x | x.type.name.equals(element.type.name)]
	}
	
}