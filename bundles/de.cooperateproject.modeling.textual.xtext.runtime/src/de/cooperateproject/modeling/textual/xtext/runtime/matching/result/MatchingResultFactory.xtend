package de.cooperateproject.modeling.textual.xtext.runtime.matching.result

import de.cooperateproject.modeling.textual.xtext.runtime.matching.issues.MatchingIssue
import java.util.LinkedList
import org.eclipse.emf.ecore.EObject
import java.util.Collections

class MatchingResultFactory {
    public static val INSTANCE = new MatchingResultFactory
    
   def <T extends EObject, R extends EObject> Match<T, R> createDefinite(T element, R match) {
       return new DefiniteMatch(element, match)
   }
   
   def <T extends EObject, R extends EObject> Match<T, R> createDefinite(T element, R match, Iterable<MatchingIssue> issues) {
       return new DefiniteMatch(element, match, issues)
   }
   
   def <T extends EObject, R extends EObject> MatchingResult<T> create(T element) {
       this.create(element, null, Collections.emptyList)
   }
   
   def <T extends EObject, R extends EObject> MatchingResult<T> create(T element, R match) {
       this.create(element, match, Collections.emptyList)
   } 
   
   def <T extends EObject, R extends EObject> MatchingResult<T> create(T element, R match, Iterable<MatchingIssue> issues) {
       if (match === null) new NoMatch(element)
       else new Match(element, match, issues)
   }
   
   def <T extends EObject, R extends EObject> MatchingResult<T> wrap(Iterable<MatchingResult<T>> nestedResults) {
       val definiteMatches = new LinkedList<DefiniteMatch<T, R>>
       val matches = new LinkedList<Match<T, R>>
       val issues = new LinkedList<MatchingIssue>
       val noMatches = new LinkedList<MatchingResult<T>>
       nestedResults.forEach[
           switch(it) {
               DefiniteMatch: {
                   definiteMatches.add(it)
                   if (it.hasIssues) issues.addAll(it.issues)
               }
               Match: {
                   matches.add(it)
                   if (it.hasIssues) issues.addAll(it.issues)
               }
               NoMatch: noMatches.add(it)
           }
       ]
       
       if (!noMatches.empty && definiteMatches.empty && matches.empty) {
           new NoMatch(noMatches.head.element)
       } else if (!definiteMatches.empty) {
           new DefiniteMatch(definiteMatches.head.element, definiteMatches.head.match, issues)
       } else if (!matches.empty) {
           new Match(matches.head.element, matches.head.match, issues)
       }       
   }
   
   
}
