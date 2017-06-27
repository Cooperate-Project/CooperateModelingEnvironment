package de.cooperateproject.modeling.textual.xtext.runtime.matching.matcher

import de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementCandidateSelector
import de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementMatcherApplication
import de.cooperateproject.modeling.textual.xtext.runtime.matching.condition.CollectionMatcherApplicationCondition
import de.cooperateproject.modeling.textual.xtext.runtime.matching.condition.DeferredMatcherApplicationCondition
import de.cooperateproject.modeling.textual.xtext.runtime.matching.condition.DefiniteMatcherApplicationCondition
import de.cooperateproject.modeling.textual.xtext.runtime.matching.condition.ElementMatcherCondition
import de.cooperateproject.modeling.textual.xtext.runtime.matching.condition.ElementPredicateCondition
import de.cooperateproject.modeling.textual.xtext.runtime.matching.condition.MatchExistsCondition
import de.cooperateproject.modeling.textual.xtext.runtime.matching.provider.CandidatesConfigurationProvider
import java.util.function.BiPredicate
import java.util.function.Function
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject

abstract class AbstractElementMatcherBase<LeftType extends EObject, RightType extends EObject> implements ElementMatcher<LeftType, RightType> {
    val EClass leftType
    val EClass rightType
    
    new (EClass leftType, EClass rightType) {
        this.leftType = leftType
        this.rightType = rightType
    }
    
    override acceptsAsLeft(LeftType leftInstance) {
        this.leftType.instanceClass.isAssignableFrom(leftInstance.class)
    }
    
    override acceptsAsRight(EClass rightInstance) {
        this.rightType.instanceClass.isAssignableFrom(rightInstance.instanceClass)
    }
    
    protected def <T extends EObject, U extends EObject> (ElementMatcherApplication<LeftType, RightType>)=>ElementMatcherCondition<LeftType, RightType> is(BiPredicate<LeftType, RightType> condition) {
        [new ElementPredicateCondition(condition, matchingInstance.elementToMatch)]
    }
    
    protected def <T extends EObject, U extends EObject> (ElementMatcherApplication<LeftType, RightType>)=>ElementMatcherCondition<LeftType, RightType> matchAs(EClass clazz) {
        [new DeferredMatcherApplicationCondition(matchingInstance.elementToMatch, clazz)]
    }
    
    protected def <T extends EObject, U extends EObject> (ElementMatcherApplication<LeftType, RightType>)=>ElementMatcherCondition<LeftType, RightType> matches((LeftType)=>T elementToMatch, (RightType)=>U candidateToMatch) {
        [app |
            val provider = app.candidatesProvider as CandidatesConfigurationProvider<RightType>
            val candPool = provider.getDependentCandidatesPool(([r | #[candidateToMatch.apply(r)]]))
            val etm = elementToMatch.apply(app.matchingInstance.elementToMatch)
            new MatchExistsCondition(app.matchingInstance, etm, candPool)
        ]
    }
    
    protected def <T extends EObject, U extends EObject> (ElementMatcherApplication<LeftType, RightType>)=>ElementMatcherCondition<LeftType, RightType> matchExists((LeftType)=>T  elementToMatch, (RightType)=>Iterable<U> candidateToMatch) {
        [app |
            val provider = app.candidatesProvider as CandidatesConfigurationProvider<RightType>
            val candPool = provider.getDependentCandidatesPool(([r | candidateToMatch.apply(r)]))
            val etm = elementToMatch.apply(app.matchingInstance.elementToMatch)
            new MatchExistsCondition(app.matchingInstance, etm, candPool)
        ]
    }
    
    protected def <T extends EObject, U extends EObject> (ElementMatcherApplication<LeftType, RightType>)=>ElementMatcherCondition<LeftType, RightType> matchesExist((LeftType)=>Iterable<T> elementsToMatch, (RightType)=>Iterable<U> candidatesToMatch) {
        [app |
            val provider = app.candidatesProvider as CandidatesConfigurationProvider<RightType>
            val candPool = provider.getDependentCandidatesPool(([r | candidatesToMatch.apply(r)]))
            
            val etm = elementsToMatch.apply(app.matchingInstance.elementToMatch)
            new CollectionMatcherApplicationCondition(app.matchingInstance, etm, candPool)
        ]
    }
    
    protected def <T extends EObject, U extends EObject> (ElementMatcherApplication<LeftType, RightType>)=>ElementMatcherCondition<LeftType, RightType> definiteIf((ElementMatcherApplication<LeftType, RightType>)=>ElementMatcherCondition<LeftType, RightType> matcher) {
        [app |
            new DefiniteMatcherApplicationCondition(matcher.apply(app))
        ]
    }
    
    protected def Function<ElementMatcherApplication<LeftType, RightType>, ElementCandidateSelector<RightType>> definiteIf(BiPredicate<LeftType, RightType> condition) {
        [new ElementCandidateSelector<RightType>() {
            
            override protected matchDefinite(RightType match) {
                condition.test(matchingInstance.elementToMatch, match)
            }
            
            override protected mustMatchDefinite() {
                true
            }
        }]
    }
    
    protected def Function<ElementMatcherApplication<LeftType, RightType>, ElementCandidateSelector<RightType>> mustBe(BiPredicate<LeftType, RightType> condition) {
        [new ElementCandidateSelector<RightType>() {
            override protected match(RightType match) {
                condition.test(matchingInstance.elementToMatch, match)
            }
        }]
    }
    
    
    
}
		