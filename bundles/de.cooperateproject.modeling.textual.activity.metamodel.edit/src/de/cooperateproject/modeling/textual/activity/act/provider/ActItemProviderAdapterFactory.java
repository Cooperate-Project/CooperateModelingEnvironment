/**
 */
package de.cooperateproject.modeling.textual.activity.act.provider;

import de.cooperateproject.modeling.textual.activity.act.util.ActAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActItemProviderAdapterFactory extends ActAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.cooperateproject.modeling.textual.activity.act.ActivityDiagram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityDiagramItemProvider activityDiagramItemProvider;

	/**
	 * This creates an adapter for a {@link de.cooperateproject.modeling.textual.activity.act.ActivityDiagram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActivityDiagramAdapter() {
		if (activityDiagramItemProvider == null) {
			activityDiagramItemProvider = new ActivityDiagramItemProvider(this);
		}

		return activityDiagramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.cooperateproject.modeling.textual.activity.act.RootPackage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootPackageItemProvider rootPackageItemProvider;

	/**
	 * This creates an adapter for a {@link de.cooperateproject.modeling.textual.activity.act.RootPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRootPackageAdapter() {
		if (rootPackageItemProvider == null) {
			rootPackageItemProvider = new RootPackageItemProvider(this);
		}

		return rootPackageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.cooperateproject.modeling.textual.activity.act.Container} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerItemProvider containerItemProvider;

	/**
	 * This creates an adapter for a {@link de.cooperateproject.modeling.textual.activity.act.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContainerAdapter() {
		if (containerItemProvider == null) {
			containerItemProvider = new ContainerItemProvider(this);
		}

		return containerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.cooperateproject.modeling.textual.activity.act.ControlNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlNodeItemProvider controlNodeItemProvider;

	/**
	 * This creates an adapter for a {@link de.cooperateproject.modeling.textual.activity.act.ControlNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControlNodeAdapter() {
		if (controlNodeItemProvider == null) {
			controlNodeItemProvider = new ControlNodeItemProvider(this);
		}

		return controlNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.cooperateproject.modeling.textual.activity.act.ActionNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionNodeItemProvider actionNodeItemProvider;

	/**
	 * This creates an adapter for a {@link de.cooperateproject.modeling.textual.activity.act.ActionNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionNodeAdapter() {
		if (actionNodeItemProvider == null) {
			actionNodeItemProvider = new ActionNodeItemProvider(this);
		}

		return actionNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.cooperateproject.modeling.textual.activity.act.Flow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowItemProvider flowItemProvider;

	/**
	 * This creates an adapter for a {@link de.cooperateproject.modeling.textual.activity.act.Flow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFlowAdapter() {
		if (flowItemProvider == null) {
			flowItemProvider = new FlowItemProvider(this);
		}

		return flowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.cooperateproject.modeling.textual.activity.act.InitialNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialNodeItemProvider initialNodeItemProvider;

	/**
	 * This creates an adapter for a {@link de.cooperateproject.modeling.textual.activity.act.InitialNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInitialNodeAdapter() {
		if (initialNodeItemProvider == null) {
			initialNodeItemProvider = new InitialNodeItemProvider(this);
		}

		return initialNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.cooperateproject.modeling.textual.activity.act.FinalNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalNodeItemProvider finalNodeItemProvider;

	/**
	 * This creates an adapter for a {@link de.cooperateproject.modeling.textual.activity.act.FinalNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFinalNodeAdapter() {
		if (finalNodeItemProvider == null) {
			finalNodeItemProvider = new FinalNodeItemProvider(this);
		}

		return finalNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.cooperateproject.modeling.textual.activity.act.FlowFinalNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowFinalNodeItemProvider flowFinalNodeItemProvider;

	/**
	 * This creates an adapter for a {@link de.cooperateproject.modeling.textual.activity.act.FlowFinalNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFlowFinalNodeAdapter() {
		if (flowFinalNodeItemProvider == null) {
			flowFinalNodeItemProvider = new FlowFinalNodeItemProvider(this);
		}

		return flowFinalNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.cooperateproject.modeling.textual.activity.act.DecisionNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionNodeItemProvider decisionNodeItemProvider;

	/**
	 * This creates an adapter for a {@link de.cooperateproject.modeling.textual.activity.act.DecisionNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDecisionNodeAdapter() {
		if (decisionNodeItemProvider == null) {
			decisionNodeItemProvider = new DecisionNodeItemProvider(this);
		}

		return decisionNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.cooperateproject.modeling.textual.activity.act.MergeNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MergeNodeItemProvider mergeNodeItemProvider;

	/**
	 * This creates an adapter for a {@link de.cooperateproject.modeling.textual.activity.act.MergeNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMergeNodeAdapter() {
		if (mergeNodeItemProvider == null) {
			mergeNodeItemProvider = new MergeNodeItemProvider(this);
		}

		return mergeNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.cooperateproject.modeling.textual.activity.act.ForkNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForkNodeItemProvider forkNodeItemProvider;

	/**
	 * This creates an adapter for a {@link de.cooperateproject.modeling.textual.activity.act.ForkNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createForkNodeAdapter() {
		if (forkNodeItemProvider == null) {
			forkNodeItemProvider = new ForkNodeItemProvider(this);
		}

		return forkNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.cooperateproject.modeling.textual.activity.act.JoinNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinNodeItemProvider joinNodeItemProvider;

	/**
	 * This creates an adapter for a {@link de.cooperateproject.modeling.textual.activity.act.JoinNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJoinNodeAdapter() {
		if (joinNodeItemProvider == null) {
			joinNodeItemProvider = new JoinNodeItemProvider(this);
		}

		return joinNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.cooperateproject.modeling.textual.activity.act.Swimlane} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwimlaneItemProvider swimlaneItemProvider;

	/**
	 * This creates an adapter for a {@link de.cooperateproject.modeling.textual.activity.act.Swimlane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSwimlaneAdapter() {
		if (swimlaneItemProvider == null) {
			swimlaneItemProvider = new SwimlaneItemProvider(this);
		}

		return swimlaneItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (activityDiagramItemProvider != null) activityDiagramItemProvider.dispose();
		if (rootPackageItemProvider != null) rootPackageItemProvider.dispose();
		if (containerItemProvider != null) containerItemProvider.dispose();
		if (controlNodeItemProvider != null) controlNodeItemProvider.dispose();
		if (actionNodeItemProvider != null) actionNodeItemProvider.dispose();
		if (flowItemProvider != null) flowItemProvider.dispose();
		if (initialNodeItemProvider != null) initialNodeItemProvider.dispose();
		if (finalNodeItemProvider != null) finalNodeItemProvider.dispose();
		if (flowFinalNodeItemProvider != null) flowFinalNodeItemProvider.dispose();
		if (decisionNodeItemProvider != null) decisionNodeItemProvider.dispose();
		if (mergeNodeItemProvider != null) mergeNodeItemProvider.dispose();
		if (forkNodeItemProvider != null) forkNodeItemProvider.dispose();
		if (joinNodeItemProvider != null) joinNodeItemProvider.dispose();
		if (swimlaneItemProvider != null) swimlaneItemProvider.dispose();
	}

}
