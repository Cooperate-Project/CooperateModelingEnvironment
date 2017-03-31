/**
 */
package de.cooperateproject.modeling.textual.common.metamodel.textualCommons;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage#getElement()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface Element extends CDOObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.ecore.EObject%> parent = this;\r\nwhile (parent != null && !(parent instanceof PackageBase)) {\r\n\tparent = parent.eContainer();\r\n}\r\nreturn (PackageBase<?>)parent;'"
	 * @generated
	 */
	PackageBase<?> getNearestPackage();

} // Element
