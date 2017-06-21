package de.cooperateproject.modeling.textual.xtext.runtime.matching

interface ElementMatcherApplicationRegisterDelegate { 
    def <L, R> void evaluateBefore(L elementToMatch, Class<R> matchAgainst)
    def <L, R> void evaluate(L elementToMatch, Class<R> matchAgainst)
}