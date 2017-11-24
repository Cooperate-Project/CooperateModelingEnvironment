package de.cooperateproject.ui.diff.internal;

import java.util.function.Predicate;

import org.eclipse.emf.ecore.EObject;

/**
 * Predicate that checks if a element to be tested is a transitive child of a
 * given parent element with respect to the containment hierarchy in EMF.
 */
public class IsTransitiveChildPredicate implements Predicate<EObject> {

	private final boolean ignoreSelf;
	private final EObject parent;

	/**
	 * Constructs the predicate.
	 * 
	 * @param parent
	 *            The parent that the elements are tested against.
	 * @param ignoreSelf
	 *            If the element to test is equal to the parent and this flag is set
	 *            to false, the predicate will hold.
	 */
	public IsTransitiveChildPredicate(EObject parent, boolean ignoreSelf) {
		this.parent = parent;
		this.ignoreSelf = ignoreSelf;
	}

	@Override
	public boolean test(EObject t) {
		EObject currentElement = t;
		if (ignoreSelf) {
			currentElement = t.eContainer();
		}
		do {
			if (currentElement == parent) {
				return true;
			}
			currentElement = currentElement.eContainer();
		} while (currentElement != null);
		return false;
	}

}
