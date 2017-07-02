/**
 */
package de.cooperateproject.modeling.textual.component.metamodel.component;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage
 * @generated
 */
public interface ComponentFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ComponentFactory eINSTANCE = de.cooperateproject.modeling.textual.component.metamodel.component.impl.ComponentFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Diagram</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagram</em>'.
     * @generated
     */
    ComponentDiagram createComponentDiagram();

    /**
     * Returns a new object of class '<em>Root Package</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Root Package</em>'.
     * @generated
     */
    RootPackage createRootPackage();

    /**
     * Returns a new object of class '<em>Connector</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Connector</em>'.
     * @generated
     */
    Connector createConnector();

    /**
     * Returns a new object of class '<em>Generalization</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Generalization</em>'.
     * @generated
     */
    Generalization createGeneralization();

    /**
     * Returns a new object of class '<em>Abstraction</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Abstraction</em>'.
     * @generated
     */
    Abstraction createAbstraction();

    /**
     * Returns a new object of class '<em>Manifestation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Manifestation</em>'.
     * @generated
     */
    Manifestation createManifestation();

    /**
     * Returns a new object of class '<em>Substitution</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Substitution</em>'.
     * @generated
     */
    Substitution createSubstitution();

    /**
     * Returns a new object of class '<em>Dependency</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Dependency</em>'.
     * @generated
     */
    Dependency createDependency();

    /**
     * Returns a new object of class '<em>Component</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Component</em>'.
     * @generated
     */
    Component createComponent();

    /**
     * Returns a new object of class '<em>Interface</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interface</em>'.
     * @generated
     */
    Interface createInterface();

    /**
     * Returns a new object of class '<em>Method</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Method</em>'.
     * @generated
     */
    Method createMethod();

    /**
     * Returns a new object of class '<em>Parameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Parameter</em>'.
     * @generated
     */
    Parameter createParameter();

    /**
     * Returns a new object of class '<em>Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Attribute</em>'.
     * @generated
     */
    Attribute createAttribute();

    /**
     * Returns a new object of class '<em>Provide</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Provide</em>'.
     * @generated
     */
    Provide createProvide();

    /**
     * Returns a new object of class '<em>Require</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Require</em>'.
     * @generated
     */
    Require createRequire();

    /**
     * Returns a new object of class '<em>Port</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Port</em>'.
     * @generated
     */
    Port createPort();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ComponentPackage getComponentPackage();

} //ComponentFactory
