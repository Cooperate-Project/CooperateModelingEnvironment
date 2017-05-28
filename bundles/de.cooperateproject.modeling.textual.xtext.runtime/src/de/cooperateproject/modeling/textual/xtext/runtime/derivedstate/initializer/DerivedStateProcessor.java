package de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.commons.lang3.ClassUtils;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.jgrapht.DirectedGraph;
import org.jgrapht.alg.CycleDetector;
import org.jgrapht.experimental.dag.DirectedAcyclicGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.traverse.TopologicalOrderIterator;

import com.google.inject.Inject;

public class DerivedStateProcessor implements IDerivedStateProcessor {

    private interface RegistryFunction extends Function<Class, Optional<IAtomicDerivedStateProcessor<?>>> {

    }

    private interface IProcessorCache
            extends Map<Class<? extends EObject>, Iterable<IAtomicDerivedStateProcessor<EObject>>> {

    }

    private static class ProcessorCache
            extends HashMap<Class<? extends EObject>, Iterable<IAtomicDerivedStateProcessor<EObject>>>
            implements IProcessorCache {
        private static final long serialVersionUID = -5069957874239306073L;
    }

    private static final Logger LOGGER = Logger.getLogger(DerivedStateProcessor.class);
    private final IProcessorCache initCache = new ProcessorCache();
    private final IProcessorCache cleanCache = new ProcessorCache();
    private final IProcessorCache calculateCache = new ProcessorCache();

    @Inject
    private IAtomicDerivedStateProcessorRegistry registry;

    @Inject
    private IDerivedStateComputerSorter sorter;

    @Override
    public void initState(EObject o, boolean recursive) {
        executeProcessors(o, initCache, registry::findInitializer, recursive);
    }

    @Override
    public void cleanState(EObject o, boolean recursive) {
        executeProcessors(o, cleanCache, registry::findCleaner, recursive);
    }

    @Override
    public void calculateState(EObject o, boolean recursive) {
        executeProcessors(o, calculateCache, registry::findCalculator, recursive);
    }

    private void executeProcessors(EObject o, IProcessorCache cache, RegistryFunction fn, boolean recursive) {
        if (recursive) {
            List<EObject> content = new LinkedList<>();
            content.add(o);
            o.eAllContents().forEachRemaining(content::add);
            content.sort(sorter);
            content.forEach(object -> executeProcessors(object, cache, fn));
        } else {
            executeProcessors(o, cache, fn);
        }
    }

    private static void executeProcessors(EObject o, IProcessorCache cache, RegistryFunction fn) {
        if (!cache.containsKey(o.getClass())) {
            fillCache(o.getClass(), cache, fn);
        }
        Iterable<IAtomicDerivedStateProcessor<EObject>> processors = cache.get(o.getClass());
        processors.forEach(i -> i.accept(o));
    }

    private static void fillCache(Class<? extends EObject> clazz, IProcessorCache cache, RegistryFunction fn) {
        Set<IAtomicDerivedStateProcessor<? extends EObject>> processors = ClassUtils.getAllInterfaces(clazz).stream()
                .filter(EObject.class::isAssignableFrom).map(fn::apply).filter(Optional::isPresent).map(Optional::get)
                .collect(Collectors.toSet());

        DirectedGraph<IAtomicDerivedStateProcessor<? extends EObject>, DefaultEdge> graph = new DirectedAcyclicGraph<>(
                DefaultEdge.class);
        processors.forEach(graph::addVertex);
        processors.forEach(p -> addRequirements(p, fn, graph));
        processors.forEach(i -> i.getReplacements().stream().map(fn::apply).filter(Optional::isPresent)
                .map(Optional::get).forEach(r -> replaceVertex(graph, r, i)));

        CycleDetector<?, ?> cycleDetector = new CycleDetector<>(graph);
        if (cycleDetector.detectCycles()) {
            IllegalStateException ex = new IllegalStateException(String.format(
                    "The state initializers for element type %s have cyclic dependencies.", clazz.getSimpleName()));
            LOGGER.error(ex);
            throw ex;
        }

        TopologicalOrderIterator<IAtomicDerivedStateProcessor<? extends EObject>, DefaultEdge> iter = new TopologicalOrderIterator<>(
                graph);
        List<IAtomicDerivedStateProcessor<EObject>> orderedProcessors = new ArrayList<>();
        iter.forEachRemaining(processor -> orderedProcessors.add((IAtomicDerivedStateProcessor<EObject>) processor));
        Collections.reverse(orderedProcessors);
        cache.put(clazz, orderedProcessors);
    }

    private static void addRequirements(IAtomicDerivedStateProcessor<? extends EObject> processor, RegistryFunction fn,
            DirectedGraph<IAtomicDerivedStateProcessor<? extends EObject>, DefaultEdge> graph) {
        for (Class<? extends EObject> requirement : processor.getRequirements()) {
            Optional<IAtomicDerivedStateProcessor<?>> foundRequirement = fn.apply(requirement);
            if (!foundRequirement.isPresent()) {
                LOGGER.error(String.format("Could not find requirement %s.", requirement.getSimpleName()));
                continue;
            }
            graph.addEdge(processor, foundRequirement.get());
        }
    }

    private static void replaceVertex(DirectedGraph<IAtomicDerivedStateProcessor<? extends EObject>, DefaultEdge> graph,
            IAtomicDerivedStateProcessor<? extends EObject> original,
            IAtomicDerivedStateProcessor<? extends EObject> replacement) {

        Collection<DefaultEdge> edgeDump = new ArrayList<>();

        for (DefaultEdge incomingEdge : graph.incomingEdgesOf(original)) {
            IAtomicDerivedStateProcessor<? extends EObject> edgeSource = graph.getEdgeSource(incomingEdge);
            edgeDump.add(incomingEdge);
            graph.addEdge(edgeSource, replacement);
        }

        for (DefaultEdge outgoingEdge : graph.outgoingEdgesOf(original)) {
            // we do not insert the dependencies of the removed vertex because the new vertex has its own dependencies
            edgeDump.add(outgoingEdge);
        }

        edgeDump.forEach(graph::removeEdge);
        graph.removeVertex(original);
    }

}
