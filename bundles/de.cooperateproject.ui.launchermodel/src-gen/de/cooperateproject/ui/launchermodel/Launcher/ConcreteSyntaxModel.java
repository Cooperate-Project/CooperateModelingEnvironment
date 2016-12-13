/**
 */
package de.cooperateproject.ui.launchermodel.Launcher;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Syntax Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel#getExtension <em>Extension</em>}</li>
 *   <li>{@link de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel#getRootElement <em>Root Element</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.ui.launchermodel.Launcher.LauncherPackage#getConcreteSyntaxModel()
 * @model abstract="true"
 * @generated
 */
public interface ConcreteSyntaxModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see #setExtension(String)
	 * @see de.cooperateproject.ui.launchermodel.Launcher.LauncherPackage#getConcreteSyntaxModel_Extension()
	 * @model required="true"
	 * @generated
	 */
	String getExtension();

	/**
	 * Sets the value of the '{@link de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel#getExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' attribute.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(String value);

	/**
	 * Returns the value of the '<em><b>Root Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Element</em>' reference.
	 * @see #setRootElement(EObject)
	 * @see de.cooperateproject.ui.launchermodel.Launcher.LauncherPackage#getConcreteSyntaxModel_RootElement()
	 * @model required="true"
	 * @generated
	 */
	EObject getRootElement();

	/**
	 * Sets the value of the '{@link de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel#getRootElement <em>Root Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Element</em>' reference.
	 * @see #getRootElement()
	 * @generated
	 */
	void setRootElement(EObject value);

} // ConcreteSyntaxModel
