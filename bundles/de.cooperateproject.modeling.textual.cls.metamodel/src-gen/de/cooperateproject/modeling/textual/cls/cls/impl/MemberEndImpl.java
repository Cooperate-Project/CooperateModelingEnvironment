/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.Cardinality;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.Element;
import de.cooperateproject.modeling.textual.cls.cls.MemberEnd;
import de.cooperateproject.modeling.textual.cls.cls.MultiAssociation;
import de.cooperateproject.modeling.textual.cls.cls.UMLTypeReference;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.MemberEndImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.MemberEndImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.MemberEndImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.MemberEndImpl#isNavigable <em>Navigable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemberEndImpl extends NamedElementOptionalImpl<Property> implements MemberEnd {
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
	public Cardinality getCardinality() {
		return (Cardinality)eGet(ClsPackage.Literals.MEMBER_END__CARDINALITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCardinality(Cardinality newCardinality) {
		eSet(ClsPackage.Literals.MEMBER_END__CARDINALITY, newCardinality);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLTypeReference getType() {
		return (UMLTypeReference)eGet(ClsPackage.Literals.MEMBER_END__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(UMLTypeReference newType) {
		eSet(ClsPackage.Literals.MEMBER_END__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiAssociation getAssociation() {
		return (MultiAssociation)eGet(ClsPackage.Literals.MEMBER_END__ASSOCIATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssociation(MultiAssociation newAssociation) {
		eSet(ClsPackage.Literals.MEMBER_END__ASSOCIATION, newAssociation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNavigable() {
		return (Boolean)eGet(ClsPackage.Literals.MEMBER_END__NAVIGABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNavigable(boolean newNavigable) {
		eSet(ClsPackage.Literals.MEMBER_END__NAVIGABLE, newNavigable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public de.cooperateproject.modeling.textual.cls.cls.Package getNearestPackage() {
		EObject focus = this.eContainer();
		while (focus != null && !(focus instanceof de.cooperateproject.modeling.textual.cls.cls.Package)) {
			focus = focus.eContainer();
		}
		return (de.cooperateproject.modeling.textual.cls.cls.Package)focus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Element.class) {
			switch (baseOperationID) {
				case ClsPackage.ELEMENT___GET_NEAREST_PACKAGE: return ClsPackage.MEMBER_END___GET_NEAREST_PACKAGE;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ClsPackage.MEMBER_END___GET_NEAREST_PACKAGE:
				return getNearestPackage();
		}
		return super.eInvoke(operationID, arguments);
	}

} //MemberEndImpl
