package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.ocl.uml.OCL;
import org.eclipse.papyrus.infra.viewpoints.style.StylePackage;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.common.collect.Streams;

import de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.general.CooperateConstraintBase;

public abstract class CooperateConstraintTestBase {

	private static final File TEST_FILES_BASE_DIR = new File("models/constraints");
	private final Class<? extends CooperateConstraintBase<? extends EObject>> subjectClass;
	private ResourceSet rs;
	private CooperateConstraintBase<? extends EObject> subject;
	
	public CooperateConstraintTestBase(Class<? extends CooperateConstraintBase<? extends EObject>> subjectClass) {
		this.subjectClass = subjectClass;
	}
	
	@BeforeClass
	public static void init() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
        OCL.initialize(null);
        NotationPackage.eINSTANCE.eClass();
        StylePackage.eINSTANCE.eClass();
        org.eclipse.papyrus.infra.gmfdiag.style.StylePackage.eINSTANCE.eClass();
	}
	
	@Before
	public void setup() throws InstantiationException, IllegalAccessException {
		rs = new ResourceSetImpl();
		subject = subjectClass.newInstance();
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testUnsupportedModelElement() {
		test(EcoreFactory.eINSTANCE.createEClass());
	}
	
	protected void testSuccess(String modelName) {
		testSuccess(getContents(modelName));
	}
	
	protected void testSuccess(Collection<EObject> elements) {
		test(elements, status -> status.forEach(s -> assertThat(s.getSeverity(), is(IStatus.OK))));
	}
	
	protected void testFail(String modelName) {
		testFail(getContents(modelName));
	}
	
	protected void testFail(Collection<EObject> elements) {
		test(elements, status -> assertTrue(status.stream().anyMatch(s -> s.getSeverity() != IStatus.OK)));
	}
	
	private void test(Collection<EObject> modelElements, Consumer<Collection<IStatus>> asserter) {
		List<EObject> relevantElements = getAllContents(modelElements).stream().filter(subject.getTargetType()::isInstance)
				.map(subject.getTargetType()::cast).collect(Collectors.toList());
		assertThat(relevantElements, is(not(empty())));
		List<IStatus> results = relevantElements.stream().map(this::test).collect(Collectors.toList());
		asserter.accept(results);
	}
	
	private IStatus test(EObject element) {
		IValidationContext ctx = createMock(IValidationContext.class);
		expect(ctx.getTarget()).andReturn(element).anyTimes();
		expect(ctx.createSuccessStatus()).andReturn(Status.OK_STATUS).times(0, 1);
		expect(ctx.createFailureStatus(element)).andReturn(Status.CANCEL_STATUS).times(0, 1);
		replay(ctx);
		return subject.validate(ctx);
	}
	
	private Collection<EObject> getContents(String modelName) {
		URI modelURI = URI.createFileURI(new File(TEST_FILES_BASE_DIR, modelName).getAbsolutePath());
		Resource model = rs.getResource(modelURI, true);
		return model.getContents();
	}
	
	private static Collection<EObject> getAllContents(Collection<EObject> modelElements) {
		List<EObject> contents = modelElements.stream().map(EObject::eAllContents).flatMap(Streams::stream).collect(Collectors.toList());
		contents.addAll(0, modelElements);
		return contents;
	}
}
