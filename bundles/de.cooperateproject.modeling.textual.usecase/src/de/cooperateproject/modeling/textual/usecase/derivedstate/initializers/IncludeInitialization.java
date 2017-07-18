package de.cooperateproject.modeling.textual.usecase.derivedstate.initializers;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.INITIALIZATION;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.cooperateproject.modeling.textual.common.util.UMLReferencingElementFinder;
import de.cooperateproject.modeling.textual.usecase.usecase.Include;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * Initializes state of {@link Include} elements.
 */
@Applicability(applicabilities = INITIALIZATION)
public class IncludeInitialization extends AtomicDerivedStateProcessorBase<Include> {

    /**
     * Instantiates the initializer.
     */
    public IncludeInitialization() {
        super(Include.class);
    }

    @Override
    protected void applyTyped(Include object) {
        if (object.getReferencedElement() != null) {
            UMLReferencingElementFinder finder = UMLReferencingElementFinder.create(EcoreUtil.getRootContainer(object));
            if (object.getIncludingCase() == null) {
                finder.findElement(object.getReferencedElement().getIncludingCase(),
                        de.cooperateproject.modeling.textual.usecase.usecase.UseCase.class)
                        .ifPresent(object::setIncludingCase);
            }
            if (object.getAddition() == null) {
                finder.findElement(object.getReferencedElement().getAddition(),
                        de.cooperateproject.modeling.textual.usecase.usecase.UseCase.class)
                        .ifPresent(object::setAddition);
            }
        }
    }

}
