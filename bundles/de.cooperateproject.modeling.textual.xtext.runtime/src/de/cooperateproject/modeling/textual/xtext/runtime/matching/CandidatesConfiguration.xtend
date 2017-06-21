package de.cooperateproject.modeling.textual.xtext.runtime.matching

interface CandidatesConfiguration<RightType> {
   def RightType getCandidateChoice()
   
   def Iterable<RightType> getRemainingCandidates()
   
   def Iterable<RightType> getAllRemainingCandidates() 
}