package de.cooperateproject.modeling.textual.xtext.runtime.matching

import de.cooperateproject.modeling.textual.xtext.runtime.matching.matcher.ElementMatcher
import de.cooperateproject.modeling.textual.xtext.runtime.matching.provider.CandidatesConfigurationProvider
import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject

abstract class ElementMatchingContext {
   protected val matchTypeRegister = new HashMap<EClass, EClass>
   protected val registeredMatchers = new HashMap<EClass, ElementMatcher<? extends EObject, ? extends EObject>>
   val CandidatesConfigurationProvider<?> rootCandidatesProvider
   val Map<EObject, ElementMatchingInstance<?,?>> existingMatchingInstances = new HashMap
   var initialized = false
   
   new(CandidatesConfigurationProvider<?> rootCandidatesProvider) {
      this.rootCandidatesProvider = rootCandidatesProvider
   }
   
   def <L extends EObject, R extends EObject> ElementMatchingInstance<L,R> getElementMatchingInstance(L element) {
       this.existingMatchingInstances.computeIfAbsent(element, [element.createElementMatchingInstance]) as ElementMatchingInstance<L,R>
   }

   private def <L extends EObject, R extends EObject> ElementMatchingInstance<L,R> createElementMatchingInstance(L element) {
       val type = matchTypeRegister.get(element.eClass)
       new ElementMatchingInstance(element, type)
   }
   
   def doMatch(Iterable<? extends EObject> initialElementsToMatch, EClass matchAgainstType) {
       if (!initialized) {
           initializeMatchers
           initialized = true
       }
       val evaluator = new ElementMatchingContextEvaluator(this)
       
       initialElementsToMatch.forEach[evaluator.instantiateElementEvaluation(it, matchAgainstType)]
       
       while(!evaluator.evaluationFinished) evaluator.evaluateNext
   }
   
   abstract def void initializeMatchers()
   
   
   private def <L extends EObject, R extends EObject> getMatcherAlternatives(L element) {
       element.eClass.EAllSuperTypes.map[registeredMatchers.get(it.instanceClass) as ElementMatcher<L,? extends EObject>]
                .filter[it !== null]
                .filter[it.acceptsAsLeft(element)]
   } 

    def <L extends EObject> findMatcher(L element) {
        var matcher = registeredMatchers.get(element.eClass) as ElementMatcher<L,? extends EObject>
        if (matcher === null || !matcher.acceptsAsLeft(element)) {
                matcher = element.matcherAlternatives.findFirst[true] 
        }
        if (matcher === null)
            throw new UnsupportedOperationException('''No compatible Matcher registered for matching of «element.eClass.name»''')
        matcher
    }
    
    def <L extends EObject> findMatcher(L element, EClass asClass) {
        var matcher = registeredMatchers.get(asClass) as ElementMatcher<L,? extends EObject>
        if (matcher === null || !matcher.acceptsAsLeft(element)) {
            throw new UnsupportedOperationException('''No compatible Matcher registered for matching «element.eClass.name» as «asClass.name»''')
        } 
        matcher
    }
    
}