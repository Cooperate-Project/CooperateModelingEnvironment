package de.cooperateproject.modeling.transformation.common.impl.postprocessors;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.util.Trace;

public class ContentIteratingPostProcessor extends PostProcessorBase {

    public static interface PostProcessingSwitch {
        public Boolean doSwitch(EObject content);

        public boolean isPackageSupported(EPackage ePackage);

        public Iterable<Runnable> getRequestedChanges();
    }

    @FunctionalInterface
    public static interface PostProcessingSwitchFactory {
        public PostProcessingSwitch create(Set<EObject> mappedElements);
    }

    private final PostProcessingSwitchFactory factory;

    public ContentIteratingPostProcessor(int priority, PostProcessingSwitchFactory factory) {
        super(priority);
        this.factory = factory;
    }

    @SuppressWarnings("restriction")
    @Override
    public void process(Collection<ModelExtent> transformationParameters, Optional<Trace> transformationTrace) {
        if (!transformationTrace.isPresent()) {
            return;
        }
        Set<org.eclipse.m2m.internal.qvt.oml.trace.Trace> traces = transformationTrace.get().getTraceContent().stream()
                .filter(org.eclipse.m2m.internal.qvt.oml.trace.Trace.class::isInstance)
                .map(org.eclipse.m2m.internal.qvt.oml.trace.Trace.class::cast).collect(Collectors.toSet());

        Set<EObject> mappedElements = traces.stream()
                .flatMap(t -> Stream.concat(t.getTargetToTraceRecordMap().keySet().stream(),
                        t.getSourceToTraceRecordMap().keySet().stream()))
                .filter(EObject.class::isInstance).map(EObject.class::cast).collect(Collectors.toSet());

        PostProcessingSwitch postProcessor = factory.create(mappedElements);

        Set<EObject> relevantObjects = transformationParameters.stream().flatMap(m -> m.getContents().stream())
                .filter(o -> postProcessor.isPackageSupported(o.eClass().getEPackage())).collect(Collectors.toSet());
        for (TreeIterator<Object> contentIterator = EcoreUtil.getAllContents(relevantObjects, true); contentIterator
                .hasNext();) {
            Object content = contentIterator.next();
            if (!(content instanceof EObject)) {
                contentIterator.prune();
                continue;
            }
            postProcessor.doSwitch((EObject) content);
        }

        postProcessor.getRequestedChanges().forEach(Runnable::run);
    }

}
