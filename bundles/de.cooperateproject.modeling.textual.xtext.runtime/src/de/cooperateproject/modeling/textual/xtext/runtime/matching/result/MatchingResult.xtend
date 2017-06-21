package de.cooperateproject.modeling.textual.xtext.runtime.matching.result

abstract class MatchingResult<RootType> {
   val RootType element
   
   new (RootType element) {
       this.element = element
   } 
   
   def RootType getElement() {
       element
   } 
}
