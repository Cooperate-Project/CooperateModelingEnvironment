/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.Association;
import de.cooperateproject.modeling.textual.cls.cls.AssociationProperties;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends TypedConnectorImpl implements Association {
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
		return ClsPackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationProperties getProperties() {
		return (AssociationProperties)eGet(ClsPackage.Literals.ASSOCIATION__PROPERTIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperties(AssociationProperties newProperties) {
		eSet(ClsPackage.Literals.ASSOCIATION__PROPERTIES, newProperties);
	}

} //AssociationImpl
