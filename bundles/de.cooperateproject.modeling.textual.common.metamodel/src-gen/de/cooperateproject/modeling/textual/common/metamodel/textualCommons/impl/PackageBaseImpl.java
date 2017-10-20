/**
 */
package de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageImport;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.PackageBaseImpl#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.PackageBaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.PackageBaseImpl#getOwningPackage <em>Owning Package</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.PackageBaseImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.PackageBaseImpl#getPackageImports <em>Package Imports</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PackageBaseImpl<PackageType extends PackageBase<?>> extends ElementImpl implements PackageBase<PackageType> {
	/**
     * The cached setting delegate for the '{@link #getReferencedElement() <em>Referenced Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferencedElement()
     * @generated
     * @ordered
     */
    protected EStructuralFeature.Internal.SettingDelegate REFERENCED_ELEMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT).getSettingDelegate();
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
	protected PackageBaseImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return TextualCommonsPackage.Literals.PACKAGE_BASE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public org.eclipse.uml2.uml.Package getReferencedElement() {
        return (org.eclipse.uml2.uml.Package)eDynamicGet(TextualCommonsPackage.PACKAGE_BASE__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public org.eclipse.uml2.uml.Package basicGetReferencedElement() {
        return (org.eclipse.uml2.uml.Package)eDynamicGet(TextualCommonsPackage.PACKAGE_BASE__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, false, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setReferencedElement(org.eclipse.uml2.uml.Package newReferencedElement) {
        eDynamicSet(TextualCommonsPackage.PACKAGE_BASE__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, newReferencedElement);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getName() {
        return (String)eDynamicGet(TextualCommonsPackage.PACKAGE_BASE__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setName(String newName) {
        eDynamicSet(TextualCommonsPackage.PACKAGE_BASE__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, newName);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetName() {
        eDynamicUnset(TextualCommonsPackage.PACKAGE_BASE__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetName() {
        return eDynamicIsSet(TextualCommonsPackage.PACKAGE_BASE__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	public PackageType getOwningPackage() {
        return (PackageType)eDynamicGet(TextualCommonsPackage.PACKAGE_BASE__OWNING_PACKAGE, TextualCommonsPackage.Literals.PACKAGE_BASE__OWNING_PACKAGE, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetOwningPackage(PackageType newOwningPackage, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newOwningPackage, TextualCommonsPackage.PACKAGE_BASE__OWNING_PACKAGE, msgs);
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setOwningPackage(PackageType newOwningPackage) {
        eDynamicSet(TextualCommonsPackage.PACKAGE_BASE__OWNING_PACKAGE, TextualCommonsPackage.Literals.PACKAGE_BASE__OWNING_PACKAGE, newOwningPackage);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	public EList<PackageType> getPackages() {
        return (EList<PackageType>)eDynamicGet(TextualCommonsPackage.PACKAGE_BASE__PACKAGES, TextualCommonsPackage.Literals.PACKAGE_BASE__PACKAGES, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	public EList<PackageImport> getPackageImports() {
        return (EList<PackageImport>)eDynamicGet(TextualCommonsPackage.PACKAGE_BASE__PACKAGE_IMPORTS, TextualCommonsPackage.Literals.PACKAGE_BASE__PACKAGE_IMPORTS, true, true);
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
            case TextualCommonsPackage.PACKAGE_BASE__OWNING_PACKAGE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetOwningPackage((PackageType)otherEnd, msgs);
            case TextualCommonsPackage.PACKAGE_BASE__PACKAGES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackages()).basicAdd(otherEnd, msgs);
            case TextualCommonsPackage.PACKAGE_BASE__PACKAGE_IMPORTS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackageImports()).basicAdd(otherEnd, msgs);
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
            case TextualCommonsPackage.PACKAGE_BASE__OWNING_PACKAGE:
                return basicSetOwningPackage(null, msgs);
            case TextualCommonsPackage.PACKAGE_BASE__PACKAGES:
                return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
            case TextualCommonsPackage.PACKAGE_BASE__PACKAGE_IMPORTS:
                return ((InternalEList<?>)getPackageImports()).basicRemove(otherEnd, msgs);
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
            case TextualCommonsPackage.PACKAGE_BASE__OWNING_PACKAGE:
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
            case TextualCommonsPackage.PACKAGE_BASE__REFERENCED_ELEMENT:
                if (resolve) return getReferencedElement();
                return basicGetReferencedElement();
            case TextualCommonsPackage.PACKAGE_BASE__NAME:
                return getName();
            case TextualCommonsPackage.PACKAGE_BASE__OWNING_PACKAGE:
                return getOwningPackage();
            case TextualCommonsPackage.PACKAGE_BASE__PACKAGES:
                return getPackages();
            case TextualCommonsPackage.PACKAGE_BASE__PACKAGE_IMPORTS:
                return getPackageImports();
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
            case TextualCommonsPackage.PACKAGE_BASE__REFERENCED_ELEMENT:
                setReferencedElement((org.eclipse.uml2.uml.Package)newValue);
                return;
            case TextualCommonsPackage.PACKAGE_BASE__NAME:
                setName((String)newValue);
                return;
            case TextualCommonsPackage.PACKAGE_BASE__OWNING_PACKAGE:
                setOwningPackage((PackageType)newValue);
                return;
            case TextualCommonsPackage.PACKAGE_BASE__PACKAGES:
                getPackages().clear();
                getPackages().addAll((Collection<? extends PackageType>)newValue);
                return;
            case TextualCommonsPackage.PACKAGE_BASE__PACKAGE_IMPORTS:
                getPackageImports().clear();
                getPackageImports().addAll((Collection<? extends PackageImport>)newValue);
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
            case TextualCommonsPackage.PACKAGE_BASE__REFERENCED_ELEMENT:
                setReferencedElement((org.eclipse.uml2.uml.Package)null);
                return;
            case TextualCommonsPackage.PACKAGE_BASE__NAME:
                unsetName();
                return;
            case TextualCommonsPackage.PACKAGE_BASE__OWNING_PACKAGE:
                setOwningPackage((PackageType)null);
                return;
            case TextualCommonsPackage.PACKAGE_BASE__PACKAGES:
                getPackages().clear();
                return;
            case TextualCommonsPackage.PACKAGE_BASE__PACKAGE_IMPORTS:
                getPackageImports().clear();
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
            case TextualCommonsPackage.PACKAGE_BASE__REFERENCED_ELEMENT:
                return REFERENCED_ELEMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
            case TextualCommonsPackage.PACKAGE_BASE__NAME:
                return isSetName();
            case TextualCommonsPackage.PACKAGE_BASE__OWNING_PACKAGE:
                return getOwningPackage() != null;
            case TextualCommonsPackage.PACKAGE_BASE__PACKAGES:
                return !getPackages().isEmpty();
            case TextualCommonsPackage.PACKAGE_BASE__PACKAGE_IMPORTS:
                return !getPackageImports().isEmpty();
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
        if (baseClass == UMLReferencingElement.class) {
            switch (derivedFeatureID) {
                case TextualCommonsPackage.PACKAGE_BASE__REFERENCED_ELEMENT: return TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;
                default: return -1;
            }
        }
        if (baseClass == NamedElement.class) {
            switch (derivedFeatureID) {
                case TextualCommonsPackage.PACKAGE_BASE__NAME: return TextualCommonsPackage.NAMED_ELEMENT__NAME;
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
                case TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT: return TextualCommonsPackage.PACKAGE_BASE__REFERENCED_ELEMENT;
                default: return -1;
            }
        }
        if (baseClass == NamedElement.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.NAMED_ELEMENT__NAME: return TextualCommonsPackage.PACKAGE_BASE__NAME;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //PackageBaseImpl
