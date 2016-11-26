/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.NamedElementAliased;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.StringExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Element Aliased</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.NamedElementAliasedImpl#getAliasExpression <em>Alias Expression</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.NamedElementAliasedImpl#getAlias <em>Alias</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NamedElementAliasedImpl<T extends NamedElement> extends NamedElementImpl<T> implements NamedElementAliased<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementAliasedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClsPackage.Literals.NAMED_ELEMENT_ALIASED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringExpression getAliasExpression() {
		return (StringExpression)eGet(ClsPackage.Literals.NAMED_ELEMENT_ALIASED__ALIAS_EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAliasExpression(StringExpression newAliasExpression) {
		eSet(ClsPackage.Literals.NAMED_ELEMENT_ALIASED__ALIAS_EXPRESSION, newAliasExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlias() {
		if (getAliasExpression() == null) {
			return null;
		}
		return getAliasExpression().getName();
	}

} //NamedElementAliasedImpl
