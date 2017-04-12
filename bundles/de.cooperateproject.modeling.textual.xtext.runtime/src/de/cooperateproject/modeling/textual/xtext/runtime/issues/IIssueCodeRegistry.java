package de.cooperateproject.modeling.textual.xtext.runtime.issues;

import java.util.Collection;

public interface IIssueCodeRegistry {

    void registerIssueCode(String code);

    boolean hasIssueCode(String code);

    Collection<String> getAllCodes();

}
