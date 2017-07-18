package de.cooperateproject.modeling.textual.usecase.derivedstate.initializers;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.INITIALIZATION;

import java.util.Optional;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.ExtensionPoint;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.ValueSpecification;

import com.google.common.base.Strings;

import de.cooperateproject.modeling.textual.common.util.UMLReferencingElementFinder;
import de.cooperateproject.modeling.textual.usecase.usecase.Extend;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * State initializer for {@link Extend} elements.
 */
@Applicability(applicabilities = INITIALIZATION)
public class ExtendInitializer extends AtomicDerivedStateProcessorBase<Extend> {

    public static final String CONDITION_LANGUAGE_NAME = "Natural language";

    /**
     * Instantiates the initializer.
     */
    public ExtendInitializer() {
        super(Extend.class);
    }

    @Override
    protected void applyTyped(Extend object) {
        if (object.getReferencedElement() != null) {
            org.eclipse.uml2.uml.Extend umlExtend = object.getReferencedElement();
            if (Strings.isNullOrEmpty(object.getCondition())) {
                initCondition(object, umlExtend);
            }
            if (object.getExtendedCase() == null) {
                initExtendedCase(object, umlExtend);
            }
            if (object.getExtension() == null) {
                initExtension(object, umlExtend);
            }
            if (object.getExtensionLocation() == null) {
                initExtensionLocation(object, umlExtend);
            }
        }
    }

    private static void initExtensionLocation(Extend object, org.eclipse.uml2.uml.Extend umlExtend) {
        UMLReferencingElementFinder finder = UMLReferencingElementFinder.create(EcoreUtil.getRootContainer(object));
        Optional<ExtensionPoint> umlExtensionPoint = umlExtend.getExtensionLocations().stream().findFirst();
        if (umlExtensionPoint.isPresent()) {
            finder.findElement(umlExtensionPoint.get(),
                    de.cooperateproject.modeling.textual.usecase.usecase.ExtensionPoint.class)
                    .ifPresent(object::setExtensionLocation);
        }
    }

    private static void initExtension(Extend object, org.eclipse.uml2.uml.Extend umlExtend) {
        UseCase umlExtension = umlExtend.getExtension();
        UMLReferencingElementFinder finder = UMLReferencingElementFinder.create(EcoreUtil.getRootContainer(object));
        finder.findElement(umlExtension, de.cooperateproject.modeling.textual.usecase.usecase.UseCase.class)
                .ifPresent(object::setExtension);
    }

    private static void initExtendedCase(Extend object, org.eclipse.uml2.uml.Extend umlExtend) {
        UseCase umlExtendedCase = umlExtend.getExtendedCase();
        UMLReferencingElementFinder finder = UMLReferencingElementFinder.create(EcoreUtil.getRootContainer(object));
        finder.findElement(umlExtendedCase, de.cooperateproject.modeling.textual.usecase.usecase.UseCase.class)
                .ifPresent(object::setExtendedCase);
    }

    private static void initCondition(Extend object, org.eclipse.uml2.uml.Extend umlExtend) {
        ValueSpecification valueSpecification = umlExtend.getCondition().getSpecification();
        if (valueSpecification instanceof OpaqueExpression) {
            OpaqueExpression expression = (OpaqueExpression) valueSpecification;
            int bodyIndex = expression.getLanguages().indexOf(CONDITION_LANGUAGE_NAME);
            if (bodyIndex != -1 && expression.getBodies().size() > bodyIndex) {
                String conditionString = expression.getBodies().get(bodyIndex);
                object.setCondition(conditionString);
            }
        }
    }

}
