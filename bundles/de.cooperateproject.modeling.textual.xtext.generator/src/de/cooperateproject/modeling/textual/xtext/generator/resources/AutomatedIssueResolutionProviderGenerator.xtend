package de.cooperateproject.modeling.textual.xtext.generator.resources

import org.eclipse.xtext.xtext.generator.model.JavaFileAccess

class AutomatedIssueResolutionProviderGenerator {
	
	static def create(JavaFileAccess jva, String pgkFqn, String simpleClassName) {
		jva.content = '''
		package «pgkFqn»;
		
		import java.util.Collection;
		import java.util.Set;
		import java.util.stream.Collectors;
		
		import org.eclipse.xtext.ui.editor.quickfix.IssueResolution;
		import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionProvider;
		import org.eclipse.xtext.validation.Issue;
		
		import com.google.common.collect.Sets;
		import com.google.inject.Inject;
		
		import de.cooperateproject.modeling.textual.xtext.runtime.editor.automation.IAutomatedIssueResolutionProvider;
		
		public class «simpleClassName» implements IAutomatedIssueResolutionProvider {
		
		    private static final Set<String> RELEVANT_CODES = Sets.newHashSet();
		    private static final int automatedResolutionRelevance = 99;
		
		    @Inject
		    private IssueResolutionProvider issueResolutionProvider;
		
		    @Override
		    public Collection<IssueResolution> get(Collection<Issue> issues) {
		        return issues.stream().filter(i -> RELEVANT_CODES.contains(i.getCode()))
		                .map(issueResolutionProvider::getResolutions).flatMap(Collection::stream)
		                .filter(s -> s.getRelevance() == automatedResolutionRelevance).collect(Collectors.toList());
		    }
		
		}
		'''
	}
	
}