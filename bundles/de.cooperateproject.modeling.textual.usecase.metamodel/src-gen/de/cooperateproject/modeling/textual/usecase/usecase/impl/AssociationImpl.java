/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase.impl;

import de.cooperateproject.modeling.textual.usecase.usecase.Actor;
import de.cooperateproject.modeling.textual.usecase.usecase.Association;
import de.cooperateproject.modeling.textual.usecase.usecase.Cardinality;
import de.cooperateproject.modeling.textual.usecase.usecase.UMLReferencingElement;
import de.cooperateproject.modeling.textual.usecase.usecase.UseCase;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.AssociationImpl#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.AssociationImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.AssociationImpl#getUsecase <em>Usecase</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.AssociationImpl#getLeftCardinality <em>Left Cardinality</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.AssociationImpl#getRightCardinality <em>Right Cardinality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends RelationshipImpl implements Association {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected AssociationImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return UsecasePackage.Literals.ASSOCIATION;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public org.eclipse.uml2.uml.Association getReferencedElement() {
        return (org.eclipse.uml2.uml.Association)eDynamicGet(UsecasePackage.ASSOCIATION__REFERENCED_ELEMENT, UsecasePackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public org.eclipse.uml2.uml.Association basicGetReferencedElement() {
        return (org.eclipse.uml2.uml.Association)eDynamicGet(UsecasePackage.ASSOCIATION__REFERENCED_ELEMENT, UsecasePackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, false, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setReferencedElement(org.eclipse.uml2.uml.Association newReferencedElement) {
        eDynamicSet(UsecasePackage.ASSOCIATION__REFERENCED_ELEMENT, UsecasePackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, newReferencedElement);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Actor getActor() {
        return (Actor)eDynamicGet(UsecasePackage.ASSOCIATION__ACTOR, UsecasePackage.Literals.ASSOCIATION__ACTOR, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Actor basicGetActor() {
        return (Actor)eDynamicGet(UsecasePackage.ASSOCIATION__ACTOR, UsecasePackage.Literals.ASSOCIATION__ACTOR, false, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setActor(Actor newActor) {
        eDynamicSet(UsecasePackage.ASSOCIATION__ACTOR, UsecasePackage.Literals.ASSOCIATION__ACTOR, newActor);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public UseCase getUsecase() {
        return (UseCase)eDynamicGet(UsecasePackage.ASSOCIATION__USECASE, UsecasePackage.Literals.ASSOCIATION__USECASE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public UseCase basicGetUsecase() {
        return (UseCase)eDynamicGet(UsecasePackage.ASSOCIATION__USECASE, UsecasePackage.Literals.ASSOCIATION__USECASE, false, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setUsecase(UseCase newUsecase) {
        eDynamicSet(UsecasePackage.ASSOCIATION__USECASE, UsecasePackage.Literals.ASSOCIATION__USECASE, newUsecase);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Cardinality getLeftCardinality() {
        return (Cardinality)eDynamicGet(UsecasePackage.ASSOCIATION__LEFT_CARDINALITY, UsecasePackage.Literals.ASSOCIATION__LEFT_CARDINALITY, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetLeftCardinality(Cardinality newLeftCardinality, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject)newLeftCardinality, UsecasePackage.ASSOCIATION__LEFT_CARDINALITY, msgs);
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLeftCardinality(Cardinality newLeftCardinality) {
        eDynamicSet(UsecasePackage.ASSOCIATION__LEFT_CARDINALITY, UsecasePackage.Literals.ASSOCIATION__LEFT_CARDINALITY, newLeftCardinality);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Cardinality getRightCardinality() {
        return (Cardinality)eDynamicGet(UsecasePackage.ASSOCIATION__RIGHT_CARDINALITY, UsecasePackage.Literals.ASSOCIATION__RIGHT_CARDINALITY, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetRightCardinality(Cardinality newRightCardinality, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject)newRightCardinality, UsecasePackage.ASSOCIATION__RIGHT_CARDINALITY, msgs);
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRightCardinality(Cardinality newRightCardinality) {
        eDynamicSet(UsecasePackage.ASSOCIATION__RIGHT_CARDINALITY, UsecasePackage.Literals.ASSOCIATION__RIGHT_CARDINALITY, newRightCardinality);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UsecasePackage.ASSOCIATION__LEFT_CARDINALITY:
                return basicSetLeftCardinality(null, msgs);
            case UsecasePackage.ASSOCIATION__RIGHT_CARDINALITY:
                return basicSetRightCardinality(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UsecasePackage.ASSOCIATION__REFERENCED_ELEMENT:
                if (resolve) return getReferencedElement();
                return basicGetReferencedElement();
            case UsecasePackage.ASSOCIATION__ACTOR:
                if (resolve) return getActor();
                return basicGetActor();
            case UsecasePackage.ASSOCIATION__USECASE:
                if (resolve) return getUsecase();
                return basicGetUsecase();
            case UsecasePackage.ASSOCIATION__LEFT_CARDINALITY:
                return getLeftCardinality();
            case UsecasePackage.ASSOCIATION__RIGHT_CARDINALITY:
                return getRightCardinality();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case UsecasePackage.ASSOCIATION__REFERENCED_ELEMENT:
                setReferencedElement((org.eclipse.uml2.uml.Association)newValue);
                return;
            case UsecasePackage.ASSOCIATION__ACTOR:
                setActor((Actor)newValue);
                return;
            case UsecasePackage.ASSOCIATION__USECASE:
                setUsecase((UseCase)newValue);
                return;
            case UsecasePackage.ASSOCIATION__LEFT_CARDINALITY:
                setLeftCardinality((Cardinality)newValue);
                return;
            case UsecasePackage.ASSOCIATION__RIGHT_CARDINALITY:
                setRightCardinality((Cardinality)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eUnset(int featureID) {
        switch (featureID) {
            case UsecasePackage.ASSOCIATION__REFERENCED_ELEMENT:
                setReferencedElement((org.eclipse.uml2.uml.Association)null);
                return;
            case UsecasePackage.ASSOCIATION__ACTOR:
                setActor((Actor)null);
                return;
            case UsecasePackage.ASSOCIATION__USECASE:
                setUsecase((UseCase)null);
                return;
            case UsecasePackage.ASSOCIATION__LEFT_CARDINALITY:
                setLeftCardinality((Cardinality)null);
                return;
            case UsecasePackage.ASSOCIATION__RIGHT_CARDINALITY:
                setRightCardinality((Cardinality)null);
                return;
        }
        super.eUnset(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean eIsSet(int featureID) {
        switch (featureID) {
            case UsecasePackage.ASSOCIATION__REFERENCED_ELEMENT:
                return basicGetReferencedElement() != null;
            case UsecasePackage.ASSOCIATION__ACTOR:
                return basicGetActor() != null;
            case UsecasePackage.ASSOCIATION__USECASE:
                return basicGetUsecase() != null;
            case UsecasePackage.ASSOCIATION__LEFT_CARDINALITY:
                return getLeftCardinality() != null;
            case UsecasePackage.ASSOCIATION__RIGHT_CARDINALITY:
                return getRightCardinality() != null;
        }
        return super.eIsSet(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == UMLReferencingElement.class) {
            switch (derivedFeatureID) {
                case UsecasePackage.ASSOCIATION__REFERENCED_ELEMENT: return UsecasePackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == UMLReferencingElement.class) {
            switch (baseFeatureID) {
                case UsecasePackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT: return UsecasePackage.ASSOCIATION__REFERENCED_ELEMENT;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //AssociationImpl
