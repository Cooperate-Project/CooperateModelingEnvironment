package de.cooperateproject.modeling.transformation.transformations.impl.postprocessors;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.util.Trace;

import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;

public abstract class ContentIteratingPostProcessor extends PostProcessorBase {

	@FunctionalInterface
	public static interface PostProcessingSwitchFactory {
		public Switch<Boolean> create(Set<Object> mappedElements);
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
		Set<org.eclipse.m2m.internal.qvt.oml.trace.Trace> traces = transformationTrace.get().getTraceContent().stream().filter(org.eclipse.m2m.internal.qvt.oml.trace.Trace.class::isInstance).map(org.eclipse.m2m.internal.qvt.oml.trace.Trace.class::cast).collect(Collectors.toSet());
		Set<Object> mappedTargets = traces.stream().map(org.eclipse.m2m.internal.qvt.oml.trace.Trace::getTargetToTraceRecordMap).map(m -> m.keySet()).flatMap(Collection::stream).collect(Collectors.toSet());
		
		Set<ClassDiagram> classDiagrams = transformationParameters.stream()
				.flatMap(me -> me.getContents().stream().filter(ClassDiagram.class::isInstance))
				.map(ClassDiagram.class::cast).collect(Collectors.toSet());
		
		Switch<Boolean> postProcessor = factory.create(mappedTargets);
		for (TreeIterator<Object> contentIterator = EcoreUtil.getAllContents(classDiagrams, true); contentIterator.hasNext(); ) {
			Object content = contentIterator.next();
			if (!(content instanceof EObject)) {
				contentIterator.prune();
				continue;
			}
			postProcessor.doSwitch((EObject)content);
		}

	}

}
