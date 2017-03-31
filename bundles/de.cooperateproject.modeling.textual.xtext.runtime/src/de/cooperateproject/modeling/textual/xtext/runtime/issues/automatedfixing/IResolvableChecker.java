package de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing;

import org.eclipse.emf.ecore.EObject;

@FunctionalInterface
public interface IResolvableChecker<T extends EObject> {

    public boolean isResolvable(T element);

}
