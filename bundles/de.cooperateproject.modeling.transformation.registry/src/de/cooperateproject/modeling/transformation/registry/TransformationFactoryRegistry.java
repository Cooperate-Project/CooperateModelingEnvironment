package de.cooperateproject.modeling.transformation.registry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Strings;

import de.cooperateproject.modeling.common.types.DiagramTypeRegistry;
import de.cooperateproject.modeling.common.types.IDiagramType;
import de.cooperateproject.modeling.transformation.common.IQVTOResourceProvider;
import de.cooperateproject.modeling.transformation.common.IQVTOTransformationExecutorProvider;
import de.cooperateproject.modeling.transformation.common.ITransformationContext;
import de.cooperateproject.modeling.transformation.common.ITransformationFactory;
import de.cooperateproject.modeling.transformation.common.ITransformationFactoryRegistry;
import de.cooperateproject.modeling.transformation.common.ITransformationUnitURIResolver;
import de.cooperateproject.modeling.transformation.common.impl.PostProcessor;
import de.cooperateproject.modeling.transformation.common.impl.TransformationContextBuilder;
import de.cooperateproject.util.eclipse.ExtensionPointHelper;

@Component(scope = ServiceScope.SINGLETON)
public class TransformationFactoryRegistry implements ITransformationFactoryRegistry {
    private static final String POSTPROCESSOR_CLASS_ATTRIBUTE_NAME = "class";
    private static final String POSTPROCESSOR_DIRECTION_ATTRIBUTE_NAME = "direction";
    private static final String TRANSFORMATION_ELEMENT_NAME = "transformation";
    private static final String DEFAULT_TRANSFORMATION_ELEMENT_NAME = "defaulttransformation";
    private static final String TRANSFORMATION_FACTORY_ELEMENT_NAME = "transformationfactory";
    private static final String POSTPROCESSOR_ELEMENT_NAME = "postprocessor";
    private static final String TRANSFORMATION_FACTORY_ATTRIBUTE_NAME = POSTPROCESSOR_CLASS_ATTRIBUTE_NAME;
    private static final String URI_RESOLVER_ELEMENT_NAME = "transformationuriresolver";
    private static final String URI_RESOLVER_ATTRIBUTE_NAME = POSTPROCESSOR_CLASS_ATTRIBUTE_NAME;
    private static final String TRANSFORMATION_FOLDER_ELEMENT_NAME = "transformationfolder";
    private static final String TRANSFORMATION_FOLDER_ELEMENT_FOLDER_ATTRIBUTE_NAME = "foldername";
    private static final String ATTRIBUTE_DIAGRAM_NAME = "diagramName";
    private static final String ATTRIBUTE_GRAPHICAL_EXTENSION = "graphicalFileExtension";

    private static final String EXTENSION_POINT_ID = "de.cooperateproject.modeling.transformation.registry.transformationfactories";

    private static final Logger LOGGER = LoggerFactory.getLogger(TransformationFactoryRegistry.class);

    private Set<ITransformationFactory> factories = null;

    @Reference
    protected IQVTOResourceProvider resourceProvider;

    @Reference
    protected IQVTOTransformationExecutorProvider transformationExecutorProvider;

    protected synchronized void initializeFactories() {
        factories = new HashSet<>();

        IExtensionRegistry registry = Platform.getExtensionRegistry();
        if (registry != null) {
            IConfigurationElement[] config = registry.getConfigurationElementsFor(EXTENSION_POINT_ID);
            for (IConfigurationElement e : config) {
                if (e.getName().equals(TRANSFORMATION_ELEMENT_NAME)) {
                    handleTransformationConfiguration(e);
                }
            }
        }
    }

    protected void handleTransformationConfiguration(IConfigurationElement config) {
        assert config.getName().equals(TRANSFORMATION_ELEMENT_NAME);
        List<ITransformationFactory> tfactories = new LinkedList<>();
        ITransformationUnitURIResolver resolver = null;
        Map<PostProcessorDirection, Collection<PostProcessor>> postProcessors = new EnumMap<>(
                PostProcessorDirection.class);
        for (IConfigurationElement e : config.getChildren()) {
            switch (e.getName()) {
            case DEFAULT_TRANSFORMATION_ELEMENT_NAME:
                tfactories.add(createDefaultFactory(e));
                break;
            case TRANSFORMATION_FACTORY_ELEMENT_NAME:
                tfactories.add(createTransformationFactory(e));
                break;
            case URI_RESOLVER_ELEMENT_NAME:
                resolver = createURIResolver(e);
                break;
            case TRANSFORMATION_FOLDER_ELEMENT_NAME:
                resolver = createDefaultResolver(e);
                break;
            case POSTPROCESSOR_ELEMENT_NAME:
                createPostProcessor(e).ifPresent(
                        p -> postProcessors.computeIfAbsent(p.getKey(), key -> new ArrayList<>()).add(p.getValue()));
                break;
            default:
                break;
            }
        }
        final ITransformationContext ctx = (new TransformationContextBuilder())
                .setQVTOResourceProvider(resourceProvider)
                .setQVTOTransformationExecutorProvider(transformationExecutorProvider)
                .setTransformationUnitURIResolver(resolver).build();
        Collection<ITransformationFactory> createdFactories = tfactories.stream().filter(Objects::nonNull)
                .peek(this.factories::add).collect(Collectors.toList());
        createdFactories.stream().filter(InjectTransformationContext.class::isInstance)
                .map(InjectTransformationContext.class::cast).forEach(f -> f.setTransformationContext(ctx));
        createdFactories.stream().filter(InjectPostProcessors.class::isInstance).map(InjectPostProcessors.class::cast)
                .forEach(f -> f.setPostProcessors(postProcessors));
    }

    private static Optional<Pair<PostProcessorDirection, PostProcessor>> createPostProcessor(IConfigurationElement e) {
        Optional<PostProcessorDirection> direction = Optional
                .ofNullable(e.getAttribute(POSTPROCESSOR_DIRECTION_ATTRIBUTE_NAME))
                .flatMap(PostProcessorDirection::findByName);
        Optional<PostProcessor> postProcessor = ExtensionPointHelper.convert(e, POSTPROCESSOR_CLASS_ATTRIBUTE_NAME,
                PostProcessor.class);

        if (!direction.isPresent()) {
            LOGGER.warn("Mandatory {} attribute for post processor is not available or wrong.",
                    POSTPROCESSOR_DIRECTION_ATTRIBUTE_NAME);
            return Optional.empty();
        }

        if (!postProcessor.isPresent()) {
            LOGGER.warn("Mandatory {} attribute for post processor is not available or wrong.",
                    POSTPROCESSOR_CLASS_ATTRIBUTE_NAME);
            return Optional.empty();
        }

        return Optional.of(Pair.of(direction.get(), postProcessor.get()));
    }

    protected ITransformationUnitURIResolver createDefaultResolver(IConfigurationElement e) {
        String folderName = e.getAttribute(TRANSFORMATION_FOLDER_ELEMENT_FOLDER_ATTRIBUTE_NAME);
        return new PluginFolderNameConventionResolvingURIResolver(e.getContributor().getName(),
                folderName == null ? "" : folderName);
    }

    protected ITransformationUnitURIResolver createURIResolver(IConfigurationElement e) {
        return ExtensionPointHelper.convert(e, URI_RESOLVER_ATTRIBUTE_NAME, ITransformationUnitURIResolver.class)
                .orElse(null);
    }

    protected ITransformationFactory createTransformationFactory(IConfigurationElement e) {
        return ExtensionPointHelper.convert(e, TRANSFORMATION_FACTORY_ATTRIBUTE_NAME, ITransformationFactory.class)
                .orElse(null);
    }

    protected ITransformationFactory createDefaultFactory(IConfigurationElement e) {

        String diagramName = e.getAttribute(ATTRIBUTE_DIAGRAM_NAME);
        String graphicalExtension = e.getAttribute(ATTRIBUTE_GRAPHICAL_EXTENSION);

        Optional<IDiagramType> diagramType = DiagramTypeRegistry.getInstance().getByName(diagramName);

        if (diagramType.isPresent() && !(Strings.isNullOrEmpty(graphicalExtension))) {
            return new BidirectionalTransformationFactoryWithInjectedContext(diagramType.get(), graphicalExtension);
        }
        return null;
    }

    public void registerTransformation(ITransformationFactory factory) {
        factories.add(factory);
    }

    @Override
    public Collection<ITransformationFactory> getTransformationFactories() {
        if (factories == null) {
            initializeFactories();
        }

        return Collections.unmodifiableSet(factories);
    }

}
