/**
 */
package dummy;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dummy.Container#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see dummy.DummyPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends Containable {
	/**
     * Returns the value of the '<em><b>Content</b></em>' containment reference list.
     * The list contents are of type {@link dummy.Containable}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Content</em>' containment reference list.
     * @see dummy.DummyPackage#getContainer_Content()
     * @model containment="true"
     * @generated
     */
	EList<Containable> getContent();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model required="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='ReferencingElement element = DummyFactory.eINSTANCE.createReferencingElement();\r\ngetContent().add(element);\r\nreturn element;'"
     * @generated
     */
	ReferencingElement createReferencingElement();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model required="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='ReferencingElement2 element = DummyFactory.eINSTANCE.createReferencingElement2();\r\ngetContent().add(element);\r\nreturn element;'"
     * @generated
     */
	ReferencingElement2 createReferencingElement2();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model required="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='dummy.Container element = DummyFactory.eINSTANCE.createContainer();\r\ngetContent().add(element);\r\nreturn element;'"
     * @generated
     */
	Container createContainer();

} // Container
