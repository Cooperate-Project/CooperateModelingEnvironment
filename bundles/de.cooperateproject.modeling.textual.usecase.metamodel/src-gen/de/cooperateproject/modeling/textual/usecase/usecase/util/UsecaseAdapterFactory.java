/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase.util;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Commentable;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

import de.cooperateproject.modeling.textual.usecase.usecase.Actor;
import de.cooperateproject.modeling.textual.usecase.usecase.Association;
import de.cooperateproject.modeling.textual.usecase.usecase.Extend;
import de.cooperateproject.modeling.textual.usecase.usecase.ExtensionPoint;
import de.cooperateproject.modeling.textual.usecase.usecase.Generalization;
import de.cooperateproject.modeling.textual.usecase.usecase.Include;
import de.cooperateproject.modeling.textual.usecase.usecase.Relationship;
import de.cooperateproject.modeling.textual.usecase.usecase.RootPackage;
import de.cooperateproject.modeling.textual.usecase.usecase.UseCase;
import de.cooperateproject.modeling.textual.usecase.usecase.UseCaseDiagram;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.BehavioredClassifier;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage
 * @generated
 */
public class UsecaseAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static UsecasePackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UsecaseAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = UsecasePackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UsecaseSwitch<Adapter> modelSwitch =
        new UsecaseSwitch<Adapter>() {
            @Override
            public Adapter caseUseCaseDiagram(UseCaseDiagram object) {
                return createUseCaseDiagramAdapter();
            }
            @Override
            public <T extends BehavioredClassifier> Adapter caseBehavioredClassifier(de.cooperateproject.modeling.textual.usecase.usecase.BehavioredClassifier<T> object) {
                return createBehavioredClassifierAdapter();
            }
            @Override
            public Adapter caseRootPackage(RootPackage object) {
                return createRootPackageAdapter();
            }
            @Override
            public Adapter caseActor(Actor object) {
                return createActorAdapter();
            }
            @Override
            public Adapter caseSystem(de.cooperateproject.modeling.textual.usecase.usecase.System object) {
                return createSystemAdapter();
            }
            @Override
            public Adapter caseUseCase(UseCase object) {
                return createUseCaseAdapter();
            }
            @Override
            public Adapter caseExtensionPoint(ExtensionPoint object) {
                return createExtensionPointAdapter();
            }
            @Override
            public Adapter caseRelationship(Relationship object) {
                return createRelationshipAdapter();
            }
            @Override
            public Adapter caseAssociation(Association object) {
                return createAssociationAdapter();
            }
            @Override
            public Adapter caseGeneralization(Generalization object) {
                return createGeneralizationAdapter();
            }
            @Override
            public Adapter caseInclude(Include object) {
                return createIncludeAdapter();
            }
            @Override
            public Adapter caseExtend(Extend object) {
                return createExtendAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public <UMLType extends org.eclipse.uml2.uml.Element> Adapter caseUMLReferencingElement(UMLReferencingElement<UMLType> object) {
                return createUMLReferencingElementAdapter();
            }
            @Override
            public <CommentableUMLType extends org.eclipse.uml2.uml.Element> Adapter caseCommentable(Commentable<CommentableUMLType> object) {
                return createCommentableAdapter();
            }
            @Override
            public Adapter caseNamedElement(NamedElement object) {
                return createNamedElementAdapter();
            }
            @Override
            public Adapter caseAliasedElement(AliasedElement object) {
                return createAliasedElementAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.usecase.usecase.UseCaseDiagram <em>Use Case Diagram</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UseCaseDiagram
     * @generated
     */
    public Adapter createUseCaseDiagramAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.usecase.usecase.BehavioredClassifier <em>Behaviored Classifier</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.BehavioredClassifier
     * @generated
     */
    public Adapter createBehavioredClassifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.usecase.usecase.RootPackage <em>Root Package</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.RootPackage
     * @generated
     */
    public Adapter createRootPackageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.usecase.usecase.Actor <em>Actor</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.Actor
     * @generated
     */
    public Adapter createActorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.usecase.usecase.System <em>System</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.System
     * @generated
     */
    public Adapter createSystemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.usecase.usecase.UseCase <em>Use Case</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UseCase
     * @generated
     */
    public Adapter createUseCaseAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.usecase.usecase.ExtensionPoint <em>Extension Point</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.ExtensionPoint
     * @generated
     */
    public Adapter createExtensionPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.usecase.usecase.Relationship <em>Relationship</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.Relationship
     * @generated
     */
    public Adapter createRelationshipAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.usecase.usecase.Association <em>Association</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.Association
     * @generated
     */
    public Adapter createAssociationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.usecase.usecase.Generalization <em>Generalization</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.Generalization
     * @generated
     */
    public Adapter createGeneralizationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.usecase.usecase.Include <em>Include</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.Include
     * @generated
     */
    public Adapter createIncludeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.usecase.usecase.Extend <em>Extend</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.usecase.usecase.Extend
     * @generated
     */
    public Adapter createExtendAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element
     * @generated
     */
    public Adapter createElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement <em>UML Referencing Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
     * @generated
     */
    public Adapter createUMLReferencingElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Commentable <em>Commentable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Commentable
     * @generated
     */
    public Adapter createCommentableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement <em>Named Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement
     * @generated
     */
    public Adapter createNamedElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement <em>Aliased Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement
     * @generated
     */
    public Adapter createAliasedElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //UsecaseAdapterFactory
