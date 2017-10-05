/**
 */
package de.cooperateproject.modeling.textual.common.metamodel.textualCommons;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Namespace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Referencing Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement#getReferencedElement <em>Referenced Element</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage#getUMLReferencingElement()
 * @model abstract="true"
 * @generated
 */
public interface UMLReferencingElement<UMLType extends Element> extends de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element {
	/**
     * Returns the value of the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Referenced Element</em>' reference.
     * @see #setReferencedElement(Element)
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage#getUMLReferencingElement_ReferencedElement()
     * @model
     * @generated
     */
	UMLType getReferencedElement();

	/**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement#getReferencedElement <em>Referenced Element</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Referenced Element</em>' reference.
     * @see #getReferencedElement()
     * @generated
     */
	void setReferencedElement(UMLType value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.ecore.EObject%&gt; currentElement = &lt;%java.util.Optional%&gt;.ofNullable(getReferencedElement()).map(&lt;%org.eclipse.emf.ecore.EObject%&gt;::eContainer).orElse(null);\r\nwhile (currentElement != null &amp;&amp; !(currentElement instanceof &lt;%org.eclipse.uml2.uml.Namespace%&gt;)) {\r\n\tcurrentElement = currentElement.eContainer();\r\n}\r\nreturn &lt;%java.util.Optional%&gt;.ofNullable(currentElement).filter(&lt;%org.eclipse.uml2.uml.Namespace%&gt;.class::isInstance).map(&lt;%org.eclipse.uml2.uml.Namespace%&gt;.class::cast).orElse(null);'"
     * @generated
     */
    Namespace getUMLParentNamespace();

} // UMLReferencingElement
