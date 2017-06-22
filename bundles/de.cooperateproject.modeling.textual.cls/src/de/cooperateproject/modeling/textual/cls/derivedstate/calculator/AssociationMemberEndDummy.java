package de.cooperateproject.modeling.textual.cls.derivedstate.calculator;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.CALCULATION;
import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.CLEANING;
import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.INITIALIZATION;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * Dummy processor for AssociationMemberEnd elements.
 * 
 * This processor basically does nothing and prevents other processors from processing the AssociationMemberEnd.
 * AssociationMemberEnd elements are already processed by {@link XtextAssociationCalculator}.
 */
@Applicability(applicabilities = { INITIALIZATION, CALCULATION, CLEANING })
public class AssociationMemberEndDummy extends AtomicDerivedStateProcessorBase<AssociationMemberEnd> {

    /**
     * Constructs the processor.
     */
    public AssociationMemberEndDummy() {
        super(AssociationMemberEnd.class);
    }

    @Override
    protected void applyTyped(AssociationMemberEnd object) {
        // intentionally do nothing
        return;
    }

    @Override
    public Collection<Class<? extends EObject>> getReplacements() {
        return Arrays.asList(UMLReferencingElement.class);
    }

}
