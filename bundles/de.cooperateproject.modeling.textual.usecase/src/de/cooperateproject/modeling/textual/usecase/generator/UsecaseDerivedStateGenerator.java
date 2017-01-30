package de.cooperateproject.modeling.textual.usecase.generator;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

import com.google.common.base.Predicates;
import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.usecase.usecase.UMLReferencingElement;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;
import de.cooperateproject.modeling.textual.usecase.usecase.util.UsecaseSwitch;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IGlobalScopeTypeQueryProvider;

public class UsecaseDerivedStateGenerator implements IDerivedStateComputer {

    @Inject
    private IQualifiedNameProvider qualifiedNameProvider;

    @Inject
    private IGlobalScopeTypeQueryProvider globalScopeProvider;

    private final UsecaseStateCalculator calculator = new UsecaseStateCalculator();

    @Override
    public void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
        if (preLinkingPhase) {
            return;
        }
        for (TreeIterator<EObject> iter = resource.getAllContents(); iter.hasNext();) {
            EObject o = iter.next();
            if (!calculator.doSwitch(o)) {
                iter.prune();
            }
        }
    }

    @Override
    public void discardDerivedState(DerivedStateAwareResource resource) {

        return;
        // TODO Auto-generated method stub

    }

    private class UsecaseStateCalculator extends UsecaseSwitch<Boolean> {

        @Override
        public Boolean defaultCase(EObject object) {
            return true;
        }

        @Override
        public <UMLType extends Element> Boolean caseUMLReferencingElement(UMLReferencingElement<UMLType> object) {
            QualifiedName qn = qualifiedNameProvider.getFullyQualifiedName(object);

            Set<EClass> requiredTypes = object.eClass().getEGenericSuperTypes().stream()
                    .filter(t -> t.getEClassifier() == UsecasePackage.Literals.UML_REFERENCING_ELEMENT)
                    .map(EGenericType::getETypeArguments).flatMap(EList::stream).map(EGenericType::getEClassifier)
                    .filter(EClass.class::isInstance).map(EClass.class::cast).collect(Collectors.toSet());
            Set<IEObjectDescription> foundElements = requiredTypes.stream()
                    .map(t -> globalScopeProvider.queryScope(object.eResource(), true, t, Predicates.alwaysTrue()))
                    .map(IScope::getAllElements).flatMap(c -> StreamSupport.stream(c.spliterator(), false))
                    .collect(Collectors.toSet());

            List<EObject> matchingElements = foundElements.stream().filter(d -> qn.equals(d.getQualifiedName()))
                    .map(IEObjectDescription::getEObjectOrProxy).distinct().collect(Collectors.toList());
            if (matchingElements.size() == 1) {
                object.setReferencedElement((UMLType) matchingElements.get(0));
                return true;
            }

            return super.caseUMLReferencingElement(object);
        }

    }

}
