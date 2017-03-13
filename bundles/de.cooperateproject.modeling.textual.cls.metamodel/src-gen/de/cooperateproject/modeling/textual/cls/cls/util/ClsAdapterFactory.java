/**
 */
package de.cooperateproject.modeling.textual.cls.cls.util;

import de.cooperateproject.modeling.textual.cls.cls.Association;
import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd;
import de.cooperateproject.modeling.textual.cls.cls.Attribute;
import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.CommentLink;
import de.cooperateproject.modeling.textual.cls.cls.Connector;
import de.cooperateproject.modeling.textual.cls.cls.Generalization;
import de.cooperateproject.modeling.textual.cls.cls.Implementation;
import de.cooperateproject.modeling.textual.cls.cls.Interface;
import de.cooperateproject.modeling.textual.cls.cls.Member;
import de.cooperateproject.modeling.textual.cls.cls.Method;
import de.cooperateproject.modeling.textual.cls.cls.Parameter;
import de.cooperateproject.modeling.textual.cls.cls.Property;
import de.cooperateproject.modeling.textual.cls.cls.TypedConnector;
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociation;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Commentable;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageableElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage
 * @generated
 */
public class ClsAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ClsPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClsAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ClsPackage.eINSTANCE;
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
    protected ClsSwitch<Adapter> modelSwitch =
        new ClsSwitch<Adapter>() {
            @Override
            public Adapter caseClassDiagram(ClassDiagram object) {
                return createClassDiagramAdapter();
            }
            @Override
            public Adapter casePackage(de.cooperateproject.modeling.textual.cls.cls.Package object) {
                return createPackageAdapter();
            }
            @Override
            public <T extends Classifier> Adapter caseClassifier(de.cooperateproject.modeling.textual.cls.cls.Classifier<T> object) {
                return createClassifierAdapter();
            }
            @Override
            public Adapter caseClass(de.cooperateproject.modeling.textual.cls.cls.Class object) {
                return createClassAdapter();
            }
            @Override
            public Adapter caseInterface(Interface object) {
                return createInterfaceAdapter();
            }
            @Override
            public <T extends NamedElement> Adapter caseProperty(Property<T> object) {
                return createPropertyAdapter();
            }
            @Override
            public <T extends NamedElement> Adapter caseMember(Member<T> object) {
                return createMemberAdapter();
            }
            @Override
            public Adapter caseAttribute(Attribute object) {
                return createAttributeAdapter();
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
            public Adapter caseConnector(Connector object) {
                return createConnectorAdapter();
            }
            @Override
            public Adapter caseTypedConnector(TypedConnector object) {
                return createTypedConnectorAdapter();
            }
            @Override
            public Adapter caseGeneralization(Generalization object) {
                return createGeneralizationAdapter();
            }
            @Override
            public Adapter caseImplementation(Implementation object) {
                return createImplementationAdapter();
            }
            @Override
            public Adapter caseCommentLink(CommentLink object) {
                return createCommentLinkAdapter();
            }
            @Override
            public Adapter caseAssociation(Association object) {
                return createAssociationAdapter();
            }
            @Override
            public Adapter caseAssociationMemberEnd(AssociationMemberEnd object) {
                return createAssociationMemberEndAdapter();
            }
            @Override
            public Adapter caseXtextAssociation(XtextAssociation object) {
                return createXtextAssociationAdapter();
            }
            @Override
            public Adapter casePackageableElement(PackageableElement object) {
                return createPackageableElementAdapter();
            }
            @Override
            public Adapter caseElement(de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element object) {
                return createElementAdapter();
            }
            @Override
            public <UMLType extends Element> Adapter caseUMLReferencingElement(UMLReferencingElement<UMLType> object) {
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
            public Adapter caseCommentable(Commentable object) {
                return createCommentableAdapter();
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
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cls.cls.ClassDiagram <em>Class Diagram</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cls.cls.ClassDiagram
     * @generated
     */
    public Adapter createClassDiagramAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cls.cls.Package <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cls.cls.Package
     * @generated
     */
    public Adapter createPackageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cls.cls.Classifier <em>Classifier</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cls.cls.Classifier
     * @generated
     */
    public Adapter createClassifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cls.cls.Class <em>Class</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cls.cls.Class
     * @generated
     */
    public Adapter createClassAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cls.cls.Interface <em>Interface</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cls.cls.Interface
     * @generated
     */
    public Adapter createInterfaceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cls.cls.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cls.cls.Property
     * @generated
     */
    public Adapter createPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cls.cls.Member <em>Member</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cls.cls.Member
     * @generated
     */
    public Adapter createMemberAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cls.cls.Attribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cls.cls.Attribute
     * @generated
     */
    public Adapter createAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cls.cls.Method <em>Method</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cls.cls.Method
     * @generated
     */
    public Adapter createMethodAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cls.cls.Parameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cls.cls.Parameter
     * @generated
     */
    public Adapter createParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cls.cls.Connector <em>Connector</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cls.cls.Connector
     * @generated
     */
    public Adapter createConnectorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cls.cls.TypedConnector <em>Typed Connector</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cls.cls.TypedConnector
     * @generated
     */
    public Adapter createTypedConnectorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cls.cls.Generalization <em>Generalization</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cls.cls.Generalization
     * @generated
     */
    public Adapter createGeneralizationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cls.cls.Implementation <em>Implementation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cls.cls.Implementation
     * @generated
     */
    public Adapter createImplementationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cls.cls.CommentLink <em>Comment Link</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cls.cls.CommentLink
     * @generated
     */
    public Adapter createCommentLinkAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cls.cls.Association <em>Association</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cls.cls.Association
     * @generated
     */
    public Adapter createAssociationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd <em>Association Member End</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd
     * @generated
     */
    public Adapter createAssociationMemberEndAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.cls.cls.XtextAssociation <em>Xtext Association</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.modeling.textual.cls.cls.XtextAssociation
     * @generated
     */
    public Adapter createXtextAssociationAdapter() {
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

} //ClsAdapterFactory
