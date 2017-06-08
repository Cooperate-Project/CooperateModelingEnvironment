package de.cooperateproject.modeling.textual.cls.derivedstate.initializer;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.INITIALIZATION;

import java.util.Arrays;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Classifier;

import de.cooperateproject.modeling.textual.cls.cls.Generalization;
import de.cooperateproject.modeling.textual.cls.cls.TypedConnector;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * Initializes the state of {@link Generalization} elements.
 */
@Applicability(applicabilities = INITIALIZATION)
public class GeneralizationInitializer extends AtomicDerivedStateProcessorBase<Generalization>
        implements TypedConnectorInitializerMixin {

    private static final Logger LOGGER = Logger.getLogger(GeneralizationInitializer.class);

    /**
     * Instantiates the initializer.
     */
    public GeneralizationInitializer() {
        super(Generalization.class);
    }

    @Override
    protected void applyTyped(Generalization object) {
        if (object.getLeft() != null && object.getRight() != null && object.getReferencedElement() != null) {
            org.eclipse.uml2.uml.Generalization umlGeneralization = object.getReferencedElement();
            Classifier specific = umlGeneralization.getSpecific();
            Classifier general = umlGeneralization.getGeneral();
            initTypedConnector(object, specific, general, LOGGER);
        }
    }

    @Override
    public Collection<Class<? extends EObject>> getReplacements() {
        return Arrays.asList(TypedConnector.class);
    }

}
