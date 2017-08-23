/**
 */
package de.cooperateproject.modeling.textual.cmp.cmp.provider;


import de.cooperateproject.modeling.textual.cmp.cmp.CmpFactory;
import de.cooperateproject.modeling.textual.cmp.cmp.CmpPackage;
import de.cooperateproject.modeling.textual.cmp.cmp.Component;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.cooperateproject.modeling.textual.cmp.cmp.Component} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentItemProvider extends ClassifierItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComponentItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

        }
        return itemPropertyDescriptors;
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(CmpPackage.Literals.COMPONENT__COMPONENT);
            childrenFeatures.add(CmpPackage.Literals.COMPONENT__PORT_RELATION);
            childrenFeatures.add(CmpPackage.Literals.COMPONENT__INTERFACE_RELATION);
            childrenFeatures.add(CmpPackage.Literals.COMPONENT__NESTED_INTERFACE);
            childrenFeatures.add(CmpPackage.Literals.COMPONENT__PORT);
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns Component.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Component"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((Component)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_Component_type") :
            getString("_UI_Component_type") + " " + label;
    }
    

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(Component.class)) {
            case CmpPackage.COMPONENT__COMPONENT:
            case CmpPackage.COMPONENT__PORT_RELATION:
            case CmpPackage.COMPONENT__INTERFACE_RELATION:
            case CmpPackage.COMPONENT__NESTED_INTERFACE:
            case CmpPackage.COMPONENT__PORT:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
                return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add
            (createChildParameter
                (CmpPackage.Literals.COMPONENT__COMPONENT,
                 CmpFactory.eINSTANCE.createComponent()));

        newChildDescriptors.add
            (createChildParameter
                (CmpPackage.Literals.COMPONENT__PORT_RELATION,
                 CmpFactory.eINSTANCE.createConnector()));

        newChildDescriptors.add
            (createChildParameter
                (CmpPackage.Literals.COMPONENT__INTERFACE_RELATION,
                 CmpFactory.eINSTANCE.createProvide()));

        newChildDescriptors.add
            (createChildParameter
                (CmpPackage.Literals.COMPONENT__INTERFACE_RELATION,
                 CmpFactory.eINSTANCE.createRequire()));

        newChildDescriptors.add
            (createChildParameter
                (CmpPackage.Literals.COMPONENT__NESTED_INTERFACE,
                 CmpFactory.eINSTANCE.createInterface()));

        newChildDescriptors.add
            (createChildParameter
                (CmpPackage.Literals.COMPONENT__PORT,
                 CmpFactory.eINSTANCE.createPort()));
    }

}
