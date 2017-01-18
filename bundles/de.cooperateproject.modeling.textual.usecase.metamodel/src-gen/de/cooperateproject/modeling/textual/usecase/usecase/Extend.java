/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.Extend#getClient <em>Client</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.Extend#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.Extend#getExtensionPoint <em>Extension Point</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.Extend#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getExtend()
 * @model
 * @generated
 */
public interface Extend extends Relationship, UMLReferencingElement<org.eclipse.uml2.uml.Extend> {
	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference.
	 * @see #setClient(UseCase)
	 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getExtend_Client()
	 * @model
	 * @generated
	 */
	UseCase getClient();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Extend#getClient <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(UseCase value);

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier</em>' reference.
	 * @see #setSupplier(UseCase)
	 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getExtend_Supplier()
	 * @model
	 * @generated
	 */
	UseCase getSupplier();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Extend#getSupplier <em>Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier</em>' reference.
	 * @see #getSupplier()
	 * @generated
	 */
	void setSupplier(UseCase value);

	/**
	 * Returns the value of the '<em><b>Extension Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Point</em>' reference.
	 * @see #setExtensionPoint(ExtensionPoint)
	 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getExtend_ExtensionPoint()
	 * @model
	 * @generated
	 */
	ExtensionPoint getExtensionPoint();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Extend#getExtensionPoint <em>Extension Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Point</em>' reference.
	 * @see #getExtensionPoint()
	 * @generated
	 */
	void setExtensionPoint(ExtensionPoint value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getExtend_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Extend#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

} // Extend
