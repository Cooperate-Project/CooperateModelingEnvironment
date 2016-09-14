/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.Association;
import de.cooperateproject.modeling.textual.cls.cls.AssociationProperties;
import de.cooperateproject.modeling.textual.cls.cls.Cardinality;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationPropertiesImpl#getCardinalityLeft <em>Cardinality Left</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationPropertiesImpl#getCardinalityRight <em>Cardinality Right</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationPropertiesImpl#getPropertyLeft <em>Property Left</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationPropertiesImpl#getPropertyRight <em>Property Right</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationPropertiesImpl#getAssociation <em>Association</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationPropertiesImpl extends CDOObjectImpl implements AssociationProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClsPackage.Literals.ASSOCIATION_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getCardinalityLeft() {
		return (Cardinality)eGet(ClsPackage.Literals.ASSOCIATION_PROPERTIES__CARDINALITY_LEFT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinalityLeft(Cardinality newCardinalityLeft) {
		eSet(ClsPackage.Literals.ASSOCIATION_PROPERTIES__CARDINALITY_LEFT, newCardinalityLeft);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getCardinalityRight() {
		return (Cardinality)eGet(ClsPackage.Literals.ASSOCIATION_PROPERTIES__CARDINALITY_RIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinalityRight(Cardinality newCardinalityRight) {
		eSet(ClsPackage.Literals.ASSOCIATION_PROPERTIES__CARDINALITY_RIGHT, newCardinalityRight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getPropertyLeft() {
		return (Property)eGet(ClsPackage.Literals.ASSOCIATION_PROPERTIES__PROPERTY_LEFT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyLeft(Property newPropertyLeft) {
		eSet(ClsPackage.Literals.ASSOCIATION_PROPERTIES__PROPERTY_LEFT, newPropertyLeft);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getPropertyRight() {
		return (Property)eGet(ClsPackage.Literals.ASSOCIATION_PROPERTIES__PROPERTY_RIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyRight(Property newPropertyRight) {
		eSet(ClsPackage.Literals.ASSOCIATION_PROPERTIES__PROPERTY_RIGHT, newPropertyRight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getAssociation() {
		return (Association)eGet(ClsPackage.Literals.ASSOCIATION_PROPERTIES__ASSOCIATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociation(Association newAssociation) {
		eSet(ClsPackage.Literals.ASSOCIATION_PROPERTIES__ASSOCIATION, newAssociation);
	}

} //AssociationPropertiesImpl
