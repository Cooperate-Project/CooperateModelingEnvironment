/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.Cardinality;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.MemberEnd;
import de.cooperateproject.modeling.textual.cls.cls.MultiAssociation;
import de.cooperateproject.modeling.textual.cls.cls.NamedElementOptional;
import de.cooperateproject.modeling.textual.cls.cls.UMLReferencingElement;
import de.cooperateproject.modeling.textual.cls.cls.UMLTypeReference;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.MemberEndImpl#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.MemberEndImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.MemberEndImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.MemberEndImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.MemberEndImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.MemberEndImpl#isNavigable <em>Navigable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemberEndImpl extends CDOObjectImpl implements MemberEnd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClsPackage.Literals.MEMBER_END;
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
	public Property getReferencedElement() {
		return (Property)eGet(ClsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedElement(Property newReferencedElement) {
		eSet(ClsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, newReferencedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		if (getReferencedElement() == null) {
			return null;
		}
		return getReferencedElement().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getCardinality() {
		return (Cardinality)eGet(ClsPackage.Literals.MEMBER_END__CARDINALITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(Cardinality newCardinality) {
		eSet(ClsPackage.Literals.MEMBER_END__CARDINALITY, newCardinality);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLTypeReference getType() {
		return (UMLTypeReference)eGet(ClsPackage.Literals.MEMBER_END__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(UMLTypeReference newType) {
		eSet(ClsPackage.Literals.MEMBER_END__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiAssociation getAssociation() {
		return (MultiAssociation)eGet(ClsPackage.Literals.MEMBER_END__ASSOCIATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociation(MultiAssociation newAssociation) {
		eSet(ClsPackage.Literals.MEMBER_END__ASSOCIATION, newAssociation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNavigable() {
		return (Boolean)eGet(ClsPackage.Literals.MEMBER_END__NAVIGABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigable(boolean newNavigable) {
		eSet(ClsPackage.Literals.MEMBER_END__NAVIGABLE, newNavigable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == UMLReferencingElement.class) {
			switch (derivedFeatureID) {
				case ClsPackage.MEMBER_END__REFERENCED_ELEMENT: return ClsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == NamedElementOptional.class) {
			switch (derivedFeatureID) {
				case ClsPackage.MEMBER_END__NAME: return ClsPackage.NAMED_ELEMENT_OPTIONAL__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == UMLReferencingElement.class) {
			switch (baseFeatureID) {
				case ClsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT: return ClsPackage.MEMBER_END__REFERENCED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == NamedElementOptional.class) {
			switch (baseFeatureID) {
				case ClsPackage.NAMED_ELEMENT_OPTIONAL__NAME: return ClsPackage.MEMBER_END__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //MemberEndImpl
