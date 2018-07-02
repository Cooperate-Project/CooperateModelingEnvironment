package de.cooperateproject.cdo.util.resources.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;

public class AbstractVirtualCDOResourceFileExtensionHandler implements IFileExtensionHandler {

    private final String extension;
    private final Collection<String> relevantExtensions;

    public AbstractVirtualCDOResourceFileExtensionHandler(String extension) {
        this.extension = extension;
        this.relevantExtensions = calculateRelevantExtensions(extension);
    }

    @Override
    public Collection<String> getExtensionsToRegister() {
        return relevantExtensions;
    }

    @Override
    public Optional<String> getRelevantExtension(URI uri) {
        final URI plainURI = uri.trimFragment().trimQuery();
        return relevantExtensions.stream().filter(e -> plainURI.toString().endsWith(e)).findAny();
    }

    protected Collection<String> calculateRelevantExtensions(String extension) {
        Set<String> result = new HashSet<>(FileExtensionRegistry.getInstance().getFileExtensions());
        result.addAll(result.stream().map(e -> String.format("%s.%s", e, extension)).collect(Collectors.toSet()));
        return Collections.unmodifiableCollection(result);
    }

    @Override
    public URI getRealUri(URI uri) {
        if (!extension.equals(uri.fileExtension())) {
            String newLastSegment = String.format("%s.%s", uri.trimQuery().trimFragment().lastSegment(), extension);
            return uri.trimSegments(1).appendSegment(newLastSegment).appendFragment(uri.fragment())
                    .appendQuery(uri.query());
        }
        return uri;
    }

    @Override
    public URI getVirtualUri(URI uri) {
        if (extension.equals(uri.fileExtension())) {
            return uri.trimFileExtension();
        }
        return uri;
    }

}
