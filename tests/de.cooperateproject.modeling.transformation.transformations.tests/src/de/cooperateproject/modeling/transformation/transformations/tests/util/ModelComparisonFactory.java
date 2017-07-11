package de.cooperateproject.modeling.transformation.transformations.tests.util;

import org.eclipse.emf.compare.diff.IDiffEngine;
import org.eclipse.emf.compare.diff.IDiffProcessor;

public interface ModelComparisonFactory {

    IDiffEngine createEMFCompareDiffEngine(IDiffProcessor processor);
}
