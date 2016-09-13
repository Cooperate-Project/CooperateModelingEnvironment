/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Association;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.MultiAssociation#getConnectorEnds <em>Connector Ends</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getMultiAssociation()
 * @model
 * @generated
 */
public interface MultiAssociation extends Connector, NamedElement<Association> {
	/**
	 * Returns the value of the '<em><b>Connector Ends</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.modeling.textual.cls.cls.MemberEnd}.
	 * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.cls.cls.MemberEnd#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector Ends</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Ends</em>' containment reference list.
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getMultiAssociation_ConnectorEnds()
	 * @see de.cooperateproject.modeling.textual.cls.cls.MemberEnd#getAssociation
	 * @model opposite="association" containment="true" lower="2"
	 * @generated
	 */
	EList<MemberEnd> getConnectorEnds();

} // MultiAssociation
