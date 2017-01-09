/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.TypedConnector;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.TypedConnectorImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.TypedConnectorImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TypedConnectorImpl extends ElementImpl implements TypedConnector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClsPackage.Literals.TYPED_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Classifier getLeft() {
		return (Classifier)eGet(ClsPackage.Literals.TYPED_CONNECTOR__LEFT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeft(Classifier newLeft) {
		eSet(ClsPackage.Literals.TYPED_CONNECTOR__LEFT, newLeft);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Classifier getRight() {
		return (Classifier)eGet(ClsPackage.Literals.TYPED_CONNECTOR__RIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRight(Classifier newRight) {
		eSet(ClsPackage.Literals.TYPED_CONNECTOR__RIGHT, newRight);
	}

} //TypedConnectorImpl
