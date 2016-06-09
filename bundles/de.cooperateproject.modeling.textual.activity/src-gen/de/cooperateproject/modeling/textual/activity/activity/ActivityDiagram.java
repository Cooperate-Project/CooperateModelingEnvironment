/**
 */
package de.cooperateproject.modeling.textual.activity.activity;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.activity.ActivityDiagram#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getActivityDiagram()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface ActivityDiagram extends CDOObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link de.cooperateproject.modeling.textual.activity.activity.ActivityElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see de.cooperateproject.modeling.textual.activity.activity.ActivityPackage#getActivityDiagram_Elements()
   * @model containment="true"
   * @generated
   */
  EList<ActivityElement> getElements();

} // ActivityDiagram
