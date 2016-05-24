/**
 * generated by Xtext 2.9.0
 */
package de.cooperateproject.modeling.language.usecase.usecase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.language.usecase.usecase.System#getUsecases <em>Usecases</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.language.usecase.usecase.UsecasePackage#getSystem()
 * @model
 * @generated
 */
public interface System extends Commentable
{
  /**
   * Returns the value of the '<em><b>Usecases</b></em>' containment reference list.
   * The list contents are of type {@link de.cooperateproject.modeling.language.usecase.usecase.UseCase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Usecases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Usecases</em>' containment reference list.
   * @see de.cooperateproject.modeling.language.usecase.usecase.UsecasePackage#getSystem_Usecases()
   * @model containment="true"
   * @generated
   */
  EList<UseCase> getUsecases();

} // System