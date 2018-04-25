package de.cooperateproject.modeling.textual.xtext.generator.tests

import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming
import org.eclipse.xtext.Grammar
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.xtext.generator.model.JavaFileAccess
import org.eclipse.xtext.GrammarUtil
import static org.eclipse.xtext.xtext.generator.model.TypeReference.*
import java.io.File

class AbstractFormatterTestGenerator {
	
	private val extension XtextGeneratorNaming naming
	private val Grammar grammar
	private val String directoryPath

	new(XtextGeneratorNaming naming, Grammar grammar, String directoryPath) {
		this.naming = naming
		this.grammar = grammar
		this.directoryPath = directoryPath
	}
	
	def create(JavaFileAccess jva) { jva.content =
		'''
	import com.google.common.base.Function
	import com.google.common.base.Strings
	import com.google.inject.Inject
	import java.io.File
	import org.apache.commons.io.FileUtils
	import org.apache.commons.io.IOUtils
	import org.eclipse.emf.common.util.URI
	import org.eclipse.xtext.resource.SaveOptions
	import org.eclipse.xtext.serializer.ISerializer
	import org.eclipse.xtext.testing.InjectWith
	import org.junit.Test
		
	import static org.junit.Assert.*
		
	@InjectWith(«typeRef(customizedInjectorProviderName)».DefaultProvider)
	abstract class AbstractFormatterTest extends «typeRef(abstractTestName)» {
	
		static val TEST_FOLDER = "«directoryPath»"
	
		@Inject extension ISerializer
	
		protected def test(String modelName) {
			val path = modelName.getRelativePath
			val expected = path.readText
			val actual = path.readModel([uglifyMinimalSpaces]).serialize(SaveOptions.newBuilder.format.options)
			assertEqualsNormalized(expected, actual)
			val actual2 = path.readModel([uglifyManySpaces]).serialize(SaveOptions.newBuilder.format.options)
			assertEqualsNormalized(expected, actual2)
		}	
	
		private def readModel(String path, Function<String, String> uglifier) {
			val uri = URI.createURI(path)
			var r = rs.getResource(uri, false)
			if (r !== null) {
				r.unload
				rs.resources.remove(r)
			}
			r = rs.createResource(uri)
			val is = IOUtils.toInputStream(uglifier.apply(path.readText))
			try {
				r.load(is, SaveOptions.newBuilder.options.toOptionsMap);
				return r.contents.get(0)			
			} finally {
				IOUtils.closeQuietly(is);
			}
		}
	
		private static def getRelativePath(String modelName) {
			return TEST_FOLDER + modelName
		}
	
		private static def assertEqualsNormalized(String expected, String actual) {
			val normalizedActual = actual.normalize
			val normalizedExpected = expected.normalize
			assertEquals(normalizedExpected, normalizedActual)
		}
	
		private static def normalize(String text) {
			return text.replaceAll("\\r\\n", "\n").replaceAll("\\n", String.format("%n"))
		}
	
		private static def readText(String path) {
			return FileUtils.readFileToString(new File(path));
		}
	
		private static def uglifyMinimalSpaces(String text) {
			return text.replaceAll("\\s+(?=([^\"]*\"[^\"]*\")*[^\"]*$)", " ")
		}
		
		private static def uglifyManySpaces(String text) {
			return text.replaceAll("\\s+(?=([^\"]*\"[^\"]*\")*[^\"]*$)", Strings.repeat(" ", 10))
		}
	}	
		
		'''
	}
	
	private def getCustomizedInjectorProviderName() {
		return naming.getRuntimeTestBasePackage(grammar) + ".scoping.util." + GrammarUtil.getSimpleName(grammar) + "CustomizedInjectorProvider";
	}
	
	 
	private def getAbstractTestName() {
		return naming.getRuntimeTestBasePackage(grammar) + "." + "Abstract" + GrammarUtil.getSimpleName(grammar) + "Test";
	}
	
	
	
}