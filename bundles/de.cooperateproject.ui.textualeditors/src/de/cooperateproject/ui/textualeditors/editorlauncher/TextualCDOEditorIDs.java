package de.cooperateproject.ui.textualeditors.editorlauncher;

import java.util.Arrays;
import java.util.Optional;

public enum TextualCDOEditorIDs {

    CLASS("cls", "de.cooperateproject.modeling.textual.cls.Cls"),
    USECASE("uc", "de.cooperateproject.modeling.textual.usecase.Usecase");

    private final String extension;
    private final String id;

    private TextualCDOEditorIDs(String extension, String id) {
        this.extension = extension;
        this.id = id;
    }

    public String getExtension() {
        return extension;
    }

    public String getId() {
        return id;
    }

    public static Optional<TextualCDOEditorIDs> findByExtension(String extension) {
        return Arrays.asList(values()).stream().filter(e -> extension.equals(e.getExtension())).findFirst();
    }

}
