package de.cooperateproject.modeling.textual.xtext.runtime.matching.result

import de.cooperateproject.modeling.textual.xtext.runtime.matching.issues.MatchingIssue
import java.util.LinkedList

class MatchingResultFactory {
    public static val INSTANCE = new MatchingResultFactory
    
   def <T, R> SuccessfulMatch<T, R> createDefinite(T element, R match) {
       return new DefiniteMatch(element, match)
   }
   
   def <T, R> SuccessfulMatch<T, R> createDefinite(T element, R match, Iterable<MatchingIssue> issues) {
       return new DefiniteMatch(element, match, issues)
   }
   
   def <T, R> MatchingResult<T> create(T element, R match) {
       this.create(element, match, null)
   } 
   
   def <T, R> MatchingResult<T> create(T element, R match, Iterable<MatchingIssue> issues) {
       if (match === null) new NoMatch(element)
       else new SuccessfulMatch(element, match, issues)
   }
   
   def <T, R> MatchingResult<T> wrap(Iterable<MatchingResult<T>> nestedResults) {
       val definiteMatches = new LinkedList<DefiniteMatch<T, R>>
       val matches = new LinkedList<SuccessfulMatch<T, R>>
       val issues = new LinkedList<MatchingIssue>
       val noMatches = new LinkedList<MatchingResult<T>>
       nestedResults.forEach[
           switch(it) {
               DefiniteMatch: {
                   definiteMatches.add(it)
                   if (it.hasIssues) issues.addAll(it.issues)
               }
               SuccessfulMatch: {
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
           new SuccessfulMatch(matches.head.element, matches.head.match, issues)
       }       
   }
   
   
}
