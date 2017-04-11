/**
 */
package de.cooperateproject.modeling.textual.common.metamodel.textualCommons.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Commentable;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageImport;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageableElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage
 * @generated
 */
public class DynamicTextualCommonsSwitch<T> extends TextualCommonsSwitch<T> {

	static final Map<Integer, BiFunction<DynamicTextualCommonsSwitch<?>, EObject, ?>> switchCases;
	static final Map<Integer, List<Integer>> standardHierarchy;
	
	static {
		switchCases = new HashMap<Integer, BiFunction<DynamicTextualCommonsSwitch<?>,EObject,?>>();
		switchCases.put(TextualCommonsPackage.ELEMENT, (s, o) -> s.caseElement((Element) o));
		switchCases.put(TextualCommonsPackage.NAMED_ELEMENT, (s, o) -> s.caseNamedElement((NamedElement) o));
		switchCases.put(TextualCommonsPackage.ALIASED_ELEMENT, (s, o) -> s.caseAliasedElement((AliasedElement) o));
		switchCases.put(TextualCommonsPackage.UML_REFERENCING_ELEMENT, (s, o) -> s.caseUMLReferencingElement((UMLReferencingElement<?>) o));
		switchCases.put(TextualCommonsPackage.PACKAGE_BASE, (s, o) -> s.casePackageBase((PackageBase<?>) o));
		switchCases.put(TextualCommonsPackage.COMMENTABLE, (s, o) -> s.caseCommentable((Commentable) o));
		switchCases.put(TextualCommonsPackage.COMMENT, (s, o) -> s.caseComment((Comment) o));
		switchCases.put(TextualCommonsPackage.CARDINALITY, (s, o) -> s.caseCardinality((Cardinality) o));
		switchCases.put(TextualCommonsPackage.PACKAGEABLE_ELEMENT, (s, o) -> s.casePackageableElement((PackageableElement) o));
		switchCases.put(TextualCommonsPackage.PACKAGE_IMPORT, (s, o) -> s.casePackageImport((PackageImport) o));
		
		standardHierarchy = new HashMap<Integer, List<Integer>>();
		standardHierarchy.put(TextualCommonsPackage.ELEMENT, Arrays.asList(
				TextualCommonsPackage.ELEMENT));
		standardHierarchy.put(TextualCommonsPackage.NAMED_ELEMENT, Arrays.asList(
				TextualCommonsPackage.NAMED_ELEMENT, 
				TextualCommonsPackage.ELEMENT));
		standardHierarchy.put(TextualCommonsPackage.ALIASED_ELEMENT, Arrays.asList(
				TextualCommonsPackage.ALIASED_ELEMENT, 
				TextualCommonsPackage.NAMED_ELEMENT, 
				TextualCommonsPackage.ELEMENT));
		standardHierarchy.put(TextualCommonsPackage.UML_REFERENCING_ELEMENT, Arrays.asList(
				TextualCommonsPackage.UML_REFERENCING_ELEMENT, 
				TextualCommonsPackage.ELEMENT));
		standardHierarchy.put(TextualCommonsPackage.PACKAGE_BASE, Arrays.asList(
				TextualCommonsPackage.PACKAGEABLE_ELEMENT,
				TextualCommonsPackage.UML_REFERENCING_ELEMENT,
				TextualCommonsPackage.NAMED_ELEMENT, 
				TextualCommonsPackage.ELEMENT));
		standardHierarchy.put(TextualCommonsPackage.COMMENTABLE, Arrays.asList(
				TextualCommonsPackage.COMMENTABLE));
		standardHierarchy.put(TextualCommonsPackage.COMMENT, Arrays.asList(
				TextualCommonsPackage.COMMENT,
				TextualCommonsPackage.UML_REFERENCING_ELEMENT, 
				TextualCommonsPackage.ELEMENT));
		standardHierarchy.put(TextualCommonsPackage.CARDINALITY, Arrays.asList(
				TextualCommonsPackage.CARDINALITY));
		standardHierarchy.put(TextualCommonsPackage.PACKAGEABLE_ELEMENT, Arrays.asList(
				TextualCommonsPackage.PACKAGEABLE_ELEMENT, 
				TextualCommonsPackage.ELEMENT));
		standardHierarchy.put(TextualCommonsPackage.PACKAGE_IMPORT, Arrays.asList(
				TextualCommonsPackage.PACKAGE_IMPORT,
				TextualCommonsPackage.UML_REFERENCING_ELEMENT, 
				TextualCommonsPackage.ELEMENT));
	}
	
	
	@SuppressWarnings("unchecked")
	protected T doSwitch(Stream<Integer> typeHierarchy, EObject theEObject) {
		T result = (T) typeHierarchy.map(switchCases::get).map(f -> f.apply(this, theEObject)).filter(Objects::nonNull).findFirst().orElse(null);
		return result != null ? result : defaultCase(theEObject);		
	}
	 
	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		return doSwitch(standardHierarchy.get(classifierID).stream(), theEObject);
	}

	
  /**
   * Calls <code>caseXXX</code> for each (super-)class of the model until one returns a non-null result;
   * it yields that result.
   * @param eClass the class or superclass of <code>eObject</code> to consider. 
   * The class's containing <code>EPackage</code> determines whether the receiving switch object can handle the request.
   * @param eObject the model object to pass to the appropriate <code>caseXXX</code>.
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   */
	protected T doSwitch(EClass eClass, EObject eObject)
	{
		if (isSwitchFor(eClass.getEPackage()))
	    {
	      return doSwitch(eClass.getClassifierID(), eObject);
	    }
	    else
	    {
	      return doSwitch(eClass.getEAllSuperTypes().stream().filter(c -> isSwitchFor(c.getEPackage())).map(c -> c.getClassifierID()), eObject);
	    }
	}

}
