package de.cooperateproject.modeling.textual.cls.derivedstate.initializer;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.INITIALIZATION;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Stereotype;

import de.cooperateproject.modeling.textual.cls.cls.Class;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.StereotypeApplication;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsFactory;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * State initializer for {@link Class} elements.
 */
@Applicability(applicabilities = INITIALIZATION)
public class ClassInitializer
        extends AtomicDerivedStateProcessorBase<de.cooperateproject.modeling.textual.cls.cls.Class> {

    /**
     * Constructs the initializer.
     */
    public ClassInitializer() {
        super(de.cooperateproject.modeling.textual.cls.cls.Class.class);
    }

    @Override
    protected void applyTyped(Class object) {
        if (!object.isSetAbstract() && object.getReferencedElement() != null) {
            object.setAbstract(object.getReferencedElement().isAbstract());
        }

        if (!object.isSetAppliedStereotypes() && object.getReferencedElement() != null) {
            EList<Stereotype> appliedStereotypes = object.getReferencedElement().getAppliedStereotypes();
            for (Stereotype stereotype : appliedStereotypes) {
                StereotypeApplication textualApplication = TextualCommonsFactory.eINSTANCE
                        .createStereotypeApplication();
                textualApplication.setStereotype(stereotype.getName());
                EObject stereoApp = object.getReferencedElement().getStereotypeApplication(stereotype);
                textualApplication.setReferencedElement(stereoApp);
                object.getAppliedStereotypes().add(textualApplication);
            }

        }
    }

}
