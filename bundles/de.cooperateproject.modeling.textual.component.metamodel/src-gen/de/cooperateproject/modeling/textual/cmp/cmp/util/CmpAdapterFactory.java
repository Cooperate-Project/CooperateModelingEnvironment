/**
 */
package de.cooperateproject.modeling.textual.cmp.cmp.util;

import de.cooperateproject.modeling.textual.cmp.cmp.*;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Commentable;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageableElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.VisibilityHavingElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.modeling.textual.cmp.cmp.CmpPackage
 * @generated
 */
public class CmpAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static CmpPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CmpAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = CmpPackage.eINSTANCE;
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
    protected CmpSwitch<Adapter> modelSwitch =
        new CmpSwitch<Adapter>() {
            @Override
            public Adapter caseComponentDiagram(ComponentDiagram object) {
                return createComponentDiagramAdapter();
            }
            @Override
            public Adapter caseRootPackage(RootPackage object) {
                return createRootPackageAdapter();
            }
            @Override
            public <LeftUMLType extends Classifier, RightUMLType extends Classifier> Adapter caseClassifierRelation(ClassifierRelation<LeftUMLType, RightUMLType> object) {
                return createClassifierRelationAdapter();
            }
            @Override
            public Adapter caseConnector(Connector object) {
                return createConnectorAdapter();
            }
            @Override
            public Adapter caseConnectorEnd(ConnectorEnd object) {
                return createConnectorEndAdapter();
            }
            @Override
            public Adapter caseGeneralization(Generalization object) {
                return createGeneralizationAdapter();
            }
            @Override
            public Adapter caseAbstraction(Abstraction object) {
                return createAbstractionAdapter();
            }
            @Override
            public Adapter caseManifestation(Manifestation object) {
                return createManifestationAdapter();
            }
            @Override
            public Adapter caseSubstitution(Substitution object) {
                return createSubstitutionAdapter();
            }
            @Override
            public Adapter caseDependency(Dependency object) {
                return createDependencyAdapter();
            }
            @Override
            public <T extends Classifier> Adapter caseClassifier(de.cooperateproject.modeling.textual.cmp.cmp.Classifier<T> object) {
                return createClassifierAdapter();
            }
            @Override
            public <T extends NamedElement> Adapter caseProperty(Property<T> object) {
                return createPropertyAdapter();
            }
            @Override
            public Adapter caseComponent(Component object) {
                return createComponentAdapter();
            }
            @Override
            public Adapter caseInterface(Interface object) {
                return createInterfaceAdapter();
            }
            @Override
            public Adapter caseMethod(Method object) {
                return createMethodAdapter();
            }
            @Override
            public Adapter caseParameter(Parameter object) {
                return createParameterAdapter();
            }
            @Override
            public Adapter caseAttribute(Attribute object) {
                return createAttributeAdapter();
            }
            @Override
            public Adapter caseMember(Member object) {
                return createMemberAdapter();
            }
            @Override
            public Adapter caseInterfaceRelation(InterfaceRelation object) {
                return createInterfaceRelationAdapter();
            }
            @Override
            public Adapter caseProvide(Provide object) {
                return createProvideAdapter();
            }
            @Override
            public Adapter caseRequire(Require object) {
                return createRequireAdapter();
            }
            @Override
            public <realizeClassifierUMLType extends Classifier> Adapter casePort(Port<realizeClassifierUMLType> object) {
                return createPortAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter casePackageableElement(PackageableElement object) {
                return createPackageableElementAdapter();
            }
            @Override
            public <UMLType extends org.eclipse.uml2.uml.Element> Adapter caseUMLReferencingElement(UMLReferencingElement<UMLType> object) {
                return createUMLReferencingElementAdapter();
            }
            @Override
            public Adapter caseNamedElement(de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement object) {
                return createNamedElementAdapter();
            }
            @Override
            public <PackageType extends PackageBase<?>> Adapter casePackageBase(PackageBase<PackageType> object) {
                return createPackageBaseAdapter();
            }
            @Override
            public Adapter caseAliasedElement(AliasedElement object) {
                return createAliasedElementAdapter();
            }
            @Override
            public <CommentableUMLType extends org.eclipse.uml2.uml.Element> Adapter caseCommentable(Commentable<CommentableUMLType> object) {
                return createCommentableAdapter();
            }
            @Override
            public Adapter caseVisibilityHavingElement(VisibilityHavingElement object) {
                return createVisibilityHavingElementAdapter();
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
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cmp.cmp.ComponentDiagram <em>Component Diagram</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.ComponentDiagram
     * @generated
     */
    public Adapter createComponentDiagramAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cmp.cmp.RootPackage <em>Root Package</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.RootPackage
     * @generated
     */
    public Adapter createRootPackageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cmp.cmp.ClassifierRelation <em>Classifier Relation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.ClassifierRelation
     * @generated
     */
    public Adapter createClassifierRelationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Connector <em>Connector</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Connector
     * @generated
     */
    public Adapter createConnectorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cmp.cmp.ConnectorEnd <em>Connector End</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.ConnectorEnd
     * @generated
     */
    public Adapter createConnectorEndAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Generalization <em>Generalization</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Generalization
     * @generated
     */
    public Adapter createGeneralizationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Abstraction <em>Abstraction</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Abstraction
     * @generated
     */
    public Adapter createAbstractionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Manifestation <em>Manifestation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Manifestation
     * @generated
     */
    public Adapter createManifestationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Substitution <em>Substitution</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Substitution
     * @generated
     */
    public Adapter createSubstitutionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Dependency <em>Dependency</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Dependency
     * @generated
     */
    public Adapter createDependencyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Classifier <em>Classifier</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Classifier
     * @generated
     */
    public Adapter createClassifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Property
     * @generated
     */
    public Adapter createPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Component <em>Component</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Component
     * @generated
     */
    public Adapter createComponentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Interface <em>Interface</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Interface
     * @generated
     */
    public Adapter createInterfaceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Method <em>Method</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Method
     * @generated
     */
    public Adapter createMethodAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Parameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Parameter
     * @generated
     */
    public Adapter createParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Attribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Attribute
     * @generated
     */
    public Adapter createAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Member <em>Member</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Member
     * @generated
     */
    public Adapter createMemberAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cmp.cmp.InterfaceRelation <em>Interface Relation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.InterfaceRelation
     * @generated
     */
    public Adapter createInterfaceRelationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Provide <em>Provide</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Provide
     * @generated
     */
    public Adapter createProvideAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Require <em>Require</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Require
     * @generated
     */
    public Adapter createRequireAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cmp.cmp.Port <em>Port</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cmp.cmp.Port
     * @generated
     */
    public Adapter createPortAdapter() {
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
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageableElement <em>Packageable Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageableElement
     * @generated
     */
    public Adapter createPackageableElementAdapter() {
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
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase <em>Package Base</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase
     * @generated
     */
    public Adapter createPackageBaseAdapter() {
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
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.VisibilityHavingElement <em>Visibility Having Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.VisibilityHavingElement
     * @generated
     */
    public Adapter createVisibilityHavingElementAdapter() {
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

} //CmpAdapterFactory
