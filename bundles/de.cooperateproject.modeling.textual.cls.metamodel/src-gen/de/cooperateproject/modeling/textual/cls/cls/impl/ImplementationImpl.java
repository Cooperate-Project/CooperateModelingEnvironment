/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.uml.InterfaceRealization;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.Implementation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.ImplementationImpl#getReferencedElement <em>Referenced
 * Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationImpl extends TypedConnectorImpl implements Implementation {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ImplementationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ClsPackage.Literals.IMPLEMENTATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public InterfaceRealization getReferencedElement() {
        org.eclipse.uml2.uml.Type implementor = getLeft();
        org.eclipse.uml2.uml.Type contract = getRight();

        if (implementor instanceof org.eclipse.uml2.uml.BehavioredClassifier) {
            org.eclipse.uml2.uml.BehavioredClassifier implementingClassifier = (org.eclipse.uml2.uml.BehavioredClassifier) implementor;
            return implementingClassifier.getInterfaceRealizations().stream().filter(r -> r.getContract() == contract)
                    .findFirst().orElse(null);
        }

        return null;
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        if (featureID == ClsPackage.IMPLEMENTATION__REFERENCED_ELEMENT) {
            return getReferencedElement();
        }
        return super.eGet(featureID, resolve, coreType);
    }

} // ImplementationImpl
