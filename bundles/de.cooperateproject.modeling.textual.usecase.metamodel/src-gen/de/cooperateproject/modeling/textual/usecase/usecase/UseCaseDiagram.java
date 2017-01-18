/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.UseCaseDiagram#getRootPackage <em>Root Package</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getUseCaseDiagram()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface UseCaseDiagram extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Root Package</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.usecase.usecase.RootPackage#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Package</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Package</em>' containment reference.
	 * @see #setRootPackage(RootPackage)
	 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getUseCaseDiagram_RootPackage()
	 * @see de.cooperateproject.modeling.textual.usecase.usecase.RootPackage#getDiagram
	 * @model opposite="diagram" containment="true"
	 * @generated
	 */
	RootPackage getRootPackage();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.UseCaseDiagram#getRootPackage <em>Root Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Package</em>' containment reference.
	 * @see #getRootPackage()
	 * @generated
	 */
	void setRootPackage(RootPackage value);

} // UseCaseDiagram
