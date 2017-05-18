/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.Connector;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Commentable;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageableElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.UMLReferencingElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Association;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationImpl#getOwningPackage <em>Owning Package</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationImpl#getMemberEnds <em>Member Ends</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AssociationImpl extends UMLReferencingElementImpl<Association> implements de.cooperateproject.modeling.textual.cls.cls.Association {
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
    protected AssociationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ClsPackage.Literals.ASSOCIATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * This is specialized for the more specific type known in this context.
     * @generated
     */
    @Override
    public void setReferencedElement(Association newReferencedElement) {
        super.setReferencedElement(newReferencedElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public de.cooperateproject.modeling.textual.cls.cls.Package getOwningPackage() {
        return (de.cooperateproject.modeling.textual.cls.cls.Package)eDynamicGet(ClsPackage.ASSOCIATION__OWNING_PACKAGE, ClsPackage.Literals.CONNECTOR__OWNING_PACKAGE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOwningPackage(de.cooperateproject.modeling.textual.cls.cls.Package newOwningPackage, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newOwningPackage, ClsPackage.ASSOCIATION__OWNING_PACKAGE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwningPackage(de.cooperateproject.modeling.textual.cls.cls.Package newOwningPackage) {
        eDynamicSet(ClsPackage.ASSOCIATION__OWNING_PACKAGE, ClsPackage.Literals.CONNECTOR__OWNING_PACKAGE, newOwningPackage);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Comment> getComments() {
        return (EList<Comment>)eDynamicGet(ClsPackage.ASSOCIATION__COMMENTS, TextualCommonsPackage.Literals.COMMENTABLE__COMMENTS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return (String)eDynamicGet(ClsPackage.ASSOCIATION__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        eDynamicSet(ClsPackage.ASSOCIATION__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, newName);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<AssociationMemberEnd> getMemberEnds() {
        return (EList<AssociationMemberEnd>)eDynamicGet(ClsPackage.ASSOCIATION__MEMBER_ENDS, ClsPackage.Literals.ASSOCIATION__MEMBER_ENDS, true, true);
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
            case ClsPackage.ASSOCIATION__OWNING_PACKAGE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetOwningPackage((de.cooperateproject.modeling.textual.cls.cls.Package)otherEnd, msgs);
            case ClsPackage.ASSOCIATION__COMMENTS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getComments()).basicAdd(otherEnd, msgs);
            case ClsPackage.ASSOCIATION__MEMBER_ENDS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getMemberEnds()).basicAdd(otherEnd, msgs);
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
            case ClsPackage.ASSOCIATION__OWNING_PACKAGE:
                return basicSetOwningPackage(null, msgs);
            case ClsPackage.ASSOCIATION__COMMENTS:
                return ((InternalEList<?>)getComments()).basicRemove(otherEnd, msgs);
            case ClsPackage.ASSOCIATION__MEMBER_ENDS:
                return ((InternalEList<?>)getMemberEnds()).basicRemove(otherEnd, msgs);
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
            case ClsPackage.ASSOCIATION__OWNING_PACKAGE:
                return eInternalContainer().eInverseRemove(this, ClsPackage.PACKAGE__CONNECTORS, de.cooperateproject.modeling.textual.cls.cls.Package.class, msgs);
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
            case ClsPackage.ASSOCIATION__OWNING_PACKAGE:
                return getOwningPackage();
            case ClsPackage.ASSOCIATION__COMMENTS:
                return getComments();
            case ClsPackage.ASSOCIATION__NAME:
                return getName();
            case ClsPackage.ASSOCIATION__MEMBER_ENDS:
                return getMemberEnds();
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
            case ClsPackage.ASSOCIATION__OWNING_PACKAGE:
                setOwningPackage((de.cooperateproject.modeling.textual.cls.cls.Package)newValue);
                return;
            case ClsPackage.ASSOCIATION__COMMENTS:
                getComments().clear();
                getComments().addAll((Collection<? extends Comment>)newValue);
                return;
            case ClsPackage.ASSOCIATION__NAME:
                setName((String)newValue);
                return;
            case ClsPackage.ASSOCIATION__MEMBER_ENDS:
                getMemberEnds().clear();
                getMemberEnds().addAll((Collection<? extends AssociationMemberEnd>)newValue);
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
            case ClsPackage.ASSOCIATION__OWNING_PACKAGE:
                setOwningPackage((de.cooperateproject.modeling.textual.cls.cls.Package)null);
                return;
            case ClsPackage.ASSOCIATION__COMMENTS:
                getComments().clear();
                return;
            case ClsPackage.ASSOCIATION__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ClsPackage.ASSOCIATION__MEMBER_ENDS:
                getMemberEnds().clear();
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
            case ClsPackage.ASSOCIATION__OWNING_PACKAGE:
                return getOwningPackage() != null;
            case ClsPackage.ASSOCIATION__COMMENTS:
                return !getComments().isEmpty();
            case ClsPackage.ASSOCIATION__NAME:
                return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
            case ClsPackage.ASSOCIATION__MEMBER_ENDS:
                return !getMemberEnds().isEmpty();
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
        if (baseClass == PackageableElement.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == Connector.class) {
            switch (derivedFeatureID) {
                case ClsPackage.ASSOCIATION__OWNING_PACKAGE: return ClsPackage.CONNECTOR__OWNING_PACKAGE;
                default: return -1;
            }
        }
        if (baseClass == Commentable.class) {
            switch (derivedFeatureID) {
                case ClsPackage.ASSOCIATION__COMMENTS: return TextualCommonsPackage.COMMENTABLE__COMMENTS;
                default: return -1;
            }
        }
        if (baseClass == NamedElement.class) {
            switch (derivedFeatureID) {
                case ClsPackage.ASSOCIATION__NAME: return TextualCommonsPackage.NAMED_ELEMENT__NAME;
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
        if (baseClass == PackageableElement.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == Connector.class) {
            switch (baseFeatureID) {
                case ClsPackage.CONNECTOR__OWNING_PACKAGE: return ClsPackage.ASSOCIATION__OWNING_PACKAGE;
                default: return -1;
            }
        }
        if (baseClass == Commentable.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.COMMENTABLE__COMMENTS: return ClsPackage.ASSOCIATION__COMMENTS;
                default: return -1;
            }
        }
        if (baseClass == NamedElement.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.NAMED_ELEMENT__NAME: return ClsPackage.ASSOCIATION__NAME;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //AssociationImpl
