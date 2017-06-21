package de.cooperateproject.modeling.textual.xtext.runtime.matching

import de.cooperateproject.modeling.textual.xtext.runtime.matching.matcher.ElementMatcher
import de.cooperateproject.modeling.textual.xtext.runtime.matching.provider.CandidatesConfigurationProvider
import de.cooperateproject.modeling.textual.xtext.runtime.matching.provider.InitialCandidatesConfigurationProvider
import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.EObject

class ElementMatchingContext<LeftType extends EObject, RightType extends EObject> {
   val registeredMatchers = new HashMap<Class<?>, ElementMatcher<? extends EObject, ? extends EObject>>
   
   val Map<Object, Map<Class<?>, ElementMatchingInstance<?,?>>> existingMatchingInstances = new HashMap
   
   var CandidatesConfigurationProvider<RightType> rootCandidatesProvider = null 
   
   
   def <L, R> ElementMatchingInstance<L,R> getElementMatchingInstance(L element, CandidatesConfigurationProvider<R> provider) {
       val elementMatchings = this.existingMatchingInstances.computeIfAbsent(element, [new HashMap])
       elementMatchings.computeIfAbsent(provider.typeOfCandidates, [createElementMatchingInstance(element, provider)]) as ElementMatchingInstance<L,R>
   }
   
   def <L, R> ElementMatchingInstance<L,R> getElementMatchingInstance(L element, Class<R> matchAgainst) {
       val elementMatchings = this.existingMatchingInstances.computeIfAbsent(element, [new HashMap])
       elementMatchings.computeIfAbsent(matchAgainst, [createRootElementMatchingInstance(element, matchAgainst)]) as ElementMatchingInstance<L,R>
   }
   
   private def <L, R> ElementMatchingInstance<L,R> createRootElementMatchingInstance(L element, Class<R> matchAgainst) {
       new ElementMatchingInstance(element, createRootCandidatesProvider)
   }
   
   private def <L, R> ElementMatchingInstance<L,R> createElementMatchingInstance(L element, CandidatesConfigurationProvider<R> provider) {
       new ElementMatchingInstance(element, provider)
   }
   
   def synchronized CandidatesConfigurationProvider<RightType> createRootCandidatesProvider() {
       rootCandidatesProvider.continueProvider() => [
           rootCandidatesProvider = it
       ]
   }
   
   def doMatch(Iterable<LeftType> initialElementsToMatch, Iterable<RightType> initialCandidates, Class<? extends RightType> matchAgainstType) {
       rootCandidatesProvider = new InitialCandidatesConfigurationProvider(initialCandidates, matchAgainstType as Class<RightType>)
       
       val evaluator = new ElementMatchingContextEvaluator(this)
       
       initialElementsToMatch.forEach[evaluator.evaluateElement(it, matchAgainstType)]
   }
    
    def <L, R> getMatcher(Class<L> leftType, Class<R> rightType) {
        val matcher = registeredMatchers.get(leftType)
        if (!matcher.isMatcherFor(leftType, rightType)) 
            throw new UnsupportedOperationException('''No compatible Matcher registered for matching between «leftType.name» and «rightType.name»''') 
        matcher as ElementMatcher<L, R>
    }
    
}