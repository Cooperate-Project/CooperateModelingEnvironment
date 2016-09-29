package de.cooperateproject.modeling.textual.cls.validation
 
import de.cooperateproject.modeling.textual.cls.cls.PrimitiveType
import org.eclipse.emf.common.util.URI
import org.eclipse.uml2.uml.resource.UMLResource
import com.google.common.collect.Iterables
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Type
import org.eclipse.emf.ecore.resource.ResourceSet

class TypeConverter {
	static def getType(PrimitiveType type, ResourceSet rs) {
		if (type == null || rs == null) {
			return null
		}
		switch (type) {
			case PrimitiveType.STRING: findEcorePrimitiveType("EString", rs)
			case PrimitiveType.INT: findEcorePrimitiveType("EInt", rs)
			case PrimitiveType.DOUBLE: findEcorePrimitiveType("EDouble", rs)
			case PrimitiveType.BOOLEAN: findEcorePrimitiveType("EBoolean", rs)
			case PrimitiveType.CHAR: findEcorePrimitiveType("EChar", rs)
			case PrimitiveType.BYTE: findEcorePrimitiveType("EByte", rs)
			case PrimitiveType.SHORT: findEcorePrimitiveType("EShort", rs)
			case PrimitiveType.LONG: findEcorePrimitiveType("ELong", rs)
			case PrimitiveType.FLOAT: findEcorePrimitiveType("EFloat", rs)
		}
	}

	/**
	 * Converts a UML Type into a Cls PrimitiveType.
	 */
	static def getPrimitive(Type type) {
		if (type == null) {
			return null
		}
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

	private static def findEcorePrimitiveType(String name, ResourceSet rs) {
		var resource = rs.getResource(URI.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI),
			true)
		var model = Iterables.getFirst(resource.contents, null)
		if (model instanceof Model) {
			var ecoreTypes = model.ownedTypes
			return ecoreTypes.findFirst[x|x.name.equals(name)]
		}
		return null
	}
}
