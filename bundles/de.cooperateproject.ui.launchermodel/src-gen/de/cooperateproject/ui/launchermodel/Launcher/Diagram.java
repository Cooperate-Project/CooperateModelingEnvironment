/**
 */
package de.cooperateproject.ui.launchermodel.Launcher;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.ui.launchermodel.Launcher.Diagram#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.ui.launchermodel.Launcher.Diagram#getConcreteSyntaxModels <em>Concrete Syntax Models</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.ui.launchermodel.Launcher.LauncherPackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.cooperateproject.ui.launchermodel.Launcher.LauncherPackage#getDiagram_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.cooperateproject.ui.launchermodel.Launcher.Diagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Concrete Syntax Models</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Syntax Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Syntax Models</em>' containment reference list.
	 * @see de.cooperateproject.ui.launchermodel.Launcher.LauncherPackage#getDiagram_ConcreteSyntaxModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConcreteSyntaxModel> getConcreteSyntaxModels();

} // Diagram
