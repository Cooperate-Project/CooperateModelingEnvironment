/**
 */
package dummy.util;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import dummy.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dummy.DummyPackage
 * @generated
 */
public class DummyAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DummyPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DummyAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DummyPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DummySwitch<Adapter> modelSwitch =
		new DummySwitch<Adapter>() {
			@Override
			public Adapter caseContainable(Containable object) {
				return createContainableAdapter();
			}
			@Override
			public Adapter caseReferencingElement(ReferencingElement object) {
				return createReferencingElementAdapter();
			}
			@Override
			public Adapter caseContainer(Container object) {
				return createContainerAdapter();
			}
			@Override
			public Adapter caseReferencingElement2(ReferencingElement2 object) {
				return createReferencingElement2Adapter();
			}
			@Override
			public Adapter caseElement(de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element object) {
				return createElementAdapter();
			}
			@Override
			public <UMLType extends Element> Adapter caseUMLReferencingElement(UMLReferencingElement<UMLType> object) {
				return createUMLReferencingElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link dummy.Containable <em>Containable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dummy.Containable
	 * @generated
	 */
	public Adapter createContainableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dummy.ReferencingElement <em>Referencing Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dummy.ReferencingElement
	 * @generated
	 */
	public Adapter createReferencingElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dummy.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dummy.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dummy.ReferencingElement2 <em>Referencing Element2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dummy.ReferencingElement2
	 * @generated
	 */
	public Adapter createReferencingElement2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement <em>UML Referencing Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
	 * @generated
	 */
	public Adapter createUMLReferencingElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DummyAdapterFactory
