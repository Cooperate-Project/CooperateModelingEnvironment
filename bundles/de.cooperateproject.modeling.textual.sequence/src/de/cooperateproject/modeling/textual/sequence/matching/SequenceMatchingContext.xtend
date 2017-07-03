package de.cooperateproject.modeling.textual.sequence.matching

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage
import de.cooperateproject.modeling.textual.sequence.matching.matcher.CombinedFragmentMatcher
import de.cooperateproject.modeling.textual.sequence.matching.matcher.MessageMatcher
import de.cooperateproject.modeling.textual.sequence.matching.matcher.MultipleRegionContainerMatcher
import de.cooperateproject.modeling.textual.sequence.matching.matcher.NamedElementMatcher
import de.cooperateproject.modeling.textual.sequence.matching.matcher.OrderedFragmentContainerMatcher
import de.cooperateproject.modeling.textual.sequence.matching.matcher.SequenceDiagramMatcher
import de.cooperateproject.modeling.textual.sequence.matching.matcher.SingleRegionContainerMatcher
import de.cooperateproject.modeling.textual.sequence.matching.matcher.UniqueAliasedElementMatcher
import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage
import de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementMatchingContext
import de.cooperateproject.modeling.textual.xtext.runtime.matching.provider.CandidatesConfigurationPool
import org.eclipse.emf.ecore.EObject
import de.cooperateproject.modeling.textual.sequence.matching.matcher.ActorWithClassifierMatcher

class SequenceMatchingContext extends ElementMatchingContext {
    
    new(CandidatesConfigurationPool<EObject> rootCandidatesProvider) {
        super(rootCandidatesProvider)
    }
    
    override def initializeMatchers() {
        this.registeredMatchers.put(TextualCommonsPackage.eINSTANCE.namedElement, new NamedElementMatcher)
        this.registeredMatchers.put(SequencePackage.eINSTANCE.message, new MessageMatcher)
        this.registeredMatchers.put(SequencePackage.eINSTANCE.combinedFragment, new CombinedFragmentMatcher)
        this.registeredMatchers.put(SequencePackage.eINSTANCE.multipleRegionContainer, new MultipleRegionContainerMatcher)
        this.registeredMatchers.put(SequencePackage.eINSTANCE.singleRegionContainer, new SingleRegionContainerMatcher)
        this.registeredMatchers.put(TextualCommonsPackage.eINSTANCE.aliasedElement, new UniqueAliasedElementMatcher)
        this.registeredMatchers.put(SequencePackage.eINSTANCE.orderedFragmentContainer, new OrderedFragmentContainerMatcher)
        this.registeredMatchers.put(SequencePackage.eINSTANCE.sequenceDiagram, new SequenceDiagramMatcher)
        this.registeredMatchers.put(SequencePackage.eINSTANCE.actor, new ActorWithClassifierMatcher)
  }   
}