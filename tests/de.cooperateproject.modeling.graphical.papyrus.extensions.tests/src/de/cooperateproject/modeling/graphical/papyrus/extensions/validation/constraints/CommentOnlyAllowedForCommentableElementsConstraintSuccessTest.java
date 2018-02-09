package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import de.cooperateproject.modeling.graphical.papyrus.extensions.tests.commons.constraints.CooperateConstraintTestBase;
import de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.general.CommentOnlyAllowedForCommentableElementsConstraint;

@RunWith(Parameterized.class)
public class CommentOnlyAllowedForCommentableElementsConstraintSuccessTest extends CooperateConstraintTestBase {

	@Parameter
	public Class<? extends Element> typeToTest;
	
	public CommentOnlyAllowedForCommentableElementsConstraintSuccessTest() {
		super(CommentOnlyAllowedForCommentableElementsConstraint.class);
	}
	
    @Parameters(name = "{0}")
    public static Collection<Object[]> data() {
    	Collection<Class<? extends Element>> commentableElements = Arrays.asList(
                org.eclipse.uml2.uml.Class.class, Interface.class, Association.class, Actor.class, UseCase.class,
                Component.class);
    	return commentableElements.stream().map(c -> new Object[] {c}).collect(Collectors.toList());
    }

	@Test
	public void testAllowed() {
		EClass umlType = (EClass)UMLPackage.eINSTANCE.getEClassifier(typeToTest.getSimpleName());
		Model umlModel = UMLFactory.eINSTANCE.createModel();
		Comment umlComment = UMLFactory.eINSTANCE.createComment();
		umlModel.getOwnedComments().add(umlComment);
		Element commentedElement = (Element)UMLFactory.eINSTANCE.create(umlType);
		umlComment.getAnnotatedElements().add(commentedElement);
		umlModel.getPackagedElements().add((PackageableElement)commentedElement);
	}
	
}
