/**
 */
package de.cooperateproject.modeling.textual.component.metamodel.component.provider;


import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.provider.CommentableItemProvider;

import de.cooperateproject.modeling.textual.component.metamodel.component.Component;
import de.cooperateproject.modeling.textual.component.metamodel.component.ComponentFactory;
import de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.cooperateproject.modeling.textual.component.metamodel.component.Component} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentItemProvider extends CommentableItemProvider {
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

            addNamePropertyDescriptor(object);
            addAliasPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_NamedElement_name_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_name_feature", "_UI_NamedElement_type"),
                 TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Alias feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAliasPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AliasedElement_alias_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AliasedElement_alias_feature", "_UI_AliasedElement_type"),
                 TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
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
            childrenFeatures.add(ComponentPackage.Literals.COMPONENT__COMPONENT);
            childrenFeatures.add(ComponentPackage.Literals.COMPONENT__PORTRELATION);
            childrenFeatures.add(ComponentPackage.Literals.COMPONENT__INTERFACERELATION);
            childrenFeatures.add(ComponentPackage.Literals.COMPONENT__INTERFACE);
            childrenFeatures.add(ComponentPackage.Literals.COMPONENT__PORT);
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
            case ComponentPackage.COMPONENT__NAME:
            case ComponentPackage.COMPONENT__ALIAS:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case ComponentPackage.COMPONENT__COMPONENT:
            case ComponentPackage.COMPONENT__PORTRELATION:
            case ComponentPackage.COMPONENT__INTERFACERELATION:
            case ComponentPackage.COMPONENT__INTERFACE:
            case ComponentPackage.COMPONENT__PORT:
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
                (ComponentPackage.Literals.COMPONENT__COMPONENT,
                 ComponentFactory.eINSTANCE.createComponent()));

        newChildDescriptors.add
            (createChildParameter
                (ComponentPackage.Literals.COMPONENT__PORTRELATION,
                 ComponentFactory.eINSTANCE.createConnector()));

        newChildDescriptors.add
            (createChildParameter
                (ComponentPackage.Literals.COMPONENT__INTERFACERELATION,
                 ComponentFactory.eINSTANCE.createProvide()));

        newChildDescriptors.add
            (createChildParameter
                (ComponentPackage.Literals.COMPONENT__INTERFACERELATION,
                 ComponentFactory.eINSTANCE.createRequire()));

        newChildDescriptors.add
            (createChildParameter
                (ComponentPackage.Literals.COMPONENT__INTERFACE,
                 ComponentFactory.eINSTANCE.createInterface()));

        newChildDescriptors.add
            (createChildParameter
                (ComponentPackage.Literals.COMPONENT__PORT,
                 ComponentFactory.eINSTANCE.createPort()));
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return ComponentEditPlugin.INSTANCE;
    }

}
