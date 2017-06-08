package de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer;

import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.AliasedEObjectDescription;

import com.google.common.base.Predicates;
import com.google.common.collect.Sets;
import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IGlobalScopeTypeQueryProvider;

public abstract class AtomicMappingEstablishingProcessorBase<T extends EObject>
        extends AtomicDerivedStateProcessorBase<T> {

    @Inject
    protected IQualifiedNameProvider qualifiedNameProvider;

    @Inject
    protected IGlobalScopeTypeQueryProvider globalScopeProvider;

    public AtomicMappingEstablishingProcessorBase(Class<T> clazz) {
        super(clazz);
    }

    @SuppressWarnings("unchecked")
    protected <UMLType> Collection<UMLType> getReferenceCandidates(T object) {
        Collection<IEObjectDescription> foundElements = Sets.newHashSet(globalScopeProvider
                .queryScope(object.eResource(), true, this.getReferencedType(object), Predicates.alwaysTrue())
                .getAllElements());

        Predicate<IEObjectDescription> foundElementsFilter = this.getFoundElementsFilter(object);

        return foundElements.stream().filter(foundElementsFilter).map(IEObjectDescription::getEObjectOrProxy).distinct()
                .map(e -> ((UMLType) e)).collect(Collectors.toList());
    }

    protected Predicate<IEObjectDescription> getFoundElementsFilter(T object) {
        QualifiedName qn = qualifiedNameProvider.getFullyQualifiedName(object);
        if (qn == null) {
            return e -> false;
        }
        return e -> descriptionMatchesQualifiedName(qn, e);
    }

    protected EClass getReferencedType(T object) {
        return (EClass) object.eClass().getFeatureType(this.getReferenceFeature()).getEClassifier();
    }

    abstract protected EStructuralFeature getReferenceFeature();

    static boolean descriptionMatchesQualifiedName(QualifiedName name, IEObjectDescription description) {
        if (description instanceof AliasedEObjectDescription) {
            if (description.getName().equals(name)) {
                return true;
            }
        }
        return description.getQualifiedName().equals(name);
    }

}
