/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage
 * @generated
 */
public interface UsecaseFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    UsecaseFactory eINSTANCE = de.cooperateproject.modeling.textual.usecase.usecase.impl.UsecaseFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Use Case Diagram</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Use Case Diagram</em>'.
     * @generated
     */
    UseCaseDiagram createUseCaseDiagram();

    /**
     * Returns a new object of class '<em>Root Package</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Root Package</em>'.
     * @generated
     */
    RootPackage createRootPackage();

    /**
     * Returns a new object of class '<em>Actor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Actor</em>'.
     * @generated
     */
    Actor createActor();

    /**
     * Returns a new object of class '<em>System</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>System</em>'.
     * @generated
     */
    System createSystem();

    /**
     * Returns a new object of class '<em>Use Case</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Use Case</em>'.
     * @generated
     */
    UseCase createUseCase();

    /**
     * Returns a new object of class '<em>Extension Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Extension Point</em>'.
     * @generated
     */
    ExtensionPoint createExtensionPoint();

    /**
     * Returns a new object of class '<em>Association</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Association</em>'.
     * @generated
     */
    Association createAssociation();

    /**
     * Returns a new object of class '<em>Generalization</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Generalization</em>'.
     * @generated
     */
    Generalization createGeneralization();

    /**
     * Returns a new object of class '<em>Include</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Include</em>'.
     * @generated
     */
    Include createInclude();

    /**
     * Returns a new object of class '<em>Extend</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Extend</em>'.
     * @generated
     */
    Extend createExtend();

    /**
     * Returns a new object of class '<em>Comment Link</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Comment Link</em>'.
     * @generated
     */
    CommentLink createCommentLink();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    UsecasePackage getUsecasePackage();

} //UsecaseFactory
