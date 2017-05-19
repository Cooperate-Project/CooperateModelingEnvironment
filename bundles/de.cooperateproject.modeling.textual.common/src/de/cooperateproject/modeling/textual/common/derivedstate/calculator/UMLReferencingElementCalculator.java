package de.cooperateproject.modeling.textual.common.derivedstate.calculator;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;

import com.google.common.base.Predicates;
import com.google.common.collect.Sets;
import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.AtomicStateProcessorExtensionBase;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IGlobalScopeTypeQueryProvider;

/**
 * State calculation for {@link UMLReferencingElement}.
 */
public class UMLReferencingElementCalculator extends AtomicStateProcessorExtensionBase<UMLReferencingElement<Element>> {

    @Inject
    private IQualifiedNameProvider qualifiedNameProvider;

    @Inject
    private IGlobalScopeTypeQueryProvider globalScopeProvider;

    /**
     * Constructs the calculator.
     */
    @SuppressWarnings("unchecked")
    public UMLReferencingElementCalculator() {
        super((Class<UMLReferencingElement<Element>>) (Class<?>) UMLReferencingElement.class);
    }

    @Override
    protected Boolean applyTyped(UMLReferencingElement<Element> object) {
        QualifiedName qn = qualifiedNameProvider.getFullyQualifiedName(object);
        if (qn == null) {
            return false;
        }

        EGenericType requiredType = object.eClass()
                .getFeatureType(TextualCommonsPackage.eINSTANCE.getUMLReferencingElement_ReferencedElement());
        Collection<IEObjectDescription> foundElements = Sets.newHashSet(globalScopeProvider
                .queryScope(object.eResource(), true, (EClass) requiredType.getEClassifier(), Predicates.alwaysTrue())
                .getAllElements());

        List<EObject> matchingElements = foundElements.stream().filter(d -> qn.equals(d.getQualifiedName()))
                .map(IEObjectDescription::getEObjectOrProxy).distinct().collect(Collectors.toList());
        if (matchingElements.size() == 1) {
            object.setReferencedElement((Element) matchingElements.get(0));
        } else {
            object.setReferencedElement(null);
        }
        return true;
    }

}
