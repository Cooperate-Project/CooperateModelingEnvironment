package de.cooperateproject.modeling.textual.sequence.matching.matcher

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage
import de.cooperateproject.modeling.textual.xtext.runtime.matching.matcher.AbstractElementMatcherBase
import org.eclipse.uml2.uml.UMLPackage

class NamedElementMatcher extends AbstractElementMatcherBase<NamedElement, org.eclipse.uml2.uml.NamedElement> {

    new () {
       super(TextualCommonsPackage.eINSTANCE.namedElement, UMLPackage.eINSTANCE.namedElement) 
    }
    
    override match() {
        #[
            is([el, cand| el.name == cand.name])
        ]
    }
    
}