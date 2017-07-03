package de.cooperateproject.modeling.textual.xtext.runtime.matching.condition

import com.google.common.collect.Lists
import de.cooperateproject.modeling.textual.xtext.runtime.matching.CandidatesConfiguration
import de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementMatcherApplicationRegisterDelegate
import de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementMatcherApplicationResultDelegate
import de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementMatchingContext
import de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementMatchingInstance
import de.cooperateproject.modeling.textual.xtext.runtime.matching.issues.MatchingIssue
import de.cooperateproject.modeling.textual.xtext.runtime.matching.issues.NoMatchIssue
import de.cooperateproject.modeling.textual.xtext.runtime.matching.provider.CandidatesConfigurationPool
import de.cooperateproject.modeling.textual.xtext.runtime.matching.result.Match
import de.cooperateproject.modeling.textual.xtext.runtime.matching.result.MatchingResultFactory
import de.cooperateproject.modeling.textual.xtext.runtime.matching.result.NoMatch
import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.EObject
import de.cooperateproject.modeling.textual.xtext.runtime.matching.issues.WrongOrderIssue

class CollectionMatcherApplicationCondition<LeftType extends EObject, RightType extends EObject, T extends EObject, U extends EObject> implements ElementMatcherCondition<LeftType, RightType> {
    val ElementMatchingInstance<LeftType, RightType> matchingInstance
    val Iterable<T> leftElements
    val CandidatesConfigurationPool<U> candidatesPool
    val Map<T, ElementMatcherApplicationResultDelegate<T>> resultDelegates = new HashMap
    
    new (ElementMatchingInstance<LeftType, RightType> matchingInstance, Iterable<T> leftElements, CandidatesConfigurationPool<U> candidatesPool) {
        this.matchingInstance = matchingInstance
        this.candidatesPool = candidatesPool
        this.leftElements = leftElements
    }
    
    override evaluate(CandidatesConfiguration<RightType> config) {
        if (!config.candidateChoice.isPresent) {
            MatchingResultFactory.INSTANCE.create(matchingInstance.elementToMatch)
        } else {
            val leftList = Lists.newLinkedList(leftElements)
            val candidatesList = Lists.newLinkedList(candidatesPool.allAvailableCandidates)
            
            val resultingIssues = <MatchingIssue>newArrayList
            
            var T nextLeft = null
            while (!leftList.empty) {
                nextLeft = leftList.head
                
                val res = resultDelegates.get(nextLeft).result
                if (res instanceof Match<?,?>) {
                    val candIdx = candidatesList.indexOf(res.match)
                    
                    if (candIdx != 0 /*leftIdx*/) {
                        val nextCand = candidatesList.get(0)
                        val candLeft = resultDelegates.entrySet.filter[(it.value.result instanceof Match) && ((it.value.result as Match).match == nextCand)].map[key].head
                        
                        if(candLeft === null) {
                            resultingIssues.add(new NoMatchIssue(nextCand))
                            candidatesList.remove(candIdx)    
                        } else {
                            val candLeftIdx = leftList.indexOf(candLeft)
                            resultingIssues.add(new WrongOrderIssue(candLeft, nextCand, candLeftIdx))
                            leftList.remove(candLeftIdx)
                            candidatesList.remove(candIdx)
                        }
                        
                    } else {
                        //Everything is fine
                        leftList.remove(0)        
                        candidatesList.remove(candIdx)
                    }
                } else {
                    resultingIssues.add(new NoMatchIssue((res as NoMatch).element))
                    leftList.remove(0)
                }
                
            }
            MatchingResultFactory.INSTANCE.create(matchingInstance.elementToMatch, config.candidateChoice.get, resultingIssues)
        }
    }
    

    
    private def dispatch createResult(Match<T, U> match, CandidatesConfiguration<RightType> config) {
        MatchingResultFactory.INSTANCE.create(matchingInstance.elementToMatch, config.candidateChoice.get, match.issues)
    }
        
    override prepare(ElementMatcherApplicationRegisterDelegate registerDelegate, ElementMatchingContext context) {
        leftElements.forEach[
            val instance = context.getElementMatchingInstance(it)
            instance.candidatesPool = this.candidatesPool
            resultDelegates.put(it, registerDelegate.evaluate(it))    
        ]
        
    }

}