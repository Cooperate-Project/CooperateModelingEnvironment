/**
 */
package de.cooperateproject.modeling.textual.cls.cls;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.Generalization#getReferencedElement <em>Referenced Element</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization extends TypedConnector {
	/**
	 * Returns the value of the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Element</em>' reference.
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getGeneralization_ReferencedElement()
	 * @model required="true" transient="true" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='org.eclipse.uml2.uml.Type special = getLeft();\r\norg.eclipse.uml2.uml.Type general = getRight();\r\n\r\nif (special instanceof org.eclipse.uml2.uml.Classifier) {\r\n\torg.eclipse.uml2.uml.Classifier specialClassifier = (org.eclipse.uml2.uml.Classifier)special;\r\n\treturn specialClassifier.getGeneralizations().stream().filter(g -> g.getGeneral() == general).findFirst().orElse(null);\r\n}\r\n\r\nreturn null;'"
	 * @generated
	 */
	org.eclipse.uml2.uml.Generalization getReferencedElement();

} // Generalization
