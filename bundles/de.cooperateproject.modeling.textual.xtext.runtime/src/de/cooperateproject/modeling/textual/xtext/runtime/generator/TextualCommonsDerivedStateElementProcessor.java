package de.cooperateproject.modeling.textual.xtext.runtime.generator;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.util.TextualCommonsSwitch;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IGlobalScopeTypeQueryProvider;

public class TextualCommonsDerivedStateElementProcessor extends TextualCommonsSwitch<Optional<Void>>
        implements IDerivedStateElementProcessor {

    @Inject
    private IQualifiedNameProvider qualifiedNameProvider;

    @Inject
    private IGlobalScopeTypeQueryProvider globalScopeProvider;

    @Override
    public Optional<Void> caseComment(Comment object) {

        if (TextualCommonsPackage.eINSTANCE.getUMLReferencingElement().isInstance(object.getCommentedElement())) {
            @SuppressWarnings("unchecked")
            UMLReferencingElement<? extends org.eclipse.uml2.uml.Classifier> realElement = (UMLReferencingElement<? extends Classifier>) object
                    .getCommentedElement();

            if (realElement != null) {
                Element umlCommentedElement = realElement.getReferencedElement();

                IScope candidates = globalScopeProvider.queryScope(object.eResource(), true,
                        UMLPackage.Literals.COMMENT,
                        c -> ((org.eclipse.uml2.uml.Comment) c.getEObjectOrProxy()).getAnnotatedElements()
                                .contains(umlCommentedElement)
                                && ((org.eclipse.uml2.uml.Comment) c.getEObjectOrProxy()).getBody()
                                        .equals(object.getBody()));
                Iterable<org.eclipse.uml2.uml.Comment> typedCandidates = Iterables.transform(
                        candidates.getAllElements(), e -> (org.eclipse.uml2.uml.Comment) e.getEObjectOrProxy());
                if (Iterables.size(typedCandidates) == 1) {
                    object.setReferencedElement(Iterables.getFirst(typedCandidates, null));
                }
            }
        }
        return Optional.empty();
    }

    @Override
    public <UMLType extends Element> Optional<Void> caseUMLReferencingElement(UMLReferencingElement<UMLType> object) {
        QualifiedName qn = qualifiedNameProvider.getFullyQualifiedName(object);
        if (qn == null) {
            return Optional.empty();
        }

        EGenericType requiredType = object.eClass()
                .getFeatureType(TextualCommonsPackage.eINSTANCE.getUMLReferencingElement_ReferencedElement());
        Collection<IEObjectDescription> foundElements = Sets.newHashSet(globalScopeProvider
                .queryScope(object.eResource(), true, (EClass) requiredType.getEClassifier(), Predicates.alwaysTrue())
                .getAllElements());

        List<EObject> matchingElements = foundElements.stream().filter(d -> qn.equals(d.getQualifiedName()))
                .map(IEObjectDescription::getEObjectOrProxy).distinct().collect(Collectors.toList());
        if (matchingElements.size() == 1) {
            object.setReferencedElement((UMLType) matchingElements.get(0));
            return Optional.empty();
        } else {
            object.setReferencedElement(null);
        }
        return Optional.empty();
    }

    @Override
    public boolean isDirectlyCompatibleWith(EClass eClass) {
        return isSwitchFor(eClass.getEPackage());
    }

    @Override
    public boolean processElementUsingType(EClass clazz, EObject object) {
        if (!clazz.isInstance(object)) {
            throw new IllegalArgumentException("The object is not a valid instance of the provided class");
        }
        return (doSwitch(clazz, object) != null);
    }
}
