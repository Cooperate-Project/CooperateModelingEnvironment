/*
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.component.formatting2

import com.google.inject.Inject
import de.cooperateproject.modeling.textual.component.cmp.ComponentDiagram
import de.cooperateproject.modeling.textual.component.cmp.Classifier
import de.cooperateproject.modeling.textual.component.cmp.ClassifierRelation
import de.cooperateproject.modeling.textual.component.cmp.RootPackage
import de.cooperateproject.modeling.textual.component.services.ComponentGrammarAccess
import de.cooperateproject.modeling.textual.component.cmp.CmpPackage
import de.cooperateproject.modeling.textual.component.cmp.Component
import de.cooperateproject.modeling.textual.component.cmp.Class
import de.cooperateproject.modeling.textual.component.cmp.Attribute
import de.cooperateproject.modeling.textual.component.cmp.Method
import de.cooperateproject.modeling.textual.component.cmp.Parameter
import de.cooperateproject.modeling.textual.component.cmp.Interface
import de.cooperateproject.modeling.textual.component.cmp.Member
import de.cooperateproject.modeling.textual.component.cmp.InterfaceRelation
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageableElement
import de.cooperateproject.modeling.textual.component.cmp.Connector
import de.cooperateproject.modeling.textual.component.cmp.Port

class ComponentFormatter extends AbstractFormatter2 {
	
	@Inject extension ComponentGrammarAccess

	def dispatch void format(ComponentDiagram componentDiagram, extension IFormattableDocument document) {
		componentDiagram.regionFor.feature(CmpPackage.Literals.COMPONENT_DIAGRAM__TITLE).append[newLines = 2]
		componentDiagram.getRootpackage.format;
		componentDiagram.regionFor.keyword(componentDiagramAccess.endCpdKeyword_4).prepend[newLines = 2 priority = 1]
	}

	def dispatch void format(RootPackage rootPackage, extension IFormattableDocument document) {
		for (ClassifierRelation elementRelation : rootPackage.getRelations()) {
			elementRelation.format;
		}
		for (Classifier elementContent : rootPackage.getClassifiers()) {
			elementContent.format;
		}
		rootPackage.regionFor.assignment(rootPackageAccess.nameAssignment_1_1).append[newLines = 2]

	}
		 
	
	def dispatch void format(ClassifierRelation clr, extension IFormattableDocument document) {
	clr.append[newLine]
	}
	
	def dispatch void format(Component cmp, extension IFormattableDocument document) {
		interior(			
			cmp.regionFor.keyword(componentAccess.leftCurlyBracketKeyword_2_1_0).append[newLine],
			cmp.regionFor.keyword(componentAccess.rightCurlyBracketKeyword_2_1_7).append[newLine].prepend[newLines = 1 priority = 4],
			[indent]
		)
		for(Port port: cmp.port) {
			port.format();
		}
		
		for(Attribute attribute: cmp.attributes) {
			attribute.format();
		}
		for(PackageableElement elem: cmp.packagedElements) {
			elem.format();
		}
		for(Connector conn: cmp.connectors){
			conn.append[newLine]
		}
		for(InterfaceRelation infRel: cmp.getInterfaceRelation()){
			infRel.append[newLine]
		}
		cmp.append[newLine; priority = 2]
	}
	
	def dispatch void format(Class cls, extension IFormattableDocument document) {
		interior(			
			cls.regionFor.keyword(classAccess.leftCurlyBracketKeyword_2_1_0).append[newLine],
			cls.regionFor.keyword(classAccess.rightCurlyBracketKeyword_2_1_3).append[newLine].prepend[newLines = 1 priority = 4],
			[indent]
		)
		for(InterfaceRelation infRel: cls.getInterfaceRelation()){
			infRel.append[newLine]
		}
		
		cls.append[newLine; priority = 2]
	}
	
	def dispatch void format(Interface iface, extension IFormattableDocument document) {
		interior(
			iface.regionFor.keyword(interfaceAccess.leftCurlyBracketKeyword_2_1_0).append[newLine],
			iface.regionFor.keyword(interfaceAccess.rightCurlyBracketKeyword_2_1_3),
			[indent] 
		)
		
		for (member : iface.getMembers()) {
			format(member, document);
		}
		iface.append[newLine; priority = 2]
	}
	
	def dispatch void format(Attribute attribute, extension IFormattableDocument document) {
		format(attribute.getType(), document);
		attribute.append[newLine]
	}
	
	def dispatch void format(Port port, extension IFormattableDocument document) {
		port.regionFor.keyword(portAccess.conjugatedTildeKeyword_4_0_0).append[noSpace]
		port.append[newLine]
	}

	def dispatch void format(Method method, extension IFormattableDocument document) {
		for (Parameter parameters : method.getParameters()) {
			format(parameters, document);
		}
		format(method.getType(), document);
		method.append[newLine]
	}

	def dispatch void format(Parameter parameter, extension IFormattableDocument document) {
		format(parameter.getType(), document);
	}

}
