/**
 */
package de.cooperateproject.modeling.textual.activity.act.impl;

import de.cooperateproject.modeling.textual.activity.act.ActPackage;
import de.cooperateproject.modeling.textual.activity.act.RootPackage;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.PackageBaseImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RootPackageImpl extends PackageBaseImpl<RootPackage> implements RootPackage {
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

} //RootPackageImpl
