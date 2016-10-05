/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import org.eclipse.uml2.uml.InterfaceRealization;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.Implementation#getReferencedElement <em>Referenced Element</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getImplementation()
 * @model
 * @generated
 */
public interface Implementation extends TypedConnector {

	/**
	 * Returns the value of the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Element</em>' reference.
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getImplementation_ReferencedElement()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='org.eclipse.uml2.uml.Type implementor = getLeft().getType();\r\norg.eclipse.uml2.uml.Type contract = getRight().getType();\r\n\r\nif (implementor instanceof org.eclipse.uml2.uml.BehavioredClassifier) {\r\n\torg.eclipse.uml2.uml.BehavioredClassifier implementingClassifier = (org.eclipse.uml2.uml.BehavioredClassifier)implementor;\r\n\treturn implementingClassifier.getInterfaceRealizations().stream().filter(r -> r.getContract() == contract).findFirst().orElse(null);\r\n}\r\n\r\nreturn null;'"
	 * @generated
	 */
	InterfaceRealization getReferencedElement();
} // Implementation
