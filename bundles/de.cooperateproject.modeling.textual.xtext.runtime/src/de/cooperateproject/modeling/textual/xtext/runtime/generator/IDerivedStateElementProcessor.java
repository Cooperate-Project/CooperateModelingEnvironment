package de.cooperateproject.modeling.textual.xtext.runtime.generator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

public interface IDerivedStateElementProcessor {
    boolean isCompatibleWith(EPackage ePackage);

    void processElement(EObject object);
}
