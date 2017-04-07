/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.AggregationKind;
import de.cooperateproject.modeling.textual.cls.cls.Association;
import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd;
import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.UMLReferencingElementImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Member End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationMemberEndImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationMemberEndImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationMemberEndImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationMemberEndImpl#isNavigable <em>Navigable</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationMemberEndImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationMemberEndImpl#getAggregationKind <em>Aggregation Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationMemberEndImpl extends UMLReferencingElementImpl<Property> implements AssociationMemberEnd {
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
     * The default value of the '{@link #isNavigable() <em>Navigable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isNavigable()
     * @generated
     * @ordered
     */
    protected static final boolean NAVIGABLE_EDEFAULT = false;

    /**
     * The default value of the '{@link #getAggregationKind() <em>Aggregation Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAggregationKind()
     * @generated
     * @ordered
     */
    protected static final AggregationKind AGGREGATION_KIND_EDEFAULT = AggregationKind.NONE;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AssociationMemberEndImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ClsPackage.Literals.ASSOCIATION_MEMBER_END;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * This is specialized for the more specific type known in this context.
     * @generated
     */
    @Override
    public void setReferencedElement(Property newReferencedElement) {
        super.setReferencedElement(newReferencedElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return (String)eDynamicGet(ClsPackage.ASSOCIATION_MEMBER_END__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        eDynamicSet(ClsPackage.ASSOCIATION_MEMBER_END__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, newName);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Cardinality getCardinality() {
        return (Cardinality)eDynamicGet(ClsPackage.ASSOCIATION_MEMBER_END__CARDINALITY, ClsPackage.Literals.ASSOCIATION_MEMBER_END__CARDINALITY, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCardinality(Cardinality newCardinality, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject)newCardinality, ClsPackage.ASSOCIATION_MEMBER_END__CARDINALITY, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCardinality(Cardinality newCardinality) {
        eDynamicSet(ClsPackage.ASSOCIATION_MEMBER_END__CARDINALITY, ClsPackage.Literals.ASSOCIATION_MEMBER_END__CARDINALITY, newCardinality);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier<?> getType() {
        return (Classifier<?>)eDynamicGet(ClsPackage.ASSOCIATION_MEMBER_END__TYPE, ClsPackage.Literals.ASSOCIATION_MEMBER_END__TYPE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier<?> basicGetType() {
        return (Classifier<?>)eDynamicGet(ClsPackage.ASSOCIATION_MEMBER_END__TYPE, ClsPackage.Literals.ASSOCIATION_MEMBER_END__TYPE, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(Classifier<?> newType) {
        eDynamicSet(ClsPackage.ASSOCIATION_MEMBER_END__TYPE, ClsPackage.Literals.ASSOCIATION_MEMBER_END__TYPE, newType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isNavigable() {
        return (Boolean)eDynamicGet(ClsPackage.ASSOCIATION_MEMBER_END__NAVIGABLE, ClsPackage.Literals.ASSOCIATION_MEMBER_END__NAVIGABLE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNavigable(boolean newNavigable) {
        eDynamicSet(ClsPackage.ASSOCIATION_MEMBER_END__NAVIGABLE, ClsPackage.Literals.ASSOCIATION_MEMBER_END__NAVIGABLE, newNavigable);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Association getAssociation() {
        return (Association)eDynamicGet(ClsPackage.ASSOCIATION_MEMBER_END__ASSOCIATION, ClsPackage.Literals.ASSOCIATION_MEMBER_END__ASSOCIATION, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAssociation(Association newAssociation, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newAssociation, ClsPackage.ASSOCIATION_MEMBER_END__ASSOCIATION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAssociation(Association newAssociation) {
        eDynamicSet(ClsPackage.ASSOCIATION_MEMBER_END__ASSOCIATION, ClsPackage.Literals.ASSOCIATION_MEMBER_END__ASSOCIATION, newAssociation);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AggregationKind getAggregationKind() {
        return (AggregationKind)eDynamicGet(ClsPackage.ASSOCIATION_MEMBER_END__AGGREGATION_KIND, ClsPackage.Literals.ASSOCIATION_MEMBER_END__AGGREGATION_KIND, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAggregationKind(AggregationKind newAggregationKind) {
        eDynamicSet(ClsPackage.ASSOCIATION_MEMBER_END__AGGREGATION_KIND, ClsPackage.Literals.ASSOCIATION_MEMBER_END__AGGREGATION_KIND, newAggregationKind);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ClsPackage.ASSOCIATION_MEMBER_END__ASSOCIATION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetAssociation((Association)otherEnd, msgs);
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
            case ClsPackage.ASSOCIATION_MEMBER_END__CARDINALITY:
                return basicSetCardinality(null, msgs);
            case ClsPackage.ASSOCIATION_MEMBER_END__ASSOCIATION:
                return basicSetAssociation(null, msgs);
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
            case ClsPackage.ASSOCIATION_MEMBER_END__ASSOCIATION:
                return eInternalContainer().eInverseRemove(this, ClsPackage.ASSOCIATION__MEMBER_ENDS, Association.class, msgs);
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
            case ClsPackage.ASSOCIATION_MEMBER_END__NAME:
                return getName();
            case ClsPackage.ASSOCIATION_MEMBER_END__CARDINALITY:
                return getCardinality();
            case ClsPackage.ASSOCIATION_MEMBER_END__TYPE:
                if (resolve) return getType();
                return basicGetType();
            case ClsPackage.ASSOCIATION_MEMBER_END__NAVIGABLE:
                return isNavigable();
            case ClsPackage.ASSOCIATION_MEMBER_END__ASSOCIATION:
                return getAssociation();
            case ClsPackage.ASSOCIATION_MEMBER_END__AGGREGATION_KIND:
                return getAggregationKind();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ClsPackage.ASSOCIATION_MEMBER_END__NAME:
                setName((String)newValue);
                return;
            case ClsPackage.ASSOCIATION_MEMBER_END__CARDINALITY:
                setCardinality((Cardinality)newValue);
                return;
            case ClsPackage.ASSOCIATION_MEMBER_END__TYPE:
                setType((Classifier<?>)newValue);
                return;
            case ClsPackage.ASSOCIATION_MEMBER_END__NAVIGABLE:
                setNavigable((Boolean)newValue);
                return;
            case ClsPackage.ASSOCIATION_MEMBER_END__ASSOCIATION:
                setAssociation((Association)newValue);
                return;
            case ClsPackage.ASSOCIATION_MEMBER_END__AGGREGATION_KIND:
                setAggregationKind((AggregationKind)newValue);
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
            case ClsPackage.ASSOCIATION_MEMBER_END__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ClsPackage.ASSOCIATION_MEMBER_END__CARDINALITY:
                setCardinality((Cardinality)null);
                return;
            case ClsPackage.ASSOCIATION_MEMBER_END__TYPE:
                setType((Classifier<?>)null);
                return;
            case ClsPackage.ASSOCIATION_MEMBER_END__NAVIGABLE:
                setNavigable(NAVIGABLE_EDEFAULT);
                return;
            case ClsPackage.ASSOCIATION_MEMBER_END__ASSOCIATION:
                setAssociation((Association)null);
                return;
            case ClsPackage.ASSOCIATION_MEMBER_END__AGGREGATION_KIND:
                setAggregationKind(AGGREGATION_KIND_EDEFAULT);
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
            case ClsPackage.ASSOCIATION_MEMBER_END__NAME:
                return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
            case ClsPackage.ASSOCIATION_MEMBER_END__CARDINALITY:
                return getCardinality() != null;
            case ClsPackage.ASSOCIATION_MEMBER_END__TYPE:
                return basicGetType() != null;
            case ClsPackage.ASSOCIATION_MEMBER_END__NAVIGABLE:
                return isNavigable() != NAVIGABLE_EDEFAULT;
            case ClsPackage.ASSOCIATION_MEMBER_END__ASSOCIATION:
                return getAssociation() != null;
            case ClsPackage.ASSOCIATION_MEMBER_END__AGGREGATION_KIND:
                return getAggregationKind() != AGGREGATION_KIND_EDEFAULT;
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
        if (baseClass == NamedElement.class) {
            switch (derivedFeatureID) {
                case ClsPackage.ASSOCIATION_MEMBER_END__NAME: return TextualCommonsPackage.NAMED_ELEMENT__NAME;
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
        if (baseClass == NamedElement.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.NAMED_ELEMENT__NAME: return ClsPackage.ASSOCIATION_MEMBER_END__NAME;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //AssociationMemberEndImpl
