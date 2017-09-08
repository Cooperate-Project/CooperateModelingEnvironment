package de.cooperateproject.modeling.transformation.registry;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

import com.google.common.base.Strings;

import de.cooperateproject.modeling.common.types.DiagramTypes;
import de.cooperateproject.modeling.graphical.common.conventions.NotationDiagramTypes;
import de.cooperateproject.modeling.transformation.common.ITransformationFactory;
import de.cooperateproject.modeling.transformation.common.ITransformationFactoryRegistry;
import de.cooperateproject.modeling.transformation.common.ITransformationUnitURIResolver;
import de.cooperateproject.modeling.transformation.common.ITransformationUnitURIResolverInjectionExpecting;
import de.cooperateproject.modeling.transformation.common.impl.InjectedURIResolvingTransformationFactory;
import de.cooperateproject.util.eclipse.ExtensionPointHelper;

public class TransformationFactoryRegistry implements ITransformationFactoryRegistry {
    private static final String TRANSFORMATION_ELEMENT_NAME = "transformation";
    private static final String DEFAULT_TRANSFORMATION_ELEMENT_NAME = "defaulttransformation";
    private static final String TRANSFORMATION_FACTORY_ELEMENT_NAME = "transformationfactory";
    private static final String TRANSFORMATION_FACTORY_ATTRIBUTE_NAME = "class";
    private static final String URI_RESOLVER_ELEMENT_NAME = "transformationuriresolver";
    private static final String URI_RESOLVER_ATTRIBUTE_NAME = "class";
    private static final String TRANSFORMATION_FOLDER_ELEMENT_NAME = "transformationfolder";
    private static final String TRANSFORMATION_FOLDER_ELEMENT_FOLDER_ATTRIBUTE_NAME = "foldername";
    private static final String ATTRIBUTE_DIAGRAM_NAME = "diagramName";
    private static final String ATTRIBUTE_GRAPHICAL_EXTENSION = "graphicalFileExtension";
    private static final String ATTRIBUTE_TEXTUAL_EXTENSION = "textualFileExtension";
    
    private static final String EXTENSION_POINT_ID = "de.cooperateproject.modeling.transformation.registry.transformationfactories";
    
    
    private Set<ITransformationFactory> factories = null;

    protected synchronized void initializeFactories() {
        factories = new HashSet<ITransformationFactory>();

        IExtensionRegistry registry = Platform.getExtensionRegistry();
        if (registry != null) {
            IConfigurationElement[] config = registry.getConfigurationElementsFor(EXTENSION_POINT_ID);
            for (IConfigurationElement e : config) {
                if (e.getName().equals(TRANSFORMATION_ELEMENT_NAME))
                    handleTransformationConfiguration(e);
            }
        }
    }

    protected void handleTransformationConfiguration(IConfigurationElement config) {
        assert config.getName().equals(TRANSFORMATION_ELEMENT_NAME);
        List<ITransformationFactory> tfactories = new LinkedList<>();
        ITransformationUnitURIResolver resolver = null;
        for (IConfigurationElement e : config.getChildren()) {
            switch (e.getName()) {
            case DEFAULT_TRANSFORMATION_ELEMENT_NAME: tfactories.add(createDefaultFactory(e)); break;
            case TRANSFORMATION_FACTORY_ELEMENT_NAME: tfactories.add(createTransformationFactory(e)); break;
            case URI_RESOLVER_ELEMENT_NAME: resolver = createURIResolver(e); break;
            case TRANSFORMATION_FOLDER_ELEMENT_NAME: resolver = createDefaultResolver(e); break;
            default:;
            }
        }
        final ITransformationUnitURIResolver res = resolver;
        tfactories.stream().filter(Objects::nonNull).peek(this.factories::add).filter(ITransformationUnitURIResolverInjectionExpecting.class::isInstance)
            .map(ITransformationUnitURIResolverInjectionExpecting.class::cast).forEach(f -> f.injectTransformationUnitURIResolver(res));
    }

    protected ITransformationUnitURIResolver createDefaultResolver(IConfigurationElement e) {
        String folderName = e.getAttribute(TRANSFORMATION_FOLDER_ELEMENT_FOLDER_ATTRIBUTE_NAME);
        return new PluginFolderNameConventionResolvingURIResolver(e.getContributor().getName(), folderName == null ? "" : folderName);
    }

    protected ITransformationUnitURIResolver createURIResolver(IConfigurationElement e) {
        return ExtensionPointHelper.convert(e, URI_RESOLVER_ATTRIBUTE_NAME, ITransformationUnitURIResolver.class).orElse(null);
    }

    protected ITransformationFactory createTransformationFactory(IConfigurationElement e) {
        return ExtensionPointHelper.convert(e, TRANSFORMATION_FACTORY_ATTRIBUTE_NAME, ITransformationFactory.class).orElse(null);
    }

    protected ITransformationFactory createDefaultFactory(IConfigurationElement e) {
        
        String diagramName = e.getAttribute(ATTRIBUTE_DIAGRAM_NAME);
        String graphicalExtension = e.getAttribute(ATTRIBUTE_GRAPHICAL_EXTENSION);
        String textualExtension = e.getAttribute(ATTRIBUTE_TEXTUAL_EXTENSION);

        Optional<NotationDiagramTypes> diagType = DiagramTypes.getByName(diagramName)
                .flatMap(NotationDiagramTypes::getByDiagramType);

        if (diagType.isPresent()
                && !(Strings.isNullOrEmpty(graphicalExtension) || Strings.isNullOrEmpty(textualExtension))) {
            return new InjectedURIResolvingTransformationFactory(diagType.get(), graphicalExtension,
                textualExtension);
        } 
        return null;
    }

    public void registerTransformation(ITransformationFactory factory) {
        factories.add(factory);
    }

    public Collection<ITransformationFactory> getTransformationFactories() {
        if (factories == null)
            initializeFactories();

        return Collections.unmodifiableSet(factories);
    }

}
