/**
 */
package de.cooperateproject.modeling.textual.activity.act.impl;

import de.cooperateproject.modeling.textual.activity.act.ActPackage;
import de.cooperateproject.modeling.textual.activity.act.ActivityDiagram;
import de.cooperateproject.modeling.textual.activity.act.RootPackage;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.act.impl.ActivityDiagramImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.act.impl.ActivityDiagramImpl#getRootPackage <em>Root Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityDiagramImpl extends CDOObjectImpl implements ActivityDiagram {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActPackage.Literals.ACTIVITY_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return (String)eDynamicGet(ActPackage.ACTIVITY_DIAGRAM__TITLE, ActPackage.Literals.ACTIVITY_DIAGRAM__TITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		eDynamicSet(ActPackage.ACTIVITY_DIAGRAM__TITLE, ActPackage.Literals.ACTIVITY_DIAGRAM__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootPackage getRootPackage() {
		return (RootPackage)eDynamicGet(ActPackage.ACTIVITY_DIAGRAM__ROOT_PACKAGE, ActPackage.Literals.ACTIVITY_DIAGRAM__ROOT_PACKAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootPackage(RootPackage newRootPackage, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newRootPackage, ActPackage.ACTIVITY_DIAGRAM__ROOT_PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootPackage(RootPackage newRootPackage) {
		eDynamicSet(ActPackage.ACTIVITY_DIAGRAM__ROOT_PACKAGE, ActPackage.Literals.ACTIVITY_DIAGRAM__ROOT_PACKAGE, newRootPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActPackage.ACTIVITY_DIAGRAM__ROOT_PACKAGE:
				return basicSetRootPackage(null, msgs);
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
			case ActPackage.ACTIVITY_DIAGRAM__TITLE:
				return getTitle();
			case ActPackage.ACTIVITY_DIAGRAM__ROOT_PACKAGE:
				return getRootPackage();
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
			case ActPackage.ACTIVITY_DIAGRAM__TITLE:
				setTitle((String)newValue);
				return;
			case ActPackage.ACTIVITY_DIAGRAM__ROOT_PACKAGE:
				setRootPackage((RootPackage)newValue);
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
			case ActPackage.ACTIVITY_DIAGRAM__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ActPackage.ACTIVITY_DIAGRAM__ROOT_PACKAGE:
				setRootPackage((RootPackage)null);
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
			case ActPackage.ACTIVITY_DIAGRAM__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
			case ActPackage.ACTIVITY_DIAGRAM__ROOT_PACKAGE:
				return getRootPackage() != null;
		}
		return super.eIsSet(featureID);
	}

} //ActivityDiagramImpl
