package de.cooperateproject.modeling.transformation.transformations.tests.transforms.plain;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.m2m.internal.qvt.oml.evaluator.QVTEvaluationOptions;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.Trace;
import org.eclipse.ocl.uml.OCL;
import org.eclipse.papyrus.infra.viewpoints.style.StylePackage;
import org.junit.Before;
import org.junit.BeforeClass;

import com.google.common.collect.Iterables;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.transformation.transformations.Activator;
import de.cooperateproject.modeling.transformation.transformations.impl.Log4JLogger;
import de.cooperateproject.modeling.transformation.transformations.tests.Constants;

public abstract class TransformationTestBase {

    private static final Logger LOGGER = Logger.getLogger(TransformationTestBase.class);
    private ResourceSet resourceSet;

    @BeforeClass
    public static void init() throws Exception {
        BasicConfigurator.resetConfiguration();
        BasicConfigurator.configure(new ConsoleAppender(new PatternLayout("%m%n")));

        if (!isPluginEnvironment()) {
            EcorePlugin.getPlatformResourceMap().put(Activator.PLUGIN_ID,
                    determinePluginUri(Activator.PLUGIN_ID, Activator.class));
            EcorePlugin.getPlatformResourceMap().put(Constants.PLUGIN_ID,
                    determinePluginUri(Constants.PLUGIN_ID, Constants.class));

            Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
            OCL.initialize(null);
            NotationPackage.eINSTANCE.eClass();
            StylePackage.eINSTANCE.eClass();
            TextualCommonsPackage.eINSTANCE.eClass();
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
        ctx.setLog(new Log4JLogger(LOGGER, Level.INFO));
        ctx.getSessionData().setValue(QVTEvaluationOptions.INCREMENTAL_UPDATE_TRACE, traceModel);
        ExecutionDiagnostic result = executor.execute(ctx,
                Iterables.toArray(transformationParameters, ModelExtent.class));
        assertEquals(result.getMessage(), ExecutionDiagnostic.OK, result.getSeverity());
    }

    protected static URI createTransformationURI(String filename) {
        String pathName = String.format("/%s/transforms/%s", Activator.PLUGIN_ID, filename);
        return createPlatformURI(pathName);
    }

    protected static URI createResourceModelURI(String filename) {
        String pathName = String.format("/%s/models/%s", Constants.PLUGIN_ID, filename);
        return createPlatformURI(pathName);
    }

    private static boolean isPluginEnvironment() {
        return ResourcesPlugin.getPlugin() != null;
    }

    private static URI createPlatformURI(String pathName) {
        if (!isPluginEnvironment()) {
            return URI.createPlatformResourceURI(pathName, true);
        } else {
            return URI.createPlatformPluginURI(pathName, true);
        }
    }

    private static URI determinePluginUri(String pluginId, Class<?> classOfPlugin) throws URISyntaxException {
        Path p = Paths.get(classOfPlugin.getProtectionDomain().getCodeSource().getLocation().toURI());
        while (p.getParent() != null && !p.getFileName().toString().equals(pluginId)) {
            p = p.getParent();
        }
        return URI.createFileURI(p.toAbsolutePath().toFile().toString() + "/");
    }

}
