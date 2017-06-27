package de.cooperateproject.modeling.textual.xtext.runtime.matching

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EClass

interface ElementMatcherApplicationRegisterDelegate { 
    def <L extends EObject> ElementMatcherApplicationResultDelegate<L> evaluate(L instanceToMatch)
    def <L extends EObject> ElementMatcherApplicationResultDelegate<L> evaluateAs(L instanceToMatch, EClass leftType)
}