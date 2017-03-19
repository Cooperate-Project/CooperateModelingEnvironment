package de.cooperateproject.modeling.textual.xtext.generator.resources

import org.eclipse.xtext.xtext.generator.model.JavaFileAccess

class AutomatedIssueResolutionProviderGenerator {
	
	static def create(JavaFileAccess jva, String pgkFqn, String simpleClassName) {
		jva.content = '''
		import java.util.Collection;
		
		import com.google.common.collect.HashMultimap;
		import com.google.common.collect.Multimap;
		
		import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionProviderBase;
		import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolution;
		
		public class «simpleClassName» extends AutomatedIssueResolutionProviderBase {
		
		    private static final Multimap<String, Class<? extends IAutomatedIssueResolution>> RESOLUTIONS = initResolutions();
		
		    @Override
		    protected Collection<Class<? extends IAutomatedIssueResolution>> findResolutionClasses(String issueCode) {
		        return RESOLUTIONS.get(issueCode);
		    }
		
		    private static Multimap<String, Class<? extends IAutomatedIssueResolution>> initResolutions() {
		        Multimap<String, Class<? extends IAutomatedIssueResolution>> map = HashMultimap.create();
		        //TODO insert resolutions
		        return map;
		    }
		
		}
		'''
	}
	
}