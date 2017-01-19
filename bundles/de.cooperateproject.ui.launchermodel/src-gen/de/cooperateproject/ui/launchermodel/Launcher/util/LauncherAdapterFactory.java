/**
 */
package de.cooperateproject.ui.launchermodel.Launcher.util;

import de.cooperateproject.ui.launchermodel.Launcher.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.ui.launchermodel.Launcher.LauncherPackage
 * @generated
 */
public class LauncherAdapterFactory extends AdapterFactoryImpl {
	/**
     * The cached model package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static LauncherPackage modelPackage;

	/**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public LauncherAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = LauncherPackage.eINSTANCE;
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
	protected LauncherSwitch<Adapter> modelSwitch =
		new LauncherSwitch<Adapter>() {
            @Override
            public Adapter caseDiagram(Diagram object) {
                return createDiagramAdapter();
            }
            @Override
            public Adapter caseConcreteSyntaxModel(ConcreteSyntaxModel object) {
                return createConcreteSyntaxModelAdapter();
            }
            @Override
            public Adapter caseTextualConcreteSyntaxModel(TextualConcreteSyntaxModel object) {
                return createTextualConcreteSyntaxModelAdapter();
            }
            @Override
            public Adapter caseGraphicalConcreteSyntaxModel(GraphicalConcreteSyntaxModel object) {
                return createGraphicalConcreteSyntaxModelAdapter();
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
     * Creates a new adapter for an object of class '{@link de.cooperateproject.ui.launchermodel.Launcher.Diagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.ui.launchermodel.Launcher.Diagram
     * @generated
     */
	public Adapter createDiagramAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel <em>Concrete Syntax Model</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel
     * @generated
     */
	public Adapter createConcreteSyntaxModelAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.ui.launchermodel.Launcher.TextualConcreteSyntaxModel <em>Textual Concrete Syntax Model</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.ui.launchermodel.Launcher.TextualConcreteSyntaxModel
     * @generated
     */
	public Adapter createTextualConcreteSyntaxModelAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.cooperateproject.ui.launchermodel.Launcher.GraphicalConcreteSyntaxModel <em>Graphical Concrete Syntax Model</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.cooperateproject.ui.launchermodel.Launcher.GraphicalConcreteSyntaxModel
     * @generated
     */
	public Adapter createGraphicalConcreteSyntaxModelAdapter() {
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

} //LauncherAdapterFactory
