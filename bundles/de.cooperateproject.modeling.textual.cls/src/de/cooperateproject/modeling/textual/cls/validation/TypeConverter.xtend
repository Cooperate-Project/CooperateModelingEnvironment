package de.cooperateproject.modeling.textual.cls.validation
 
import de.cooperateproject.modeling.textual.cls.cls.PrimitiveType
import org.eclipse.emf.common.util.URI
import org.eclipse.uml2.uml.resource.UMLResource
import com.google.common.collect.Iterables
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Type

class TypeConverter {
	def getType(PrimitiveType type, Model model) {
		switch (type) {
			case PrimitiveType.STRING: findEcorePrimitiveType("EString", model)
			case PrimitiveType.INT: findEcorePrimitiveType("EInt", model)
			case PrimitiveType.DOUBLE: findEcorePrimitiveType("EDouble", model)
			case PrimitiveType.BOOLEAN: findEcorePrimitiveType("EBoolean", model)
			case PrimitiveType.CHAR: findEcorePrimitiveType("EChar", model)
			case PrimitiveType.BYTE: findEcorePrimitiveType("EByte", model)
			case PrimitiveType.SHORT: findEcorePrimitiveType("EShort", model)
			case PrimitiveType.LONG: findEcorePrimitiveType("ELong", model)
			case PrimitiveType.FLOAT: findEcorePrimitiveType("EFloat", model)
		}
	}

	/**
	 * Converts a UML Type into a Cls PrimitiveType.
	 */
	def getPrimitive(Type type) {
		switch (type.name) {
			case "String": return PrimitiveType.STRING
			case "Boolean": return PrimitiveType.BOOLEAN
			case "Real": return PrimitiveType.FLOAT
			case "Integer": return PrimitiveType.INT
			case "UnlimitedNatural": return PrimitiveType.LONG
			case "EString": return PrimitiveType.STRING
			case "EByte": return PrimitiveType.BYTE
			case "EBoolean": return PrimitiveType.BOOLEAN
			case "EFloat": return PrimitiveType.FLOAT
			case "EInt": return PrimitiveType.INT
			case "ELong": return PrimitiveType.LONG
			case "EDouble": return PrimitiveType.DOUBLE
			case "EChar": return PrimitiveType.CHAR
			case "EShort": return PrimitiveType.SHORT
		}
		return PrimitiveType.STRING
	}

	private def findEcorePrimitiveType(String name, Model m) {
		var resource = m.eResource.resourceSet.getResource(URI.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI),
			true)
		var model = Iterables.getFirst(resource.contents, null)
		if (model instanceof Model) {
			var ecoreTypes = model.ownedTypes
			return ecoreTypes.findFirst[x|x.name.equals(name)]
		}
		return null
	}
}
