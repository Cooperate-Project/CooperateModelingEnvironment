package de.cooperateproject.modeling.textual.xtext.runtime.matching.provider

import de.cooperateproject.modeling.textual.xtext.runtime.matching.CandidatesConfiguration
import de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementCandidateSelector
import java.util.HashMap
import java.util.Map
import java.util.NoSuchElementException
import org.eclipse.emf.ecore.EObject

class CandidatesConfigurationProvider<CandidatesType extends EObject> {
    val ElementCandidateSelector<CandidatesType> selector
    val CandidatesConfigurationPool<CandidatesType> pool
    
    val Map<CandidatesType, CandidatesConfiguration<CandidatesType>> selectedChoices = new HashMap
    var CandidatesConfiguration<CandidatesType> nextVal = null
    var CandidatesConfiguration<CandidatesType> currentVal = null
    
    new (CandidatesConfigurationPool<CandidatesType> pool) {
        this(ElementCandidateSelector.DEFAULT_SELECTOR.apply(null), pool)
    }
    
    new (ElementCandidateSelector<CandidatesType> selector, CandidatesConfigurationPool<CandidatesType> pool) {
        this.selector = selector
        this.pool = pool
    }
    
    def hasNext(EObject forCandidate) {
        if (nextVal === null) {
            this.candidatesPool.unregisterTemporary(forCandidate, currentVal.candidateChoice, this)
            val candidates = this.availableCandidates
            val selected = candidates.findFirst[!selectedChoices.containsKey(it)]
            this.nextVal = if(selected !== null) {
                new CandidatesConfiguration<CandidatesType>() {    
                    override getCandidateChoice() {
                        selected
                    }
                    
                    override getRemainingCandidates() {
                        candidates.filter[it != selected]
                    }
                    
                }
            } else null
            this.candidatesPool.registerTemporary(forCandidate, currentVal.candidateChoice, this)        
        }
        nextVal !== null
    }
    
    def next(EObject forCandidate) {
        if (this.nextVal === null && !hasNext(forCandidate)) throw new NoSuchElementException  
        this.candidatesPool.unregisterTemporary(forCandidate, currentVal.candidateChoice, this)
        currentVal = nextVal
        this.candidatesPool.registerTemporary(forCandidate, currentVal.candidateChoice, this)  
        nextVal = null
        currentVal
    }
    
    def CandidatesConfiguration<CandidatesType> getCurrentConfiguration() {
        currentVal
    }
    
    def <T extends EObject> CandidatesConfigurationPool<T> getDependentCandidatesPool((CandidatesType) => Iterable<T> candidateGetter) {
        ConfigurationProviderDependentCandidatesPool.createDependentConfigurationPool(this, candidateGetter)
    }
        
    protected def Iterable<CandidatesType> getAvailableCandidates() {
        selector.getCandidates(this.candidatesPool.availableCandidates).value
    }
    
    def CandidatesConfigurationPool<CandidatesType> getCandidatesPool() {
        pool
    }
}
