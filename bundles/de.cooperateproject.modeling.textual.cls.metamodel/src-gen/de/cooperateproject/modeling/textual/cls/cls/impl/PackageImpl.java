/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.Connector;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageImport;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.PackageImpl#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.PackageImpl#getOwningPackage <em>Owning Package</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.PackageImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.PackageImpl#getPackageImports <em>Package Imports</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.PackageImpl#getClassifiers <em>Classifiers</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.PackageImpl#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends CDOObjectImpl implements de.cooperateproject.modeling.textual.cls.cls.Package {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PackageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ClsPackage.Literals.PACKAGE;
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
    public org.eclipse.uml2.uml.Package getReferencedElement() {
        return (org.eclipse.uml2.uml.Package)eDynamicGet(ClsPackage.PACKAGE__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.eclipse.uml2.uml.Package basicGetReferencedElement() {
        return (org.eclipse.uml2.uml.Package)eDynamicGet(ClsPackage.PACKAGE__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReferencedElement(org.eclipse.uml2.uml.Package newReferencedElement) {
        eDynamicSet(ClsPackage.PACKAGE__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, newReferencedElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return (String)eDynamicGet(ClsPackage.PACKAGE__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        eDynamicSet(ClsPackage.PACKAGE__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, newName);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public de.cooperateproject.modeling.textual.cls.cls.Package getOwningPackage() {
        return (de.cooperateproject.modeling.textual.cls.cls.Package)eDynamicGet(ClsPackage.PACKAGE__OWNING_PACKAGE, TextualCommonsPackage.Literals.PACKAGE_BASE__OWNING_PACKAGE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOwningPackage(de.cooperateproject.modeling.textual.cls.cls.Package newOwningPackage, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newOwningPackage, ClsPackage.PACKAGE__OWNING_PACKAGE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwningPackage(de.cooperateproject.modeling.textual.cls.cls.Package newOwningPackage) {
        eDynamicSet(ClsPackage.PACKAGE__OWNING_PACKAGE, TextualCommonsPackage.Literals.PACKAGE_BASE__OWNING_PACKAGE, newOwningPackage);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<de.cooperateproject.modeling.textual.cls.cls.Package> getPackages() {
        return (EList<de.cooperateproject.modeling.textual.cls.cls.Package>)eDynamicGet(ClsPackage.PACKAGE__PACKAGES, TextualCommonsPackage.Literals.PACKAGE_BASE__PACKAGES, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<PackageImport> getPackageImports() {
        return (EList<PackageImport>)eDynamicGet(ClsPackage.PACKAGE__PACKAGE_IMPORTS, TextualCommonsPackage.Literals.PACKAGE_BASE__PACKAGE_IMPORTS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Classifier<? extends org.eclipse.uml2.uml.Classifier>> getClassifiers() {
        return (EList<Classifier<? extends org.eclipse.uml2.uml.Classifier>>)eDynamicGet(ClsPackage.PACKAGE__CLASSIFIERS, ClsPackage.Literals.PACKAGE__CLASSIFIERS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Connector> getConnectors() {
        return (EList<Connector>)eDynamicGet(ClsPackage.PACKAGE__CONNECTORS, ClsPackage.Literals.PACKAGE__CONNECTORS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PackageBase<?> getNearestPackage() {
        EObject parent = this;
        while (parent != null && !(parent instanceof PackageBase)) {
            parent = parent.eContainer();
        }
        return (PackageBase<?>)parent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ClsPackage.PACKAGE__OWNING_PACKAGE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetOwningPackage((de.cooperateproject.modeling.textual.cls.cls.Package)otherEnd, msgs);
            case ClsPackage.PACKAGE__PACKAGES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackages()).basicAdd(otherEnd, msgs);
            case ClsPackage.PACKAGE__PACKAGE_IMPORTS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackageImports()).basicAdd(otherEnd, msgs);
            case ClsPackage.PACKAGE__CLASSIFIERS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getClassifiers()).basicAdd(otherEnd, msgs);
            case ClsPackage.PACKAGE__CONNECTORS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectors()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ClsPackage.PACKAGE__OWNING_PACKAGE:
                return basicSetOwningPackage(null, msgs);
            case ClsPackage.PACKAGE__PACKAGES:
                return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
            case ClsPackage.PACKAGE__PACKAGE_IMPORTS:
                return ((InternalEList<?>)getPackageImports()).basicRemove(otherEnd, msgs);
            case ClsPackage.PACKAGE__CLASSIFIERS:
                return ((InternalEList<?>)getClassifiers()).basicRemove(otherEnd, msgs);
            case ClsPackage.PACKAGE__CONNECTORS:
                return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case ClsPackage.PACKAGE__OWNING_PACKAGE:
                return eInternalContainer().eInverseRemove(this, TextualCommonsPackage.PACKAGE_BASE__PACKAGES, PackageBase.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ClsPackage.PACKAGE__REFERENCED_ELEMENT:
                if (resolve) return getReferencedElement();
                return basicGetReferencedElement();
            case ClsPackage.PACKAGE__NAME:
                return getName();
            case ClsPackage.PACKAGE__OWNING_PACKAGE:
                return getOwningPackage();
            case ClsPackage.PACKAGE__PACKAGES:
                return getPackages();
            case ClsPackage.PACKAGE__PACKAGE_IMPORTS:
                return getPackageImports();
            case ClsPackage.PACKAGE__CLASSIFIERS:
                return getClassifiers();
            case ClsPackage.PACKAGE__CONNECTORS:
                return getConnectors();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ClsPackage.PACKAGE__REFERENCED_ELEMENT:
                setReferencedElement((org.eclipse.uml2.uml.Package)newValue);
                return;
            case ClsPackage.PACKAGE__NAME:
                setName((String)newValue);
                return;
            case ClsPackage.PACKAGE__OWNING_PACKAGE:
                setOwningPackage((de.cooperateproject.modeling.textual.cls.cls.Package)newValue);
                return;
            case ClsPackage.PACKAGE__PACKAGES:
                getPackages().clear();
                getPackages().addAll((Collection<? extends de.cooperateproject.modeling.textual.cls.cls.Package>)newValue);
                return;
            case ClsPackage.PACKAGE__PACKAGE_IMPORTS:
                getPackageImports().clear();
                getPackageImports().addAll((Collection<? extends PackageImport>)newValue);
                return;
            case ClsPackage.PACKAGE__CLASSIFIERS:
                getClassifiers().clear();
                getClassifiers().addAll((Collection<? extends Classifier<? extends org.eclipse.uml2.uml.Classifier>>)newValue);
                return;
            case ClsPackage.PACKAGE__CONNECTORS:
                getConnectors().clear();
                getConnectors().addAll((Collection<? extends Connector>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case ClsPackage.PACKAGE__REFERENCED_ELEMENT:
                setReferencedElement((org.eclipse.uml2.uml.Package)null);
                return;
            case ClsPackage.PACKAGE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ClsPackage.PACKAGE__OWNING_PACKAGE:
                setOwningPackage((de.cooperateproject.modeling.textual.cls.cls.Package)null);
                return;
            case ClsPackage.PACKAGE__PACKAGES:
                getPackages().clear();
                return;
            case ClsPackage.PACKAGE__PACKAGE_IMPORTS:
                getPackageImports().clear();
                return;
            case ClsPackage.PACKAGE__CLASSIFIERS:
                getClassifiers().clear();
                return;
            case ClsPackage.PACKAGE__CONNECTORS:
                getConnectors().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case ClsPackage.PACKAGE__REFERENCED_ELEMENT:
                return basicGetReferencedElement() != null;
            case ClsPackage.PACKAGE__NAME:
                return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
            case ClsPackage.PACKAGE__OWNING_PACKAGE:
                return getOwningPackage() != null;
            case ClsPackage.PACKAGE__PACKAGES:
                return !getPackages().isEmpty();
            case ClsPackage.PACKAGE__PACKAGE_IMPORTS:
                return !getPackageImports().isEmpty();
            case ClsPackage.PACKAGE__CLASSIFIERS:
                return !getClassifiers().isEmpty();
            case ClsPackage.PACKAGE__CONNECTORS:
                return !getConnectors().isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == Element.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == UMLReferencingElement.class) {
            switch (derivedFeatureID) {
                case ClsPackage.PACKAGE__REFERENCED_ELEMENT: return TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;
                default: return -1;
            }
        }
        if (baseClass == NamedElement.class) {
            switch (derivedFeatureID) {
                case ClsPackage.PACKAGE__NAME: return TextualCommonsPackage.NAMED_ELEMENT__NAME;
                default: return -1;
            }
        }
        if (baseClass == PackageBase.class) {
            switch (derivedFeatureID) {
                case ClsPackage.PACKAGE__OWNING_PACKAGE: return TextualCommonsPackage.PACKAGE_BASE__OWNING_PACKAGE;
                case ClsPackage.PACKAGE__PACKAGES: return TextualCommonsPackage.PACKAGE_BASE__PACKAGES;
                case ClsPackage.PACKAGE__PACKAGE_IMPORTS: return TextualCommonsPackage.PACKAGE_BASE__PACKAGE_IMPORTS;
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
        if (baseClass == Element.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == UMLReferencingElement.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT: return ClsPackage.PACKAGE__REFERENCED_ELEMENT;
                default: return -1;
            }
        }
        if (baseClass == NamedElement.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.NAMED_ELEMENT__NAME: return ClsPackage.PACKAGE__NAME;
                default: return -1;
            }
        }
        if (baseClass == PackageBase.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.PACKAGE_BASE__OWNING_PACKAGE: return ClsPackage.PACKAGE__OWNING_PACKAGE;
                case TextualCommonsPackage.PACKAGE_BASE__PACKAGES: return ClsPackage.PACKAGE__PACKAGES;
                case TextualCommonsPackage.PACKAGE_BASE__PACKAGE_IMPORTS: return ClsPackage.PACKAGE__PACKAGE_IMPORTS;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
                case TextualCommonsPackage.ELEMENT___GET_NEAREST_PACKAGE: return ClsPackage.PACKAGE___GET_NEAREST_PACKAGE;
                default: return -1;
            }
        }
        if (baseClass == UMLReferencingElement.class) {
            switch (baseOperationID) {
                default: return -1;
            }
        }
        if (baseClass == NamedElement.class) {
            switch (baseOperationID) {
                default: return -1;
            }
        }
        if (baseClass == PackageBase.class) {
            switch (baseOperationID) {
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
            case ClsPackage.PACKAGE___GET_NEAREST_PACKAGE:
                return getNearestPackage();
        }
        return super.eInvoke(operationID, arguments);
    }

} //PackageImpl
