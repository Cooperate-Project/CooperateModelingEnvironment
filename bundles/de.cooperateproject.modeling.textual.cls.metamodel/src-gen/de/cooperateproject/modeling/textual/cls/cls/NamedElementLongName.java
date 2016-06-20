/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element Long Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.NamedElementLongName#getLongName <em>Long Name</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getNamedElementLongName()
 * @model abstract="true"
 * @generated
 */
public interface NamedElementLongName<T extends NamedElement> extends de.cooperateproject.modeling.textual.cls.cls.NamedElement<T> {
	/**
	 * Returns the value of the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Name</em>' attribute.
	 * @see #setLongName(String)
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getNamedElementLongName_LongName()
	 * @model unique="false"
	 * @generated
	 */
	String getLongName();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.NamedElementLongName#getLongName <em>Long Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Name</em>' attribute.
	 * @see #getLongName()
	 * @generated
	 */
	void setLongName(String value);

} // NamedElementLongName
