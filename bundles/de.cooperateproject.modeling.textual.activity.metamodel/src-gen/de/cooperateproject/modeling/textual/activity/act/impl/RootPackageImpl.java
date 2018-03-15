/**
 */
package de.cooperateproject.modeling.textual.activity.act.impl;

import de.cooperateproject.modeling.textual.activity.act.ActPackage;
import de.cooperateproject.modeling.textual.activity.act.Flow;
import de.cooperateproject.modeling.textual.activity.act.Node;
import de.cooperateproject.modeling.textual.activity.act.RootPackage;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.PackageBaseImpl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.act.impl.RootPackageImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.act.impl.RootPackageImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.act.impl.RootPackageImpl#getActivityName <em>Activity Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootPackageImpl extends PackageBaseImpl<RootPackage> implements RootPackage {
	/**
	 * The default value of the '{@link #getActivityName() <em>Activity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityName()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVITY_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActPackage.Literals.ROOT_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetOwningPackage(RootPackage newOwningPackage, NotificationChain msgs) {
		return super.basicSetOwningPackage(newOwningPackage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Node> getNodes() {
		return (EList<Node>)eDynamicGet(ActPackage.ROOT_PACKAGE__NODES, ActPackage.Literals.ROOT_PACKAGE__NODES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Flow> getRelations() {
		return (EList<Flow>)eDynamicGet(ActPackage.ROOT_PACKAGE__RELATIONS, ActPackage.Literals.ROOT_PACKAGE__RELATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActivityName() {
		return (String)eDynamicGet(ActPackage.ROOT_PACKAGE__ACTIVITY_NAME, ActPackage.Literals.ROOT_PACKAGE__ACTIVITY_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityName(String newActivityName) {
		eDynamicSet(ActPackage.ROOT_PACKAGE__ACTIVITY_NAME, ActPackage.Literals.ROOT_PACKAGE__ACTIVITY_NAME, newActivityName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActPackage.ROOT_PACKAGE__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case ActPackage.ROOT_PACKAGE__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
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
			case ActPackage.ROOT_PACKAGE__NODES:
				return getNodes();
			case ActPackage.ROOT_PACKAGE__RELATIONS:
				return getRelations();
			case ActPackage.ROOT_PACKAGE__ACTIVITY_NAME:
				return getActivityName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActPackage.ROOT_PACKAGE__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case ActPackage.ROOT_PACKAGE__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Flow>)newValue);
				return;
			case ActPackage.ROOT_PACKAGE__ACTIVITY_NAME:
				setActivityName((String)newValue);
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
			case ActPackage.ROOT_PACKAGE__NODES:
				getNodes().clear();
				return;
			case ActPackage.ROOT_PACKAGE__RELATIONS:
				getRelations().clear();
				return;
			case ActPackage.ROOT_PACKAGE__ACTIVITY_NAME:
				setActivityName(ACTIVITY_NAME_EDEFAULT);
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
			case ActPackage.ROOT_PACKAGE__NODES:
				return !getNodes().isEmpty();
			case ActPackage.ROOT_PACKAGE__RELATIONS:
				return !getRelations().isEmpty();
			case ActPackage.ROOT_PACKAGE__ACTIVITY_NAME:
				return ACTIVITY_NAME_EDEFAULT == null ? getActivityName() != null : !ACTIVITY_NAME_EDEFAULT.equals(getActivityName());
		}
		return super.eIsSet(featureID);
	}

} //RootPackageImpl
