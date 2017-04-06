package de.cooperateproject.modeling.textual.xtext.runtime.issues;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import com.google.inject.Singleton;

@Singleton
public class IssueCodeRegistry implements IIssueCodeRegistry {

    private final Set<String> issueCodes = new HashSet<>();

    @Override
    public void registerIssueCode(String code) {
        issueCodes.add(code);
    }

    @Override
    public Collection<String> getAllCodes() {
        return Collections.unmodifiableCollection(issueCodes);
    }

    @Override
    public boolean hasIssueCode(String code) {
        return issueCodes.contains(code);
    }

}
