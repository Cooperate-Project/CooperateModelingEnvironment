/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.Member;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.MemberImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MemberImpl<T extends NamedElement> extends PropertyImpl<T> implements Member<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClsPackage.Literals.MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Classifier<?> getOwner() {
		return (Classifier<?>)eGet(ClsPackage.Literals.MEMBER__OWNER, true);
	}

} //MemberImpl
