/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class NamedElementImpl<T extends NamedElement> extends NamedElementOptionalImpl<T> implements de.cooperateproject.modeling.textual.cls.cls.NamedElement<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClsPackage.Literals.NAMED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasReferencedElement(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		if (getReferencedElement() == null) {
			BasicDiagnostic basicDiagnostic = new BasicDiagnostic(BasicDiagnostic.ERROR, "hasReferencedElement", 1, "A referenced element is mandatory.", new Object[]{this});
			diagnostics.add(basicDiagnostic);
			return false;
		}
		diagnostics.add(BasicDiagnostic.OK_INSTANCE);
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ClsPackage.NAMED_ELEMENT___HAS_REFERENCED_ELEMENT__DIAGNOSTICCHAIN_MAP:
				return hasReferencedElement((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //NamedElementImpl
