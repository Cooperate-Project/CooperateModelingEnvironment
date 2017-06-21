package de.cooperateproject.modeling.textual.xtext.runtime.matching.matcher

import de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementCandidateSelector
import de.cooperateproject.modeling.textual.xtext.runtime.matching.condition.ElementMatcherCondition
import de.cooperateproject.modeling.textual.xtext.runtime.matching.condition.ElementPredicateCondition
import java.util.function.BiPredicate
import java.util.function.Function
import java.util.function.Predicate
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature

abstract class AbstractElementMatcherBase<LeftType extends EObject, RightType> implements ElementMatcher<LeftType, RightType> {
    val Class<LeftType> leftType
    val Class<RightType> rightType
    
    new (Class<LeftType> leftType, Class<RightType> rightType) {
        this.leftType = leftType
        this.rightType = rightType
    }
    
    override isMatcherFor(Class<?> leftType, Class<?> rightType) {
        this.leftType.isAssignableFrom(leftType)
            && this.rightType.isAssignableFrom(rightType)
    }
    
    protected def Function<LeftType, ElementMatcherCondition<LeftType, RightType>> is(BiPredicate<LeftType, RightType> condition) {
        [new ElementPredicateCondition(condition, it)]
    }
    
    protected def <T, U> Function<LeftType, ElementMatcherCondition<LeftType, RightType>> matchAs(EClass clazz) {
    }
    
    protected def <T, U> Function<LeftType, ElementMatcherCondition<LeftType, RightType>> matches(Function<LeftType, T> elementToMatch, Function<RightType, U> canditateToMatch) {
    }
    
    protected def <T, U> Function<LeftType, ElementMatcherCondition<LeftType, RightType>> matchExists(Function<LeftType, T> elementToMatch, Function<RightType, Iterable<U>> canditateToMatch) {
    }
    
    protected def <T, U> Function<LeftType, ElementMatcherCondition<LeftType, RightType>> matchExists(Function<LeftType, T> elementToMatch, Class<U> candidateType, Predicate<U> candidateFilter) {
    }
    
    protected def Function<LeftType, ElementMatcherCondition<LeftType, RightType>> defer(EStructuralFeature feature) {   
    }
    
    protected def <T, U> Function<LeftType, ElementMatcherCondition<LeftType, RightType>>definiteIf(Iterable<Function<LeftType, ElementMatcherCondition<LeftType, RightType>>> matcher) {
        
    }
    
    protected def <T, U> Function<LeftType, ElementMatcherCondition<LeftType, RightType>> definiteIf(Function<LeftType, ElementMatcherCondition<LeftType, RightType>> matcher) {
        
    }
    
    protected def Function<LeftType, ElementCandidateSelector<RightType>> id(BiPredicate<LeftType, RightType> condition) {
        [new ElementCandidateSelector<RightType>() {
            
            override protected matchDefinite(RightType match) {
                condition.test(it, match)
            }
            
            override protected mustMatchDefinite() {
                true
            }
        }]
    }
    
    protected def Function<LeftType, ElementCandidateSelector<RightType>> must(BiPredicate<LeftType, RightType> condition) {
        [new ElementCandidateSelector<RightType>() {
            override protected match(RightType match) {
                condition.test(it, match)
            }
        }]
    }
    
    
    
}
		