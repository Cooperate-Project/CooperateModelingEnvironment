package de.cooperateproject.ui.util;

import java.util.Arrays;

import com.google.common.base.Optional;
import com.google.common.collect.Iterables;

//TODO Remove this class as this information should be located in separate plugins
public enum TextualModelFileExtensions {

	CLASS("PapyrusUMLClassDiagram", "cls");
	
	private final String extension;
	private final String papyrusType;
	
	private TextualModelFileExtensions(String papyrusType, String extension) {
		this.papyrusType = papyrusType;
		this.extension = extension;
	}
	
	public String getExtension() {
		return extension;
	}

	public String getPapyrusType() {
		return papyrusType;
	}

	public static Optional<TextualModelFileExtensions> getByPapyrusType(String papyrusType) {
		return Iterables.tryFind(Arrays.asList(values()), v -> v.papyrusType.equals(papyrusType));
	}
	
	public static Optional<TextualModelFileExtensions> getByTextualExtension(String textualExtension) {
		return Iterables.tryFind(Arrays.asList(values()), v -> v.extension.equals(textualExtension));
	}
	
}
