/**
 */
package de.cooperateproject.ui.launchermodel.Launcher;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.ui.launchermodel.Launcher.LauncherPackage
 * @generated
 */
public interface LauncherFactory extends EFactory {
	/**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	LauncherFactory eINSTANCE = de.cooperateproject.ui.launchermodel.Launcher.impl.LauncherFactoryImpl.init();

	/**
     * Returns a new object of class '<em>Diagram</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagram</em>'.
     * @generated
     */
	Diagram createDiagram();

	/**
     * Returns a new object of class '<em>Textual Concrete Syntax Model</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Textual Concrete Syntax Model</em>'.
     * @generated
     */
	TextualConcreteSyntaxModel createTextualConcreteSyntaxModel();

	/**
     * Returns a new object of class '<em>Graphical Concrete Syntax Model</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Graphical Concrete Syntax Model</em>'.
     * @generated
     */
	GraphicalConcreteSyntaxModel createGraphicalConcreteSyntaxModel();

	/**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
	LauncherPackage getLauncherPackage();

} //LauncherFactory
