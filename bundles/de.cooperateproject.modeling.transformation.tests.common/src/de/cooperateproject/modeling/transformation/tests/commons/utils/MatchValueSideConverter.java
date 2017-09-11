package de.cooperateproject.modeling.transformation.tests.commons.utils;

import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.compare.Match;
import org.eclipse.emf.ecore.EObject;

import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;

public class MatchValueSideConverter {
	
	private final Set<Match> matches = Sets.newHashSet();

	public void add(Match match) {
		matches.add(match);
	}

	public <T extends EObject> T convert(T obj) {
		Set<T> results = matches.stream().map(m -> convert(m, obj)).filter(o -> o != null).collect(Collectors.toSet());
		if (results.size() != 1) {
			throw new IllegalStateException("There must not be more than one mapping for an object.");
		}
		return Iterables.getFirst(results, null);
	}

	@SuppressWarnings("unchecked")
	private static <T extends EObject> T convert(Match m, T obj) {
		if (m.getLeft() == obj) {
			return (T) m.getRight();
		}
		if (m.getRight() == obj) {
			return (T) m.getLeft();
		}
		return null;
	}
}
