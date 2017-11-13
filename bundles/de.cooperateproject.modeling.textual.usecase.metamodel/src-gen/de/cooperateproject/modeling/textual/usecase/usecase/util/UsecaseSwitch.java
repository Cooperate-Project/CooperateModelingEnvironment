/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase.util;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Commentable;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageableElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.VisibilityHavingElement;
import de.cooperateproject.modeling.textual.usecase.usecase.Actor;
import de.cooperateproject.modeling.textual.usecase.usecase.Association;
import de.cooperateproject.modeling.textual.usecase.usecase.BehavioredClassifier;
import de.cooperateproject.modeling.textual.usecase.usecase.Extend;
import de.cooperateproject.modeling.textual.usecase.usecase.ExtensionPoint;
import de.cooperateproject.modeling.textual.usecase.usecase.Generalization;
import de.cooperateproject.modeling.textual.usecase.usecase.Include;
import de.cooperateproject.modeling.textual.usecase.usecase.Relationship;
import de.cooperateproject.modeling.textual.usecase.usecase.RootPackage;
import de.cooperateproject.modeling.textual.usecase.usecase.UseCase;
import de.cooperateproject.modeling.textual.usecase.usecase.UseCaseDiagram;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage
 * @generated
 */
public class UsecaseSwitch<T1> extends Switch<T1> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static UsecasePackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UsecaseSwitch() {
        if (modelPackage == null) {
            modelPackage = UsecasePackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T1 doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case UsecasePackage.USE_CASE_DIAGRAM: {
                UseCaseDiagram useCaseDiagram = (UseCaseDiagram)theEObject;
                T1 result = caseUseCaseDiagram(useCaseDiagram);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UsecasePackage.BEHAVIORED_CLASSIFIER: {
                BehavioredClassifier<?> behavioredClassifier = (BehavioredClassifier<?>)theEObject;
                T1 result = caseBehavioredClassifier(behavioredClassifier);
                if (result == null) result = caseCommentable(behavioredClassifier);
                if (result == null) result = caseUMLReferencingElement(behavioredClassifier);
                if (result == null) result = caseElement(behavioredClassifier);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UsecasePackage.ROOT_PACKAGE: {
                RootPackage rootPackage = (RootPackage)theEObject;
                T1 result = caseRootPackage(rootPackage);
                if (result == null) result = casePackageBase(rootPackage);
                if (result == null) result = casePackageableElement(rootPackage);
                if (result == null) result = caseUMLReferencingElement(rootPackage);
                if (result == null) result = caseNamedElement(rootPackage);
                if (result == null) result = caseElement(rootPackage);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UsecasePackage.ACTOR: {
                Actor actor = (Actor)theEObject;
                T1 result = caseActor(actor);
                if (result == null) result = caseBehavioredClassifier(actor);
                if (result == null) result = caseAliasedElement(actor);
                if (result == null) result = caseVisibilityHavingElement(actor);
                if (result == null) result = caseCommentable(actor);
                if (result == null) result = caseNamedElement(actor);
                if (result == null) result = caseUMLReferencingElement(actor);
                if (result == null) result = caseElement(actor);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UsecasePackage.SYSTEM: {
                de.cooperateproject.modeling.textual.usecase.usecase.System system = (de.cooperateproject.modeling.textual.usecase.usecase.System)theEObject;
                T1 result = caseSystem(system);
                if (result == null) result = caseNamedElement(system);
                if (result == null) result = caseCommentable(system);
                if (result == null) result = caseUMLReferencingElement(system);
                if (result == null) result = caseElement(system);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UsecasePackage.USE_CASE: {
                UseCase useCase = (UseCase)theEObject;
                T1 result = caseUseCase(useCase);
                if (result == null) result = caseBehavioredClassifier(useCase);
                if (result == null) result = caseAliasedElement(useCase);
                if (result == null) result = caseVisibilityHavingElement(useCase);
                if (result == null) result = caseCommentable(useCase);
                if (result == null) result = caseNamedElement(useCase);
                if (result == null) result = caseUMLReferencingElement(useCase);
                if (result == null) result = caseElement(useCase);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UsecasePackage.EXTENSION_POINT: {
                ExtensionPoint extensionPoint = (ExtensionPoint)theEObject;
                T1 result = caseExtensionPoint(extensionPoint);
                if (result == null) result = caseUMLReferencingElement(extensionPoint);
                if (result == null) result = caseAliasedElement(extensionPoint);
                if (result == null) result = caseNamedElement(extensionPoint);
                if (result == null) result = caseElement(extensionPoint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UsecasePackage.RELATIONSHIP: {
                Relationship relationship = (Relationship)theEObject;
                T1 result = caseRelationship(relationship);
                if (result == null) result = caseElement(relationship);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UsecasePackage.ASSOCIATION: {
                Association association = (Association)theEObject;
                T1 result = caseAssociation(association);
                if (result == null) result = caseUMLReferencingElement(association);
                if (result == null) result = caseRelationship(association);
                if (result == null) result = caseElement(association);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UsecasePackage.GENERALIZATION: {
                Generalization generalization = (Generalization)theEObject;
                T1 result = caseGeneralization(generalization);
                if (result == null) result = caseRelationship(generalization);
                if (result == null) result = caseUMLReferencingElement(generalization);
                if (result == null) result = caseElement(generalization);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UsecasePackage.INCLUDE: {
                Include include = (Include)theEObject;
                T1 result = caseInclude(include);
                if (result == null) result = caseRelationship(include);
                if (result == null) result = caseUMLReferencingElement(include);
                if (result == null) result = caseElement(include);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UsecasePackage.EXTEND: {
                Extend extend = (Extend)theEObject;
                T1 result = caseExtend(extend);
                if (result == null) result = caseRelationship(extend);
                if (result == null) result = caseUMLReferencingElement(extend);
                if (result == null) result = caseElement(extend);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Use Case Diagram</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Use Case Diagram</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseUseCaseDiagram(UseCaseDiagram object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Behaviored Classifier</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Behaviored Classifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public <T extends org.eclipse.uml2.uml.BehavioredClassifier> T1 caseBehavioredClassifier(BehavioredClassifier<T> object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Root Package</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Root Package</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseRootPackage(RootPackage object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseActor(Actor object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>System</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>System</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseSystem(de.cooperateproject.modeling.textual.usecase.usecase.System object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Use Case</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Use Case</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseUseCase(UseCase object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Extension Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Extension Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseExtensionPoint(ExtensionPoint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseRelationship(Relationship object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Association</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseAssociation(Association object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Generalization</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Generalization</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseGeneralization(Generalization object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Include</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Include</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseInclude(Include object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Extend</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Extend</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseExtend(Extend object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseElement(Element object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>UML Referencing Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>UML Referencing Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public <UMLType extends org.eclipse.uml2.uml.Element> T1 caseUMLReferencingElement(UMLReferencingElement<UMLType> object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Commentable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Commentable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public <CommentableUMLType extends org.eclipse.uml2.uml.Element> T1 caseCommentable(Commentable<CommentableUMLType> object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 casePackageableElement(PackageableElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseNamedElement(NamedElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Package Base</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Package Base</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public <PackageType extends PackageBase<?>> T1 casePackageBase(PackageBase<PackageType> object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Aliased Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Aliased Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseAliasedElement(AliasedElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Visibility Having Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Visibility Having Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseVisibilityHavingElement(VisibilityHavingElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T1 defaultCase(EObject object) {
        return null;
    }

} //UsecaseSwitch
