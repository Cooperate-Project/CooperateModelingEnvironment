package de.cooperateproject.modeling.textual.sequence.matching.matcher

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage
import de.cooperateproject.modeling.textual.sequence.sequence.CombinedFragment
import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage
import de.cooperateproject.modeling.textual.xtext.runtime.matching.matcher.AbstractElementMatcherBase
import org.eclipse.uml2.uml.UMLPackage

class CombinedFragmentMatcher extends AbstractElementMatcherBase<CombinedFragment, org.eclipse.uml2.uml.CombinedFragment> {

    new () {
       super(SequencePackage.eINSTANCE.combinedFragment, UMLPackage.eINSTANCE.combinedFragment) 
    }
    
    override match() {
        #[
            definiteIf(matchAs(TextualCommonsPackage.eINSTANCE.aliasedElement))
        ]
    }
    
    override select() {
        mustBe([l, r | l.interactionOperatorKind == r.interactionOperator])
    }
    
}