package de.cooperateproject.modeling.textual.cls.derivedstate.calculator;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

import com.google.common.collect.Sets;
import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.cls.cls.Package;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IGlobalScopeTypeQueryProvider;

/**
 * State calculation for the Root{@link Package}.
 */
@Applicability(applicabilities = DerivedStateProcessorApplicability.CALCULATION)
public class RootPackageCalculator extends AtomicDerivedStateProcessorBase<Package> {

    @Inject
    private IQualifiedNameProvider qualifiedNameProvider;

    @Inject
    private IGlobalScopeTypeQueryProvider globalScopeProvider;

    /**
     * Constructs the calculator.
     */
    public RootPackageCalculator() {
        super(Package.class);
    }

    @Override
    public Collection<Class<? extends EObject>> getRequirements() {
        return Arrays.asList(UMLReferencingElement.class);
    }

    @Override
    protected void applyTyped(Package object) {
        QualifiedName qn = qualifiedNameProvider.getFullyQualifiedName(object);
        if (qn == null) {
            IScope queryScope = globalScopeProvider.queryScope(object.eResource(), true, (UMLPackage.Literals.MODEL),
                    model -> model.getEObjectOrProxy().eContainer() == null);
            Collection<IEObjectDescription> foundElements = Sets.newHashSet(queryScope.getAllElements());

            EObject element = foundElements.stream().findFirst().get().getEObjectOrProxy();
            if (element != object.getReferencedElement() && element instanceof Model) {
                object.setReferencedElement((Model) element);
            }
        }
    }

}
