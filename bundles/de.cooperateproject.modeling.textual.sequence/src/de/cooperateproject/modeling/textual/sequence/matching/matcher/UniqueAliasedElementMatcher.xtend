package de.cooperateproject.modeling.textual.sequence.matching.matcher

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage
import de.cooperateproject.modeling.textual.xtext.runtime.matching.matcher.AbstractElementMatcherBase
import org.eclipse.uml2.uml.NamedElement
import org.eclipse.uml2.uml.UMLPackage

class UniqueAliasedElementMatcher extends AbstractElementMatcherBase<AliasedElement, NamedElement> {
    
    new () {
        super(TextualCommonsPackage.eINSTANCE.aliasedElement, UMLPackage.eINSTANCE.namedElement)
    }
    
    override select() {        
        definiteIf([el, cand | !el.alias.nullOrEmpty && el.alias == cand.nameExpression?.name])
    }
    
}