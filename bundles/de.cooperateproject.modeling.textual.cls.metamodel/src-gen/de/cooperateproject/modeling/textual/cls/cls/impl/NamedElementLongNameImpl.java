/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.NamedElementLongName;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Element Long Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.NamedElementLongNameImpl#getLongName <em>Long Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NamedElementLongNameImpl<T extends NamedElement> extends NamedElementImpl<T> implements NamedElementLongName<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementLongNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClsPackage.Literals.NAMED_ELEMENT_LONG_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLongName() {
		return (String)eGet(ClsPackage.Literals.NAMED_ELEMENT_LONG_NAME__LONG_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongName(String newLongName) {
		eSet(ClsPackage.Literals.NAMED_ELEMENT_LONG_NAME__LONG_NAME, newLongName);
	}

} //NamedElementLongNameImpl
