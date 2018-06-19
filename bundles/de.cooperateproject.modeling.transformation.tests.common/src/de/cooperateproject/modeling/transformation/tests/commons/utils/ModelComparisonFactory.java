package de.cooperateproject.modeling.transformation.tests.commons.utils;

import java.util.Collection;

import org.eclipse.emf.compare.diff.IDiffEngine;
import org.eclipse.emf.compare.diff.IDiffProcessor;
import org.eclipse.emf.compare.match.IMatchEngine.Factory;
import org.eclipse.emf.compare.postprocessor.IPostProcessor.Descriptor.Registry;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;

public interface ModelComparisonFactory {

    IDiffEngine createEMFCompareDiffEngine(IDiffProcessor processor);

    void registerPostProcessors(Registry<String> postProcessorRegistry);

    Factory createMatchEngineFactory();
    
    Collection<EClass> createIgnoredEClasses();

    Collection<EAttribute> createIgnoredEAttributes();
}
