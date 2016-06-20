/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.cls.cls.ClassifierReference;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.ClassifierReferenceImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassifierReferenceImpl extends TypeReferenceImpl implements ClassifierReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClsPackage.Literals.CLASSIFIER_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier<?> getType() {
		return (Classifier<?>)eGet(ClsPackage.Literals.CLASSIFIER_REFERENCE__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Classifier<?> newType) {
		eSet(ClsPackage.Literals.CLASSIFIER_REFERENCE__TYPE, newType);
	}

} //ClassifierReferenceImpl
