package de.cooperateproject.modeling.textual.sequence.matching.matcher

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage
import de.cooperateproject.modeling.textual.sequence.sequence.CombinedFragment
import de.cooperateproject.modeling.textual.xtext.runtime.matching.matcher.AbstractElementMatcherBase

class CombinedFragmentMatcher extends AbstractElementMatcherBase<CombinedFragment, org.eclipse.uml2.uml.CombinedFragment> {

    new () {
       super(CombinedFragment, org.eclipse.uml2.uml.CombinedFragment) 
    }
    
    override match() {
        #[
            definiteIf(matchAs(TextualCommonsPackage.eINSTANCE.aliasedElement)),
            is([l, r | l.interactionOperatorKind == r.interactionOperator])
        ]
    }
    
}