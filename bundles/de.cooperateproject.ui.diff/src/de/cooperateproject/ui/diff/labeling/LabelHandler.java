package de.cooperateproject.ui.diff.labeling;

import java.util.Optional;

import org.eclipse.emf.ecore.EObject;

/**
 * This interface provides functions for the labeling of items.
 * 
 * @author Jasmin
 *
 */
public interface LabelHandler {

	/**
	 * Returns a description for the given item.
	 * 
	 * This method redirects the call to the {@link LabelHandler#getText(EObject)}
	 * method if possible.
	 * 
	 * @param item
	 *            The item to be described.
	 * @return The description.
	 */
	default String getText(Object item) {
		return Optional.ofNullable(item).filter(EObject.class::isInstance).map(EObject.class::cast).map(this::getText)
				.orElse(null);
	}

	/**
	 * Returns description for given item.
	 * 
	 * @param item
	 *            given item to decript.
	 * @return description for given item.
	 */
	public String getText(EObject item);

	/**
	 * Returns a type name for the given item.
	 * 
	 * This method redirects the call to the
	 * {@link LabelHandler#getClassText(EObject)} method if possible.
	 * 
	 * @param item
	 *            The item to be described with a type name.
	 * @return The type name.
	 */
	default String getClassText(Object item) {
		return getClassText(item, null);
	}

	/**
	 * Returns a type name for the given item.
	 * 
	 * This method redirects the call to the
	 * {@link LabelHandler#getClassText(EObject)} method if possible.
	 * 
	 * @param item
	 *            The item to be described with a type name.
	 * @param context
	 *            An object that describes the context of the given item.
	 * @return The type name.
	 */
	default String getClassText(Object item, Object context) {
		return Optional.ofNullable(item).filter(EObject.class::isInstance).map(EObject.class::cast)
				.map(o -> getClassText(o, context)).orElse(null);
	}

	/**
	 * Returns a type name for the given item.
	 * 
	 * @param item
	 *            The item to be described with a type name.
	 * @return The type name.
	 */
	default String getClassText(EObject item) {
		return getClassText(item, null);
	}
	
	/**
	 * Returns a type name for the given item.
	 * 
	 * @param item
	 *            The item to be described with a type name.
	 * @param context
	 *            An object that describes the context of the given item.
	 * @return The type name.
	 */
	public String getClassText(EObject item, Object context);
}
