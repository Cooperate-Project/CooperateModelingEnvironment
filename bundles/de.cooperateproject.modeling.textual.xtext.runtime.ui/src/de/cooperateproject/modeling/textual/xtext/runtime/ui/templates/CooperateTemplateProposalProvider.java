package de.cooperateproject.modeling.textual.xtext.runtime.ui.templates;

import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper;
import org.eclipse.xtext.ui.editor.templates.DefaultTemplateProposalProvider;

import com.google.inject.Inject;

public class CooperateTemplateProposalProvider extends DefaultTemplateProposalProvider {

    @Inject
    public CooperateTemplateProposalProvider(TemplateStore templateStore,
            org.eclipse.jface.text.templates.ContextTypeRegistry registry, ContextTypeIdHelper helper) {
        super(templateStore, registry, helper);
    }

    @Override
    public int getRelevance(Template template) {
        return 10000;
    }

}
