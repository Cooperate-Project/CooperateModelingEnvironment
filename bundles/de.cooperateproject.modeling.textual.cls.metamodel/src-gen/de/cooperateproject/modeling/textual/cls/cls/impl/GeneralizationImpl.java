/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.uml.Generalization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GeneralizationImpl extends TypedConnectorImpl<Generalization> implements de.cooperateproject.modeling.textual.cls.cls.Generalization {
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

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * This is specialized for the more specific type known in this context.
     * @generated
     */
    @Override
    public void setReferencedElement(Generalization newReferencedElement) {
        super.setReferencedElement(newReferencedElement);
    }

} //GeneralizationImpl
