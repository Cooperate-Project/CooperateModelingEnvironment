package de.cooperateproject.modeling.common.conventions;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.eclipse.emf.common.util.URI;

public class ModelNamingConventions {

    private static class TextualModelName {
        private final String baseName;
        private final String diagramName;
        private final String fileExtension;

        public TextualModelName(String baseName, String diagramName, String fileExtension) {
            super();
            this.baseName = baseName;
            this.diagramName = diagramName;
            this.fileExtension = fileExtension;
        }

        public String getBaseName() {
            return baseName;
        }

        public String getDiagramName() {
            return diagramName;
        }

        public String getFileExtension() {
            return fileExtension;
        }

        @Override
        public String toString() {
            return String.format("%s - %s.%s", baseName, diagramName, fileExtension);
        }

    }

    public static String getProjectNameFromUMLURI(URI umlURI) {
        return umlURI.trimSegments(1).lastSegment();
    }

    public static URI getTextualFromGraphicalURI(URI graphicalURI, String diagramName, String textualFileExtension) {
        Validate.notNull(graphicalURI);
        Validate.isTrue(graphicalURI.isHierarchical());

        String papyrusFileName = URI.decode(graphicalURI.trimFileExtension().lastSegment());
        String textualFileName = getTextualModelNameObject(papyrusFileName, diagramName, textualFileExtension)
                .toString();
        return graphicalURI.trimFragment().trimQuery().trimSegments(1).appendSegment(textualFileName);
    }

    public static URI getGraphicalFromTextualURI(URI textualURI) {
        TextualModelName textualFileName = getTextualModelNameObjectFromTextualURI(textualURI);
        String graphicalFileName = String.format("%s.%s", textualFileName.getBaseName(), "notation");
        return textualURI.trimQuery().trimFragment().trimSegments(1).appendSegment(graphicalFileName);
    }

    public static URI getGraphicalResourceFromUMLURI(URI umlURI) {
        return umlURI.trimFileExtension().appendFileExtension("notation");
    }

    public static URI getUMLFromTextualURI(URI textualURI) {
        TextualModelName textualFileName = getTextualModelNameObjectFromTextualURI(textualURI);
        String umlFileName = String.format("%s.%s", textualFileName.getBaseName(), "uml");
        return textualURI.trimQuery().trimFragment().trimSegments(1).appendSegment(umlFileName);
    }

    public static URI getUMLFromGraphicalURI(URI graphicalURI) {
        return graphicalURI.trimFragment().trimQuery().trimFileExtension().appendFileExtension("uml");
    }

    public static URI getDiFromGraphicalURI(URI graphicalURI) {
        return graphicalURI.trimFragment().trimQuery().trimFileExtension().appendFileExtension("di");
    }

    public static String getDiagramNameFromTextualURI(URI textualURI) {
        TextualModelName textualFileName = getTextualModelNameObjectFromTextualURI(textualURI);
        return textualFileName.getDiagramName();
    }

    private static TextualModelName getTextualModelNameObjectFromTextualURI(URI textualURI) {
        Validate.notNull(textualURI);
        Validate.isTrue(textualURI.isHierarchical());
        String textualFileName = URI.decode(textualURI.lastSegment());
        Optional<TextualModelName> textualFileNameResult = parseTextualModelFileName(textualFileName);
        Validate.isTrue(textualFileNameResult.isPresent(), "The file name in the given URI \"%s\" is invalid.",
                textualURI.toString());
        return textualFileNameResult.get();
    }

    private static TextualModelName getTextualModelNameObject(String papyrusModelFileName, String papyrusDiagramName,
            String textualFileExtension) {
        Validate.notBlank(papyrusModelFileName);
        Validate.notBlank(papyrusDiagramName);
        Validate.notBlank(textualFileExtension);
        Validate.isTrue(!papyrusModelFileName.contains("-"),
                "The Papyrus model file name \"%s\" must not contain the '-' character.", papyrusModelFileName);
        Validate.isTrue(!papyrusDiagramName.contains("-"),
                "The Papyrus diagram name \"%s\" must not contain the '-' character.", papyrusDiagramName);

        String baseName = FilenameUtils.getBaseName(papyrusModelFileName);
        return new TextualModelName(baseName, papyrusDiagramName, textualFileExtension);
    }

    private static Optional<TextualModelName> parseTextualModelFileName(String textualModelFileName) {
        Validate.notBlank(textualModelFileName);
        Validate.isTrue(StringUtils.countMatches(textualModelFileName, "-") == 1,
                "The textual model file name \"%s\" must contain exactly one '-' character.", textualModelFileName);

        Pattern namePattern = Pattern.compile("^(.*?) - (.*)\\.([^.]+)");
        Matcher nameMatcher = namePattern.matcher(textualModelFileName);
        if (!nameMatcher.matches() || nameMatcher.groupCount() != 3) {
            return Optional.empty();
        }
        String baseName = nameMatcher.group(1);
        String diagramName = nameMatcher.group(2);
        String fileExtension = nameMatcher.group(3);
        return Optional.of(new TextualModelName(baseName, diagramName, fileExtension));
    }

}
