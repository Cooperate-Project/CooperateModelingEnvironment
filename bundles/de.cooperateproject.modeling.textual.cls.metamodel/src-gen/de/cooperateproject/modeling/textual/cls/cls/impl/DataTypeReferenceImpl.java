/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.DataTypeReference;
import de.cooperateproject.modeling.textual.cls.cls.PrimitiveType;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.DataTypeReferenceImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypeReferenceImpl extends TypeReferenceImpl implements DataTypeReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClsPackage.Literals.DATA_TYPE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveType getType() {
		return (PrimitiveType)eGet(ClsPackage.Literals.DATA_TYPE_REFERENCE__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(PrimitiveType newType) {
		eSet(ClsPackage.Literals.DATA_TYPE_REFERENCE__TYPE, newType);
	}

} //DataTypeReferenceImpl
