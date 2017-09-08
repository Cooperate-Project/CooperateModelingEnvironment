package de.cooperateproject.modeling.textual.common.issues

import de.cooperateproject.modeling.textual.common.issues.CommonAutomatedIssueResolutionFactoryBase
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement

import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage
import org.eclipse.uml2.uml.NamedElement
import java.util.Objects

class AliasedElementWrongAliasFactory extends CommonAutomatedIssueResolutionFactoryBase<AliasedElement> {
	
	static val ISSUE_CODE = "commons_" + AliasedElementWrongAliasFactory.simpleName
	
	new() {
		super(ISSUE_CODE, [isResolvable], AliasedElement)
	}
	
    private static def isResolvable(AliasedElement element) {
        if (element instanceof UMLReferencingElement) {
            element.hasReferencedElementOfType(NamedElement)
        }
    }
	
	override protected createInternal(AliasedElement element) {
		new AliasedElementWrongAliasResolution(element, resolvableChecker)
	}
	
	override protected getIssueDescriptionInternal(AliasedElement element) {
		"The alias of the element does not match the alias of the according UML element."
	}
	
	override protected getIssueFeatureInternal(AliasedElement element) {
		new IssueLocator(TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS, element)
	}
	
	override protected getResolutionNameInternal(AliasedElement element) {
		"Set alias in UML to the alias currently used."
	}
	
	override protected hasIssueInternal(AliasedElement element) {
        if (!(element instanceof UMLReferencingElement)) {
            return false
        }
        
        var umlReferencingElement = element as UMLReferencingElement<NamedElement>
        if (!umlReferencingElement.hasReferencedElement) {
            return false
        }
        
        val umlAlias = umlReferencingElement.referencedElement.nameExpression?.name
        return element.alias != umlAlias
	}
	
}