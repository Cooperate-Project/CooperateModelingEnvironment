package de.cooperateproject.modeling.textual.xtext.runtime.matching

import java.util.Set
import com.google.common.base.Objects
import java.util.Optional

abstract class CandidatesConfiguration<RightType> {
   def Optional<RightType> getCandidateChoice()
   
   def Set<RightType> getRemainingCandidates()
   
    override equals(Object obj) {
        if (obj instanceof CandidatesConfiguration<?>) {
            obj.candidateChoice == this.candidateChoice
            && obj.remainingCandidates == this.remainingCandidates
        }
        else false
    }
    
    override hashCode() {
        return Objects.hashCode(candidateChoice, remainingCandidates)    
    }
    
}