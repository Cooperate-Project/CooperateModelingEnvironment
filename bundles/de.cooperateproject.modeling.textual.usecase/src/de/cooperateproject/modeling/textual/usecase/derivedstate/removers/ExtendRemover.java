package de.cooperateproject.modeling.textual.usecase.derivedstate.removers;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.CLEANING;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ExtensionPoint;
import org.eclipse.uml2.uml.OpaqueExpression;

import com.google.common.base.Objects;
import com.google.common.base.Strings;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.usecase.derivedstate.initializers.ExtendInitializer;
import de.cooperateproject.modeling.textual.usecase.usecase.Extend;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * State remover for {@link Extend} elements.
 */
@Applicability(applicabilities = CLEANING)
public class ExtendRemover extends AtomicDerivedStateProcessorBase<Extend> {

    /**
     * Instantiates remover.
     */
    public ExtendRemover() {
        super(Extend.class);
    }

    @Override
    protected void applyTyped(Extend object) {
        if (object.getReferencedElement() != null) {
            if (object.getReferencedElement().getExtendedCase() == Optional.ofNullable(object.getExtendedCase())
                    .map(UMLReferencingElement::getReferencedElement).orElse(null)) {
                object.eUnset(UsecasePackage.Literals.EXTEND__EXTENDED_CASE);
            }
            if (object.getReferencedElement().getExtension() == Optional.ofNullable(object.getExtension())
                    .map(UMLReferencingElement::getReferencedElement).orElse(null)) {
                object.eUnset(UsecasePackage.Literals.EXTEND__EXTENSION);
            }

            Optional<ExtensionPoint> umlExtensionLocation = Optional.ofNullable(object.getExtensionLocation())
                    .map(UMLReferencingElement::getReferencedElement);
            if (!umlExtensionLocation.isPresent()
                    || Optional.ofNullable(object.getReferencedElement().getExtensionLocations())
                            .map(locations -> locations.contains(umlExtensionLocation.get())).orElse(false)) {
                object.eUnset(UsecasePackage.Literals.EXTEND__EXTENSION_LOCATION);
            }

            if (Optional.ofNullable(object.getReferencedElement().getCondition()).map(Constraint::getSpecification)
                    .filter(OpaqueExpression.class::isInstance).map(OpaqueExpression.class::cast)
                    .map(ExtendRemover::getConstraintLanguageBodies)
                    .map(m -> m.getOrDefault(ExtendInitializer.CONDITION_LANGUAGE_NAME, null))
                    .map(b -> Objects.equal(b, object.getCondition())).orElse(false)) {
                object.eUnset(UsecasePackage.Literals.EXTEND__CONDITION);
            } else if (Strings.isNullOrEmpty(object.getCondition()) && undergoesAutomatedIssueResolution(object)) {
                object.setCondition(null);
            }
        }
    }

    private static Map<String, String> getConstraintLanguageBodies(OpaqueExpression e) {
        Map<String, String> result = new HashMap<>();
        for (int i = 0; i < e.getLanguages().size(); ++i) {
            result.put(e.getLanguages().get(i), e.getBodies().get(i));
        }
        return result;
    }

}
