/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.Generalization;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.GeneralizationImpl#getReferencedElement <em>Referenced Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralizationImpl extends TypedConnectorImpl implements Generalization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClsPackage.Literals.GENERALIZATION;
	}



	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		if(featureID == 2)
			return getReferencedElement();
		// TODO Auto-generated method stub
		return super.eGet(featureID, resolve, coreType);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.uml2.uml.Generalization getReferencedElement() {
		org.eclipse.uml2.uml.Type special = getLeft().getType();
		org.eclipse.uml2.uml.Type general = getRight().getType();
		
		if (special instanceof org.eclipse.uml2.uml.Classifier) {
			org.eclipse.uml2.uml.Classifier specialClassifier = (org.eclipse.uml2.uml.Classifier)special;
			return specialClassifier.getGeneralizations().stream().filter(g -> g.getGeneral() == general).findFirst().orElse(null);
		}
		
		return null;
	}

} //GeneralizationImpl
