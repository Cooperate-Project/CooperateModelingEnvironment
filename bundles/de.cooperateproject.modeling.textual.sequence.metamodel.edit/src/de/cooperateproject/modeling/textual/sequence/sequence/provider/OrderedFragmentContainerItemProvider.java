/**
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.sequence.sequence.provider;


import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.provider.UMLReferencingElementItemProvider;

import de.cooperateproject.modeling.textual.sequence.sequence.OrderedFragmentContainer;
import de.cooperateproject.modeling.textual.sequence.sequence.SequenceFactory;
import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.cooperateproject.modeling.textual.sequence.sequence.OrderedFragmentContainer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OrderedFragmentContainerItemProvider extends UMLReferencingElementItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OrderedFragmentContainerItemProvider(AdapterFactory adapterFactory) {
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

            addCommentsPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Comments feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCommentsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Commentable_comments_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Commentable_comments_feature", "_UI_Commentable_type"),
                 TextualCommonsPackage.Literals.COMMENTABLE__COMMENTS,
                 true,
                 false,
                 true,
                 null,
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
            childrenFeatures.add(SequencePackage.Literals.FRAGMENT_SEQUENCE__FRAGMENTS);
            childrenFeatures.add(SequencePackage.Literals.ORDERED_FRAGMENT_CONTAINER__CONDITION);
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
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        return getString("_UI_OrderedFragmentContainer_type");
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

        switch (notification.getFeatureID(OrderedFragmentContainer.class)) {
            case SequencePackage.ORDERED_FRAGMENT_CONTAINER__FRAGMENTS:
            case SequencePackage.ORDERED_FRAGMENT_CONTAINER__CONDITION:
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
                (SequencePackage.Literals.FRAGMENT_SEQUENCE__FRAGMENTS,
                 SequenceFactory.eINSTANCE.createFragment()));

        newChildDescriptors.add
            (createChildParameter
                (SequencePackage.Literals.FRAGMENT_SEQUENCE__FRAGMENTS,
                 SequenceFactory.eINSTANCE.createMessage()));

        newChildDescriptors.add
            (createChildParameter
                (SequencePackage.Literals.FRAGMENT_SEQUENCE__FRAGMENTS,
                 SequenceFactory.eINSTANCE.createStandardMessage()));

        newChildDescriptors.add
            (createChildParameter
                (SequencePackage.Literals.FRAGMENT_SEQUENCE__FRAGMENTS,
                 SequenceFactory.eINSTANCE.createResponseMessage()));

        newChildDescriptors.add
            (createChildParameter
                (SequencePackage.Literals.FRAGMENT_SEQUENCE__FRAGMENTS,
                 SequenceFactory.eINSTANCE.createCreateMessage()));

        newChildDescriptors.add
            (createChildParameter
                (SequencePackage.Literals.FRAGMENT_SEQUENCE__FRAGMENTS,
                 SequenceFactory.eINSTANCE.createDestructionMessage()));

        newChildDescriptors.add
            (createChildParameter
                (SequencePackage.Literals.FRAGMENT_SEQUENCE__FRAGMENTS,
                 SequenceFactory.eINSTANCE.createOccurenceSpecification()));

        newChildDescriptors.add
            (createChildParameter
                (SequencePackage.Literals.FRAGMENT_SEQUENCE__FRAGMENTS,
                 SequenceFactory.eINSTANCE.createDestructionOccurenceSpecification()));

        newChildDescriptors.add
            (createChildParameter
                (SequencePackage.Literals.FRAGMENT_SEQUENCE__FRAGMENTS,
                 SequenceFactory.eINSTANCE.createNonInstantaneousFragment()));

        newChildDescriptors.add
            (createChildParameter
                (SequencePackage.Literals.FRAGMENT_SEQUENCE__FRAGMENTS,
                 SequenceFactory.eINSTANCE.createAlternative()));

        newChildDescriptors.add
            (createChildParameter
                (SequencePackage.Literals.FRAGMENT_SEQUENCE__FRAGMENTS,
                 SequenceFactory.eINSTANCE.createOption()));

        newChildDescriptors.add
            (createChildParameter
                (SequencePackage.Literals.FRAGMENT_SEQUENCE__FRAGMENTS,
                 SequenceFactory.eINSTANCE.createCoRegion()));

        newChildDescriptors.add
            (createChildParameter
                (SequencePackage.Literals.FRAGMENT_SEQUENCE__FRAGMENTS,
                 SequenceFactory.eINSTANCE.createParallel()));

        newChildDescriptors.add
            (createChildParameter
                (SequencePackage.Literals.FRAGMENT_SEQUENCE__FRAGMENTS,
                 SequenceFactory.eINSTANCE.createCritical()));

        newChildDescriptors.add
            (createChildParameter
                (SequencePackage.Literals.FRAGMENT_SEQUENCE__FRAGMENTS,
                 SequenceFactory.eINSTANCE.createLoop()));

        newChildDescriptors.add
            (createChildParameter
                (SequencePackage.Literals.FRAGMENT_SEQUENCE__FRAGMENTS,
                 SequenceFactory.eINSTANCE.createTimeObservation()));

        newChildDescriptors.add
            (createChildParameter
                (SequencePackage.Literals.FRAGMENT_SEQUENCE__FRAGMENTS,
                 SequenceFactory.eINSTANCE.createDurationObservation()));

        newChildDescriptors.add
            (createChildParameter
                (SequencePackage.Literals.FRAGMENT_SEQUENCE__FRAGMENTS,
                 SequenceFactory.eINSTANCE.createConstraint()));

        newChildDescriptors.add
            (createChildParameter
                (SequencePackage.Literals.FRAGMENT_SEQUENCE__FRAGMENTS,
                 SequenceFactory.eINSTANCE.createTimeConstraint()));

        newChildDescriptors.add
            (createChildParameter
                (SequencePackage.Literals.FRAGMENT_SEQUENCE__FRAGMENTS,
                 SequenceFactory.eINSTANCE.createDurationConstraint()));

        newChildDescriptors.add
            (createChildParameter
                (SequencePackage.Literals.FRAGMENT_SEQUENCE__FRAGMENTS,
                 SequenceFactory.eINSTANCE.createImplicitMessageOccurenceSpecification()));

        newChildDescriptors.add
            (createChildParameter
                (SequencePackage.Literals.FRAGMENT_SEQUENCE__FRAGMENTS,
                 SequenceFactory.eINSTANCE.createExplicitArrivalOccurenceSpecification()));

        newChildDescriptors.add
            (createChildParameter
                (SequencePackage.Literals.FRAGMENT_SEQUENCE__FRAGMENTS,
                 SequenceFactory.eINSTANCE.createReference()));

        newChildDescriptors.add
            (createChildParameter
                (SequencePackage.Literals.ORDERED_FRAGMENT_CONTAINER__CONDITION,
                 SequenceFactory.eINSTANCE.createCondition()));
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return SequenceEditPlugin.INSTANCE;
    }

}