/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.ClassDiagram#getTitle <em>Title</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.ClassDiagram#getRootPackage <em>Root Package</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getClassDiagram()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface ClassDiagram extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getClassDiagram_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.ClassDiagram#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Root Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Package</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Package</em>' containment reference.
	 * @see #setRootPackage(de.cooperateproject.modeling.textual.cls.cls.Package)
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getClassDiagram_RootPackage()
	 * @model containment="true" required="true"
	 * @generated
	 */
	de.cooperateproject.modeling.textual.cls.cls.Package getRootPackage();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.ClassDiagram#getRootPackage <em>Root Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Package</em>' containment reference.
	 * @see #getRootPackage()
	 * @generated
	 */
	void setRootPackage(de.cooperateproject.modeling.textual.cls.cls.Package value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList<Connector> transitiveConnectors = new <%org.eclipse.emf.common.util.BasicEList%><Connector>();\r\n\r\n<%java.util.LinkedList%><<%de.cooperateproject.modeling.textual.cls.cls.Package%>> queue = new <%java.util.LinkedList%><<%de.cooperateproject.modeling.textual.cls.cls.Package%>>();\r\nqueue.add(getRootPackage());\r\nwhile (!queue.isEmpty()) {\r\n\t<%de.cooperateproject.modeling.textual.cls.cls.Package%> currentPackage = queue.pop();\r\n\tqueue.addAll(0, currentPackage.getPackages());\r\n\ttransitiveConnectors.addAll(currentPackage.getConnectors());\r\n}\r\n\r\nreturn transitiveConnectors;'"
	 * @generated
	 */
	EList<Connector> getAllTransitiveConnectors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList<de.cooperateproject.modeling.textual.cls.cls.Package> transitivePackages = new BasicEList<de.cooperateproject.modeling.textual.cls.cls.Package>();\r\n\r\nLinkedList<de.cooperateproject.modeling.textual.cls.cls.Package> queue = new LinkedList<de.cooperateproject.modeling.textual.cls.cls.Package>();\r\nqueue.add(getRootPackage());\r\nwhile (!queue.isEmpty()) {\r\n\tde.cooperateproject.modeling.textual.cls.cls.Package currentPackage = queue.pop();\r\n\tqueue.addAll(0, currentPackage.getPackages());\r\n\ttransitivePackages.add(currentPackage);\r\n}\r\n\r\nreturn transitivePackages;'"
	 * @generated
	 */
	EList<de.cooperateproject.modeling.textual.cls.cls.Package> getAllTransitivePackages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList<de.cooperateproject.modeling.textual.cls.cls.Classifier<? extends org.eclipse.uml2.uml.Classifier>> transitiveClassifiers = new BasicEList<de.cooperateproject.modeling.textual.cls.cls.Classifier<? extends org.eclipse.uml2.uml.Classifier>>();\r\n\r\nLinkedList<de.cooperateproject.modeling.textual.cls.cls.Package> queue = new LinkedList<de.cooperateproject.modeling.textual.cls.cls.Package>();\r\nqueue.add(getRootPackage());\r\nwhile (!queue.isEmpty()) {\r\n\tde.cooperateproject.modeling.textual.cls.cls.Package currentPackage = queue.pop();\r\n\tqueue.addAll(0, currentPackage.getPackages());\r\n\ttransitiveClassifiers.addAll(currentPackage.getClassifiers());\r\n}\r\n\r\nreturn transitiveClassifiers;'"
	 * @generated
	 */
	EList<Classifier<? extends org.eclipse.uml2.uml.Classifier>> getAllTransitiveClassifiers();

} // ClassDiagram
