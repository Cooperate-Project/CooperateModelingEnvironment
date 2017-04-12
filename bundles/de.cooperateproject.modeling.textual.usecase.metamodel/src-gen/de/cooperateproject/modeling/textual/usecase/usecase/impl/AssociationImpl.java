/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.UMLReferencingElementImpl;

import de.cooperateproject.modeling.textual.usecase.usecase.Actor;
import de.cooperateproject.modeling.textual.usecase.usecase.UseCase;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.uml2.uml.Association;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.AssociationImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.AssociationImpl#getUsecase <em>Usecase</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.AssociationImpl#getActorCardinality <em>Actor Cardinality</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.AssociationImpl#getUseCaseCardinality <em>Use Case Cardinality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends UMLReferencingElementImpl<Association> implements de.cooperateproject.modeling.textual.usecase.usecase.Association {
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
     * This is specialized for the more specific type known in this context.
     * @generated
     */
    @Override
    public void setReferencedElement(Association newReferencedElement) {
        super.setReferencedElement(newReferencedElement);
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
    public Cardinality getActorCardinality() {
        return (Cardinality)eDynamicGet(UsecasePackage.ASSOCIATION__ACTOR_CARDINALITY, UsecasePackage.Literals.ASSOCIATION__ACTOR_CARDINALITY, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetActorCardinality(Cardinality newActorCardinality, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject)newActorCardinality, UsecasePackage.ASSOCIATION__ACTOR_CARDINALITY, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setActorCardinality(Cardinality newActorCardinality) {
        eDynamicSet(UsecasePackage.ASSOCIATION__ACTOR_CARDINALITY, UsecasePackage.Literals.ASSOCIATION__ACTOR_CARDINALITY, newActorCardinality);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Cardinality getUseCaseCardinality() {
        return (Cardinality)eDynamicGet(UsecasePackage.ASSOCIATION__USE_CASE_CARDINALITY, UsecasePackage.Literals.ASSOCIATION__USE_CASE_CARDINALITY, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetUseCaseCardinality(Cardinality newUseCaseCardinality, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject)newUseCaseCardinality, UsecasePackage.ASSOCIATION__USE_CASE_CARDINALITY, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUseCaseCardinality(Cardinality newUseCaseCardinality) {
        eDynamicSet(UsecasePackage.ASSOCIATION__USE_CASE_CARDINALITY, UsecasePackage.Literals.ASSOCIATION__USE_CASE_CARDINALITY, newUseCaseCardinality);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UsecasePackage.ASSOCIATION__ACTOR_CARDINALITY:
                return basicSetActorCardinality(null, msgs);
            case UsecasePackage.ASSOCIATION__USE_CASE_CARDINALITY:
                return basicSetUseCaseCardinality(null, msgs);
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
            case UsecasePackage.ASSOCIATION__ACTOR:
                if (resolve) return getActor();
                return basicGetActor();
            case UsecasePackage.ASSOCIATION__USECASE:
                if (resolve) return getUsecase();
                return basicGetUsecase();
            case UsecasePackage.ASSOCIATION__ACTOR_CARDINALITY:
                return getActorCardinality();
            case UsecasePackage.ASSOCIATION__USE_CASE_CARDINALITY:
                return getUseCaseCardinality();
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
            case UsecasePackage.ASSOCIATION__ACTOR:
                setActor((Actor)newValue);
                return;
            case UsecasePackage.ASSOCIATION__USECASE:
                setUsecase((UseCase)newValue);
                return;
            case UsecasePackage.ASSOCIATION__ACTOR_CARDINALITY:
                setActorCardinality((Cardinality)newValue);
                return;
            case UsecasePackage.ASSOCIATION__USE_CASE_CARDINALITY:
                setUseCaseCardinality((Cardinality)newValue);
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
            case UsecasePackage.ASSOCIATION__ACTOR:
                setActor((Actor)null);
                return;
            case UsecasePackage.ASSOCIATION__USECASE:
                setUsecase((UseCase)null);
                return;
            case UsecasePackage.ASSOCIATION__ACTOR_CARDINALITY:
                setActorCardinality((Cardinality)null);
                return;
            case UsecasePackage.ASSOCIATION__USE_CASE_CARDINALITY:
                setUseCaseCardinality((Cardinality)null);
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
            case UsecasePackage.ASSOCIATION__ACTOR:
                return basicGetActor() != null;
            case UsecasePackage.ASSOCIATION__USECASE:
                return basicGetUsecase() != null;
            case UsecasePackage.ASSOCIATION__ACTOR_CARDINALITY:
                return getActorCardinality() != null;
            case UsecasePackage.ASSOCIATION__USE_CASE_CARDINALITY:
                return getUseCaseCardinality() != null;
        }
        return super.eIsSet(featureID);
    }

} //AssociationImpl
