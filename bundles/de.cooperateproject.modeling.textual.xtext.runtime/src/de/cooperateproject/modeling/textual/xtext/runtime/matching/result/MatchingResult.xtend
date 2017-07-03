package de.cooperateproject.modeling.textual.xtext.runtime.matching.result

import org.eclipse.emf.ecore.EObject

abstract class MatchingResult<RootType extends EObject> {
   val RootType element
   
   new (RootType element) {
       this.element = element
   } 
   
   def RootType getElement() {
       element
   }
}
