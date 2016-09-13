/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getNamedElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasReferencedElement'"
 * @generated
 */
public interface NamedElement<T extends org.eclipse.uml2.uml.NamedElement> extends NamedElementOptional<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (getReferencedElement() == null) {\r\n\t<%org.eclipse.emf.common.util.BasicDiagnostic%> basicDiagnostic = new <%org.eclipse.emf.common.util.BasicDiagnostic%>(<%org.eclipse.emf.common.util.BasicDiagnostic%>.ERROR, \"hasReferencedElement\", 1, \"A referenced element is mandatory.\", new Object[]{this});\r\n\tdiagnostics.add(basicDiagnostic);\r\n\treturn false;\r\n}\r\ndiagnostics.add(<%org.eclipse.emf.common.util.BasicDiagnostic%>.OK_INSTANCE);\r\nreturn true;'"
	 * @generated
	 */
	boolean hasReferencedElement(DiagnosticChain diagnostics, Map<Object, Object> context);

} // NamedElement
