package de.cooperateproject.modeling.textual.component.derivedstate.remover;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.CLEANING;

import de.cooperateproject.modeling.textual.component.cmp.CmpPackage;
import de.cooperateproject.modeling.textual.component.cmp.Port;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * State remover for {@link Port} elements.
 */
@Applicability(applicabilities = CLEANING)
public class PortRemover extends AtomicDerivedStateProcessorBase<Port>{
	
	/**
     * Instantiates the remover.
     */
    public PortRemover() {
        super(Port.class);
    }

    @Override
    protected void applyTyped(Port object) {
        if (object.getReferencedElement() != null) {
//        		object.eUnset(CmpPackage.Literals.PORT__CONJUGATED);
        }
    }

}
