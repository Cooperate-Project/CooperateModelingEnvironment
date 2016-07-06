/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.AssociationProperties;
import de.cooperateproject.modeling.textual.cls.cls.Cardinality;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.ReadingDirection;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

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
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationPropertiesImpl#getReadingDirection <em>Reading Direction</em>}</li>
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
	public ReadingDirection getReadingDirection() {
		return (ReadingDirection)eGet(ClsPackage.Literals.ASSOCIATION_PROPERTIES__READING_DIRECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadingDirection(ReadingDirection newReadingDirection) {
		eSet(ClsPackage.Literals.ASSOCIATION_PROPERTIES__READING_DIRECTION, newReadingDirection);
	}

} //AssociationPropertiesImpl
