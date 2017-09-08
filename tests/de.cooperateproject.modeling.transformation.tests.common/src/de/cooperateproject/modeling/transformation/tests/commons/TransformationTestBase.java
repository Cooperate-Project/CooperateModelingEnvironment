package de.cooperateproject.modeling.transformation.tests.commons;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

import org.apache.commons.lang3.reflect.FieldUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.PatternLayout;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.m2m.internal.qvt.oml.compiler.UnitResolverFactory;
import org.eclipse.m2m.internal.qvt.oml.evaluator.QVTEvaluationOptions;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.TransformationExecutor.BlackboxRegistry;
import org.eclipse.m2m.qvt.oml.util.Trace;
import org.eclipse.ocl.uml.OCL;
import org.eclipse.papyrus.infra.viewpoints.style.StylePackage;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Iterables;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.transformation.common.Activator;
import de.cooperateproject.modeling.transformation.common.impl.Slf4JLogger;
import de.cooperateproject.modeling.transformation.common.impl.Slf4JLogger.Level;
import de.cooperateproject.qvtoutils.blackbox.CooperateLibrary;

public abstract class TransformationTestBase {

    private static final Logger LOGGER = LoggerFactory.getLogger(TransformationTestBase.class);
    private ResourceSet resourceSet;

    public static void initEnvironment(UnitTestEnvironmentSetupDelegate delegate) {
        delegate.registerPlatformUris(Activator.PLUGIN_ID, Activator.class);
        delegate.registerQVTOResolutionURIs(createPlatformURI(Activator.PLUGIN_ID).appendSegment("transforms"));
    }
    
    public static void initialize(Consumer<UnitTestEnvironmentSetupDelegate> initializer) throws Exception {
        BasicConfigurator.resetConfiguration();
        BasicConfigurator.configure(new ConsoleAppender(new PatternLayout("%m%n")));

        if (!EMFPlugin.IS_ECLIPSE_RUNNING) {
            final Set<URI> baseURIs = new HashSet<>();
            initializer.accept(new UnitTestEnvironmentSetupDelegate() {
                @Override
                public void registerQVTOResolutionURIs(URI uriToRegister) {
                    baseURIs.add(uriToRegister);
                }
                
                @Override
                public void registerPlatformUris(String platformID, URI uri) {
                    EcorePlugin.getPlatformResourceMap().put(platformID, uri);
                }
            });
            
            Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
            OCL.initialize(null);
            NotationPackage.eINSTANCE.eClass();
            StylePackage.eINSTANCE.eClass();
            TextualCommonsPackage.eINSTANCE.eClass();
            org.eclipse.papyrus.infra.gmfdiag.style.StylePackage.eINSTANCE.eClass();
            
            List<UnitResolverFactory> fFactories = (List<UnitResolverFactory>) 
                    FieldUtils.readField(UnitResolverFactory.Registry.INSTANCE, "fFactories", true);
            fFactories.clear();
            fFactories.add(new MockUnitResolverFactory(new ArrayList<>(baseURIs)));
            
            BlackboxRegistry.INSTANCE.registerModule(CooperateLibrary.class,
                    "de.cooperateproject.qvtoutils.CooperateLibrary", "CooperateLibrary",
                    new String[] { EcorePackage.eNS_URI });
        }
    }

    @Before
    public void setup() throws Exception {
        resourceSet = new ResourceSetImpl();
    }

    protected ResourceSet getResourceSet() {
        return resourceSet;
    }

    @SuppressWarnings("restriction")
    protected void runTransformation(URI transformationURI, Iterable<ModelExtent> transformationParameters,
            Trace traceModel) throws IOException {
        TransformationExecutor executor = new TransformationExecutor(transformationURI);
        ExecutionContextImpl ctx = new ExecutionContextImpl();
        ctx.setLog(new Slf4JLogger(LOGGER, Level.INFO));
        ctx.getSessionData().setValue(QVTEvaluationOptions.INCREMENTAL_UPDATE_TRACE, traceModel);
        ExecutionDiagnostic result = executor.execute(ctx,
                Iterables.toArray(transformationParameters, ModelExtent.class));
        assertEquals(result.getMessage(), ExecutionDiagnostic.OK, result.getSeverity());
    }

    protected static URI createTransformationURI(String pluginName, String filename) {
        String pathName = String.format("/%s/transforms/%s", pluginName, filename);
        return createPlatformURI(pathName);
    }

    protected static URI createResourceModelURI(String pluginName, String filename) {
        String pathName = String.format("/%s/models/%s", pluginName, filename);
        return createPlatformURI(pathName);
    }

    protected static boolean isPluginEnvironment() {
        return ResourcesPlugin.getPlugin() != null;
    }

    protected static URI createPlatformURI(String pathName) {
        if (!isPluginEnvironment()) {
            return URI.createPlatformResourceURI(pathName, true);
        } else {
            return URI.createPlatformPluginURI(pathName, true);
        }
    }

}
