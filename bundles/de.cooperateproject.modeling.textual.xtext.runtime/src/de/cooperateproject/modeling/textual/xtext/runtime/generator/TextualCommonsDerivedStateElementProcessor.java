package de.cooperateproject.modeling.textual.xtext.runtime.generator;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;

import com.google.common.base.Predicates;
import com.google.common.collect.Sets;
import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.util.TextualCommonsSwitch;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IGlobalScopeTypeQueryProvider;

public class TextualCommonsDerivedStateElementProcessor extends TextualCommonsSwitch<Void>
        implements IDerivedStateElementProcessor {

    @Inject
    private IQualifiedNameProvider qualifiedNameProvider;

    @Inject
    private IGlobalScopeTypeQueryProvider globalScopeProvider;

    /*
     * @Override
     * public Boolean caseComment(Comment object) {
     * UMLReferencingElement<? extends org.eclipse.uml2.uml.Classifier> realElement = commentableFinder
     * .doSwitch(object.getCommentedElement());
     * if (realElement != null) {
     * Element umlCommentedElement = realElement.getReferencedElement();
     * 
     * IScope candidates = globalScopeProvider.queryScope(object.eResource(), true,
     * UMLPackage.Literals.COMMENT,
     * c -> ((org.eclipse.uml2.uml.Comment) c.getEObjectOrProxy()).getAnnotatedElements()
     * .contains(umlCommentedElement)
     * && ((org.eclipse.uml2.uml.Comment) c.getEObjectOrProxy()).getBody()
     * .equals(object.getBody()));
     * Iterable<org.eclipse.uml2.uml.Comment> typedCandidates = Iterables.transform(
     * candidates.getAllElements(), e -> (org.eclipse.uml2.uml.Comment) e.getEObjectOrProxy());
     * if (Iterables.size(typedCandidates) == 1) {
     * object.setReferencedElement(Iterables.getFirst(typedCandidates, null));
     * }
     * }
     * return true;
     * }
     */

    @Override
    public Void caseComment(Comment object) {
        if (!(object.getCommentedElement() instanceof UMLReferencingElement<?>)) {
            return super.caseComment(object);
        }

        @SuppressWarnings("unchecked")
        UMLReferencingElement<Element> commentedElement = (UMLReferencingElement<Element>) object.getCommentedElement();
        Element umlCommentedElement = commentedElement.getReferencedElement();
        if (umlCommentedElement == null) {
            return null;
        }

        EObject rootElement = EcoreUtil.getRootContainer(umlCommentedElement);
        Set<org.eclipse.uml2.uml.Comment> candidates = StreamSupport
                .stream(Spliterators.spliteratorUnknownSize(rootElement.eAllContents(), Spliterator.ORDERED), false)
                .filter(org.eclipse.uml2.uml.Comment.class::isInstance).map(org.eclipse.uml2.uml.Comment.class::cast)
                .filter(c -> c.getAnnotatedElements().contains(umlCommentedElement)
                        && c.getBody().equals(object.getBody()))
                .collect(Collectors.toSet());

        if (candidates.size() == 1) {
            object.setReferencedElement(candidates.iterator().next());
            return null;
        }

        return super.caseComment(object);
    }

    @Override
    public <UMLType extends Element> Void caseUMLReferencingElement(UMLReferencingElement<UMLType> object) {
        QualifiedName qn = qualifiedNameProvider.getFullyQualifiedName(object);
        if (qn == null) {
            return super.caseUMLReferencingElement(object);
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
            return super.caseUMLReferencingElement(object);
        } else {
            object.setReferencedElement(null);
        }
        return super.caseUMLReferencingElement(object);
    }

    @Override
    public boolean isCompatibleWith(EPackage ePackage) {
        return isSwitchFor(ePackage);
    }

    @Override
    public void processElement(EObject object) {
        doSwitch(object);
    }
}
