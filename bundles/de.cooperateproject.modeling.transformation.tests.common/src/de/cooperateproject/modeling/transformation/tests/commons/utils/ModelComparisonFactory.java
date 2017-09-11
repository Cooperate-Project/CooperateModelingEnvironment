package de.cooperateproject.modeling.transformation.tests.commons.utils;

import org.eclipse.emf.compare.diff.IDiffEngine;
import org.eclipse.emf.compare.diff.IDiffProcessor;

public interface ModelComparisonFactory {

    IDiffEngine createEMFCompareDiffEngine(IDiffProcessor processor);
}
