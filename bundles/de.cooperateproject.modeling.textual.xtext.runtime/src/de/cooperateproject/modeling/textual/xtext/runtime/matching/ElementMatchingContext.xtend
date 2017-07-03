package de.cooperateproject.modeling.textual.xtext.runtime.matching

import com.google.common.collect.LinkedListMultimap
import com.google.common.collect.Multimap
import de.cooperateproject.modeling.textual.xtext.runtime.matching.matcher.ElementMatcher
import de.cooperateproject.modeling.textual.xtext.runtime.matching.provider.CandidatesConfigurationPool
import de.cooperateproject.modeling.textual.xtext.runtime.matching.result.MatchingResult
import java.util.Collection
import java.util.HashMap
import java.util.Map
import java.util.Optional
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import de.cooperateproject.modeling.textual.xtext.runtime.matching.result.Match

abstract class ElementMatchingContext {
   protected val matchTypeRegister = new HashMap<EClass, EClass>
   protected val registeredMatchers = new HashMap<EClass, ElementMatcher<? extends EObject, ? extends EObject>>
   
   val CandidatesConfigurationPool<EObject> rootCandidatesPool
   val Map<Class<?>, CandidatesConfigurationPool<? extends EObject>> filteredPools = new HashMap
   
   val Map<EObject, ElementMatchingInstance<?,?>> existingMatchingInstances = new HashMap
   val Multimap<EObject, MatchingResult<EObject>> matchingResults = LinkedListMultimap.create()
   
   var initialized = false
   
   new(CandidatesConfigurationPool<EObject> rootCandidatesPool) {
      this.rootCandidatesPool = rootCandidatesPool
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
       
       initialElementsToMatch.forEach[evaluator.instantiateElementEvaluation(it)]
       
       while(!evaluator.evaluationFinished) evaluator.evaluateNext
   }
   
   abstract def void initializeMatchers()
   
   def Optional<Collection<MatchingResult<EObject>>> getMatchingResult(EObject matchedElement) {
       if (!matchingResults.containsKey(matchedElement)) Optional.empty
       else {
           Optional.of(matchingResults.get(matchedElement))
       }
   }
   
   private def <L extends EObject, R extends EObject> getMatcherAlternatives(L element) {
        element.getMatcherAlternatives(element.eClass)
   }
   
   private def <L extends EObject, R extends EObject> getMatcherAlternatives(L element, EClass mostSpecializedClass) {
       mostSpecializedClass.EAllSuperTypes.map[registeredMatchers.get(it) as ElementMatcher<L,? extends EObject>]
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
                matcher = element.getMatcherAlternatives(asClass).findFirst[true] 
        }
        if (matcher === null) {
            throw new UnsupportedOperationException('''No compatible Matcher registered for matching «element.eClass.name» as «asClass.name»''')
        } 
        matcher
    }
    
    def <T extends EObject> CandidatesConfigurationPool<T> getCandidatesPool(Class<T> candidatesClass) {
        val result = filteredPools.computeIfAbsent(candidatesClass, [rootCandidatesPool.registerCandidatesSet(candidatesClass)])
        result as CandidatesConfigurationPool<T>  
    }
    
    
    def void appendMatchingResult(MatchingResult result) {
        if (result instanceof Match)
            matchingResults.put(result.element, result)      
    }
    
}