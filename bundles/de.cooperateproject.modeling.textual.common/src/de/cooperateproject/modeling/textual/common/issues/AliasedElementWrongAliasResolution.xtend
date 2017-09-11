package de.cooperateproject.modeling.textual.common.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import org.apache.commons.lang3.StringUtils
import org.eclipse.uml2.uml.NamedElement
import org.eclipse.uml2.uml.UMLFactory
import org.eclipse.uml2.uml.UMLPackage

class AliasedElementWrongAliasResolution extends AutomatedIssueResolutionBase<AliasedElement> {
	
	new(AliasedElement problematicElement, IResolvableChecker<AliasedElement> checker) {
		super(problematicElement, checker)
	}
	
	override resolve() {
		if (resolvePossible) {
			val umlReferencingElement = problematicElement as UMLReferencingElement<NamedElement>
			val umlElement = umlReferencingElement.referencedElement
			if (StringUtils.isEmpty(problematicElement.alias)) {
				umlElement.eUnset(UMLPackage.Literals.NAMED_ELEMENT__NAME_EXPRESSION)
			} else {
				if (umlElement.nameExpression === null) {
					umlElement.nameExpression = UMLFactory.eINSTANCE.createStringExpression
				}
				umlElement.nameExpression.name = problematicElement.alias
			}
		}
	}
	
}