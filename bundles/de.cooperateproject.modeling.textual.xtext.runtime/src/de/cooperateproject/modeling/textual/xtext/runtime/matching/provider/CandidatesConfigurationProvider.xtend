package de.cooperateproject.modeling.textual.xtext.runtime.matching.provider

import de.cooperateproject.modeling.textual.xtext.runtime.matching.CandidatesConfiguration
import de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementCandidateSelector
import java.util.HashMap
import java.util.Iterator
import java.util.Map
import java.util.NoSuchElementException
import java.util.function.Function

abstract class CandidatesConfigurationProvider<RightType> implements Iterator<CandidatesConfiguration<RightType>> {
    val Class<RightType> typeOfCandidates
    var ElementCandidateSelector<RightType> selector = null
    
    val Map<RightType, CandidatesConfiguration<RightType>> selectedChoices = new HashMap
    var CandidatesConfiguration<RightType> nextVal = null
    var CandidatesConfiguration<RightType> currentVal = null
    
    protected new (CandidatesConfigurationProvider<RightType> continueFrom) {
        this.typeOfCandidates = continueFrom.typeOfCandidates
    }
    
    new (Class<RightType> typeOfCandidates) {
        this.typeOfCandidates = typeOfCandidates
    }
    
    def initialize(ElementCandidateSelector<RightType> selector) {
        if (this.selector !== null) throw new IllegalStateException("The provider is already initialized.")
        this.selector = selector
    }
    
    override hasNext() {
        if (nextVal === null) {
            val candidates = this.availableCandidates
            val selected = candidates.findFirst[!selectedChoices.containsKey(it)]
            this.nextVal = if(selected !== null) {
                new CandidatesConfiguration<RightType>() {    
                    override getCandidateChoice() {
                        selected
                    }
                    
                    override getRemainingCandidates() {
                        candidates.filter[it != selected]
                    }
                    
                    override getAllRemainingCandidates() {
                        internalAllCandidates.filter[it != selected]
                    }
                    
                }
            } else null        
        }
        nextVal !== null
    }
    
    override next() {
        if (this.nextVal === null && !hasNext) throw new NoSuchElementException  
        currentVal = nextVal
        nextVal = null
        currentVal
    }
    
    def CandidatesConfiguration<RightType> getCurrentConfiguration() {
        currentVal
    }
    
    def Class<RightType> getTypeOfCandidates() {
        typeOfCandidates
    }
    
    def CandidatesConfigurationProvider<RightType> continueProvider() {
        assertInitialized
        null
    }
    
    def <T> CandidatesConfigurationProvider<T> getDependentCandidatesProvider(Function<RightType, Iterable<T>> candidateGetter, Class<T> candidateType) {
        assertInitialized 
        null
    }
        
    protected def Iterable<RightType> getAvailableCandidates() {
        selector.getCandidates(internalCandidates).value
    }
    
    abstract def protected Iterable<RightType> internalCandidates()
    
    def protected Iterable<RightType> internalAllCandidates() {
        internalCandidates
    } 
    
    private def void assertInitialized() {
        if (this.selector === null) throw new IllegalStateException("The provider is not initialized.")
    }
}
